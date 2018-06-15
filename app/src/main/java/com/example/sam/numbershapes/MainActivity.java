package com.example.sam.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



            class shape
            {
                int number;

                public boolean isTriangular()
                {
                    int x,tri;
                    x=1;
                    tri=1;
                    while(tri<number)
                    {
                        x++;
                        tri=tri+x;
                    }
                    if(tri==number)
                        return true;
                    else
                        return false;
                }



                public boolean isSquare()
                {
                    int x=1;
                    while(x*x<number)
                    {
                        x++;
                    }
                    if(x*x==number)
                        return true;
                    else
                        return false;

                }
            }

    public void button(View view)
    {
        EditText num=(EditText) findViewById(R.id.text);
        Log.i("userNumber",num.getText().toString());
        shape s=new shape();
        s.number=Integer.parseInt(num.getText().toString());
        if(s.isSquare()) {
            if (s.isTriangular())
                Toast.makeText(this, "Square number + Triangular number", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Square Number", Toast.LENGTH_SHORT).show();
        }
        else if(s.isTriangular())
            Toast.makeText(this, "Triangular number", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(this, "not a Triangular nor square Number", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
