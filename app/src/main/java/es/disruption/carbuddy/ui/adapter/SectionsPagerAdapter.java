package es.disruption.carbuddy.ui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;

import es.disruption.carbuddy.R;
import es.disruption.carbuddy.ui.fragment.CarLocationFragment;
import es.disruption.carbuddy.ui.fragment.MonitorFragment;
import es.disruption.carbuddy.ui.fragment.WalletLocationFragment;

import static es.disruption.carbuddy.ui.fragment.MonitorFragment.SECTION_MONITOR;
import static es.disruption.carbuddy.ui.fragment.CarLocationFragment.SECTION_CAR;
import static es.disruption.carbuddy.ui.fragment.WalletLocationFragment.SECTION_WALLET;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context context;

    public SectionsPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case SECTION_CAR:
                return new CarLocationFragment();
            case SECTION_WALLET:
                return new WalletLocationFragment();
            case SECTION_MONITOR:
                return new MonitorFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case SECTION_CAR:
                return context.getString(R.string.title_section_car);
            case SECTION_WALLET:
                return context.getString(R.string.title_section_wallet);
            case SECTION_MONITOR:
                return context.getString(R.string.title_section_monitor);
        }
        return null;
    }
}
