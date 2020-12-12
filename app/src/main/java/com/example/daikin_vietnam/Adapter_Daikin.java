package com.example.daikin_vietnam;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_Daikin extends BaseAdapter {
    Activity context;
    ArrayList<DaiKin_data> list;

    public Adapter_Daikin(Activity context, ArrayList<DaiKin_data> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.listview_row, null);
        TextView Ten_151 = (TextView) row.findViewById(R.id.Ten_151);
        TextView Sdt_151 = (TextView) row.findViewById(R.id.Sdt_151);
        TextView DateTime_151 = (TextView) row.findViewById(R.id.DateTime_151);
        TextView ThanhTien_151 = (TextView) row.findViewById(R.id.ThanhTien_151);
        TextView Trangthai_151 = (TextView) row.findViewById(R.id.Trangthai_151);
        TextView DiaChi_151 = (TextView) row.findViewById(R.id.DiaChi_151);

        final DaiKin_data DaiKin_data = list.get(position);
        Ten_151.setText(DaiKin_data.Ten);
        Sdt_151.setText(DaiKin_data.Sdt);
        DateTime_151.setText(DaiKin_data.DateTime);
        ThanhTien_151.setText(DaiKin_data.ThanhTien);
        Trangthai_151.setText(DaiKin_data.Trangthai);
        DiaChi_151.setText(DaiKin_data.DiaChi);

        return row;
    }


}
