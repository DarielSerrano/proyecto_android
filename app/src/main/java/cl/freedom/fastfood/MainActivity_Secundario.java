package cl.freedom.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_Secundario extends AppCompatActivity {

    private ListView lista;
    private Adapter adapter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_main__secundario);
        context = this;

        ArrayList <Sandwiches> model = new ArrayList<Sandwiches>();
        model.add(italiano);
        model.add(chemilco);
        model.add(chacarero);
        model.add(barros_luco);
        model.add(lomito_lompleto);

        adapter = new Adapter(this, model);

        lista = (ListView)findViewById(R.id.ams_lv_lista);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Sandwiches s = (Sandwiches) adapter.getItem(position);

                SDetalles sDetalles = new SDetalles();
                sDetalles.setNombre(s.getNombre());
                sDetalles.setImagen(s.getImagen());
                sDetalles.setDescripcion(s.getDescripcion());
                sDetalles.setPrecio(s.getPrecio());


                startActivity(MainActivity_cuarto.getCallingIntent(context, sDetalles));

            }
        });

    }

    public class Sandwiches {

        private String nombre;
        private int imagen;
        private String descripcion;
        private String precio;

        public Sandwiches(){

        }

        public Sandwiches(String nombre, int imagen, String descripcion, String precio) {
            this.nombre = nombre;
            this.imagen = imagen;
            this.descripcion = descripcion;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getImagen() {
            return imagen;
        }

        public void setImagen(int imagen) {
            this.imagen = imagen;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getPrecio() {
            return precio;
        }

        public void setPrecio(String precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return nombre;
        }

    }
    Sandwiches italiano = new Sandwiches("Sandwich Italiano",R.drawable.sandwich_italiano,"marraqueta, bistec, paltas, tomate, mayonesa","$4000");
    Sandwiches chemilco = new Sandwiches("Sandwich Chemilco",R.drawable.sandwich_chemilco,"(Marraqueta, pan amasado o frica), bistec, cebolla en pluma frita, huevo frito","$4500");
    Sandwiches chacarero = new Sandwiches("Sandwich Chacarero",R.drawable.sandwich_chacarero,"Pan marraqueta, churrasco, tomate, porotos verdes, ají verde picado","$4500");
    Sandwiches barros_luco = new Sandwiches("Sandwich Barros Luco",R.drawable.sandwich_barrosluco,"Pan frica o marraqueta, churrasco, queso","$3800");
    Sandwiches lomito_lompleto = new Sandwiches("Sandwich Lomito Completo",R.drawable.sandwich_lomitocompleto,"Pan frica, lomo de chancho, (aceite, sal y pimienta), tomate, cebolla, orégano, chucrut, salsa americana, mayonesa","$5000");

}
