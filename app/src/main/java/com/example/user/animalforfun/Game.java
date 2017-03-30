package com.example.user.animalforfun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {
    //Explicit
    Button btn1,btn2,btn3,btn4;
    ImageView QuestionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Initial View
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        QuestionImageView = (ImageView) findViewById(R.id.imvQuestion);
        volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);
        for (int i=1;i<=questionCount; i++){
            qID.add(i);
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));


    } //main Method

    public void setQuestion(Integer qID) {
        if (qID ==1){
            answer = "นก";
            QuestionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.bird);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==2){
            answer = "เเมว";
            QuestionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.cat);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("เเมว");
            choice.add("ช้าง");
            choice.add("น้องหมา");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==3){
            answer = "วัว";
            QuestionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.cow);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==4){
            answer = "น้องหมา";
            QuestionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.dog);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("น้องหมา");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==5){
            answer = "ช้าง";
            QuestionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.elephant);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==6){
            answer = "ม้า";
            QuestionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.horse);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==7){
            answer = "สิงโต";
            QuestionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.lion);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==8){
            answer = "ยุ่ง";
            QuestionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.mosquito);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("ยุ่ง");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==9){
            answer = "หมู";
            QuestionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.pig);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID ==10){
            answer = "เเกะ";
            QuestionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = mediaPlayer.create(this,R.raw.sheep);
            ArrayList<String> choice= new ArrayList<String>();
            choice.add("เเกะ");
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//End setQuestion method
    public void choiceAns (View view){
        Button button = (Button) view;
        String buttonString = button.getText().toString(); //เก็บข้อความลงปุ่ม
        if (buttonString.equals(answer)){
            score++;
        }
        if (qID.isEmpty()){ //ทำครบทุกข้อเเล้วหรือยัง
            dialogBoxScore();
        }else {
            setQuestion(qID.remove(0));
        }
    }//End choiceAns Method

    private void dialogBoxScore() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนน");
        builder.setMessage("คุณได้คะเเนน"+ score+"คะแนน")
        .setCancelable(false)
        .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent =getIntent();
                finish();
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }//End dialogBoxScore Method

    //play sound
    public void playSound (View view){
        mediaPlayer.start();
    } //End playSound Method
} //main Class
