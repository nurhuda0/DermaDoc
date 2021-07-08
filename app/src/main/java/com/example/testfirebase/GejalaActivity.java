package com.example.testfirebase;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class GejalaActivity extends AppCompatActivity {
ListView myList;
        Button button_main, clearAll;
        SharedPreferences sharedpreferences;
        public static final String MyPREFERENCES = "MyChoice" ;
        ArrayList<String> selectedItems = new ArrayList<String>();

        public static final int FINAL=0;

        int gcount = 0;
        int dada=98;

private static final String LOG_TAG = GejalaActivity.class.getSimpleName();
// Unique tag required for the intent extra
public static final String EXTRA_MESSAGE
        = "com.example.android.testfirebase.extra.MESSAGE";
// Unique tag for the intent reply
public static final int TEXT_REQUEST = 1;

        public static Intent getActIntent(Activity activity) {
                // kode untuk pengambilan Intent
                return new Intent(activity, GejalaActivity.class);
        }

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

        @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala);

        myList = (ListView)findViewById(R.id.list);

        clearAll = (Button)findViewById(R.id.clearall);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, getResources().getStringArray(R.array.gejala_penyakit));
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setAdapter(adapter);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        if(sharedpreferences.contains(MyPREFERENCES)){
        LoadSelections();
        }


        clearAll.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
// TODO Auto-generated method stub
        ClearSelections();
        }
        });
        // Initialize all the view variables.

        }

public void launchSecondActivity(View view) {
        String selected = "";
        String selectedrt = "";
        String selectedn = "";
        String selectedf = "";

        int cntChoice = myList.getCount();

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

        SparseBooleanArray sparseBooleanArray = myList.getCheckedItemPositions();
        for(int i = 0; i < cntChoice; i++){
        if(sparseBooleanArray.get(i)) {

                selected = myList.getItemAtPosition(i).toString();
                selectedrt += myList.getItemAtPosition(i).toString();

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
                gcount+=1;



        selectedn += selectedrt + "\n";
                selectedf += myList.getItemAtPosition(i).toString() + "\n";;
        System.out.println("Checking list while adding:" + myList.getItemAtPosition(i).toString());
        SaveSelections();


        }

        }
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, TampilGejalaActivity.class);
        intent.putExtra(EXTRA_MESSAGE, selectedn);
        intent.putExtra("finally",selectedf);
        intent.putExtra("bah",98);
        intent.putExtra("gz1",g1);
        intent.putExtra("gz2",g2);
        intent.putExtra("gz3",g3);
        intent.putExtra("gz4",g4);
        intent.putExtra("gz5",g5);
        intent.putExtra("gz6",g6);
        intent.putExtra("gz7",g7);
        intent.putExtra("gz8",g8);
        intent.putExtra("gz9",g9);
        intent.putExtra("gz10",g10);
        intent.putExtra("gz11",g11);
        intent.putExtra("gz12",g12);
        intent.putExtra("gz13",g13);
        intent.putExtra("gz14",g14);
        intent.putExtra("gz15",g15);
        intent.putExtra("gz16",g16);
        intent.putExtra("gz17",g17);
        intent.putExtra("gz18",g18);
        intent.putExtra("gz19",g19);
        intent.putExtra("gz20",g20);
        intent.putExtra("gz21",g21);
        intent.putExtra("gz22",g22);
        intent.putExtra("gz23",g23);
        intent.putExtra("gz24",g24);
        intent.putExtra("gz25",g25);
        intent.putExtra("gz26",g26);
        intent.putExtra("gz27",g27);
        intent.putExtra("gz28",g28);
        intent.putExtra("gz29",g29);
        intent.putExtra("gz30",g30);
        intent.putExtra("gz31",g31);
        intent.putExtra("gz32",g32);
        intent.putExtra("gz33",g33);
        intent.putExtra("gz34",g34);
        intent.putExtra("gz35",g35);
        intent.putExtra("gz36",g36);
        intent.putExtra("gz37",g37);
        intent.putExtra("gz38",g38);
        intent.putExtra("gz39",g39);
        intent.putExtra("gz40",g40);
        intent.putExtra("gz41",g41);
        intent.putExtra("gz42",g42);
        intent.putExtra("gz43",g43);
        intent.putExtra("gz44",g44);
        intent.putExtra("gz45",g45);
        intent.putExtra("gz46",g46);
        intent.putExtra("gz47",g47);
        intent.putExtra("gz48",g48);
        intent.putExtra("gz49",g49);
        intent.putExtra("gz50",g50);
        intent.putExtra("gz51",g51);
        intent.putExtra("gz52",g52);
        intent.putExtra("gz53",g53);
        intent.putExtra("gz54",g54);
        intent.putExtra("gz55",g55);
        intent.putExtra("gz56",g56);
        intent.putExtra("gz57",g57);
        intent.putExtra("gz58",g58);
        intent.putExtra("gz59",g59);
        intent.putExtra("gz60",g60);
        intent.putExtra("gz61",g61);
        intent.putExtra("gz62",g62);
        intent.putExtra("gz63",g63);
        intent.putExtra("gz64",g64);
        intent.putExtra("gz65",g65);
        intent.putExtra("gz66",g66);
        intent.putExtra("gz67",g67);
        intent.putExtra("gz68",g68);
        intent.putExtra("gz69",g69);
        intent.putExtra("gz70",g70);
        intent.putExtra("gz71",g71);
        intent.putExtra("gz72",g72);
        intent.putExtra("gz73",g73);
        intent.putExtra("gz74",g74);
        intent.putExtra("gz75",g75);
        intent.putExtra("gz76",g76);
        intent.putExtra("gz77",g77);
        intent.putExtra("gz78",g78);
        intent.putExtra("gz79",g79);
        intent.putExtra("gz80",g80);
        intent.putExtra("gz81",g81);
        intent.putExtra("gz82",g82);
        intent.putExtra("gz83",g83);
        intent.putExtra("gz84",g84);
        intent.putExtra("gz85",g85);
        intent.putExtra("gz86",g86);
        intent.putExtra("gz87",g87);
        intent.putExtra("gz88",g88);
        intent.putExtra("gz89",g89);
        intent.putExtra("gz90",g90);
        intent.putExtra("gz91",g91);
        intent.putExtra("gz92",g92);
        intent.putExtra("gz93",g93);
        intent.putExtra("gz94",g94);
        intent.putExtra("gz95",g95);
        intent.putExtra("gz96",g96);
        intent.putExtra("gz97",g97);
        intent.putExtra("gz98",g98);
        intent.putExtra("gz99",g99);
        intent.putExtra("gz100",g100);
        intent.putExtra("gz101",g101);
        intent.putExtra("gz102",g102);
        intent.putExtra("gz103",g103);
        intent.putExtra("gz104",g104);
        intent.putExtra("gz105",g105);
        intent.putExtra("gz106",g106);
        intent.putExtra("getcount1",gcount);

        startActivityForResult(intent, TEXT_REQUEST);
        }


private void SaveSelections() {
// save the selections in the shared preference in private mode for the user

        SharedPreferences.Editor prefEditor = sharedpreferences.edit();
        String savedItems = getSavedItems();
        prefEditor.putString(MyPREFERENCES.toString(), savedItems);
        prefEditor.commit();
        }

private String getSavedItems() {
        String savedItems = "";
        int count = this.myList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
        if (this.myList.isItemChecked(i)) {
        if (savedItems.length() > 0) {
        savedItems += "," + this.myList.getItemAtPosition(i);
        } else {
        savedItems += this.myList.getItemAtPosition(i);
        }
        }
        }
        return savedItems;
        }

private void LoadSelections() {
// if the selections were previously saved load them

        if (sharedpreferences.contains(MyPREFERENCES.toString())) {

        String savedItems = sharedpreferences.getString(MyPREFERENCES.toString(), "");
        selectedItems.addAll(Arrays.asList(savedItems.split(",")));

        int count = this.myList.getAdapter().getCount();

        for (int i = 0; i < count; i++) {
        String currentItem = (String) myList.getAdapter().getItem(i);
        if (selectedItems.contains(currentItem)) {
        myList.setItemChecked(i, true);
        } else {
        myList.setItemChecked(i, false);
        }

        }
        }
        }

private void ClearSelections() {
// user mengklik tombol clear jadi semua item ter-uncheck
        int count = this.myList.getAdapter().getCount();
        for (int i = 0; i < count; i++) {
        this.myList.setItemChecked(i, false);
        }
// also clear the saved selections
        SaveSelections();
        }
}
