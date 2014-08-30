package es.disruption.carbuddy.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.disruption.carbuddy.R;
import es.disruption.carbuddy.ui.activity.MainActivity;

public class MonitorFragment extends Fragment {

    public static final int SECTION_MONITOR = 0;

    public MonitorFragment() {
        Bundle args = new Bundle();
        args.putInt(MainActivity.ARG_SECTION_NUMBER, SECTION_MONITOR);
        setArguments(args);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_monitor, container, false);
    }
}
