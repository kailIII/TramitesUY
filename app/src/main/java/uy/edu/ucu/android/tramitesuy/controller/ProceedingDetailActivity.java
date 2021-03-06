package uy.edu.ucu.android.tramitesuy.controller;

import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import uy.edu.ucu.android.tramitesuy.R;

public class ProceedingDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceeding_detail);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_detail, ProceedingsDetailFragment.newInstance(extras.getInt("proceedingId"), extras.getString("categoryName")))
                    .commit();
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_proceeding_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                //Intent homeIntent = new Intent(this, MainActivity.class);
                //startActivity(homeIntent);
                finish();
                break;
            default:
                break;
        }

        return true;

    }
}
