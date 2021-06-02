package com.ruslan.android_01_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText editText_a, editText_b; /* объявил переменные */
    public TextView textView_sum; /* объявил переменные */

    @Override
    protected void onCreate(Bundle savedInstanceState) { /* цикл жизни активити */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_a = findViewById(R.id.editText_a); /* связал переменные с их id */
        editText_b = findViewById(R.id.editText_b); /* связал переменные с их id */
        textView_sum = findViewById(R.id.textView_sum); /* связал переменные их с id */
    }

    //метод кнопки расчёта
    public void onClick(View v) { /* событие на нажатие кнопки "СУММА" */
        double a, b, c; /* объявление локальных переменных */
        a = Double.valueOf(editText_a.getText().toString()); /* чтение данных из компонента */
        b = Double.valueOf(editText_b.getText().toString()); /* чтение данных из компонента */
        c = a + b; /* алгоритм */
        textView_sum.setText(String.valueOf(c)); /* вывод полученного значения в компонент */
    }
}
