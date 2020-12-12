package com.example.daikin_vietnam;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DonHang_Activity extends AppCompatActivity {
    final String DATABASE_NAME = "managerdaikin.sqlite";
    SQLiteDatabase database;
    Button btnback_151;
    ListView ListView;
    ArrayList<DaiKin_data> list;
    Adapter_Daikin adapterDaikin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donhang);
        addControls();
        readData();
        btnback_151 = findViewById(R.id.btnback_151);
        btnback_151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DonHang_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void addControls() {
        ListView = (ListView) findViewById(R.id.listview_151);
        list = new ArrayList<>();
        adapterDaikin = new Adapter_Daikin(this, list);
        ListView.setAdapter(adapterDaikin);
    }
    private void readData(){
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM DaiKIn",null);
        list.clear();
        for(int i = 0; i < cursor.getCount(); i++){
            cursor.moveToPosition(i);
            String Ten_151 = cursor.getString(0);
            String Sdt_151 = cursor.getString(1);
            String DateTime_151 = cursor.getString(2);
            String ThanhToan_151 = cursor.getString(3);
            String ThanhTien_151 = cursor.getString(4);
            String DiaChi_151 = cursor.getString(5);
            list.add(new DaiKin_data(Ten_151, Sdt_151, DateTime_151, ThanhTien_151, ThanhToan_151, DiaChi_151));
        }
        adapterDaikin.notifyDataSetChanged();
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.donhang, container, false);
    }
}
