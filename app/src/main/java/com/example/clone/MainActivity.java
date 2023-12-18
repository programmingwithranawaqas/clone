package com.example.clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements NamesFrag.OnNameClicked {

    TextView tvNumber;

    ArrayList<String> numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers = new ArrayList<>();
        numbers.add("123");
        numbers.add("321");
        numbers.add("456");
        numbers.add("654");
        numbers.add("987");
        numbers.add("789");
        numbers.add("159");

        tvNumber = getSupportFragmentManager()
                .findFragmentById(R.id.numberFragment)
                .getView()
                .findViewById(R.id.tvNumber);

        tvNumber.setText(numbers.get(0));

    }

    @Override
    public void click(int index) {
        tvNumber.setText(numbers.get(index));
    }
}