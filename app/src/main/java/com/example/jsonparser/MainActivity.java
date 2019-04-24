package com.example.jsonparser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPassword;
    private Button button;

    private static String URl_Login = " http://www.dotplays.com/signin.php ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);
        button = findViewById(R.id.button);

        login();

    }

    private void login() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String s1 = "admin";
                if(edtUser.getText().toString().equals("admin") && edtPassword.getText().toString().equals("admin")){
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Mời nhập lại", Toast.LENGTH_SHORT).show();
                }
//                if(edtUser.getText().toString().isEmpty() && edtPassword.getText().toString().isEmpty()){
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập User và Password", Toast.LENGTH_SHORT).show();
//                }else if(edtUser.getText().toString().isEmpty()){
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập User ", Toast.LENGTH_SHORT).show();
//                }else if( edtPassword.getText().toString().isEmpty()){
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập password", Toast.LENGTH_SHORT).show();
//                }else {
//                    startActivity(intent);
//                }
            }
        });

//        (edtUser.getText().toString()== s1 && edtPassword.getText().toString() == s1)
    }
}
