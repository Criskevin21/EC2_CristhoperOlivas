package com.cristhoper.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cristhoper.playzoom.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
  //  private Button btnGetStarted;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v ->{
            //Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        binding.textMoviewPhraset.setText("Mira tu anime\nfavorito.");

        //       btnGetStarted = findViewById(R.id.button);
        //      btnGetStarted.setOnClickListener(v -> {
        //         Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
        //      });
    }
}