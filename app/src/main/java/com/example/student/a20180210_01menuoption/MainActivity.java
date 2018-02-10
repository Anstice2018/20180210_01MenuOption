package com.example.student.a20180210_01menuoption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // menu.add("測試一");
        // menu.add("測試二");
        menu.add(1,1,1,"測試一");
        menu.add(1,2,1,"測試二");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // if (item.getTitle().equals("測試一"))
        if (item.getItemId()==1){
            Toast.makeText(MainActivity.this, "這是測試", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()==2){
            Toast.makeText(MainActivity.this, "這是測試二", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

