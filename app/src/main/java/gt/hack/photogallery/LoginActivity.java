package gt.hack.photogallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText  username;
    private EditText  password;
    private Button    login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO 4: Initialize the EditTexts for the username and password
        //The IDs that you initialize the EditTexts with must match the IDs that
        //you set them to in activity_login.xml



        login_button = findViewById(R.id.login_btn);

        //TODO 5: Add an OnClickListener to the login_button
        /*
          When the button is clicked, the activity must change to "PhotoGalleryActivity"

          EXTRA: Check if the username and passwords are entered, and
          display a toast informing the user if they are not entered.
         */


    }
}
