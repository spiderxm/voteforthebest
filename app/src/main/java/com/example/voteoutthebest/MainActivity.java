package com.example.voteoutthebest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.voteoutthebest.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int p=0;
    /*p is the no. of votes for pepsi*/
    int c=0;
    /*c is for no. of votes for coca cola*/
    public void pepsi(View view)
    {
        p=p+1;
        display(p);
    }
    public void coca(View view)
    {
        c=c+1;
        display1(c);
    }
    public void result(View view)
    {
        if(c>p)
        {
            String a = "Coca-cola wins the competetion as it gets "+c+" votes and pepsi gets "+p+" votes.";
            disp(a);
        }
        else if(p>c)
        {
            String b = "Pepsi wins the competetion as it gets "+p+" votes and Coca-cola gets "+c+" votes.";
            disp(b);
        }
        else
        {
            String c = "Tie between Pepsi and Coca-cola as both get " + p + " votes.";
            disp(c);
        }
    }
    private void display(int p)
    {
        TextView t= (TextView)findViewById(R.id.textView);
        t.setText(""+p);

    }
    private void display1(int c)
    {
        TextView tt;
        tt = findViewById(R.id.textView2);
        tt.setText(""+c);
    }
    private void disp(String f){
        TextView priceTextView = (TextView) findViewById(R.id.textView3);
        priceTextView.setText(f);
    }
}
