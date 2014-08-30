package es.disruption.carbuddy.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import es.disruption.carbuddy.R;
import es.disruption.carbuddy.ui.adapter.SectionsPagerAdapter;


public class MainActivity extends Activity {

    public static final String ARG_SECTION_NUMBER = "section_number";
    private SectionsPagerAdapter sectionsPageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);

        sectionsPageAdapter = new SectionsPagerAdapter(getFragmentManager(), getBaseContext());
        viewPager.setAdapter(sectionsPageAdapter);
    }

}
