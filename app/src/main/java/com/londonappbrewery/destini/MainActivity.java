package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTxt;
    private Button btnTop, btnBtm;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTxt = findViewById(R.id.storyTextView);
        btnTop = findViewById(R.id.buttonTop);
        btnBtm = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1 || mStoryIndex == 2) {

                    storyTxt.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBtm.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

                } else if (mStoryIndex == 3) {

                    storyTxt.setText(R.string.T6_End);
                    btnTop.setVisibility(View.GONE);
                    btnBtm.setVisibility(View.GONE);
                    mStoryIndex = 6;

                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        btnBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {

                    storyTxt.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBtm.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;

                } else if (mStoryIndex == 2) {

                    storyTxt.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBtm.setVisibility(View.GONE);
                    mStoryIndex = 4;

                } else if (mStoryIndex == 3) {

                    storyTxt.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBtm.setVisibility(View.GONE);
                    mStoryIndex = 5;

                }
            }
        });
    }
}