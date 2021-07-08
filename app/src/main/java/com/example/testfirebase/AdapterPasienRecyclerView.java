package com.example.testfirebase;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;




public class AdapterPasienRecyclerView extends RecyclerView.Adapter<AdapterPasienRecyclerView.ViewHolder> {

    private ArrayList<Pasien> daftarPasien;
    private Context context;

    public AdapterPasienRecyclerView(ArrayList<Pasien> pasiens, Context ctx){
        /**
         * Inisiasi data dan variabel yang akan digunakan
         */
        daftarPasien = pasiens;
        context = ctx;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        /**
         * Inisiasi View
         * Di tutorial ini kita hanya menggunakan data String untuk tiap item
         * dan juga view nya hanyalah satu TextView
         */
        TextView tvTitle;

        ViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_namapasien);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /**
         *  Inisiasi ViewHolder
         */
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pasien, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override

    public void onBindViewHolder(ViewHolder holder, final int position) {

/**

 * Menampilkan data pada view

 */

        final String name = daftarPasien.get(position).getNama();

        holder.tvTitle.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {


            }

        });

        holder.tvTitle.setOnLongClickListener(new View.OnLongClickListener() {

            @Override

            public boolean onLongClick(View view) {

                final Dialog dialog = new Dialog(context);

                dialog.setContentView(R.layout.dialog_view);

                dialog.setTitle("Pilih Aksi");

                dialog.show();
                Button editButton = (Button) dialog.findViewById(R.id.bt_edit_data);

                Button delButton = (Button) dialog.findViewById(R.id.bt_delete_data);

//apabila tombol edit diklik

                editButton.setOnClickListener(

                        new View.OnClickListener() {

                            @Override

                            public void onClick(View view) {

                                dialog.dismiss();

                                context.startActivity(FirebaseDBCreateActivity.getActIntent((Activity) context).putExtra("data", daftarPasien.get(position)));

                            }

                        }

                );

//apabila tombol delete diklik

                delButton.setOnClickListener(

                        new View.OnClickListener() {

                            @Override

                            public void onClick(View view) {

                            }

                        }

                );

                return true;

            }

        });

        holder.tvTitle.setText(name);

    }

    @Override
    public int getItemCount() {
        /**
         * Mengembalikan jumlah item pada pasien
         */
        return daftarPasien.size();
    }


}
