package com.example.elimamis.gorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends ActionBarActivity {
     Button btnSkip,btnDone;
      EditText txtNameAndLastName,txtPassword,txtReEnterPassword,txtPhoneNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        handleBtnSkip();
        handleBtnDone();

    }//OnCreate

    private void handleBtnSkip() {
        btnSkip = (Button) findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, FirstScreenActivity.class);
                startActivity(intent);
            }
        });
    }


    public void handleBtnDone() {
        txtPassword = (EditText)findViewById(R.id.editTextPassword);
        txtReEnterPassword = (EditText)findViewById(R.id.editTextReEnterPassword);
        txtNameAndLastName = (EditText)findViewById(R.id.editTextNameLastName);
        txtPhoneNumber = (EditText)findViewById(R.id.editTextPhoneNumber);

        btnDone = (Button)findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pas1 = txtPassword.getText().toString();
                String pas2 = txtReEnterPassword.getText().toString();

                if (!(pas1.equals(pas2))){
                    Toast.makeText(getBaseContext(),"Passwords Are Not Matching!!!",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getBaseContext(),"Thank You Joining For Gorder",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SignUpActivity.this,MyListViewMain.class);
                    startActivity(intent);
                }


            }
        });




    }















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
