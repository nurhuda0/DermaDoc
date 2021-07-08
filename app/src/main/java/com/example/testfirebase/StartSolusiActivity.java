package com.example.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartSolusiActivity extends AppCompatActivity {

    private static final String LOG_TAG = StartSolusiActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_MESSAGE
            = "com.example.android.twoactivities.extra.MESSAGE";
    double p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,p11=0,p12=0,p13=0,p14=0,p15=0,p16=0,p17=0,p18=0,p19=0,p20=0,p21=0,p22=0,p23=0,p24=0,p25=0;
    double jpf;
    String rjpf;
    public static final String table_p1 = "",table_p2 = "",table_p3 = "",table_p4 = "",table_p5 = "",table_p6 = "",table_p7 = "",table_p8 = "",table_p9 = "",table_p10 = "",
            table_p11 = "",table_p12 = "",table_p13 = "",table_p14 = "",table_p15 = "",table_p16 = "",table_p17 = "",table_p18 = "",table_p19 = "",table_p20 = "",
            table_p21 = "",table_p22 = "",table_p23 = "",table_p24 = "",table_p25 = "";

    double gf1 = 0,gf2 = 0,gf3 = 0,gf4 = 0,gf5 = 0,gf6 = 0,gf7 = 0,gf8 = 0,gf9 = 0,gf10 = 0,gf11 = 0,gf12 = 0,gf13 = 0,gf14 = 0,gf15 = 0,
            gf16 = 0,gf17 = 0,gf18 = 0,gf19 = 0,gf20 = 0,gf21 = 0,gf22 = 0,gf23 = 0,gf24 = 0,gf25 = 0, gf26 = 0,gf27 = 0,gf28 = 0,gf29 = 0,gf30 = 0,
            gf31 = 0,gf32 = 0,gf33 = 0,gf34 = 0,gf35 = 0, gf36 = 0,gf37 = 0,gf38 = 0,gf39 = 0,gf40 = 0,gf41 = 0,gf42 = 0,gf43 = 0,gf44 = 0,gf45 = 0,
            gf46 = 0,gf47 = 0,gf48 = 0,gf49 = 0,gf50 = 0, gf51 = 0,gf52 = 0,gf53 = 0,gf54 = 0,gf55 = 0,gf56 = 0,gf57 = 0,gf58 = 0,gf59 = 0,gf60 = 0,
            gf61 = 0,gf62 = 0,gf63 = 0,gf64 = 0,gf65 = 0,gf66 = 0,gf67 = 0,gf68 = 0,gf69 = 0,gf70 = 0,gf71 = 0,gf72 = 0,gf73 = 0,gf74 = 0,gf75 = 0,
            gf76 = 0,gf77 = 0,gf78 = 0,gf79 = 0,gf80 = 0,gf81 = 0,gf82 = 0,gf83 = 0,gf84 = 0,gf85 = 0,gf86 = 0,gf87 = 0,gf88 = 0,gf89 = 0,gf90 = 0,
            gf91 = 0,gf92 = 0,gf93 = 0,gf94 = 0,gf95 = 0,gf96 = 0,gf97 = 0,gf98 = 0,gf99 = 0,gf100 = 0, gf101 = 0,gf102 = 0,gf103 = 0,gf104 = 0,gf105 = 0,gf106 = 0;

    String hsolusi;

    Intent intentg;

    int     gy1 = 0,gy2 = 0,gy3 = 0,gy4 = 0,gy5 = 0,gy6 = 0,gy7 = 0,gy8 = 0,gy9 = 0,gy10 = 0,
            gy11 = 0,gy12 = 0,gy13 = 0,gy14 = 0,gy15 = 0, gy16 = 0,gy17 = 0,gy18 = 0,gy19 = 0,gy20 = 0,
            gy21 = 0,gy22 = 0,gy23 = 0,gy24 = 0,gy25 = 0, gy26 = 0,gy27 = 0,gy28 = 0,gy29 = 0,gy30 = 0,
            gy31 = 0,gy32 = 0,gy33 = 0,gy34 = 0,gy35 = 0, gy36 = 0,gy37 = 0,gy38 = 0,gy39 = 0,gy40 = 0,
            gy41 = 0,gy42 = 0,gy43 = 0,gy44 = 0,gy45 = 0, gy46 = 0,gy47 = 0,gy48 = 0,gy49 = 0,gy50 = 0,
            gy51 = 0,gy52 = 0,gy53 = 0,gy54 = 0,gy55 = 0, gy56 = 0,gy57 = 0,gy58 = 0,gy59 = 0,gy60 = 0,
            gy61 = 0,gy62 = 0,gy63 = 0,gy64 = 0,gy65 = 0, gy66 = 0,gy67 = 0,gy68 = 0,gy69 = 0,gy70 = 0,
            gy71 = 0,gy72 = 0,gy73 = 0,gy74 = 0,gy75 = 0, gy76 = 0,gy77 = 0,gy78 = 0,gy79 = 0,gy80 = 0,
            gy81 = 0,gy82 = 0,gy83 = 0,gy84 = 0,gy85 = 0, gy86 = 0,gy87 = 0,gy88 = 0,gy89 = 0,gy90 = 0,
            gy91 = 0,gy92 = 0,gy93 = 0,gy94 = 0,gy95 = 0, gy96 = 0,gy97 = 0,gy98 = 0,gy99 = 0,gy100 = 0,
            gy101 = 0,gy102 = 0,gy103 = 0,gy104 = 0,gy105 = 0,gy106 = 0;

    int gcf=0;
    int rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_solusi);

        intentg = getIntent();
        Intent intent = getIntent();
        int pleasefr = getIntent().getIntExtra("please",0);

        gf1 = intent.getIntExtra("gx1",0);
        gf2 = intent.getIntExtra("gx2",0);
        gf3 = intent.getIntExtra("gx3",0);
        gf4 = intent.getIntExtra("gx4",0);
        gf5 = intent.getIntExtra("gx5",0);
        gf6 = intent.getIntExtra("gx6",0);
        gf7 = intent.getIntExtra("gx7",0);
        gf8 = intent.getIntExtra("gx8",0);
        gf9 = intent.getIntExtra("gx9",0);
        gf10 = intent.getIntExtra("gx10",0);
        gf11 = intent.getIntExtra("gx11",0);
        gf12 = intent.getIntExtra("gx12",0);
        gf13 = intent.getIntExtra("gx13",0);
        gf14 = intent.getIntExtra("gx14",0);
        gf15 = intent.getIntExtra("gx15",0);
        gf16 = intent.getIntExtra("gx16",0);
        gf17 = intent.getIntExtra("gx17",0);
        gf18 = intent.getIntExtra("gx18",0);
        gf19 = intent.getIntExtra("gx19",0);
        gf20 = intent.getIntExtra("gx20",0);
        gf21 = intent.getIntExtra("gx21",0);
        gf22 = intent.getIntExtra("gx22",0);
        gf23 = intent.getIntExtra("gx23",0);
        gf24 = intent.getIntExtra("gx24",0);
        gf25 = intent.getIntExtra("gx25",0);
        gf26 = intent.getIntExtra("gx26",0);
        gf27 = intent.getIntExtra("gx27",0);
        gf28 = intent.getIntExtra("gx28",0);
        gf29 = intent.getIntExtra("gx29",0);
        gf30 = intent.getIntExtra("gx30",0);
        gf31 = intent.getIntExtra("gx31",0);
        gf32 = intent.getIntExtra("gx32",0);
        gf33 = intent.getIntExtra("gx33",0);
        gf34 = intent.getIntExtra("gx34",0);
        gf35 = intent.getIntExtra("gx35",0);
        gf36 = intent.getIntExtra("gx36",0);
        gf37 = intent.getIntExtra("gx37",0);
        gf38 = intent.getIntExtra("gx38",0);
        gf39 = intent.getIntExtra("gx39",0);
        gf40 = intent.getIntExtra("gx40",0);
        gf41 = intent.getIntExtra("gx41",0);
        gf42 = intent.getIntExtra("gx42",0);
        gf43 = intent.getIntExtra("gx43",0);
        gf44 = intent.getIntExtra("gx44",0);
        gf45 = intent.getIntExtra("gx45",0);
        gf46 = intent.getIntExtra("gx46",0);
        gf47 = intent.getIntExtra("gx47",0);
        gf48 = intent.getIntExtra("gx48",0);
        gf49 = intent.getIntExtra("gx49",0);
        gf50 = intent.getIntExtra("gx50",0);
        gf51 = intent.getIntExtra("gx51",0);
        gf52 = intent.getIntExtra("gx52",0);
        gf53 = intent.getIntExtra("gx53",0);
        gf54 = intent.getIntExtra("gx54",0);
        gf55 = intent.getIntExtra("gx55",0);
        gf56 = intent.getIntExtra("gx56",0);
        gf57 = intent.getIntExtra("gx57",0);
        gf58 = intent.getIntExtra("gx58",0);
        gf59 = intent.getIntExtra("gx59",0);
        gf60 = intent.getIntExtra("gx60",0);
        gf61 = intent.getIntExtra("gx61",0);
        gf62 = intent.getIntExtra("gx62",0);
        gf63 = intent.getIntExtra("gx63",0);
        gf64 = intent.getIntExtra("gx64",0);
        gf65 = intent.getIntExtra("gx65",0);
        gf66 = intent.getIntExtra("gx66",0);
        gf67 = intent.getIntExtra("gx67",0);
        gf68 = intent.getIntExtra("gx68",0);
        gf69 = intent.getIntExtra("gx69",0);
        gf70 = intent.getIntExtra("gx70",0);
        gf71 = intent.getIntExtra("gx71",0);
        gf72 = intent.getIntExtra("gx72",0);
        gf73 = intent.getIntExtra("gx73",0);
        gf74 = intent.getIntExtra("gx74",0);
        gf75 = intent.getIntExtra("gx75",0);
        gf76 = intent.getIntExtra("gx76",0);
        gf77 = intent.getIntExtra("gx77",0);
        gf78 = intent.getIntExtra("gx78",0);
        gf79 = intent.getIntExtra("gx79",0);
        gf80 = intent.getIntExtra("gx80",0);
        gf81 = intent.getIntExtra("gx81",0);
        gf82 = intent.getIntExtra("gx82",0);
        gf83 = intent.getIntExtra("gx83",0);
        gf84 = intent.getIntExtra("gx84",0);
        gf85 = intent.getIntExtra("gx85",0);
        gf86 = intent.getIntExtra("gx86",0);
        gf87 = intent.getIntExtra("gx87",0);
        gf88 = intent.getIntExtra("gx88",0);
        gf89 = intent.getIntExtra("gx89",0);
        gf90 = intent.getIntExtra("gx90",0);
        gf91 = intent.getIntExtra("gx91",0);
        gf92 = intent.getIntExtra("gx92",0);
        gf93 = intent.getIntExtra("gx93",0);
        gf94 = intent.getIntExtra("gx94",0);
        gf95 = intent.getIntExtra("gx95",0);
        gf96 = intent.getIntExtra("gx96",0);
        gf97 = intent.getIntExtra("gx97",0);
        gf98 = intent.getIntExtra("gx98",0);
        gf99 = intent.getIntExtra("gx99",0);
        gf100 = intent.getIntExtra("gx100",0);
        gf101 = intent.getIntExtra("gx101",0);
        gf102 = intent.getIntExtra("gx102",0);
        gf103 = intent.getIntExtra("gx103",0);
        gf104 = intent.getIntExtra("gx104",0);
        gf105 = intent.getIntExtra("gx105",0);
        gf106 = intent.getIntExtra("gx106",0);

        gcf = intent.getIntExtra("getcount9",0);
        //rand = intent.getIntExtra("getcount9",0);

        //get_info();
        set_solusi();
        set_solusi_final();
        show_solusi();

        rjpf = String.valueOf(jpf);

        TextView textjpf = (TextView) findViewById(R.id.nmirip);
        textjpf.setText(rjpf);

        TextView textView = findViewById(R.id.hasil_solusi);
        textView.setText(hsolusi);
    }


    public void set_solusi() {
        p1 = (gf1+gf2+gf6+gf15+gf16+gf23+gf41+gf42+gf102)/9;
        p2 = (gf1+gf2+gf9+gf32+gf33+gf34+gf35)/7;
        p3 = (gf1+gf2+gf6+gf15+gf25+gf26+gf42)/7;
        p4 = (gf1+gf3+gf6+gf15)/4;
        p5 = (gf1+gf4+gf5+gf15)/4;
        p6 = (gf1+gf8+gf12+gf21+gf22+gf23+gf24+gf32+gf33+gf38)/10;
        p7 = (gf1+gf6+gf10+gf14)/4;
        p8 = (gf1+gf13+gf15+gf25+gf31+gf36+gf39+gf41+gf43+gf70)/10;
        p9 = (gf11+gf23+gf27+gf28+gf29+gf30+gf40+gf43)/8;
        p10 = (gf1+gf2+gf18+gf41)/4;
        p11 = (gf19+gf29+gf41+gf43)/4;
        p12 = (gf22+gf23+gf24+gf26+gf31+gf39+gf42+gf51)/8;
        p13 = (gf7+gf20+gf37+gf40+gf41)/5;
        p14 = (gf1+gf4+gf6+gf17+gf25+gf41+gf44+gf45+gf46)/9;
        p15 = (gf1+gf2+gf47+gf48+gf49+gf106)/6;
        p16 = (gf1+gf2+gf50+gf51+gf52)/5;
        p17 = (gf34+gf35+gf54+gf55)/4;
        p18 = (gf32+gf56+gf57+gf58+gf59+gf60+gf65)/7;
        p19 = (gf61+gf62+gf63+gf64+gf66+gf67)/6;
        p20 = (gf68+gf69+gf70+gf71+gf72+gf83+gf74+gf76+gf77+gf78)/10;
        p21 = (gf76+gf79+gf80+gf81+gf82+gf83+gf84+gf85+gf86+gf87+gf88+gf89)/12;
        p22 = (gf1+gf41+gf90+gf91)/4;
        p23 = (gf68+gf69+gf70+gf71+gf75+gf92+gf93+gf94+gf95+gf96)/10;
        p24 = (gf68+gf69+gf70+gf71+gf75+gf97+gf98+gf99+gf100+gf101+gf102)/11;
        p25 = (gf69+gf70+gf71+gf72+gf103+gf104+gf105)/7;
    }

    public void set_solusi_final() {
        if (gcf>9){
            p1 = (gf1+gf2+gf6+gf15+gf16+gf23+gf41+gf42+gf102)/gcf;
            p14 = (gf1+gf4+gf6+gf17+gf25+gf41+gf44+gf45+gf46)/gcf;
        }
        if (gcf>7) {
            p2 = (gf1+gf2+gf9+gf32+gf33+gf34+gf35)/gcf;
            p3 = (gf1+gf2+gf6+gf15+gf25+gf26+gf42)/gcf;
            p18 = (gf32+gf56+gf57+gf58+gf59+gf60+gf65)/gcf;
            p25 = (gf69+gf70+gf71+gf72+gf103+gf104+gf105)/gcf;
        }
        if (gcf>4) {
            p4 = (gf1+gf3+gf6+gf15)/gcf;
            p5 = (gf1+gf4+gf5+gf15)/gcf;
            p7 = (gf1+gf6+gf10+gf14)/gcf;
            p10 = (gf1+gf2+gf18+gf41)/gcf;
            p11 = (gf19+gf29+gf41+gf43)/gcf;
            p17 = (gf34+gf35+gf54+gf55)/gcf;
            p22 = (gf1+gf41+gf90+gf91)/gcf;
        }
        if (gcf>10) {
            p6 = (gf1+gf8+gf12+gf21+gf22+gf23+gf24+gf32+gf33+gf38)/gcf;
            p8 = (gf1+gf13+gf15+gf25+gf31+gf36+gf39+gf41+gf43+gf70)/gcf;
            p20 = (gf68+gf69+gf70+gf71+gf72+gf83+gf74+gf76+gf77+gf78)/gcf;
            p23 = (gf68+gf69+gf70+gf71+gf75+gf92+gf93+gf94+gf95+gf96)/gcf;
        }
        if (gcf>8) {
            p9 = (gf11+gf23+gf27+gf28+gf29+gf30+gf40+gf43)/gcf;
            p12 = (gf22+gf23+gf24+gf26+gf31+gf39+gf42+gf51)/gcf;
        }
        if (gcf>5) {
            p13 = (gf7+gf20+gf37+gf40+gf41)/gcf;
            p16 = (gf1+gf2+gf50+gf51+gf52)/gcf;
        }
        if (gcf>6) {
            p15 = (gf1+gf2+gf47+gf48+gf49+gf106)/gcf;
            p19 = (gf61+gf62+gf63+gf64+gf66+gf67)/gcf;
        }
        if (gcf>12) {
            p21 = (gf76+gf79+gf80+gf81+gf82+gf83+gf84+gf85+gf86+gf87+gf88+gf89)/gcf;
        }
        if (gcf>11) {
            p24 = (gf68+gf69+gf70+gf71+gf75+gf97+gf98+gf99+gf100+gf101+gf102)/gcf;
        }
    }


    /*
    public void get_info() {
        gf1 = 1;
        gf3 = 1;
        gf6 = 1;

        //gf1 = intentg.getIntExtra("fr1",0);
        //gf6 = getIntent().getIntExtra("fr6",0);
        //gf3 = getIntent().getIntExtra("fr3",0);


    }

     */

    public void show_solusi() {
        if (p1==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj1);
            jpf = p1;
        }

        if (p2==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj2);
            jpf = p2;
        }

        if (p3==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj3);
            jpf = p3;
        }

        if (p4==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj4);
            jpf = p4;
        }

        if (p5==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj5);
            jpf = p5;
        }

        if (p6==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj6);
            jpf = p6;
        }

        if (p7==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj7);
            jpf = p7;
        }

        if (p8==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj8);
            jpf = p8;
        }

        if (p9==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj9);
            jpf = p9;
        }

        if (p10==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj10);
            jpf = p10;
        }

        if (p11==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj11);
            jpf = p11;
        }

        if (p12==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj12);
            jpf = p12;
        }

        if (p13==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj13);
            jpf = p13;
        }

        if (p14==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj14);
            jpf = p14;
        }

        if (p15==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj15);
            jpf = p15;
        }

        if (p16==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj16);
            jpf = p16;
        }

        if (p17==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj17);
            jpf = p17;
        }

        if (p18==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj18);
            jpf = p18;
        }

        if (p19==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj19);
            jpf = p19;
        }

        if (p20==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj20);
            jpf = p20;
        }

        if (p21==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj21);
            jpf = p21;
        }

        if (p22==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj22);
            jpf = p22;
        }

        if (p23==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj23);
            jpf = p23;
        }

        if (p24==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj24);
            jpf = p24;
        }

        if (p25==Math.max(p1,Math.max(p2,Math.max(p3,Math.max(p4,Math.max(p5,Math.max(p6,Math.max(p7,Math.max(p8,Math.max(p9,Math.max(p10,
                Math.max(p11,Math.max(p12,Math.max(p13,Math.max(p14,Math.max(p15,Math.max(p16,Math.max(p17,Math.max(p18,Math.max(p19,Math.max(p20,
                        Math.max(p21,Math.max(p22,Math.max(p23,Math.max(p24,p25))))))))))))))))))))))))){
            hsolusi = getString(R.string.pj25);
            jpf = p25;
        }

    }

    public void launch_info(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, InfoSolusi.class);
        String message = hsolusi.toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void launch_daftar(View view) {

        Intent intent = new Intent(this, DaftarPenyakit.class);

        //Intent intent = new Intent(this, DaftarPenyakit.class);

        String tbp1 = String.valueOf(p1);
        intent.putExtra("table_p1",tbp1);
        String tbp2 = String.valueOf(p2);
        intent.putExtra("table_p2",tbp2);
        String tbp3 = String.valueOf(p3);
        intent.putExtra("table_p3",tbp3);
        String tbp4 = String.valueOf(p4);
        intent.putExtra("table_p4",tbp4);
        String tbp5 = String.valueOf(p5);
        intent.putExtra("table_p5",tbp5);
        String tbp6 = String.valueOf(p6);
        intent.putExtra("table_p6",tbp6);
        String tbp7 = String.valueOf(p7);
        intent.putExtra("table_p7",tbp7);
        String tbp8 = String.valueOf(p8);
        intent.putExtra("table_p8",tbp8);
        String tbp9 = String.valueOf(p9);
        intent.putExtra("table_p9",tbp9);
        String tbp10 = String.valueOf(p10);
        intent.putExtra("table_p10",tbp10);
        String tbp11 = String.valueOf(p11);
        intent.putExtra("table_p11",tbp11);
        String tbp12 = String.valueOf(p12);
        intent.putExtra("table_p12",tbp12);
        String tbp13 = String.valueOf(p13);
        intent.putExtra("table_p13",tbp13);
        String tbp14 = String.valueOf(p14);
        intent.putExtra("table_p14",tbp14);
        String tbp15 = String.valueOf(p15);
        intent.putExtra("table_p15",tbp15);
        String tbp16 = String.valueOf(p16);
        intent.putExtra("table_p16",tbp16);
        String tbp17 = String.valueOf(p17);
        intent.putExtra("table_p17",tbp17);
        String tbp18 = String.valueOf(p18);
        intent.putExtra("table_p18",tbp18);
        String tbp19 = String.valueOf(p19);
        intent.putExtra("table_p19",tbp19);
        String tbp20 = String.valueOf(p20);
        intent.putExtra("table_p20",tbp20);
        String tbp21 = String.valueOf(p21);
        intent.putExtra("table_p21",tbp21);
        String tbp22 = String.valueOf(p22);
        intent.putExtra("table_p22",tbp22);
        String tbp23 = String.valueOf(p23);
        intent.putExtra("table_p23",tbp23);
        String tbp24 = String.valueOf(p24);
        intent.putExtra("table_p24",tbp24);
        String tbp25 = String.valueOf(p25);
        intent.putExtra("table_p25",tbp25);

        startActivity(intent);
    }
}
