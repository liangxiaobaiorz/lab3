package edu.fjhu.cse.lab3_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;



public class menu extends AppCompatActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        tv_test= (TextView) findViewById(R.id.tv_test);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflator = new MenuInflater(this);
        //装填R.menu.my_menu对应的菜单,并添加到menu中
        inflator.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.size_big:
                tv_test.setTextSize(26);
                break;
            case R.id.size_center:
                tv_test.setTextSize(22);
                break;
            case R.id.size_small:
                tv_test.setTextSize(18);
                break;
            case R.id.click:
                Toast.makeText(menu.this, "普通菜单项被点击", Toast.LENGTH_SHORT).show();
                break;
            case R.id.color_red:
                tv_test.setTextColor(Color.RED);
                break;
            case R.id.color_black:
                tv_test.setTextColor(Color.BLACK);
                break;


        }
        return true;
    }
}
