package de.inovex.androidgradleversionsample.app.test;

import android.test.ActivityInstrumentationTestCase2;
import de.inovex.androidgradleversionsample.app.BuildConfig;
import de.inovex.androidgradleversionsample.app.MainActivity;
import de.inovex.androidgradleversionsample.app.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView; //for finding controls
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;


/**
 * Created by dhelleberg on 08/05/14.
 */
public class MainActivityTestCase extends ActivityInstrumentationTestCase2<MainActivity> {


    public MainActivityTestCase() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testHostNameDisplay() {
        onView(withId(R.id.main_textview_url)).check(matches(withText(BuildConfig.API_HOST)));

    }
}
