package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class signin extends AppCompatActivity {

    GoogleSignInOptions gso;
    GoogleSignInClient gso1;
    ImageView google;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        final Intent in = new Intent(signin.this,signup.class);

        Button button2 = findViewById(R.id.creat);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTosignup();
            }
        });


        google = findViewById(R.id.google);


        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gso1 = GoogleSignIn.getClient(this,gso);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin();

            }
        });



    }
    void signin(){
        Intent signInIntent = gso1.getSignInIntent();
        startActivityForResult(signInIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000);
        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

        try {
            task.getResult(ApiException.class);
            navigateTowelcom();
        } catch (ApiException e) {
            Toast.makeText(getApplicationContext(),"Somethin went wrong",Toast.LENGTH_LONG).show();
        }
    }

    private void navigateTowelcom() {
        finish();
        Intent intent = new Intent(signin.this,welcom.class);
        startActivity(intent);
    }

    private void navigateTosignup() {
        finish();
        Intent intent = new Intent(signin.this,signup.class);
        startActivity(intent);
    }




}