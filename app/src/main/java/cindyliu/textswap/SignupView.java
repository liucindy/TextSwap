package cindyliu.textswap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import com.firebase.client.Firebase;

/**
 * Created by cindyliu on 2/27/16.
 */
public class SignupView extends AppCompatActivity {

    /*EditText mSignupUsername = (EditText) findViewById(R.id.signup_username);
    EditText mSignupEmail = (EditText) findViewById(R.id.signup_email);
    Firebase mRef;*/

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_view); //set the activity view

        // allow login button to take you to find or post a book
        Button create_account = (Button) findViewById(R.id.create_account);
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupView.this, FindPostView.class);
                startActivity(intent);
            }
        });
    }

    /*@Override
        protected void onStart() {
        super.onStart();
        mRef = new Firebase("https://brilliant-torch-2254.firebaseio.com/");
    }*/


}
