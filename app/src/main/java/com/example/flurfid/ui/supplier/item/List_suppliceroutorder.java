package com.example.flurfid.ui.supplier.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.flurfid.R;
import com.example.flurfid.ui.supplier.entiey.SupplicerData;

import java.util.List;

public class List_suppliceroutorder extends BaseAdapter {

    private List<SupplicerData> mData;
    private Context context;
    private int currentItem = -1;//listview中显示位置，取默认值为-1。


    public List_suppliceroutorder(List<SupplicerData> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
       ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_suppliceroutorder, null);
            holder = new ViewHolder();

            holder.listdataoutorder = (TextView) convertView.findViewById(R.id.listdataoutorder);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.listdataoutorder.setText(mData.get(i).getOrdernumber());
        //notifyDataSetChanged();

        return convertView;
    }
    public class ViewHolder{


        TextView listdataoutorder;
    }
}
