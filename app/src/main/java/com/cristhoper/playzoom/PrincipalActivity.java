package com.cristhoper.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.cristhoper.playzoom.databinding.ActivityPrincipalBinding;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {
    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fabAddMovie.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(),"Add a anime", Snackbar.LENGTH_SHORT).show();
        });
        binding.tbPlayZoom2.setTitle("Bienvenidos");
        setSupportActionBar(binding.tbPlayZoom2);

    }
}