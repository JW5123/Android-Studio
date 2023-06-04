package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView timeView;

    ImageView img_11, img_12, img_13, img_14, img_21, img_22, img_23, img_24, img_31, img_32, img_33, img_34;

    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    Button restart;

    int img101, img102, img103, img104, img105, img106, img201, img202, img203, img204, img205, img206;

    int firstCard, secondCard;
    int clickFirst, clickSecond;
    int cardNumber = 1;

    boolean isTimerRunning = false;
    int seconds = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.Tropical_Orange));

        timeView = (TextView) findViewById(R.id.timeView);

        img_11 = (ImageView) findViewById(R.id.img_11);
        img_12 = (ImageView) findViewById(R.id.img_12);
        img_13 = (ImageView) findViewById(R.id.img_13);
        img_14 = (ImageView) findViewById(R.id.img_14);
        img_21 = (ImageView) findViewById(R.id.img_21);
        img_22 = (ImageView) findViewById(R.id.img_22);
        img_23 = (ImageView) findViewById(R.id.img_23);
        img_24 = (ImageView) findViewById(R.id.img_24);
        img_31 = (ImageView) findViewById(R.id.img_31);
        img_32 = (ImageView) findViewById(R.id.img_32);
        img_33 = (ImageView) findViewById(R.id.img_33);
        img_34 = (ImageView) findViewById(R.id.img_34);

        restart = (Button) findViewById(R.id.R_button);

        img_11.setTag("0");
        img_12.setTag("1");
        img_13.setTag("2");
        img_14.setTag("3");
        img_21.setTag("4");
        img_22.setTag("5");
        img_23.setTag("6");
        img_24.setTag("7");
        img_31.setTag("8");
        img_32.setTag("9");
        img_33.setTag("10");
        img_34.setTag("11");

        frontOfCardsResource();

        Collections.shuffle(Arrays.asList(cardArray));

        img_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_11, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_12, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_13, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_14, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_21, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_22, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_23, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_24, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_31, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_32, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_33, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        img_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img_34, theCard);
                if (!isTimerRunning) {
                    startTimer();
                }
            }
        });

        // reset
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

    }

     // 設定圖片
    private void frontOfCardsResource(){
        img101 = R.drawable.img101;
        img102 = R.drawable.img102;
        img103 = R.drawable.img103;
        img104 = R.drawable.img104;
        img105 = R.drawable.img105;
        img106 = R.drawable.img106;
        img201 = R.drawable.img201;
        img202 = R.drawable.img202;
        img203 = R.drawable.img203;
        img204 = R.drawable.img204;
        img205 = R.drawable.img205;
        img206 = R.drawable.img206;
    }

    //
    private void doStuff(ImageView iv, int card){
        if(cardArray[card] == 101){
            iv.setImageResource(img101);
        }
        else if(cardArray[card] == 102){
            iv.setImageResource(img102);
        }
        else if(cardArray[card] == 103){
            iv.setImageResource(img103);
        }
        else if(cardArray[card] == 104){
            iv.setImageResource(img104);
        }
        else if(cardArray[card] == 105){
            iv.setImageResource(img105);
        }
        else if(cardArray[card] == 106){
            iv.setImageResource(img106);
        }
        else if(cardArray[card] == 201){
            iv.setImageResource(img201);
        }
        else if(cardArray[card] == 202){
            iv.setImageResource(img202);
        }
        else if(cardArray[card] == 203){
            iv.setImageResource(img203);
        }
        else if(cardArray[card] == 204){
            iv.setImageResource(img204);
        }
        else if(cardArray[card] == 205){
            iv.setImageResource(img205);
        }
        else if(cardArray[card] == 206){
            iv.setImageResource(img206);
        }

        if(cardNumber == 1){
            firstCard = cardArray[card];
            if(firstCard > 200){
                firstCard -= 100;
            }
            cardNumber = 2;
            clickFirst = card;

            iv.setEnabled(false);
        }
        else if(cardNumber == 2){
            secondCard = cardArray[card];
            if(secondCard > 200){
                secondCard -= 100;
            }
            cardNumber = 1;
            clickSecond = card;

            // 防止按鈕再次被點擊消失
            img_11.setEnabled(false);
            img_12.setEnabled(false);
            img_13.setEnabled(false);
            img_14.setEnabled(false);
            img_21.setEnabled(false);
            img_22.setEnabled(false);
            img_23.setEnabled(false);
            img_24.setEnabled(false);
            img_31.setEnabled(false);
            img_32.setEnabled(false);
            img_33.setEnabled(false);
            img_34.setEnabled(false);

            // 圖片消失延遲時間
            Handler hand = new Handler();
            hand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 500);
        }
    }

    // 若相同則隱藏
    private void calculate(){
        if(firstCard == secondCard){
            if(clickFirst == 0){
                img_11.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 1){
                img_12.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 2){
                img_13.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 3){
                img_14.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 4){
                img_21.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 5){
                img_22.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 6){
                img_23.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 7){
                img_24.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 8){
                img_31.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 9){
                img_32.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 10){
                img_33.setVisibility(View.INVISIBLE);
            }
            else if(clickFirst == 11){
                img_34.setVisibility(View.INVISIBLE);
            }

            if(clickSecond == 0){
                img_11.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 1){
                img_12.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 2){
                img_13.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 3){
                img_14.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 4){
                img_21.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 5){
                img_22.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 6){
                img_23.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 7){
                img_24.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 8){
                img_31.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 9){
                img_32.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 10){
                img_33.setVisibility(View.INVISIBLE);
            }
            else if(clickSecond == 11){
                img_34.setVisibility(View.INVISIBLE);
            }
        }
        else{
            img_11.setImageResource(R.drawable.question_mark);
            img_12.setImageResource(R.drawable.question_mark);
            img_13.setImageResource(R.drawable.question_mark);
            img_14.setImageResource(R.drawable.question_mark);
            img_21.setImageResource(R.drawable.question_mark);
            img_22.setImageResource(R.drawable.question_mark);
            img_23.setImageResource(R.drawable.question_mark);
            img_24.setImageResource(R.drawable.question_mark);
            img_31.setImageResource(R.drawable.question_mark);
            img_32.setImageResource(R.drawable.question_mark);
            img_33.setImageResource(R.drawable.question_mark);
            img_34.setImageResource(R.drawable.question_mark);

        }

        // 允許點擊事件發生
        img_11.setEnabled(true);
        img_12.setEnabled(true);
        img_13.setEnabled(true);
        img_14.setEnabled(true);
        img_21.setEnabled(true);
        img_22.setEnabled(true);
        img_23.setEnabled(true);
        img_24.setEnabled(true);
        img_31.setEnabled(true);
        img_32.setEnabled(true);
        img_33.setEnabled(true);
        img_34.setEnabled(true);

        checkEnd();
    }

    public void checkEnd(){
        if(img_11.getVisibility() == View.INVISIBLE &&
                img_12.getVisibility() == View.INVISIBLE &&
                img_13.getVisibility() == View.INVISIBLE &&
                img_14.getVisibility() == View.INVISIBLE &&
                img_21.getVisibility() == View.INVISIBLE &&
                img_22.getVisibility() == View.INVISIBLE &&
                img_23.getVisibility() == View.INVISIBLE &&
                img_24.getVisibility() == View.INVISIBLE &&
                img_31.getVisibility() == View.INVISIBLE &&
                img_32.getVisibility() == View.INVISIBLE &&
                img_33.getVisibility() == View.INVISIBLE &&
                img_34.getVisibility() == View.INVISIBLE ){
            OverTime();
        }
    }

    public void startTimer() {
        isTimerRunning = true;

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                String time = String.format(getResources().getString(R.string.time), hours, minutes, secs);
                timeView.setText(time);

                if (isTimerRunning) {
                    seconds++;
                    handler.postDelayed(this, 1000);
                }
            }
        });
    }
    public void OverTime() {
        isTimerRunning = false;
    }
}