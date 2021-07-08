package com.example.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TampilGejalaActivity extends AppCompatActivity {

    // Unique tag for the intent reply.
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";

    // EditText for the reply.
    private EditText mReply;

    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */
    String msg;
    String selected;
    String selectedn;
    String real;
    int     g1 = 0,g2 = 0,g3 = 0,g4 = 0,g5 = 0,g6 = 0,g7 = 0,g8 = 0,g9 = 0,g10 = 0,
            g11 = 0,g12 = 0,g13 = 0,g14 = 0,g15 = 0, g16 = 0,g17 = 0,g18 = 0,g19 = 0,g20 = 0,
            g21 = 0,g22 = 0,g23 = 0,g24 = 0,g25 = 0, g26 = 0,g27 = 0,g28 = 0,g29 = 0,g30 = 0,
            g31 = 0,g32 = 0,g33 = 0,g34 = 0,g35 = 0, g36 = 0,g37 = 0,g38 = 0,g39 = 0,g40 = 0,
            g41 = 0,g42 = 0,g43 = 0,g44 = 0,g45 = 0, g46 = 0,g47 = 0,g48 = 0,g49 = 0,g50 = 0,
            g51 = 0,g52 = 0,g53 = 0,g54 = 0,g55 = 0, g56 = 0,g57 = 0,g58 = 0,g59 = 0,g60 = 0,
            g61 = 0,g62 = 0,g63 = 0,g64 = 0,g65 = 0, g66 = 0,g67 = 0,g68 = 0,g69 = 0,g70 = 0,
            g71 = 0,g72 = 0,g73 = 0,g74 = 0,g75 = 0, g76 = 0,g77 = 0,g78 = 0,g79 = 0,g80 = 0,
            g81 = 0,g82 = 0,g83 = 0,g84 = 0,g85 = 0, g86 = 0,g87 = 0,g88 = 0,g89 = 0,g90 = 0,
            g91 = 0,g92 = 0,g93 = 0,g94 = 0,g95 = 0, g96 = 0,g97 = 0,g98 = 0,g99 = 0,g100 = 0,
            g101 = 0,g102 = 0,g103 = 0,g104 = 0,g105 = 0,g106 = 0;

    String gs1,gs2,gs3,gs4,gs5,gs6,gs7,gs8,gs9,gs10,
            gs11,gs12,gs13,gs14,gs15, gs16,gs17,gs18,gs19,gs20,
            gs21,gs22,gs23,gs24,gs25, gs26,gs27,gs28,gs29,gs30,
            gs31,gs32,gs33,gs34,gs35, gs36,gs37,gs38,gs39,gs40,
            gs41,gs42,gs43,gs44,gs45, gs46,gs47,gs48,gs49,gs50,
            gs51,gs52,gs53,gs54,gs55, gs56,gs57,gs58,gs59,gs60,
            gs61,gs62,gs63,gs64,gs65, gs66,gs67,gs68,gs69,gs70,
            gs71,gs72,gs73,gs74,gs75, gs76,gs77,gs78,gs79,gs80,
            gs81,gs82,gs83,gs84,gs85, gs86,gs87,gs88,gs89,gs90,
            gs91,gs92,gs93,gs94,gs95,gs96,gs97,gs98,gs99,gs100,
            gs101,gs102,gs103,gs104,gs105,gs106;

    String[] hah;

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

    int geezfr;

    int getcount2=0;
    int getcount3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_gejala);



        // Get the intent that launched this activity, and the message in
        // the intent extra.
        Intent intent = getIntent();
        //selected = intent.getStringExtra(GejalaActivity.EXTRA_MESSAGE);
        selected = intent.getStringExtra("finally");
        gy1 = intent.getIntExtra("gz1",0);
        gy2 = intent.getIntExtra("gz2",0);
        gy3 = intent.getIntExtra("gz3",0);
        gy4 = intent.getIntExtra("gz4",0);
        gy5 = intent.getIntExtra("gz5",0);
        gy6 = intent.getIntExtra("gz6",0);
        gy7 = intent.getIntExtra("gz7",0);
        gy8 = intent.getIntExtra("gz8",0);
        gy9 = intent.getIntExtra("gz9",0);
        gy10 = intent.getIntExtra("gz10",0);
        gy11 = intent.getIntExtra("gz11",0);
        gy12 = intent.getIntExtra("gz12",0);
        gy13 = intent.getIntExtra("gz13",0);
        gy14 = intent.getIntExtra("gz14",0);
        gy15 = intent.getIntExtra("gz15",0);
        gy16 = intent.getIntExtra("gz16",0);
        gy17 = intent.getIntExtra("gz17",0);
        gy18 = intent.getIntExtra("gz18",0);
        gy19 = intent.getIntExtra("gz19",0);
        gy20 = intent.getIntExtra("gz20",0);
        gy21 = intent.getIntExtra("gz21",0);
        gy22 = intent.getIntExtra("gz22",0);
        gy23 = intent.getIntExtra("gz23",0);
        gy24 = intent.getIntExtra("gz24",0);
        gy25 = intent.getIntExtra("gz25",0);
        gy26 = intent.getIntExtra("gz26",0);
        gy27 = intent.getIntExtra("gz27",0);
        gy28 = intent.getIntExtra("gz28",0);
        gy29 = intent.getIntExtra("gz29",0);
        gy30 = intent.getIntExtra("gz30",0);
        gy31 = intent.getIntExtra("gz31",0);
        gy32 = intent.getIntExtra("gz32",0);
        gy33 = intent.getIntExtra("gz33",0);
        gy34 = intent.getIntExtra("gz34",0);
        gy35 = intent.getIntExtra("gz35",0);
        gy36 = intent.getIntExtra("gz36",0);
        gy37 = intent.getIntExtra("gz37",0);
        gy38 = intent.getIntExtra("gz38",0);
        gy39 = intent.getIntExtra("gz39",0);
        gy40 = intent.getIntExtra("gz40",0);
        gy41 = intent.getIntExtra("gz41",0);
        gy42 = intent.getIntExtra("gz42",0);
        gy43 = intent.getIntExtra("gz43",0);
        gy44 = intent.getIntExtra("gz44",0);
        gy45 = intent.getIntExtra("gz45",0);
        gy46 = intent.getIntExtra("gz46",0);
        gy47 = intent.getIntExtra("gz47",0);
        gy48 = intent.getIntExtra("gz48",0);
        gy49 = intent.getIntExtra("gz49",0);
        gy50 = intent.getIntExtra("gz50",0);
        gy51 = intent.getIntExtra("gz51",0);
        gy52 = intent.getIntExtra("gz52",0);
        gy53 = intent.getIntExtra("gz53",0);
        gy54 = intent.getIntExtra("gz54",0);
        gy55 = intent.getIntExtra("gz55",0);
        gy56 = intent.getIntExtra("gz56",0);
        gy57 = intent.getIntExtra("gz57",0);
        gy58 = intent.getIntExtra("gz58",0);
        gy59 = intent.getIntExtra("gz59",0);
        gy60 = intent.getIntExtra("gz60",0);
        gy61 = intent.getIntExtra("gz61",0);
        gy62 = intent.getIntExtra("gz62",0);
        gy63 = intent.getIntExtra("gz63",0);
        gy64 = intent.getIntExtra("gz64",0);
        gy65 = intent.getIntExtra("gz65",0);
        gy66 = intent.getIntExtra("gz66",0);
        gy67 = intent.getIntExtra("gz67",0);
        gy68 = intent.getIntExtra("gz68",0);
        gy69 = intent.getIntExtra("gz69",0);
        gy70 = intent.getIntExtra("gz70",0);
        gy71 = intent.getIntExtra("gz71",0);
        gy72 = intent.getIntExtra("gz72",0);
        gy73 = intent.getIntExtra("gz73",0);
        gy74 = intent.getIntExtra("gz74",0);
        gy75 = intent.getIntExtra("gz75",0);
        gy76 = intent.getIntExtra("gz76",0);
        gy77 = intent.getIntExtra("gz77",0);
        gy78 = intent.getIntExtra("gz78",0);
        gy79 = intent.getIntExtra("gz79",0);
        gy80 = intent.getIntExtra("gz80",0);
        gy81 = intent.getIntExtra("gz81",0);
        gy82 = intent.getIntExtra("gz82",0);
        gy83 = intent.getIntExtra("gz83",0);
        gy84 = intent.getIntExtra("gz84",0);
        gy85 = intent.getIntExtra("gz85",0);
        gy86 = intent.getIntExtra("gz86",0);
        gy87 = intent.getIntExtra("gz87",0);
        gy88 = intent.getIntExtra("gz88",0);
        gy89 = intent.getIntExtra("gz89",0);
        gy90 = intent.getIntExtra("gz90",0);
        gy91 = intent.getIntExtra("gz91",0);
        gy92 = intent.getIntExtra("gz92",0);
        gy93 = intent.getIntExtra("gz93",0);
        gy94 = intent.getIntExtra("gz94",0);
        gy95 = intent.getIntExtra("gz95",0);
        gy96 = intent.getIntExtra("gz96",0);
        gy97 = intent.getIntExtra("gz97",0);
        gy98 = intent.getIntExtra("gz98",0);
        gy99 = intent.getIntExtra("gz99",0);
        gy100 = intent.getIntExtra("gz100",0);
        gy101 = intent.getIntExtra("gz101",0);
        gy102 = intent.getIntExtra("gz102",0);
        gy103 = intent.getIntExtra("gz103",0);
        gy104 = intent.getIntExtra("gz104",0);
        gy105 = intent.getIntExtra("gz105",0);
        gy106 = intent.getIntExtra("gz106",0);
        getcount2 = intent.getIntExtra("getcount1",0);
        // Put that message into the text_message TextView
        TextView textView = findViewById(R.id.text_message);
        textView.setText(selected);


        /*
        hah= getResources().getStringArray(R.array.gejala_penyakit);
        gs1 = hah[0];
        gs2 = hah[1];
        gs3 = hah[2];
        gs4 = hah[3];
        gs5 = hah[4];
        gs6 = hah[5];
        gs7 = hah[6];
        gs8 = hah[7];
        gs9 = hah[8];
        gs10 = hah[9];
        gs11 = hah[10];
        gs12 = hah[11];
        gs13 = hah[12];
        gs14 = hah[13];
        gs15 = hah[14];
        gs16 = hah[15];
        gs17 = hah[16];
        gs18 = hah[17];
        gs19 = hah[18];
        gs20 = hah[19];
        gs21 = hah[20];
        gs22 = hah[21];
        gs23 = hah[22];
        gs24 = hah[23];
        gs25 = hah[24];
        gs26 = hah[25];
        gs27 = hah[26];
        gs28 = hah[27];
        gs29 = hah[28];
        gs30 = hah[29];
        gs31 = hah[30];
        gs32 = hah[31];
        gs33 = hah[32];
        gs34 = hah[33];
        gs35 = hah[34];
        gs36 = hah[35];
        gs37 = hah[36];
        gs38 = hah[37];
        gs39 = hah[38];
        gs40 = hah[39];
        gs41 = hah[40];
        gs42 = hah[41];
        gs43 = hah[42];
        gs44 = hah[43];
        gs45 = hah[44];
        gs46 = hah[45];
        gs47 = hah[46];
        gs48 = hah[47];
        gs49 = hah[48];
        gs50 = hah[49];
        gs51 = hah[50];
        gs52 = hah[51];
        gs53 = hah[52];
        gs54 = hah[53];
        gs55 = hah[54];
        gs56 = hah[55];
        gs57 = hah[56];
        gs58 = hah[57];
        gs59 = hah[58];
        gs60 = hah[59];
        gs61 = hah[60];
        gs62 = hah[61];
        gs63 = hah[62];
        gs64 = hah[63];
        gs65 = hah[64];
        gs66 = hah[65];
        gs67 = hah[66];
        gs68 = hah[67];
        gs69 = hah[68];
        gs70 = hah[69];
        gs71 = hah[70];
        gs72 = hah[71];
        gs73 = hah[72];
        gs74 = hah[73];
        gs75 = hah[74];

        gs76 = hah[75];
        gs77 = hah[76];
        gs78 = hah[77];
        gs79 = hah[78];
        gs80 = hah[79];
        gs81 = hah[80];
        gs82 = hah[81];
        gs83 = hah[82];
        gs84 = hah[83];
        gs85 = hah[84];
        gs86 = hah[85];
        gs87 = hah[86];
        gs88 = hah[87];
        gs89 = hah[88];
        gs90 = hah[89];

        gs91 = hah[90];
        gs92 = hah[91];
        gs93 = hah[92];
        gs94 = hah[93];
        gs95 = hah[94];
        gs96 = hah[95];
        gs97 = hah[96];
        gs98 = hah[97];
        gs99 = hah[98];
        gs100 = hah[99];
        gs101 = hah[100];
        gs102 = hah[101];
        gs103 = hah[102];
        gs104 = hah[103];

        gs105 = hah[104];
        gs106 = hah[105];
        */


        //selecting();

    }

    /**
     * Handles the onClick for the "Reply" button. Gets the message from the
     * second EditText, creates an intent, and returns that message back to
     * the main activity.
     *
     * @param view The view (Button) that was clicked.
     */
    public void returnReply(View view) {
        // Get the reply message from the edit text.
        String reply = mReply.getText().toString();

        // Create a new intent for the reply, add the reply message to it
        // as an extra, set the intent result, and close the activity.
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /*
    public void selecting() {
        String selected1 = "Adanya rasa gatal";
        if (selected.equals(gs1)){
            g1=1;
        }
        if (selected.equals(gs2)){
            g2=1;

        }
        if (selected.equals(gs3)){
            g3=1;

        }
        if (selected.equals(gs4)){
            g4=1;
        }
        if (selected.equals(gs5)){
            g5=1;
        }
        if (selected.equals(gs6)){
            g6=1;

        }
        if (selected.equals(gs7)){
            g7=1;
        }
        if (selected.equals(gs8)){
            g8=1;
        }
        if (selected.equals(gs9)){
            g9=1;
        }
        if (selected.equals(gs10)){
            g10=1;
        }
        if (selected.equals(gs11)){
            g11=1;
        }
        if (selected.equals(gs12)){
            g12=1;
        }
        if (selected.equals(gs13)){
            g13=1;
        }
        if (selected.equals(gs14)){
            g14=1;
        }
        if (selected.equals(gs15)){
            g15=1;
        }
        if (selected.equals(gs16)){
            g16=1;
        }
        if (selected.equals(gs17)){
            g17=1;
        }
        if (selected.equals(gs18)){
            g18=1;
        }
        if (selected.equals(gs19)){
            g19=1;
        }
        if (selected.equals(gs20)){
            g20=1;
        }
        if (selected.equals(gs21)){
            g21=1;
        }
        if (selected.equals(gs22)){
            g22=1;
        }
        if (selected.equals(gs23)){
            g23=1;
        }
        if (selected.equals(gs24)){
            g24=1;
        }
        if (selected.equals(gs25)){
            g25=1;
        }
        if (selected.equals(gs26)){
            g26=1;
        }
        if (selected.equals(gs27)){
            g27=1;
        }
        if (selected.equals(gs28)){
            g28=1;
        }
        if (selected.equals(gs29)){
            g29=1;
        }
        if (selected.equals(gs30)){
            g30=1;
        }
        if (selected.equals(gs31)){
            g31=1;
        }
        if (selected.equals(gs32)){
            g32=1;
        }
        if (selected.equals(gs33)){
            g33=1;
        }
        if (selected.equals(gs34)){
            g34=1;
        }
        if (selected.equals(gs35)){
            g35=1;
        }
        if (selected.equals(gs36)){
            g36=1;
        }
        if (selected.equals(gs37)){
            g37=1;
        }
        if (selected.equals(gs38)){
            g38=1;
        }
        if (selected.equals(gs39)){
            g39=1;
        }
        if (selected.equals(gs40)){
            g40=1;
        }
        if (selected.equals(gs41)){
            g41=1;
        }
        if (selected.equals(gs42)){
            g42=1;
        }
        if (selected.equals(gs43)){
            g43=1;
        }
        if (selected.equals(gs44)){
            g44=1;
        }
        if (selected.equals(gs45)){
            g45=1;
        }
        if (selected.equals(gs46)){
            g46=1;
        }
        if (selected.equals(gs47)){
            g47=1;
        }
        if (selected.equals(gs48)){
            g48=1;
        }
        if (selected.equals(gs49)){
            g49=1;
        }
        if (selected.equals(gs50)){
            g50=1;
        }
        if (selected.equals(gs51)){
            g51=1;
        }
        if (selected.equals(gs52)){
            g52=1;
        }
        if (selected.equals(gs53)){
            g53=1;
        }
        if (selected.equals(gs54)){
            g54=1;
        }
        if (selected.equals(gs55)){
            g55=1;
        }
        if (selected.equals(gs56)){
            g56=1;
        }
        if (selected.equals(gs57)){
            g57=1;
        }
        if (selected.equals(gs58)){
            g58=1;
        }
        if (selected.equals(gs59)){
            g59=1;
        }
        if (selected.equals(gs60)){
            g60=1;
        }
        if (selected.equals(gs61)){
            g61=1;
        }
        if (selected.equals(gs62)){
            g62=1;
        }
        if (selected.equals(gs63)){
            g63=1;
        }
        if (selected.equals(gs64)){
            g64=1;
        }
        if (selected.equals(gs65)){
            g65=1;
        }
        if (selected.equals(gs66)){
            g66=1;
        }
        if (selected.equals(gs67)){
            g67=1;
        }
        if (selected.equals(gs68)){
            g68=1;
        }
        if (selected.equals(gs69)){
            g69=1;
        }
        if (selected.equals(gs70)){
            g70=1;
        }
        if (selected.equals(gs71)){
            g71=1;
        }
        if (selected.equals(gs72)){
            g72=1;
        }
        if (selected.equals(gs73)){
            g73=1;
        }
        if (selected.equals(gs74)){
            g74=1;
        }
        if (selected.equals(gs75)){
            g75=1;
        }
        if (selected.equals(gs76)){
            g76=1;
        }
        if (selected.equals(gs77)){
            g77=1;
        }
        if (selected.equals(gs78)){
            g78=1;
        }
        if (selected.equals(gs79)){
            g79=1;
        }
        if (selected.equals(gs80)){
            g80=1;
        }
        if (selected.equals(gs81)){
            g81=1;
        }
        if (selected.equals(gs82)){
            g82=1;
        }
        if (selected.equals(gs83)){
            g83=1;
        }
        if (selected.equals(gs84)){
            g84=1;
        }
        if (selected.equals(gs85)){
            g85=1;
        }
        if (selected.equals(gs86)){
            g86=1;
        }
        if (selected.equals(gs87)){
            g87=1;
        }
        if (selected.equals(gs88)){
            g88=1;
        }
        if (selected.equals(gs89)){
            g89=1;
        }
        if (selected.equals(gs90)){
            g90=1;
        }
        if (selected.equals(gs91)){
            g91=1;
        }
        if (selected.equals(gs92)){
            g92=1;
        }
        if (selected.equals(gs93)){
            g93=1;
        }
        if (selected.equals(gs94)){
            g94=1;
        }
        if (selected.equals(gs95)){
            g95=1;
        }
        if (selected.equals(gs96)){
            g96=1;
        }
        if (selected.equals(gs97)){
            g97=1;
        }
        if (selected.equals(gs98)){
            g98=1;
        }
        if (selected.equals(gs99)){
            g99=1;
        }
        if (selected.equals(gs100)){
            g100=1;
        }
        if (selected.equals(gs101)){
            g101=1;
        }
        if (selected.equals(gs102)){
            g102=1;
        }
        if (selected.equals(gs103)){
            g103=1;
        }
        if (selected.equals(gs104)){
            g104=1;
        }
        if (selected.equals(gs105)){
            g105=1;
        }
        if (selected.equals(gs106)){
            g106=1;
        }

    }

     */

    public void launch_solusi(View view) {
        Intent intent = new Intent(this, StartSolusiActivity.class);
        intent.putExtra("gx1",gy1);
        intent.putExtra("gx2",gy2);
        intent.putExtra("gx3",gy3);
        intent.putExtra("gx4",gy4);
        intent.putExtra("gx5",gy5);
        intent.putExtra("gx6",gy6);
        intent.putExtra("gx7",gy7);
        intent.putExtra("gx8",gy8);
        intent.putExtra("gx9",gy9);
        intent.putExtra("gx10",gy10);
        intent.putExtra("gx11",gy11);
        intent.putExtra("gx12",gy12);
        intent.putExtra("gx13",gy13);
        intent.putExtra("gx14",gy14);
        intent.putExtra("gx15",gy15);
        intent.putExtra("gx16",gy16);
        intent.putExtra("gx17",gy17);
        intent.putExtra("gx18",gy18);
        intent.putExtra("gx19",gy19);
        intent.putExtra("gx20",gy20);
        intent.putExtra("gx21",gy21);
        intent.putExtra("gx22",gy22);
        intent.putExtra("gx23",gy23);
        intent.putExtra("gx24",gy24);
        intent.putExtra("gx25",gy25);
        intent.putExtra("gx26",gy26);
        intent.putExtra("gx27",gy27);
        intent.putExtra("gx28",gy28);
        intent.putExtra("gx29",gy29);
        intent.putExtra("gx30",gy30);
        intent.putExtra("gx31",gy31);
        intent.putExtra("gx32",gy32);
        intent.putExtra("gx33",gy33);
        intent.putExtra("gx34",gy34);
        intent.putExtra("gx35",gy35);
        intent.putExtra("gx36",gy36);
        intent.putExtra("gx37",gy37);
        intent.putExtra("gx38",gy38);
        intent.putExtra("gx39",gy39);
        intent.putExtra("gx40",gy40);
        intent.putExtra("gx41",gy41);
        intent.putExtra("gx42",gy42);
        intent.putExtra("gx43",gy43);
        intent.putExtra("gx44",gy44);
        intent.putExtra("gx45",gy45);
        intent.putExtra("gx46",gy46);
        intent.putExtra("gx47",gy47);
        intent.putExtra("gx48",gy48);
        intent.putExtra("gx49",gy49);
        intent.putExtra("gx50",gy50);
        intent.putExtra("gx51",gy51);
        intent.putExtra("gx52",gy52);
        intent.putExtra("gx53",gy53);
        intent.putExtra("gx54",gy54);
        intent.putExtra("gx55",gy55);
        intent.putExtra("gx56",gy56);
        intent.putExtra("gx57",gy57);
        intent.putExtra("gx58",gy58);
        intent.putExtra("gx59",gy59);
        intent.putExtra("gx60",gy60);
        intent.putExtra("gx61",gy61);
        intent.putExtra("gx62",gy62);
        intent.putExtra("gx63",gy63);
        intent.putExtra("gx64",gy64);
        intent.putExtra("gx65",gy65);
        intent.putExtra("gx66",gy66);
        intent.putExtra("gx67",gy67);
        intent.putExtra("gx68",gy68);
        intent.putExtra("gx69",gy69);
        intent.putExtra("gx70",gy70);
        intent.putExtra("gx71",gy71);
        intent.putExtra("gx72",gy72);
        intent.putExtra("gx73",gy73);
        intent.putExtra("gx74",gy74);
        intent.putExtra("gx75",gy75);
        intent.putExtra("gx76",gy76);
        intent.putExtra("gx77",gy77);
        intent.putExtra("gx78",gy78);
        intent.putExtra("gx79",gy79);
        intent.putExtra("gx80",gy80);
        intent.putExtra("gx81",gy81);
        intent.putExtra("gx82",gy82);
        intent.putExtra("gx83",gy83);
        intent.putExtra("gx84",gy84);
        intent.putExtra("gx85",gy85);
        intent.putExtra("gx86",gy86);
        intent.putExtra("gx87",gy87);
        intent.putExtra("gx88",gy88);
        intent.putExtra("gx89",gy89);
        intent.putExtra("gx90",gy90);
        intent.putExtra("gx91",gy91);
        intent.putExtra("gx92",gy92);
        intent.putExtra("gx93",gy93);
        intent.putExtra("gx94",gy94);
        intent.putExtra("gx95",gy95);
        intent.putExtra("gx96",gy96);
        intent.putExtra("gx97",gy97);
        intent.putExtra("gx98",gy98);
        intent.putExtra("gx99",gy99);
        intent.putExtra("gx100",gy100);
        intent.putExtra("gx101",gy101);
        intent.putExtra("gx102",gy102);
        intent.putExtra("gx103",gy103);
        intent.putExtra("gx104",gy104);
        intent.putExtra("gx105",gy105);
        intent.putExtra("gx106",gy106);
        intent.putExtra("getcount9",getcount2);
        startActivity(intent);
    }
}
