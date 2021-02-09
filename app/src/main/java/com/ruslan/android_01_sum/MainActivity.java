package com.ruslan.android_01_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //метод кнопки расчёта
    public void onClick(View v) {

        //доступ к компонентам окна
        EditText editText_a = (EditText) findViewById(R.id.editText_a);
        EditText editText_b = (EditText) findViewById(R.id.editText_b);
        TextView textView_sum = (TextView) findViewById(R.id.textView_sum);

        double a, b, c; //объявление локальных переменных

        //чтение данных из компонент
        a = Double.valueOf(editText_a.getText().toString());
        b = Double.valueOf(editText_b.getText().toString());

        c = a + b; //алгоритм

        //вывод полученного значения в компонент
        textView_sum.setText(String.valueOf(c));
    }
}
