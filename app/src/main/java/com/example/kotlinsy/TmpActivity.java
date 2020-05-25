package com.example.kotlinsy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmp);

        extendsMethod();
        superMethod();

        Button button = new Button(this);

        button.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };







    /**
     * 1.可以使用泛型通配符 ? extends 来使泛型支持协变，但是「只能读取不能修改」，
     * 这里的修改仅指对泛型集合添加元素，如果是 remove(int index) 以及 clear 当然是可以的。
     * 2.可以使用泛型通配符 ? super 来使泛型支持逆变，但是「只能修改不能读取」，
     * 这里说的不能读取是指不能按照泛型类型读取，你如果按照 Object 读出来再强转当然也是可以的。
     */
    private void superMethod() {

    }

    private void extendsMethod() {


    }
}
