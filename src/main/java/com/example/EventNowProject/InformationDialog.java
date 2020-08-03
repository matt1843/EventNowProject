package com.example.EventNowProject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class InformationDialog extends AppCompatDialogFragment {

    String redMarker = "Red Marker = Be Careful";
    String yellowMarker = "Yellow Marker = Caution";
    String greenMarker = "Green Marker = Safe";




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Marker Colour Information").setMessage(redMarker+"\n" + yellowMarker + "\n" + greenMarker).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return builder.create();

    }

}
