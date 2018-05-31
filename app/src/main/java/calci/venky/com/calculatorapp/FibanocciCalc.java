package calci.venky.com.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibanocciCalc extends AppCompatActivity {

    EditText edit;
    Button calc;
    TextView textd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibanocci_calc);

        edit=(EditText)findViewById(R.id.editText3);
        calc=(Button)findViewById(R.id.button4);
        textd=(TextView)findViewById(R.id.text);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textd.setText(fibanocci(Integer.parseInt(edit.getText().toString())));
            }
        });

    }

    private String fibanocci(int n)
    {
        StringBuilder text= new StringBuilder(" ");
        ArrayList<BigInteger> fib=new ArrayList<>();
        BigInteger first=new BigInteger("0");
        BigInteger second=new BigInteger("1");
        fib.add(first);
        fib.add(second);
        for(int i=1;i<n;i++)
        {
            fib.add(fib.get(i).add(fib.get(i-1)));

        }
        for(int i=1;i<n;i++)
        {
          text.append(i).append(".").append(fib.get(i)).append("\n");
        }
        return text.toString();

    }
}
