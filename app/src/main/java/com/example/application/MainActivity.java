package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultAns;
    TextView SolutionAns;
    MaterialButton button1,button2,button3,button4,button5,button6,button7;
    MaterialButton button8,button9,button0,buttonAdd,buttonDelete,buttonClear;
    MaterialButton buttonEquals,buttonConvert;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultAns=findViewById(R.id.result_Ans);
        SolutionAns=findViewById(R.id.solution_Ans);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonDelete,R.id.button_delete);
        assignId(buttonAdd,R.id.button_add);
        assignId(buttonClear,R.id.button_Clear);
        assignId(buttonEquals,R.id.button_Equals);
        assignId(buttonConvert,R.id.button_covert);
    }
    void assignId(MaterialButton btn, int id){
        btn=findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button= (MaterialButton) view;
        String buttonText=button.getText().toString();
        String data= SolutionAns.getText().toString();
        if (buttonText.equals("C")){
            SolutionAns.setText("");
            resultAns.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            resultAns.setText(result(data));
            return;
        }
        if(buttonText.equals(("x"))){
            SolutionAns.setText(data.substring(0, SolutionAns.length()-1));
            return;
        }
        if(buttonText.equals("+")||buttonText.equals("D-B")){
            return;
        }
        else{
            data=data+buttonText;
            SolutionAns.setText(data);
        }

    }
    String result(String d){
        int v= Integer.parseInt(d);
        int s=v;
        int c=0,c1=0;
        while(v!=0)
        {
            v=v/2;
            c++;
        }
        int[] a=new int[c];
        while(s!=0){
            a[c1]=s%2;
            s=s/2;
            c1++;
        }
        int i=(c-1);
        StringBuilder str = new StringBuilder();
        for(i=(c-1);i>=0;i--){
            str.append(a[i]);
        }

        return str.toString();
    }
}