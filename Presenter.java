package com.example.samerkador.androiddatabindingtest;


import android.app.Application;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.samerkador.androiddatabindingtest.databinding.ActivityMainBinding;

/**
 * Created by Samer.kador on 10/17/2017.
 */




public class Presenter {

    ActivityMainBinding binding;

    public void validate(View view,User user ){

//        binding.tv1.setText(user.getName());
//        binding.tv2.setText(user.getPass());


        Log.d("Presenter" , "hello");


        Log.d("Presenter" , "hello agin");

        //Toast.makeText(view.getContext() ,"hello" , Toast.LENGTH_SHORT ).show();

    }

    public void showList()
    {

        Log.d("Presenter" , "hello");

    }

}
