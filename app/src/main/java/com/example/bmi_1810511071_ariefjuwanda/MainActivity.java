package com.example.bmi_1810511071_ariefjuwanda;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText txtBeratBadan, txtTinggiBadan;
        TextView txtStatusBadan;
        Button btnCekBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBeratBadan = findViewById(R.id.txtBeratBadan);
        txtTinggiBadan = findViewById(R.id.txtTinggiBadan);
        txtStatusBadan = findViewById(R.id.txtStatusBadan);
        btnCekBMI = findViewById(R.id.btnCekBMI);

        btnCekBMI.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String stringBeratBadan = txtBeratBadan.getText().toString();
                String stringTinggiBadan = txtTinggiBadan.getText().toString();

                double BeratBadan = Double.parseDouble(stringBeratBadan);
                double TinggiBadan = Double.parseDouble(stringTinggiBadan);
            }

        });
    }
}