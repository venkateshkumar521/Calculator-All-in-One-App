package calci.venky.com.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Factorialcalc extends AppCompatActivity {
    EditText number;
    TextView answer;
    Button calculate;

    long factorial = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorialcalc);
        number = (EditText) findViewById(R.id.editText);
        answer = (TextView) findViewById(R.id.textView);
        calculate = (Button) findViewById(R.id.button);

        initialize();
    }

    private void initialize() {
        number = (EditText) findViewById(R.id.editText);
        number.setHint("Enter number");
        answer = (TextView) findViewById(R.id.textView);
        calculate = (Button) findViewById(R.id.button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("Factorial of " + number.getText().toString() + " is : " + calcFactorial());
            }
        });

    }

    private long calcFactorial() {

        long factorial = 1;
        try {
            factorial = Long.parseLong(number.getText().toString());
            for (int i = (int) (factorial - 1); i > 0; i--) {
                factorial = i * factorial;
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Incorrect Input", Toast.LENGTH_LONG).show();
        } finally {
        }

        return factorial;
    }

}

