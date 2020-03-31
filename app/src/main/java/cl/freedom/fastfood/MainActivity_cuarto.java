package cl.freedom.fastfood;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_cuarto extends AppCompatActivity {

    private TextView tvNombre, tvDescripcion, tvPrecio;
    private ImageView ivImagen;
    private SDetalles sDetalles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cuarto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        try {
            sDetalles = (SDetalles)getIntent().getExtras().getSerializable("model");
        } catch (Exception e) {
            finish();
        }

        tvNombre = (TextView) findViewById(R.id.amc_tv_nombre);
        ivImagen = (ImageView) findViewById(R.id.amc_iv_imagen);
        tvDescripcion = (TextView) findViewById(R.id.amc_tv_descripcion);
        tvPrecio = (TextView) findViewById(R.id.amc_tv_precio);

        tvNombre.setText(sDetalles.getNombre());
        ivImagen.setImageResource(sDetalles.getImagen());
        tvDescripcion.setText(sDetalles.getDescripcion());
        tvPrecio.setText(sDetalles.getPrecio());

    }

    public static Intent getCallingIntent(Context context, SDetalles sDetalles){
        Intent intent = new Intent(context,MainActivity_cuarto.class);
        intent.putExtra("model", sDetalles);
        return intent;
    }
}