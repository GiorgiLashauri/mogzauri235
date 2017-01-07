package geoton.treveler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import geoton.treveler.R;
import geoton.treveler.models.CharacterT;

/**
 * Created by ADMIN on 12/25/2016.
 */

public class CastumMonomentsAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CharacterT>listData;
    private LayoutInflater inflater;

    public CastumMonomentsAdapter (Context context, ArrayList<CharacterT> data){
        this.context=context;
        this.listData=data;
        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE );


    }


    @Override
    public int getCount() {
        return this.listData.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View itemView;
         ViewHolder viewHolder;

        if (view== null){
            itemView=View.inflate(context, R.layout.listview_item,null);
            viewHolder = new ViewHolder();

            ImageView imageView = (ImageView) itemView.findViewById(R.id.Image);
            TextView nameView = (TextView) itemView.findViewById(R.id.name);

            viewHolder.imageView=imageView;
            viewHolder.nameView=nameView;

            itemView.setTag(viewHolder);
        }else{

            itemView=view;
            viewHolder = (ViewHolder) itemView.getTag();
        }

        CharacterT Monuments = (CharacterT) getItem(position);
        viewHolder.nameView.setText(Monuments.getName());
        Picasso.with(context).load(Monuments.getImage())
                .resize(200,200)
                .centerCrop()
                .into(viewHolder.imageView);


        return itemView;
    }
    private class ViewHolder {
        ImageView imageView;
        TextView nameView;
    }
}
