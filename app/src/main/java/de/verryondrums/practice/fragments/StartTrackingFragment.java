package de.verryondrums.practice.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import de.verryondrums.practice.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link StartTrackingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StartTrackingFragment extends Fragment implements View.OnClickListener {
    public StartTrackingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment StartTrackingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StartTrackingFragment newInstance() {
        StartTrackingFragment fragment = new StartTrackingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button startButton = (Button) getActivity().findViewById(R.id.btn_start_tracking);
        Button stopButton = (Button) getActivity().findViewById(R.id.btn_stop_tracking);
        Button saveButton = (Button) getActivity().findViewById(R.id.btn_save);

        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);
        saveButton.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start_tracking, container, false);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_tracking:
                startTracking();
                break;
            case R.id.btn_stop_tracking:
                stopTracking();
                break;
            case R.id.btn_save:
                saveTracking();
                break;
        }
    }

    private void stopTracking() {
        // TODO
    }

    private void startTracking() {
        // TODO
    }

    private void saveTracking() {
        // TODO
    }
}
