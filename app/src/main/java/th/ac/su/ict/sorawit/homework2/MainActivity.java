package th.ac.su.ict.sorawit.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvBox;
    private Button btPum1;
    private Button btPum2;
    private Button btPum3;
    private Button btPum4;
    private Button btPum5;
    private Button btPum6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBox = findViewById(R.id.tvBox);
        btPum1 = findViewById(R.id.btPum1);
        btPum2 = findViewById(R.id.btPum2);
        btPum3 = findViewById(R.id.btPum3);
        btPum4 = findViewById(R.id.btPum4);
        btPum5 = findViewById(R.id.btPum5);
        btPum6 = findViewById(R.id.btPum6);

        btPum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("235-255-221");
                tvBox.setBackgroundColor(Color.parseColor("#ffebd3"));
            }
        });


        btPum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("235-203-202");
                tvBox.setBackgroundColor(Color.parseColor("#eccbca"));

            }
        });

        btPum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("255-117-131");
                tvBox.setBackgroundColor(Color.parseColor("#7583a5"));

            }
        });

        btPum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("153-169-191");
                tvBox.setBackgroundColor(Color.parseColor("#99a9bf"));

            }
        });

        btPum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("195-204-216");
                tvBox.setBackgroundColor(Color.parseColor("#c3ccd8"));

            }
        });

        btPum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBox.setText("221-226-269");
                tvBox.setBackgroundColor(Color.parseColor("#dadfe3"));

            }
        });
    }
}
