package com.example.calculatorchmod;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculator;

    private TextView txtOwnerOctal,txtGroupOctal,txtPublicOctal, txtSOwnerReader, txxtSOwnerWrite,
            txtSOwnerExecute, txtSGroupReader, txtSGroupWrite, txtSGroupExecute, txtSPublicReader,
            txtSPublicWrite, txtSPublicExecute;

    private Switch sOwnerReader, sOwnerWrite, sOwnerExcute, sGroupReader, sGroupWrite, sGroupExcute,
            sPublicReader, sPublicWrite, sPublicExcute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button
        btnCalculator = (Button) findViewById(R.id.btnCalculator);

        //TextView
        txtOwnerOctal     = (TextView) findViewById(R.id.txtOwnerOctal);
        txtGroupOctal     = (TextView)findViewById(R.id.txtGroupOctal);
        txtPublicOctal    = (TextView)findViewById(R.id.txtPublicOctal);
        txtSOwnerReader   = (TextView) findViewById(R.id.txtSOwnerReader);
        txxtSOwnerWrite   = (TextView) findViewById(R.id.txxtSOwnerWrite);
        txtSOwnerExecute  = (TextView) findViewById(R.id.txtSOwnerExecute);
        txtSGroupReader   = (TextView) findViewById(R.id.txtSGroupReader);
        txtSGroupWrite    = (TextView) findViewById(R.id.txtSGroupWrite);
        txtSGroupExecute  = (TextView) findViewById(R.id.txtSGroupExecute);
        txtSPublicReader  = (TextView) findViewById(R.id.txtSPublicReader);
        txtSPublicWrite   = (TextView) findViewById(R.id.txtSPublicWrite);
        txtSPublicExecute = (TextView) findViewById(R.id.txtSPublicExecute);

        //Owner
        sOwnerReader = (Switch) findViewById(R.id.sOwnerReader);
        sOwnerWrite  = (Switch) findViewById(R.id.sOwnerWrite);
        sOwnerExcute = (Switch) findViewById(R.id.sOwnerExcute);

        //Group
        sGroupReader = (Switch) findViewById(R.id.sGroupReader);
        sGroupWrite  = (Switch) findViewById(R.id.sGroupWrite);
        sGroupExcute = (Switch) findViewById(R.id.sGroupExcute);

        //Public
        sPublicReader = (Switch) findViewById(R.id.sPublicReader);
        sPublicWrite  = (Switch) findViewById(R.id.sPublicWrite);
        sPublicExcute = (Switch) findViewById(R.id.sPublicExcute);
    }

    public void seleccionar(View view) {
        octal();
        group();
        publiC();
        Symbolic();
    }

    public void octal(){
        int totalS = 0;
        String total_string = "";

        if(!sOwnerExcute.isChecked() && !sOwnerWrite.isChecked() && !sOwnerReader.isChecked()){ txtOwnerOctal.setText("0");
        }
        if(!sGroupExcute.isChecked() && !sGroupWrite.isChecked() && !sGroupReader.isChecked()){ txtGroupOctal.setText("0");
        }
        if(!sPublicExcute.isChecked() && !sPublicWrite.isChecked() && !sPublicReader.isChecked()){ txtPublicOctal.setText("0");
        }

        if(sOwnerReader.isChecked()){
            totalS +=4;
            txtOwnerOctal.setText(String.valueOf(totalS));
        }
        if(sOwnerWrite.isChecked()){
            totalS +=2;
            txtOwnerOctal.setText(String.valueOf(totalS));
        }
        if(sOwnerExcute.isChecked()){
            totalS +=1;
            txtOwnerOctal.setText(String.valueOf(totalS));
        }
    }
    public void group(){
        int totalS = 0;
        String total_string = "";
        if(sGroupReader.isChecked()){
            totalS +=4;
            txtGroupOctal.setText(String.valueOf(totalS));
        }
        if(sGroupWrite.isChecked()){
            totalS +=2;
            txtGroupOctal.setText(String.valueOf(totalS));
        }
        if(sGroupExcute.isChecked()){
            totalS +=1;
            txtGroupOctal.setText(String.valueOf(totalS));
        }
    }
    public void publiC(){
        int totalS = 0;
        String total_string = "";
        if(sPublicReader.isChecked()){
            totalS +=4;
            txtPublicOctal.setText(String.valueOf(totalS));
        }
        if(sPublicWrite.isChecked()){
            totalS +=2;
            txtPublicOctal.setText(String.valueOf(totalS));
        }
        if(sPublicExcute.isChecked()){
            totalS +=1;
            txtPublicOctal.setText(String.valueOf(totalS));
        }
    }
    public void Symbolic(){
        String sOReader = "", sOWrite = "", sOExecute = "", sGReader = "",
         sGExecute = "", sGWrite = "", sPReader = "", sPWrite = "",sPExecute = "";

        if (sOwnerReader.isChecked()) {sOReader = "r";}
        else{sOReader = "-";}txtSOwnerReader.setText(sOReader);

        if (sOwnerWrite.isChecked()) {sOWrite = "w";}
        else{sOWrite = "-";}txxtSOwnerWrite.setText(sOWrite);

        if (sOwnerExcute.isChecked()) {sOExecute = "x";}
        else{sOExecute = "-";}txtSOwnerExecute.setText(sOExecute);

        if (sGroupReader.isChecked()) {sGReader = "r";}
        else{sGReader = "-";}txtSGroupReader.setText(sGReader);

        if (sGroupWrite.isChecked()) {sGWrite = "w";}
        else{sGWrite = "-";}txtSGroupWrite.setText(sGWrite);

        if (sGroupExcute.isChecked()) {sGExecute = "x";}
        else{sGExecute = "-";}txtSGroupExecute.setText(sGExecute);

        if (sPublicReader.isChecked()) { sPReader = "r";}
        else{sPReader = "-";}txtSPublicReader.setText(sPReader);

        if (sPublicWrite.isChecked()) {sPWrite = "w";}
        else{sPWrite = "-";}txtSPublicWrite.setText(sPWrite);

        if (sPublicExcute.isChecked()) {sPExecute = "x";}
        else{sPExecute = "-";}txtSPublicExecute.setText(sPExecute);
    }

}