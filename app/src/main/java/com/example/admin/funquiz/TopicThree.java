package com.example.admin.funquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class TopicThree extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_three);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked on question one
        switch(view.getId()) {
            case R.id.question1A1:
                if (checked)
                    // Answer one
                    score = score + 0;
                break;
            case R.id.question1A2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;
            case R.id.question1A3:
                if (checked)
                    // Answer three, correct
                    score = score + 1;
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
                    // Answer two, correct
                    score = score + 1;
                break;
            case R.id.question3A3:
                if (checked)
                    // Answer three
                    score = score + 0;
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
                    // Answer one
                    score = score + 0;
                break;
            case R.id.question5A2:
                if (checked)
                    // Answer two
                    score = score + 0;
                break;
            case R.id.question5A3:
                if (checked)
                    // Answer three, correct
                    score = score + 1;
                break;

        }
    }

    public void ViewScore(View view) {
        displayScore(score);
    }

    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.displayScore);
        quantityTextView.setText("" + number);
    }
}
