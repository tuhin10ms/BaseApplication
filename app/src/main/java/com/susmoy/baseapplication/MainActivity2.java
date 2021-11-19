package com.susmoy.baseapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.susmoy.baseapplication.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        binding.toolbar.ivToolbarBack.setOnClickListener(v -> finish());
        binding.toolbar.tvToolbarTitle.setText("Back");
    }
}