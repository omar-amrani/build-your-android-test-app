package com.example.omaramrani.myfirstandroidapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void registerUserByID(View v) {
        EditText identifier;
        identifier   = (EditText)findViewById(R.id.identifier);
        String identifier_txt= identifier.getText().toString();
        Registration registration;
        if (identifier_txt.contains("@")) {
            registration = Registration.create().withEmail(identifier_txt);
        }
        else {
            registration = Registration.create().withUserId(identifier_txt);

        }
        Intercom.client().registerIdentifiedUser(registration);
    }

    public void logout(View v) {

        Intercom.client().logout();
    }

    public void displayMessenger(View v) {

        Intercom.client().setLauncherVisibility(Intercom.Visibility.VISIBLE);
    }

    public void hideMessenger(View v) {

        Intercom.client().setLauncherVisibility(Intercom.Visibility.GONE);
    }

}
