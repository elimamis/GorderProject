package com.example.elimamis.gorder;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivityPage extends ActionBarActivity {

    private static final int NUMBER_OF_BUTTONS = 10;
    TextView headLineText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_page);


        handleButtons();
        handleDoneButton();
    }

    private void handleDoneButton() {
        Button btnDone;
        btnDone = (Button)findViewById(R.id.btnDoneTablePage);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityPage.this,ChooseTableActivity.class);
                intent.putExtra("restName", headLineText.getText().toString());
                startActivity(intent);
            }
        });
    }


    private void handleButtons() {
        LinearLayout linearButtonsLayout = (LinearLayout) findViewById(R.id.linearLayoutInTheScrollViewMain);


        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {

            final Button theButton = new Button(this);


            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            theButton.setLayoutParams(params);

            params.gravity = Gravity.CENTER;
            theButton.setLayoutParams(params);
            linearButtonsLayout.addView(theButton);
            theButton.setBackgroundColor(Color.argb(1, 30, 136, 229));
            theButton.setTextColor(Color.WHITE);
            theButton.setTextSize(30);

            final int buttonsIndex;
            buttonsIndex = i;

            switch (buttonsIndex) {
                case 0:
                    theButton.setText("מסעדה 1");
                    break;
                case 1:
                    theButton.setText("מסעדה 2");
                    break;
                case 2:
                    theButton.setText("מסעדה 3");
                    break;
                case 3:
                    theButton.setText("מסעדה 4");
                    break;
                case 4:
                    theButton.setText("מסעדה 5");
                    break;
                case 5:
                    theButton.setText("מסעדה 6");
                    break;
                case 6:
                    theButton.setText("מסעדה 7");
                    break;
                case 7:
                    theButton.setText("מסעדה 8");
                    break;
                case 8:
                    theButton.setText("מסעדה 9");
                    break;
                case 9:
                    theButton.setText("מסעדה 10");
                    break;

            }

            headLineText = (TextView)findViewById(R.id.txtHeadLineMainActivityPage);

            theButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    String textOnButton =  theButton.getText().toString();

                    headLineText.setText(textOnButton);
                    headLineText.setTextColor(Color.RED);


                }
            });

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_page, menu);
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
