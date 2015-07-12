package com.example.elimamis.gorder;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstScreenActivity extends ActionBarActivity {

    Button bLogin,bSignUp;
    EditText txtUserName,txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

            handleLoginButton();
            handleSignUpButton();


    }



    private void handleLoginButton() {

        bLogin = (Button)findViewById(R.id.btnLogin);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtUserName = (EditText)findViewById(R.id.txtUserPhoneLogin);
                txtPassword = (EditText)findViewById(R.id.txtPasswordLogin);
                String noUserNameEntered = txtUserName.getText().toString();
                String noPasswordEntered = txtPassword.getText().toString();

                Intent intent = new Intent(FirstScreenActivity.this, MyListViewMain.class);
                    intent.putExtra("userNameFromLogin",noUserNameEntered);




                if(noUserNameEntered.isEmpty() || noPasswordEntered.isEmpty()){
                    txtUserName.setBackgroundColor(Color.RED);
                    txtPassword.setBackgroundColor(Color.RED);
                    Toast.makeText(getBaseContext(),"Enter your Phone Number Please!",Toast.LENGTH_LONG).show();
                }else {
                    startActivity(intent);
                    intent.putExtra("userNameFromLogin", noUserNameEntered.toString());
                }

            }
        });




    }

    private void handleSignUpButton() {

        bSignUp = (Button)findViewById(R.id.btnSignUpMain);
        bSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // bSignUp.setBackgroundColor(Color.RED);
                Intent intent = new Intent(FirstScreenActivity.this,SignUpActivity.class);
                startActivity(intent);

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_screen, menu);
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
