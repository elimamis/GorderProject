package com.example.elimamis.gorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


public class ChooseTableActivity extends ActionBarActivity {

    TextView textViewRestName;
    private Toolbar toolbar;
    CheckBox btnTable;
    String restName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_table);

        textViewRestName = (TextView)findViewById(R.id.txtSoon);
        toolbar = (Toolbar) findViewById(R.id.toolBarMain);

        textViewRestName.setText(restName);

        toolbar.setTitle("Pick A Table ");
        setSupportActionBar(toolbar);

        handleTableButton();
    }

    private void handleTableButton() {
        btnTable = (CheckBox) findViewById(R.id.btnTable);
        btnTable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (btnTable.isChecked()) {

                    Toast.makeText(getBaseContext(), "בחרת את שולחן מספר 1", Toast.LENGTH_SHORT).show();
                    btnTable.setBackgroundResource(R.mipmap.green_table);

                    Intent intent = new Intent(ChooseTableActivity.this,MenuListActivity.class);
                    startActivity(intent);


                } else {
                    Toast.makeText(getBaseContext(), "שולחן מספר 1 התפנה!", Toast.LENGTH_SHORT).show();
                    btnTable.setBackgroundResource(R.mipmap.gray_table);
                }


            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);

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
