package com.example.admin.funquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.R.string.no;
import static com.example.admin.funquiz.R.id.question1;
import static com.example.admin.funquiz.R.id.question1A2;


public class TopicOne extends AppCompatActivity {

    int score = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_one);

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked on question one
        switch (view.getId()) {
            case R.id.question1A1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case question1A2:
                if (checked)
                    // Answer two, correct
                    score = score + 1;
                break;
            case R.id.question1A3:
                if (checked)
                    // Answer three
                    score = score + 0;
                break;

            //Check which radio button was clicked on question two
            case R.id.question2A1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.question2A2:
                if (checked)
                    // Answer two, correct
                    score = score + 1;
                break;
            case R.id.question2A3:
                if (checked)
                    // Answer three
                    score = score + 0;
                break;

            //Check which radio button was clicked on question three
            case R.id.question3A1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.question3A2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;
            case R.id.question3A3:
                if (checked)
                    // Answer three, correct
                    score = score + 1;
                break;

            //Check which radio button was clicked on question four
            case R.id.question4A1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.question4A2:
                if (checked)
                    // Answer two, correct
                    score = score + 1;
                break;
            case R.id.question4A3:
                if (checked)
                    // Answer three
                    score = score + 0;
                break;

            //Check which radio button was clicked on question five
            case R.id.question5A1:
                if (checked)
                    // Answer one, correct
                    score = score + 1;
                break;
            case R.id.question5A2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;
            case R.id.question5A3:
                if (checked)
                    // Answer three
                    score = score + 0;
                break;

        }
    }


    //view score
    public void ViewScore(View view) {

            displayScore(score);



        //Display passed in black color if score is equal or greater than 3, else failed in red color
        if (score >= 3) {
            displayPassOrFail("Passed");
            ((TextView) findViewById(R.id.comment)).setTextColor(Color.BLACK);
        } else {
            displayPassOrFail("Failed");
            ((TextView) findViewById(R.id.comment)).setTextColor(Color.RED);
        }




    }


    //view answers
    public void viewAnswers(View view) {
        answerOne("1, 2 and 3");
        answerTwo("141");
        answerThree("41");
        answerFour("Seven");
        answerFive("70");
    }


    //code for displaying answers
    private void answerOne(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.answerone);
        quantityTextView.setText("" + word);
    }

    private void answerTwo(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.answertwo);
        quantityTextView.setText("" + word);
    }

    private void answerThree(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.answerthree);
        quantityTextView.setText("" + word);
    }

    private void answerFour(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.answerfour);
        quantityTextView.setText("" + word);
    }

    private void answerFive(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.answerfive);
        quantityTextView.setText("" + word);
    }


    //code for displaying comment
    private void displayPassOrFail(String word) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.comment);
        quantityTextView.setText("" + word);
    }

    //code for displaying score
    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.displayScore);
        quantityTextView.setText("" + number);
    }
}
