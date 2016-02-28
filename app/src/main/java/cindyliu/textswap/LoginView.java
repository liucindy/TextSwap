package cindyliu.textswap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by cindyliu on 2/27/16.
 */
public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view); //set the activity view

        // allow login button to take you to find or post a book
        Button loginview_login = (Button) findViewById(R.id.loginview_login);
        loginview_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginView.this, FindPostView.class);
                startActivity(intent);
            }
        });
    }


}
