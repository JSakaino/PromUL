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
import pe.edu.ulima.promul.model.beans.TipoPromo;

/**
 * Created by sodm on 11/28/2016.
 */

public class PromoAdapter extends BaseAdapter {
    private List<TipoPromo> mTPromo;
    private LayoutInflater mInflater;
    private Context mContext;

    public PromoAdapter(List<TipoPromo> tipoPromos, Context context){
        mTPromo= tipoPromos;
        mInflater = LayoutInflater.from(context);
        mContext = context;
    }

    @Override
    public int getCount() {
        return mTPromo.size();
    }

    @Override
    public Object getItem(int position) {
        return mTPromo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.item_tipo_promo,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tviTituloPromo = (TextView) convertView.findViewById(R.id.tviTituloPromo);
            viewHolder.iviTipoPromo = (ImageView) convertView.findViewById(R.id.iviTipoPromo);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        TipoPromo tPromo = mTPromo.get(position);

        viewHolder.tviTituloPromo.setText(tPromo.getTitulo());
        Picasso.with(mContext).load(tPromo.getUrlImagen()).into(viewHolder.iviTipoPromo);

        return convertView;
    }

    class ViewHolder{
        TextView tviTituloPromo;
        ImageView iviTipoPromo;
    }
}
