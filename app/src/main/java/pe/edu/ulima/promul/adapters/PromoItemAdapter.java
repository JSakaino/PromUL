package pe.edu.ulima.promul.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pe.edu.ulima.promul.R;
import pe.edu.ulima.promul.model.beans.Promo;

/**
 * Created by Jaime on 28/11/2016.
 */

public class PromoItemAdapter extends BaseAdapter{
    private List<Promo> mPromo;
    private LayoutInflater mInflater;
    private Context mContext;

    public PromoItemAdapter(List<Promo> promos,Context context){
        mPromo = promos;
        mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public int getCount() {
        return mPromo.size();
    }

    @Override
    public Object getItem(int position) {
        return mPromo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.item_promo,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tviTituloPromo = (TextView) convertView.findViewById(R.id.tviTituloPromo);
            viewHolder.iviImagenPromo = (ImageView) convertView.findViewById(R.id.iviImagenPromo);
            viewHolder.tviDescripcion = (TextView) convertView.findViewById(R.id.tviDescripcion);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Promo promo = mPromo.get(position);

        viewHolder.tviTituloPromo.setText(promo.getTitulo());
        Picasso.with(mContext).load(promo.getUrlImagen()).into(viewHolder.iviImagenPromo);

        return convertView;
    }

    class ViewHolder{
        TextView tviTituloPromo;
        ImageView iviImagenPromo;
        TextView tviDescripcion;
    }
}
