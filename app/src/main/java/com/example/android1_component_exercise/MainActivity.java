package com.example.android1_component_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText acc;
    private EditText pass;

    String[] Account = {"123", "Amy", "Bob"};
    String[] Password = {"111", "222", "333"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view) {
        acc = (EditText) this.findViewById(R.id.account);
        pass = (EditText) this.findViewById(R.id.password);

        for (int i = 0; i < Account.length; i++) { // 用一個迴圈把帳號跟密碼從陣列取出
            if (acc.getText().toString().equals(Account[i])
                    && pass.getText().toString().equals(Password[i])) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Activity_login.class);
                startActivity(intent);
                //break;//一定要break,否則會無法判斷第二組
            }

            else {
                TextView conterview = findViewById(R.id.message);
                conterview.setText("登入失敗");
            }
        }
    }
}