
package com.uberspot.a2048;

import java.util.Locale;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.widget.Toast;

import de.cketti.library.changelog.ChangeLog;

public class MainActivity extends Activity {

    String dataLeAk0 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
	Object throwawayLeAk0 = android.util.Log.d("leak-0", dataLeAk0);

	private static final String MAIN_ACTIVITY_TAG = "2048_MainActivity";

    private WebView mWebView;
    private long mLastBackPress;
    private static final long mBackPressThreshold = 3500;
    private static final String IS_FULLSCREEN_PREF = "is_fullscreen_pref";
    private static boolean DEF_FULLSCREEN = true;
    private long mLastTouch;
    private static final long mTouchThreshold = 2000;
    private Toast pressBackToast;

    @SuppressLint({ "SetJavaScriptEnabled", "NewApi", "ShowToast" })
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		String dataLeAk1 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk1 = android.util.Log.d("leak-1", dataLeAk1);

        // Don't show an action bar or title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // If on android 3.0+ activate hardware acceleration
        if (Build.VERSION.SDK_INT >= 11) {
            String dataLeAk2 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk2 = android.util.Log.d("leak-2", dataLeAk2);
			getWindow().setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                    WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
        }

        // Apply previous setting about showing status bar or not
        applyFullScreen(isFullScreen());

        // Check if screen rotation is locked in settings
        boolean isOrientationEnabled = false;
        try {
            String dataLeAk3 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk3 = android.util.Log.d("leak-3", dataLeAk3);
			isOrientationEnabled = Settings.System.getInt(getContentResolver(),
                    Settings.System.ACCELEROMETER_ROTATION) == 1;
        } catch (SettingNotFoundException e) {
            String dataLeAk4 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk4 = android.util.Log.d("leak-4", dataLeAk4);
			Log.d(MAIN_ACTIVITY_TAG, "Settings could not be loaded");
        }

        // If rotation isn't locked and it's a LARGE screen then add orientation changes based on sensor
        int screenLayout = getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK;
        if (((screenLayout == Configuration.SCREENLAYOUT_SIZE_LARGE)
                || (screenLayout == Configuration.SCREENLAYOUT_SIZE_XLARGE))
                    && isOrientationEnabled) {
            String dataLeAk5 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
						Object throwawayLeAk5 = android.util.Log.d("leak-5", dataLeAk5);
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        }

        setContentView(R.layout.activity_main);

        ChangeLog cl = new ChangeLog(this);
        if (cl.isFirstRun()) {
            String dataLeAk6 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk6 = android.util.Log.d("leak-6", dataLeAk6);
			cl.getLogDialog().show();
        }

        // Load webview with game
        mWebView = (WebView) findViewById(R.id.mainWebView);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setDatabasePath(getFilesDir().getParentFile().getPath() + "/databases");

        // If there is a previous instance restore it in the webview
        if (savedInstanceState != null) {
        	String dataLeAk7 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk7 = android.util.Log.d("leak-7", dataLeAk7);
			// TODO: If app was minimized and Locale language was changed, we need to reload webview with changed language
            mWebView.restoreState(savedInstanceState);
        } else {
        	String dataLeAk8 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk8 = android.util.Log.d("leak-8", dataLeAk8);
			// Load webview with current Locale language
            mWebView.loadUrl("file:///android_asset/2048/index.html?lang=" + Locale.getDefault().getLanguage());
        }

        Toast.makeText(getApplication(), R.string.toggle_fullscreen, Toast.LENGTH_SHORT).show();
        // Set fullscreen toggle on webview LongClick
        mWebView.setOnTouchListener(new OnTouchListener() {

            String dataLeAk9 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk9 = android.util.Log.d("leak-9", dataLeAk9);

			@Override
            public boolean onTouch(View v, MotionEvent event) {
                String dataLeAk10 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
				Object throwawayLeAk10 = android.util.Log.d("leak-10", dataLeAk10);
				// Implement a long touch action by comparing
                // time between action up and action down
                long currentTime = System.currentTimeMillis();
                if ((event.getAction() == MotionEvent.ACTION_UP)
                        && (Math.abs(currentTime - mLastTouch) > mTouchThreshold)) {
                    String dataLeAk11 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
							Object throwawayLeAk11 = android.util.Log.d("leak-11", dataLeAk11);
					boolean toggledFullScreen = !isFullScreen();
                    saveFullScreen(toggledFullScreen);
                    applyFullScreen(toggledFullScreen);
                } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    String dataLeAk12 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
					Object throwawayLeAk12 = android.util.Log.d("leak-12", dataLeAk12);
					mLastTouch = currentTime;
                }
                // return so that the event isn't consumed but used
                // by the webview as well
                return false;
            }
        });

        pressBackToast = Toast.makeText(getApplicationContext(), R.string.press_back_again_to_exit,
                Toast.LENGTH_SHORT);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String dataLeAk13 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk13 = android.util.Log.d("leak-13", dataLeAk13);
		mWebView.saveState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        String dataLeAk14 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk14 = android.util.Log.d("leak-14", dataLeAk14);
		// Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /**
     * Saves the full screen setting in the SharedPreferences
     * @param isFullScreen
     */

    private void saveFullScreen(boolean isFullScreen) {
        String dataLeAk15 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk15 = android.util.Log.d("leak-15", dataLeAk15);
		// save in preferences
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putBoolean(IS_FULLSCREEN_PREF, isFullScreen);
        editor.commit();
    }

    private boolean isFullScreen() {
        String dataLeAk16 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk16 = android.util.Log.d("leak-16", dataLeAk16);
		return PreferenceManager.getDefaultSharedPreferences(this).getBoolean(IS_FULLSCREEN_PREF,
                DEF_FULLSCREEN);
    }

    /**
     * Toggles the activitys fullscreen mode by setting the corresponding window flag
     * @param isFullScreen
     */
    private void applyFullScreen(boolean isFullScreen) {
        String dataLeAk17 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk17 = android.util.Log.d("leak-17", dataLeAk17);
		if (isFullScreen) {
            String dataLeAk18 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk18 = android.util.Log.d("leak-18", dataLeAk18);
			getWindow().clearFlags(LayoutParams.FLAG_FULLSCREEN);
        } else {
            String dataLeAk19 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk19 = android.util.Log.d("leak-19", dataLeAk19);
			getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
		String dataLeAk20 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk20 = android.util.Log.d("leak-20", dataLeAk20);
    }
    
    /**
     * Prevents app from closing on pressing back button accidentally.
     * mBackPressThreshold specifies the maximum delay (ms) between two consecutive backpress to
     * quit the app.
     */
    
    @Override
    public void onBackPressed() {
        String dataLeAk21 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
		Object throwawayLeAk21 = android.util.Log.d("leak-21", dataLeAk21);
		long currentTime = System.currentTimeMillis();
        if (Math.abs(currentTime - mLastBackPress) > mBackPressThreshold) {
            String dataLeAk22 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk22 = android.util.Log.d("leak-22", dataLeAk22);
			pressBackToast.show();
            mLastBackPress = currentTime;
        } else {
            pressBackToast.cancel();
			String dataLeAk23 = java.util.Calendar.getInstance().getTimeZone().getDisplayName();
			Object throwawayLeAk23 = android.util.Log.d("leak-23", dataLeAk23);
            super.onBackPressed();
        }
    }
}
