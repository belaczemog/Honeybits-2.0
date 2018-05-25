package com.example.caleb.honeybits3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class PopLogin extends Activity {

    Button buttonLogIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        buttonLogIn = (Button)findViewById(R.id.btnLogin);

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonLogIn = new Intent(PopLogin.this,Main2Activity.class);
                startActivity(buttonLogIn);
            }
        });






    }
}
