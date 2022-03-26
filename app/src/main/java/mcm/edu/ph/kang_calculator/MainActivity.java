package mcm.edu.ph.kang_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText var1, var2;
    Button btnAdd, btnMinus, btnMultiply, btnDivide;
    double num1, num2;
    TextView tvAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) { // this method is for creating the display of the app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        tvAnswer = findViewById(R.id.tvAnswer);


        //on-click listeners are necessary to make the buttons work
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }

    @Override

    public void onClick(View v) { //this method is responsible on doing on-click events

        var1 = findViewById(R.id.editText1stVar);
        var2 = findViewById(R.id.editText2ndVar);

        num1 = Double.parseDouble(var1.getText().toString());
        num2 = Double.parseDouble(var2.getText().toString());


        switch (v.getId()) {
            case R.id.btnAdd:
                tvAnswer.setText(Double.toString(num1 + num2));

                break;
            case R.id.btnMinus:
                tvAnswer.setText(Double.toString(num1 - num2));

                break;
            case R.id.btnMultiply:
                tvAnswer.setText(Double.toString(num1 * num2));

                break;
            case R.id.btnDivide:
                tvAnswer.setText(Double.toString(num1 / num2));

                break;
        }
    }
}


