package com.wedddingapp.shankar.assingmentnew;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by shan on 12/11/2017.
 */

public class MyFragmentOne extends Fragment{


    //String value;
    EditText inputEdtTxt;

    TextView yearFragTxt;

    Button displayBtn;


    public MyFragmentOne(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

     View view=inflater.inflate(R.layout.my_fragment_one, container, false);

        yearFragTxt= (TextView)view.findViewById(R.id.val);
        inputEdtTxt=(EditText)view.findViewById(R.id.e2);
        displayBtn=(Button)view.findViewById(R.id.re);

        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yearFragTxt.setText(inputEdtTxt.getText().toString());


            }
        });

        return view;




    }








}
