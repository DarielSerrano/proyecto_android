package cl.freedom.fastfood;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sobrenosotros(View view) {
        Intent sobrenosotros = new Intent(this,MainActivity_Tercero.class);
        startActivity(sobrenosotros);
    }

    public void sandwiches(View view) {
        Intent sandwiches = new Intent (this, MainActivity_Secundario.class);
        startActivity(sandwiches);
    }
}
