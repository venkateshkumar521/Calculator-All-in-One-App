package calci.venky.com.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view)
    {
        Intent i;
        if(view.getId()==R.id.button1)
        {
            i=new Intent(this,StandardCalc.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button)
        {
            i=new Intent(this,ScientificCal.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button2)
        {
            i=new Intent(this,UnitConverter.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button3)
        {
            i=new Intent(this,Factorialcalc.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button5)
        {
            i=new Intent(this,FibanocciCalc.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button8)
        {
            i=new Intent(this,EvenOdd.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button9)
        {
            i=new Intent(this,BMICalculator.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button0)
        {
            i=new Intent(this,MultiplicationTable.class);
            startActivity(i);
        }
    }


}
