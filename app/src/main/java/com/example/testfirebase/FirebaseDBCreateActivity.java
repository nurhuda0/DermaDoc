package com.example.testfirebase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseDBCreateActivity extends AppCompatActivity {

    // variable yang merefers ke Firebase Realtime Database
    private DatabaseReference database;

    // variable fields EditText dan Button
    private Button btSubmit;
    private EditText etNama;
    private EditText etUsia;
    private EditText etAlamat;

    private Button btTambahCatatan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_dbcreate);

        // inisialisasi fields EditText dan Button
        etNama = (EditText) findViewById(R.id.et_namapasien);
        etUsia = (EditText) findViewById(R.id.et_usiapasien);
        etAlamat = (EditText) findViewById(R.id.et_alamatpasien);

        btTambahCatatan = (Button) findViewById(R.id.bt_tambahcatatan);
        btSubmit = (Button) findViewById(R.id.bt_submit);


        btTambahCatatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(FotoCatatanActivity.getActIntent(FirebaseDBCreateActivity.this));
            }
        });

        // mengambil referensi ke Firebase Database
        database = FirebaseDatabase.getInstance().getReference();
        final Pasien pasien = (Pasien) getIntent().getSerializableExtra("data");

        // kode yang dipanggil ketika tombol Submit diklik
        if (pasien != null) {

            etNama.setText(pasien.getNama());

            etUsia.setText(pasien.getUsia());

            etAlamat.setText(pasien.getAlamat());

            btSubmit.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View view) {

                    pasien.setNama(etNama.getText().toString());

                    pasien.setUsia(etUsia.getText().toString());

                    pasien.setAlamat(etAlamat.getText().toString());

                    updatePasien(pasien);

                }

            });

        } else {



            btSubmit.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View view) {

                    btSubmit.setOnClickListener(new View.OnClickListener() {

                        //@Override

                        public void onClick(View view) {
                            startActivity(GejalaActivity.getActIntent(FirebaseDBCreateActivity.this));
                        }

                    });


                    if(!isEmpty(etNama.getText().toString()) && !isEmpty(etUsia.getText().toString()) && !isEmpty(etAlamat.getText().toString()))



                        submitPasien(new Pasien(etNama.getText().toString(), etUsia.getText().toString(), etAlamat.getText().toString())

                                //startActivity(GejalaActivity.getActIntent(FirebaseDBCreateActivity.this))
                        );


                    else

                        Snackbar.make(findViewById(R.id.bt_submit), "Data pasien tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                    InputMethodManager imm = (InputMethodManager)

                            getSystemService(Context.INPUT_METHOD_SERVICE);
                    startActivity(GejalaActivity.getActIntent(FirebaseDBCreateActivity.this));


                    imm.hideSoftInputFromWindow(

                            etNama.getWindowToken(), 0);



                }

            }

            );

        }

    }

    private boolean isEmpty(String s) {
        // Cek apakah ada fields yang kosong, sebelum disubmit
        return TextUtils.isEmpty(s);
    }

    private void updatePasien(Pasien Pasien) {

        database.child("pasien") //akses parent index, ibaratnya seperti nama tabel

                .child(Pasien.getKey()) //select barang berdasarkan key

                .setValue(Pasien) //set value barang yang baru

                .addOnSuccessListener(this, new OnSuccessListener<Void>() {

                    @Override

                    public void onSuccess(Void aVoid) {

/**

 * Baris kode yang akan dipanggil apabila proses update barang sukses

 */

                        Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil diupdate", Snackbar.LENGTH_LONG).setAction("Oke", new
                                View.OnClickListener() {

                                    @Override

                                    public void onClick(View view) {

                                        finish();

                                    }

                                }).show();

                    }

                });
    }


    private void submitPasien(Pasien pasien) {
        /**
         * Ini adalah kode yang digunakan untuk mengirimkan data ke Firebase Realtime Database
         * dan juga kita set onSuccessListener yang berisi kode yang akan dijalankan
         * ketika data berhasil ditambahkan
         */
        database.child("pasien").push().setValue(pasien).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                etNama.setText("");
                etUsia.setText("");
                etAlamat.setText("");
                Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, FirebaseDBCreateActivity.class);
    }




}
