package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private static final int BUTTON_CLICK = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private static LinkedList<String> groceryList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildList();
    }


    public void addItemToList(View view){
        Intent intent = new Intent(this, AddItemActivity.class);
        //startActivity(intent);
        startActivityForResult(intent, BUTTON_CLICK);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == BUTTON_CLICK) {
            if (resultCode == RESULT_OK) {
                String itemToAdd =
                        data.getStringExtra(AddItemActivity.EXTRA_MESSAGE);

                groceryList.add(itemToAdd);
                buildList();
            }
        }
    }

    private void buildList(){
        Log.d(LOG_TAG, "buildList called.");
        int i = 1;
        for(String item : groceryList){
            if(i >= 11){
                return;
            }
            TextView tv;
            switch (i){
                case 1:
                    tv = findViewById(R.id.item_1);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 2:
                    tv = findViewById(R.id.item_2);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 3:
                    tv = findViewById(R.id.item_3);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 4:
                    tv = findViewById(R.id.item_4);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 5:
                    tv = findViewById(R.id.item_5);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 6:
                    tv = findViewById(R.id.item_6);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 7:
                    tv = findViewById(R.id.item_7);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 8:
                    tv = findViewById(R.id.item_8);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 9:
                    tv = findViewById(R.id.item_9);
                    tv.setText(groceryList.get(i-1));
                    break;
                case 10:
                    tv = findViewById(R.id.item_10);
                    tv.setText(groceryList.get(i-1));
                    break;
            }
            i++;
        }
    }

}