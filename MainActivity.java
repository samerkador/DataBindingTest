package com.example.samerkador.androiddatabindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.samerkador.androiddatabindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


//    //TODO try to rename the class name from the xml layout
   ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

      User user = new User();
       binding.setUser(user);


    }


}
