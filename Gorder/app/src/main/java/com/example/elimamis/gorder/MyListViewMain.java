package com.example.elimamis.gorder;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MyListViewMain extends ActionBarActivity {


    ListView listView;
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view_main);

        inflateTheListView();
        handleClicksOnItemsInListView();

    }



    private void inflateTheListView() {

        String[] items = {"Bar Cafe","SuSu Sushi","Big Burger","Pizza Papi","Shnizel Palace","Grill Fire","Junk Foods","Indian Rest","Babbushka Restaurant","No Place Like Home"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,items);

        listView = (ListView)findViewById(R.id.listViewMain);
        listView.setAdapter(adapter);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.txtAutoComplete);
        autoCompleteTextView.setAdapter(adapter);


    }

    private void handleClicksOnItemsInListView() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView itemTextView = (TextView)view;
                String msgToDisplay = "You Clicked On : " + position;
                Toast.makeText(MyListViewMain.this,msgToDisplay,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MyListViewMain.this,ChooseTableActivity.class);
                intent.putExtra("restName",itemTextView.getText().toString());
                startActivity(intent);
            }
        });
    }
























    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_list_view_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
