package com.example.hemanth.s5assign2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int Computer = 1;
    private static final int Gamepad = 2;
    private static final int Camera = 3;
    private static final int Video = 4;
    private static final int EMail = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem computer = menu.add(Menu.NONE, Computer, 1, "Computer");
        computer.setAlphabeticShortcut('a');

        MenuItem gamepad = menu.add(Menu.NONE, Computer, 1, "Gamepad");
        gamepad.setAlphabeticShortcut('b');

        MenuItem camera = menu.add(Menu.NONE, Computer, 1, "Camera");
        camera.setAlphabeticShortcut('c');
        MenuItem video = menu.add(Menu.NONE, Computer, 1, "Video");
        video.setAlphabeticShortcut('d');
        MenuItem email = menu.add(Menu.NONE, Computer, 1, "EMail");
        email.setAlphabeticShortcut('e');
//        menu.add("Computer");
//        menu.add("Gamepad");
//        menu.add("Camera");
//        menu.add("Video");
//        menu.add("EMail");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case Computer:
                Toast.makeText(this,"Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case Gamepad:
                Toast.makeText(this,"Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case Camera:
                Toast.makeText(this,"Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case Video:
                Toast.makeText(this,"Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case EMail:
                Toast.makeText(this,"Clicked : "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;


        }


        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
