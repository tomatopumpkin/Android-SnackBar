package com.wimonsiri.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Snackbar snackBar = Snackbar.make( findViewById(R.id.RelativeLayout),
                "Unable to send message", Snackbar.LENGTH_LONG);
        snackBar.setAction("View Details", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You Click Details",
                        Toast.LENGTH_SHORT).show();
            }
        });
        snackBar.show();
    }
}