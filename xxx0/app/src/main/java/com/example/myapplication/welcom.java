package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class welcom extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gso1;
    TextView name,Vusername;

    Handler i1 = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        name = findViewById(R.id.name);
        Vusername = findViewById(R.id.Vusername);


        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gso1 = GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if(acct!=null){
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            name.setText(personName);
            Vusername.setText(personEmail);

        }


        i1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i2 = new Intent(welcom.this,Home.class);
                startActivity(i2);
                finish();

            }
        },2000);
    }
}