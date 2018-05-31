package calci.venky.com.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvenOdd extends AppCompatActivity {

    EditText number;
    TextView text;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd);

        number=(EditText)findViewById(R.id.editText7);
        text=(TextView)findViewById(R.id.textView4);
        b1=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(number.getText().toString());
                num=num %  2;
                if(num==0)
                {
                    text.setText("Even");
                }
                else
                {
                    text.setText("Odd");
                }

            }
        });


    }
}
