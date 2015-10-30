package c.mars.ciproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.b)
    Button t;
    boolean on;
    final String[] LABELS={"on", "off"};
    @OnClick(R.id.b) void t() {
        on=!on;
        t.setText(LABELS[on ? 0 : 1]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
