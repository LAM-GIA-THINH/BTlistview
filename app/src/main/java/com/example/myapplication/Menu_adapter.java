package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Menu_adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Menu> MenuList;

    public Menu_adapter(Context context, int layout, List<Menu> menuList) {
        this.context = context;
        this.layout = layout;
        MenuList = menuList;
    }

    @Override
    public int getCount() {
        return MenuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen;
        TextView txtMota;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.txtTen = (TextView) view.findViewById(R.id.textViewTen);
            holder.txtMota = (TextView) view.findViewById(R.id.textViewMota);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);
            view.setTag(holder);
        }else{
            holder=(ViewHolder) view.getTag();
        }

        Menu menu = MenuList.get(i);
        holder.txtTen.setText(menu.getTen());
        holder.txtMota.setText(menu.getMoTa());
        holder.imgHinh.setImageResource(menu.getHinh());

        return view;

    }

}
