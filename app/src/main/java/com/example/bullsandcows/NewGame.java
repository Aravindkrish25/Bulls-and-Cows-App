package com.example.bullsandcows;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
public class NewGame extends AppCompatActivity{
    public String generate_code(){
        String code ="";
        int max=9,min=1;
        ArrayList<Integer> a= new ArrayList<>();
        int r=new Random().nextInt(max - min + 1) + min;
        a.add(r);
        for(int i=0;i<4;i++){
            while (a.contains(r)) {
                r = new Random().nextInt(max - min + 1) + min;
            }
            a.add(r);
            System.out.println(r);
            code+=Integer.toString(r);
        }
        return code;
    }
    public static int getbulls(String guess,String code){
        int bulls=0;
        for(int i=0;i<4;i++){
            if(guess.charAt(i)==code.charAt(i)){
                bulls+=1;
            }
        }
        return bulls;
    }
    public static int getcows(String guess,String code){
        int cows=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if ((guess.charAt(i)==code.charAt(j)) && (i!=j)){
                    cows+=1;
                }
            }
        }
        return cows;
    }
    public static int num=0,moves=0;
    public static String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_game);
        final TextView bcode = (TextView) findViewById(R.id.code);
        code = generate_code();
        System.out.println(code);
        final TextView result = (TextView) findViewById(R.id.result);
        final Button b1 = (Button) findViewById(R.id.button1);
        final TextView his = (TextView) findViewById(R.id.moves);
        final TextView b = (TextView) findViewById(R.id.bulls);
        final TextView c = (TextView) findViewById(R.id.cows);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "1");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "2");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "3");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "4");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "5");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "6");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "7");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "8");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num<4) {
                    result.setText(result.getText() + "9");
                    num+=1;
                }
                else if(num==4){
                    Toast.makeText(NewGame.this, "Number Exceeded", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=0;
                result.setText("");
                b.setText("");
                c.setText("");
            }
        });
        final Button check = (Button) findViewById(R.id.submit);
        final TextView score =(TextView) findViewById(R.id.score);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num==4) {
                    moves+=1;
                    score.setText(Integer.toString(moves));
                    String guess = result.getText().toString();
                    int bulls = getbulls(guess,code);
                    b.setText(Integer.toString(bulls));
                    int cows = getcows(guess,code);
                    c.setText(Integer.toString(cows));
                    String details = guess+" --> "+"Bulls : "+(bulls)+" Cows : "+(cows)+"\n";
                    his.setText(his.getText().toString()+details);
                    num=0;
                    result.setText("");
                    if (bulls==4){
                        Toast.makeText(NewGame.this, "Game Won", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(NewGame.this, Gameover.class));
                    }
                }
                else{
                    Toast.makeText(NewGame.this, "Guess 4 digit code", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num>=1) {
                    String curr = result.getText().toString();
                    result.setText(curr.substring(0, result.length() - 1));
                    num -= 1;
                }
                else{
                    Toast.makeText(NewGame.this, "Nothing to clear", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button giveup = (Button) findViewById(R.id.giveup);
        giveup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NewGame.this,MainActivity.class));
            }
        });

    }
}
