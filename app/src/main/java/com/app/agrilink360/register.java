package com.app.agrilink360;

import static com.app.agrilink360.Connect.fullName;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText emailAddress, place, phone, fulllName, passwordLogin, ageODB;
        Button registerReg, loginReg;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        emailAddress = findViewById(R.id.emailAddress);
        passwordLogin = findViewById(R.id.passwordLogin);
        place = findViewById(R.id.place);
        phone = findViewById(R.id.phone);
        fulllName = findViewById(R.id.fullName);
        ageODB = findViewById(R.id.ageODB);

        registerReg = findViewById(R.id.registerReg);
        loginReg = findViewById(R.id.loginReg);

   loginReg.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {

           Intent i = new Intent(register.this, MainActivity.class);
           startActivity(i);
       }

   });


   registerReg.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {

           String fullname = fullName.getBytes().toString();
           String pnone = phone.getContext().toString();
           String place =Connect.place;
           String emailAddress = Connect.emailAddress;
           String age = ageODB.getText().toString();
           String password = passwordLogin.getText().toString();
       }
   });

    }
}