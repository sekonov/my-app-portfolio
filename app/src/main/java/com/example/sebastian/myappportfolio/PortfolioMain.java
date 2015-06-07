package com.example.sebastian.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_main, menu);
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

    public void displayToast1(View view) {
        //Show a toast in response to button 1 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my first project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast2(View view) {
        //Show a toast in response to button 2 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my second project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast3(View view) {
        //Show a toast in response to button 3 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my third project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast4(View view) {
        //Show a toast in response to button 4 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my fourth project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast5(View view) {
        //Show a toast in response to button 5 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my fifth project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast6(View view) {
        //Show a toast in response to button 6 click
        Context context = getApplicationContext();
        CharSequence text = "This button will display my FINAL project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
