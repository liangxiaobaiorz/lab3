package edu.fjhu.cse.lab3_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class simpleadapter extends AppCompatActivity {
    private String[] names = new String[]{
            "lion", "tiger", "monkey", "dog", "cat", "elephant"};
    private int[] imageIDs =new int[]{
            R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpleadapter);
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("animals", names[i]);
            listItem.put("footer", imageIDs[i]);
            listItems.add(listItem);

        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listItems,R.layout.simple_item,
                new String[]{"animals","footer"},
                new int[]{R.id.name,R.id.footer});

        ListView list = (ListView)findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(simpleadapter.this, names[i], Toast.LENGTH_SHORT).show();
                view.setBackgroundColor(Color.RED);
            }
        });

    }

}




