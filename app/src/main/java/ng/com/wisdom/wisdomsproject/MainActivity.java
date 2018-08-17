package ng.com.wisdom.wisdomsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void adminButton (View view){
        Intent adminButton = new Intent(MainActivity.this, AdminLogin.class);
        startActivity(adminButton);

    }
}
