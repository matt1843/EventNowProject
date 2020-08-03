package com.example.EventNowProject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ChatInformationDialog extends AppCompatDialogFragment {

    String chatHelp = "Please make sure to enter hello to start chat bot";
    String informationHelp = "Please make sure you have included a space after choice of event";
    String wrongQuestion = "If you have entered the wrong thing just click the reset button and type hello again";




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("ChatBot Helper").setMessage(chatHelp +"\n" + informationHelp + "\n" + wrongQuestion).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return builder.create();

    }
}
