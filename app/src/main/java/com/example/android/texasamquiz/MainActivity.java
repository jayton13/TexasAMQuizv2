package com.example.android.texasamquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.function.ToIntFunction;

public class MainActivity extends AppCompatActivity {

    float numQuestionsTotal = 5;
    float numQestionsCorrect = 0;
    int answer;
    int correctId;
    float score;
    String toastMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view)
    {
        RadioGroup radioGroup1 = (RadioGroup)(findViewById(R.id.question1));
        answer = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.answer1B);
        correctId = radioButton1.getId();
        if(answer == correctId){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        RadioGroup radioGroup2 = (RadioGroup)(findViewById(R.id.question2));
        answer = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.answer2A);
        correctId = radioButton2.getId();
        if(answer == correctId){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        RadioGroup radioGroup3 = (RadioGroup)(findViewById(R.id.question3));
        answer = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.answer3A);
        correctId = radioButton3.getId();
        if(answer == correctId){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        RadioGroup radioGroup4 = (RadioGroup)(findViewById(R.id.question4));
        answer = radioGroup4.getCheckedRadioButtonId();
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.answer4B);
        correctId = radioButton4.getId();
        if(answer == correctId){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        RadioGroup radioGroup5 = (RadioGroup)(findViewById(R.id.question5));
        answer = radioGroup5.getCheckedRadioButtonId();
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.answer5A);
        correctId = radioButton5.getId();
        if(answer == correctId){
            numQestionsCorrect = numQestionsCorrect + 1;
        }

        score = (numQestionsCorrect / numQuestionsTotal)*100;

        toastMessage = "Your score was " + score + "%!";

        Toast toast = Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_LONG);
        toast.show();

        //Reset form
        numQestionsCorrect = 0;
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();


    }


}
