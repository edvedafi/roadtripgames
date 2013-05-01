package com.roadtripgames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RoadTripGames extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /**
     * Called when the @id/launchDetector button is clicked
     *
     * @param view
     */
    public void launchDetector(View view) {
        Intent intent = new Intent(this, LicensePlateMain.class);
        startActivity( intent );
    }

    /**
     * Called when the @id/launchDetector button is clicked
     *
     * @param view
     */
    public void launchISpy(View view) {
        Intent intent = new Intent(this, ISpy.class);
        startActivity( intent );
    }
}
