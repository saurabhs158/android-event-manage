package com.example.eventmanagement;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.eventmanagement.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText login_password;
    Button register;
    Button login_button;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        setupListeners();
    }

    private void setupUI() {
        username = findViewById(R.id.username);
        login_password = findViewById(R.id.login_password);
        register = findViewById(R.id.register);
        login_button = findViewById(R.id.login_button);
    }
    void checkUsername() {
        boolean isValid = true;
    }
    private void setupListeners() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUsername();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
                //startActivity(i);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}