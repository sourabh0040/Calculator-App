package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.BidirectionalTypeConverter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    Button btn;
    EditText editText;
    TextView textView;
   private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn = findViewById(R.id.btnC);
        editText = findViewById(R.id.etView);
        textView = findViewById(R.id.txtView);

        radioGroup =findViewById(R.id.radio1);
        radioGroup.clearCheck();

    }


    public void onRadioButtonClicked(View view) {
        Boolean Checked =((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radioButton4:
                if(Checked) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            final double Value, ans;
                            Value = Double.parseDouble(editText.getText().toString());
                            ans = (double) Value * 0.305;
                            textView.setText(""+ans);

                        }
                    });

                }
                break;
            case R.id.radioButton5:
                if(Checked) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            final double Value, ans;
                            Value = Double.parseDouble(editText.getText().toString());
                            ans = (double) Value * 30.48;
                            textView.setText(""+ans);

                        }
                    });

                }
                break;
            default:

                break;
        }
    }
}