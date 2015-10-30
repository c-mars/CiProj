package c.mars.ciproj;

import android.app.Application;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.widget.Button;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    Instrumentation instrumentation;
    private MainActivity mainActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instrumentation=getInstrumentation();
        mainActivity=getActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {
        try {
            runTestOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Button b = (Button) mainActivity.findViewById(R.id.b);
                    String t = b.getText().toString();
                    assertEquals("off", t);

                    b.callOnClick();

                    t = b.getText().toString();
                    assertEquals("on", t);

                    b.callOnClick();
                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}