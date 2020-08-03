package com.example.EventNowProject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Login extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText editTextEmail;
    EditText editTextPass;
    Button buttonSign;
    Button createAccount;


    private Button BSign , BdDisplay;
    private EditText editUsername, editPasswordPass, editEmail;
    private DatabaseReference UserRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();



        editTextEmail = (EditText) findViewById(R.id.txt1);
        editTextPass = (EditText) findViewById(R.id.txt2);
        buttonSign = (Button) findViewById(R.id.btn1);
        createAccount = (Button) findViewById(R.id.create_accountbtn);

    }


    private void userLogin(){

        String email = editTextEmail.getText().toString().trim();
        String pass = editTextPass.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Please enter a valid email");
            editTextEmail.requestFocus();
            return;
        }

        if (pass.isEmpty()) {
            editTextPass.setError("Password is required");
            editTextPass.requestFocus();
            return;

        }

        if (pass.length() < 6) {
            editTextPass.setError("Password needs to be 6 characters");
            editTextPass.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete( Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(Login.this, Home.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.btn1) {
            userLogin();



        }

        if (v.getId() == R.id.create_accountbtn) {
            Intent i = new Intent(Login.this, CreateAccount.class);
            startActivity(i);
        }
    }


}