package de.verryondrums.practice.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import de.verryondrums.practice.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link StartTrackingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StartTrackingFragment extends Fragment {
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_start_tracking, container, false);

        Button startButton = (Button) rootView.findViewById(R.id.btn_start_tracking);
        Button stopButton = (Button) rootView.findViewById(R.id.btn_stop_tracking);
        Button saveButton = (Button) rootView.findViewById(R.id.btn_save);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTracking();
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTracking();
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveTracking();
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    private void stopTracking() {
        // TODO
    }

    private void startTracking() {
        // TODO
    }

    private void saveTracking() {
        EditText timeInput = (EditText) getActivity().findViewById(R.id.et_time);
        EditText notesInput = (EditText) getActivity().findViewById(R.id.et_notes);

        // TODO validate
        // save to database
        String time = timeInput.getText().toString();

    }
}
