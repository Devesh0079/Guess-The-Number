package com.deveshconvo.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void ran()
    {
        Random r =new Random();
        n=r.nextInt(20)+1;
    }
public  void guess(View view)
{ String tag,msg,m ;
    EditText editText=(EditText)findViewById(R.id.editText);
    int g=Integer.parseInt(editText.getText().toString());
    if(g>n)
    {
        m="Lower";
    }
    else if (g<n)
    {
        m="Higher";
    }
    else
    {
        m="You got it!!!Try again";
        ran();

    }
    MainActivity context;
    Toast.makeText(context=this,m,Toast.LENGTH_SHORT).show();
    Log.i(tag="entered value",editText.getText().toString());
    Log.i(tag = "info", Integer.toString(n));
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ran();
    }
}
