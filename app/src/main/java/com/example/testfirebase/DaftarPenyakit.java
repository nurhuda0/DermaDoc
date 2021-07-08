package com.example.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarPenyakit extends AppCompatActivity {

    int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,p11=0,p12=0,p13=0,p14=0,p15=0,
            p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,p22=0,p23=0,p24=0,p25=0;
    String taju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_penyakit);

        String tblp1 = getIntent().getStringExtra("table_p1");
        String tblp2 = getIntent().getStringExtra("table_p2");
        String tblp3 = getIntent().getStringExtra("table_p3");
        String tblp4 = getIntent().getStringExtra("table_p4");
        String tblp5 = getIntent().getStringExtra("table_p5");
        String tblp6 = getIntent().getStringExtra("table_p6");
        String tblp7 = getIntent().getStringExtra("table_p7");
        String tblp8 = getIntent().getStringExtra("table_p8");
        String tblp9 = getIntent().getStringExtra("table_p9");
        String tblp10 = getIntent().getStringExtra("table_p10");
        String tblp11 = getIntent().getStringExtra("table_p11");
        String tblp12 = getIntent().getStringExtra("table_p12");
        String tblp13 = getIntent().getStringExtra("table_p13");
        String tblp14 = getIntent().getStringExtra("table_p14");
        String tblp15 = getIntent().getStringExtra("table_p15");
        String tblp16 = getIntent().getStringExtra("table_p16");
        String tblp17 = getIntent().getStringExtra("table_p17");
        String tblp18 = getIntent().getStringExtra("table_p18");
        String tblp19 = getIntent().getStringExtra("table_p19");
        String tblp20 = getIntent().getStringExtra("table_p20");
        String tblp21 = getIntent().getStringExtra("table_p21");
        String tblp22 = getIntent().getStringExtra("table_p22");
        String tblp23 = getIntent().getStringExtra("table_p23");
        String tblp24 = getIntent().getStringExtra("table_p24");
        String tblp25 = getIntent().getStringExtra("table_p25");

        TextView texttbp1 = findViewById(R.id.tbtp1);
        texttbp1.setText(tblp1);
        TextView texttbp2 = findViewById(R.id.tbtp2);
        texttbp2.setText(tblp2);
        TextView texttbp3 = findViewById(R.id.tbtp3);
        texttbp3.setText(tblp3);
        TextView texttbp4 = findViewById(R.id.tbtp4);
        texttbp4.setText(tblp4);
        TextView texttbp5 = findViewById(R.id.tbtp5);
        texttbp5.setText(tblp5);
        TextView texttbp6 = findViewById(R.id.tbtp6);
        texttbp6.setText(tblp6);
        TextView texttbp7 = findViewById(R.id.tbtp7);
        texttbp7.setText(tblp7);
        TextView texttbp8 = findViewById(R.id.tbtp8);
        texttbp8.setText(tblp8);
        TextView texttbp9 = findViewById(R.id.tbtp9);
        texttbp9.setText(tblp9);
        TextView texttbp10 = findViewById(R.id.tbtp10);
        texttbp10.setText(tblp10);
        TextView texttbp11 = findViewById(R.id.tbtp11);
        texttbp11.setText(tblp11);
        TextView texttbp12 = findViewById(R.id.tbtp12);
        texttbp12.setText(tblp12);
        TextView texttbp13 = findViewById(R.id.tbtp13);
        texttbp13.setText(tblp13);
        TextView texttbp14 = findViewById(R.id.tbtp14);
        texttbp14.setText(tblp14);
        TextView texttbp15 = findViewById(R.id.tbtp15);
        texttbp15.setText(tblp15);
        TextView texttbp16 = findViewById(R.id.tbtp16);
        texttbp16.setText(tblp16);
        TextView texttbp17 = findViewById(R.id.tbtp17);
        texttbp17.setText(tblp17);
        TextView texttbp18 = findViewById(R.id.tbtp18);
        texttbp18.setText(tblp18);
        TextView texttbp19 = findViewById(R.id.tbtp19);
        texttbp19.setText(tblp19);
        TextView texttbp20 = findViewById(R.id.tbtp20);
        texttbp20.setText(tblp20);
        TextView texttbp21 = findViewById(R.id.tbtp21);
        texttbp21.setText(tblp21);
        TextView texttbp22 = findViewById(R.id.tbtp22);
        texttbp22.setText(tblp22);
        TextView texttbp23 = findViewById(R.id.tbtp23);
        texttbp23.setText(tblp23);
        TextView texttbp24 = findViewById(R.id.tbtp24);
        texttbp24.setText(tblp24);
        TextView texttbp25 = findViewById(R.id.tbtp25);
        texttbp25.setText(tblp25);
    }

    public void launch_tampil1(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",1);
        taju = getString(R.string.pj1);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil2(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",2);
        taju = getString(R.string.pj2);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil3(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",3);
        taju = getString(R.string.pj3);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil4(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",4);
        taju = getString(R.string.pj4);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil5(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",5);
        taju = getString(R.string.pj5);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil6(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",6);
        taju = getString(R.string.pj6);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil7(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",7);
        taju = getString(R.string.pj7);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil8(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",8);
        taju = getString(R.string.pj8);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil9(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",9);
        taju = getString(R.string.pj9);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }
    public void launch_tampil10(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",10);
        taju = getString(R.string.pj10);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil11(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",11);
        taju = getString(R.string.pj11);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil12(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",12);
        taju = getString(R.string.pj12);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil13(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",13);
        taju = getString(R.string.pj13);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil14(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",14);
        taju = getString(R.string.pj14);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil15(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",15);
        taju = getString(R.string.pj15);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil16(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",16);
        taju = getString(R.string.pj16);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil17(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",17);
        taju = getString(R.string.pj17);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil18(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",18);
        taju = getString(R.string.pj18);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil19(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",19);
        taju = getString(R.string.pj19);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil20(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",20);
        taju = getString(R.string.pj20);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil21(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",21);
        taju = getString(R.string.pj21);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil22(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",22);
        taju = getString(R.string.pj22);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil23(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",23);
        taju = getString(R.string.pj23);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil24(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",24);
        taju = getString(R.string.pj24);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }

    public void launch_tampil25(View view) {
        Intent intent = new Intent(this, TampilPenyakit.class);
        intent.putExtra("pm",25);
        taju = getString(R.string.pj25);
        intent.putExtra("judul_tampil",taju);
        startActivity(intent);
    }
}
