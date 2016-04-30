package com.msc.myplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateActivity extends AppCompatActivity {

    private EditText familyNameInput;
    private EditText userNameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        familyNameInput = (EditText) findViewById(R.id.familyNameInput);
        userNameInput = (EditText) findViewById(R.id.creatorNameInput);
    }

    // Create Button event listener
    // Open CreateActivity here
    public void onCreateButtonClick(View v) {

        String familyName = familyNameInput.getText().toString();
        String userName = userNameInput.getText().toString();

        if (!familyName.isEmpty() && !userName.isEmpty()) {
            // Create a new group
            // And save to SharedPrefs

            Client.createNewFamily(this, familyName, userName);
            // Need some sorta of callback when operation complete
            // What I have in mind:
            // To start a MainActivity when already have refs to family and current user
            // In shared refs, or putting this info to extra when start an intent
        }
    }
}
