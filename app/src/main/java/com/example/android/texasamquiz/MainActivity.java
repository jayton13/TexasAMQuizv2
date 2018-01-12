package com.example.android.texasamquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.ToIntFunction;

public class MainActivity extends AppCompatActivity {

    float numQuestionsTotal = 5;
    float numQestionsCorrect = 0;
    int answer;
    RadioGroup radiogroup1;
    RadioGroup radiogroup2;
    RadioGroup radiogroup3;
    RadioGroup radiogroup4;
    RadioGroup radiogroup5;
    RadioButton radiobutton1a;
    RadioButton radiobutton1b;
    RadioButton radiobutton1c;
    RadioButton radiobutton2a;
    RadioButton radiobutton2b;
    RadioButton radiobutton2c;
    RadioButton radiobutton3a;
    RadioButton radiobutton3b;
    RadioButton radioButton4a;
    RadioButton radiobutton4b;
    RadioButton radiobutton4c;
    RadioButton radiobutton5a;
    RadioButton radiobutton5b;
    int correctId;
    float score;
    String toastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup1 = (RadioGroup)findViewById(R.id.radiogroup1);
        radiogroup2 = (RadioGroup)findViewById(R.id.radiogroup2);
        radiogroup3 = (RadioGroup)findViewById(R.id.radiogroup3);
        radiogroup4 = (RadioGroup)findViewById(R.id.radiogroup4);
        radiogroup5 = (RadioGroup)findViewById(R.id.radiogroup5);

        radiobutton1a = (RadioButton)findViewById(R.id.radiobutton1a);
        radiobutton1b = (RadioButton)findViewById(R.id.radiobutton1b);
        radiobutton1c = (RadioButton)findViewById(R.id.radiobutton1c);
        radiobutton2a = (RadioButton)findViewById(R.id.radiobutton2a);
        radiobutton2b = (RadioButton)findViewById(R.id.radiobutton2b);
        radiobutton2c = (RadioButton)findViewById(R.id.radiobutton2c);
        radiobutton3a = (RadioButton)findViewById(R.id.radiobutton3a);
        radiobutton3b = (RadioButton)findViewById(R.id.radiobutton3b);
        radioButton4a = (RadioButton)findViewById(R.id.radiobutton4a);
        radiobutton4b = (RadioButton)findViewById(R.id.radiobutton4b);
        radiobutton4c = (RadioButton)findViewById(R.id.radiobutton4c);
        radiobutton5a = (RadioButton)findViewById(R.id.radiobutton5a);
        radiobutton5b = (RadioButton)findViewById(R.id.radiobutton5b);

    }

    public void checkAnswers(View view)
    {
        correctId = radiobutton1b.getId();
        answer = radiogroup1.getCheckedRadioButtonId();
        if(radiogroup1.getCheckedRadioButtonId()==radiobutton1b.getId())
        {
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        if(radiogroup2.getCheckedRadioButtonId()==radiobutton2a.getId()){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        if(radiogroup3.getCheckedRadioButtonId()==radiobutton3a.getId()){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        if(radiogroup4.getCheckedRadioButtonId()==radiobutton4b.getId()){
        numQestionsCorrect = numQestionsCorrect + 1;
        }

        if(radiogroup5.getCheckedRadioButtonId()==radiobutton5a.getId()){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        score = (numQestionsCorrect / numQuestionsTotal)*100;

        toastMessage = "Your score was " + score + "%!";

        Toast toast = Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG);
        toast.show();

        //Reset form
        numQestionsCorrect = 0;
        radiogroup1.clearCheck();
        radiogroup2.clearCheck();
        radiogroup3.clearCheck();
        radiogroup4.clearCheck();
        radiogroup5.clearCheck();


    }


}
