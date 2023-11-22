package com.example.a_listview_advence;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVegetable;
    ArrayList<Vegetable> vegetableArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        Vegetable_Adapter adapter = new Vegetable_Adapter(this,R.layout.dong_vegetable,vegetableArrayList);
        lvVegetable.setAdapter(adapter);

    }

    private void Anhxa(){
        lvVegetable = findViewById(R.id.listview);
        vegetableArrayList = new ArrayList<>();

        vegetableArrayList.add(new Vegetable("Cam","Cam vinh" ,R.drawable.orange));
        vegetableArrayList.add(new Vegetable("Quyts","Quyst vinh" ,R.drawable.tangerine));
        vegetableArrayList.add(new Vegetable("Đào ","Đào tiên" ,R.drawable.peach));
        vegetableArrayList.add(new Vegetable("Cam","Cam ngon" ,R.drawable.orange));

        vegetableArrayList.add(new Vegetable("Cam","Cam vinh" ,R.drawable.orange));
        vegetableArrayList.add(new Vegetable("Quyts","Quyst vinh" ,R.drawable.tangerine));
        vegetableArrayList.add(new Vegetable("Đào ","Đào tiên" ,R.drawable.peach));

        vegetableArrayList.add(new Vegetable("Cam","Cam vinh" ,R.drawable.orange));
        vegetableArrayList.add(new Vegetable("Quyts","Quyst vinh" ,R.drawable.tangerine));
        vegetableArrayList.add(new Vegetable("Đào ","Đào tiên" ,R.drawable.peach));

    }

}