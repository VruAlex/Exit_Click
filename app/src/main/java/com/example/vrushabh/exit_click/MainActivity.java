package com.example.vrushabh.exit_click;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //back Button press on mobile this code pop a layout of exit permission from application
     public void onBackPressed() {
         AlertDialog.Builder alexBuilder = new AlertDialog.Builder(this);
         alexBuilder .setIcon(R.drawable.ic_favorite_black_24dp);
         alexBuilder .setTitle("See you soon...!!!");
         alexBuilder .setMessage("Are you sure you want to Exit ?")

         //this code is for user ... users have to click Yes or No
         .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 MainActivity.super.onBackPressed();
             }
         })
                 .setNegativeButton("No", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         dialog.cancel();
                     }
                 });
         AlertDialog alertDialogAlex = alexBuilder.create();
         alertDialogAlex.show();
     }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
