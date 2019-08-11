package org.androidpn.client;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.androidpn.client.helper.fixTheme;

/**
 * Created by daktak on 2/19/16.
 */
public class SetPreferenceActivity extends AppCompatActivity {

    String dataLeAk419 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
	Object throwawayLeAk419 = android.util.Log.d("leak-419", dataLeAk419);

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        boolean reset = fixTheme.fixTheme(this);
		String dataLeAk420 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk420 = android.util.Log.d("leak-420", dataLeAk420);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getFragmentManager().beginTransaction().replace(R.id.content1,
                new PrefsFragment()).commit();
    }

}