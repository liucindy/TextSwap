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
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by cindyliu on 2/27/16.
 */
public class FindPostView extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_post_view); //set the activity view

        // allow login button to take you to find or post a book
        Button post_a_book = (Button) findViewById(R.id.post_a_book);
        post_a_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindPostView.this, PostView.class);
                startActivity(intent);
            }
        });
    }
}
