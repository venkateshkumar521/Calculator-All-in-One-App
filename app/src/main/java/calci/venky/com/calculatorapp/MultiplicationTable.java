package calci.venky.com.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicationTable extends AppCompatActivity {

    Button b_minus,b_plus;
    TextView number,result;
    int currentnumber;
    int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,val;
    int a,b=10,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);

        b_minus=(Button)findViewById(R.id.b_minus);
        b_plus=(Button)findViewById(R.id.b_plus);
        number=(TextView)findViewById(R.id.tn);
        result=(TextView)findViewById(R.id.tr);
        a=Integer.parseInt(number.getText().toString());

        calculateValues(currentnumber);
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentnumber>0)
                {
                    currentnumber--;
                    number.setText(" "+currentnumber);
                    calculateValues(currentnumber);


                }

            }
        });

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentnumber<1000)
                {
                    currentnumber++;
                    number.setText(" " +currentnumber);
                    calculateValues(currentnumber);


                }
            }
        });
    }

    private void calculateValues(int number)
    {
        result.setText("");
       StringBuilder builder=new StringBuilder();
       for(i=1;i<=1000;i++)
       {
            int res=currentnumber*i;
           builder.append(currentnumber +" * " + i + " = " + res + "\n");

       }
        result.setText(builder.toString());
    }
}
