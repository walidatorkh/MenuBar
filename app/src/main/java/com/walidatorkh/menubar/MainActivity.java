package com.walidatorkh.menubar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        LinearLayout bgElemant = (LinearLayout)findViewById(R.id.mainLayout);

        switch (item.getItemId()) {
            case R.id.menuItemOpenBlue:
                bgElemant.setBackgroundColor(Color.BLUE);
                Toast.makeText(this,"Blue color choosed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemOpenBlack:
                bgElemant.setBackgroundColor(Color.BLACK);
                Toast.makeText(this,"Black color choosed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemOpenRed:
                bgElemant.setBackgroundColor(Color.RED);
                Toast.makeText(this,"Red color choosed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemOpenGreen:
                bgElemant.setBackgroundColor(Color.GREEN);
                Toast.makeText(this,"Green color choosed", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
