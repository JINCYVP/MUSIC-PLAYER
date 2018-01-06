package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import vjkbvjkbjbjbjbj
dncjhbjasbjvclj
sljvkhjajhgd
svfhagshfgjkshIFCNS,MCNOWEDOWD
NSCBAJBJLHjcnnmsnckj
.widget.Button;
import android.widget.EditText;

public class CALCULATOR extends AppCompatActivity
{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bclear,equal;
    EditText ans;
    String enterno,operation;
    int first,sec,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ans=(EditText)findViewById(R.id.editText);
        b0=(Button)findViewById(R.id.zero);
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
             enterno=ans.getText().toString()+ b0.getText().toString();
                ans.setText(enterno);
            }
        });

        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b1.getText().toString();
                ans.setText(enterno);
            }
        });
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b2.getText().toString();
                ans.setText(enterno);
            }
        });

        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b3.getText().toString();
                ans.setText(enterno);
            }
        });

        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b4.getText().toString();
                ans.setText(enterno);
            }
        });

        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b5.getText().toString();
                ans.setText(enterno);
            }
        });

        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b6.getText().toString();
                ans.setText(enterno);
            }
        });

        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b7.getText().toString();
                ans.setText(enterno);
            }
        });

        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b8.getText().toString();
                ans.setText(enterno);
            }
        });

        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                enterno=ans.getText().toString()+b9.getText().toString();
                ans.setText(enterno);
            }
        });

        badd=(Button)findViewById(R.id.ADD);
        badd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                first=Integer.parseInt(ans.getText().toString());
                ans.setText("");
                operation="+";




            }
        });

        bsub=(Button)findViewById(R.id.SUB);
        bsub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(ans.getText().toString());
                ans.setText("");
                operation="-";



            }
        });

        bdiv=(Button)findViewById(R.id.DIV);
        bdiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(ans.getText().toString());
                ans.setText("");
                operation="/";


            }
        });

        bmul=(Button)findViewById(R.id.MUL);
        bmul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(ans.getText().toString());
                ans.setText("");
                operation="*";




            }
        });

        bclear=(Button)findViewById(R.id.CLEAR);
        bclear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                ans.setText("");


            }
        });
        equal=(Button)findViewById(R.id.Equal);
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sec=Integer.parseInt(ans.getText().toString());

                if(operation.equals("+"))
                   result=first+sec;

                if(operation.equals("-"))
                    result=first-sec;

                if(operation.equals("*"))
                    result=first*sec;

                if(operation.equals("/"))
                    result=first/sec;



                ans.setText(result+"");




            }
        });




    }
}
