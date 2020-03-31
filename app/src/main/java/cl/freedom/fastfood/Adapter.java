package cl.freedom.fastfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<MainActivity_Secundario.Sandwiches> arraylist;

    public Adapter (Context context, ArrayList<MainActivity_Secundario.Sandwiches> arrayList){
        this.context= context;
        this.arraylist = arrayList;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return arraylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView =layoutInflater.inflate(R.layout.columna,null);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.cnombre);
        nombre.setText(arraylist.get(position).getNombre());

        return convertView;
    }
}
