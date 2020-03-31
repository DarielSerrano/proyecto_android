package cl.freedom.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity_Tercero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__tercero);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
