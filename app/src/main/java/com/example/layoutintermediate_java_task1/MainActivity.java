package com.example.layoutintermediate_java_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.layoutintermediate_java_task1.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bin = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bin.getRoot());

        initView();

    }

    public void initView() {
        String id = Objects.requireNonNull(bin.editId.getText()).toString();
        String password = Objects.requireNonNull(bin.editPassword.getText()).toString();
        bin.btnLogin.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Id = " + id + "Password = " + password, Toast.LENGTH_SHORT).show();
        });
    }
}