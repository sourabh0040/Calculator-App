package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Currency extends AppCompatActivity {
    private RadioGroup radioGroup;

    TextView txtView;
    EditText editText;
    Button Convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cureency);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        editText = findViewById(R.id.editText);
        txtView = findViewById(R.id.textView);
        Convert = findViewById(R.id.btn);
        radioGroup =  findViewById(R.id.groupRadio);
        radioGroup.clearCheck();

    }

    public void onRadioButtonClicked(View view) {
        Boolean Checked =((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radioButton1:
                if(Checked) {
                    Convert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        final double ans;
                        int Value ;
                        Value = Integer.parseInt(editText.getText().toString());
                        ans = (double) Value / 75.51;
                        txtView.setText("" + ans);
                    }
                    });

                    break;
                }



            case R.id.radioButton2:
                if(Checked) {
                    Convert.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            final double ans;
                            int Value = Integer.parseInt(editText.getText().toString());
                            ans = (double) Value * 75.51;
                            txtView.setText("" + ans);
                        }
                    });
                    break;
                }

            default:

                break;

        }
    }
    }
