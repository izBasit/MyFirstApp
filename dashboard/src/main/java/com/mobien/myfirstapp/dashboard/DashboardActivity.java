package com.mobien.myfirstapp.dashboard;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;


public class DashboardActivity extends ActionBarActivity {

    private ActionBar mActionBar;
    private Context mContext;
    private ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mContext  = this;
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);

        lvItems = (ListView) findViewById(R.id.lvItems);
        //code to add header and footer to listview
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup mLvHeader = (ViewGroup) inflater.inflate(R.layout.sales_order_execution_header, lvItems,
                false);
//        ViewGroup footer = (ViewGroup) inflater.inflate(R.layout.footer, lvItems,
//                false);
        lvItems.addHeaderView(mLvHeader, null, false);
//        listView.addFooterView(footer, null, false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
