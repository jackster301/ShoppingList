package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity{

    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = AddItemActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }


    public void addAppleToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_1);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addOrangeToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_2);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addStrawberryToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_3);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addBlueberryToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_4);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void addBananaToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_5);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addWatermelonToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_6);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addGrapeToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_7);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addMangoToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_8);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addCoconutToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_9);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }

    public void addCranberryToList(View view){
        Button clickedButton = view.findViewById(R.id.item_button_10);
        String itemToAdd = clickedButton.getText().toString();

        Intent intent = new Intent();
        intent.putExtra(EXTRA_MESSAGE, itemToAdd);
        Log.d(LOG_TAG, "Sent " + itemToAdd + " to MainActivity.");
        setResult(RESULT_OK, intent);
        finish();

    }
}