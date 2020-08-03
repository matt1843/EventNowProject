package com.example.EventNowProject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatBot extends AppCompatActivity {
        Button ChatButton;
        Button NewQuestionBttn;
        TextView BotAnswer;
        EditText QuestionTxt;
        Button chatinfobutton;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        ChatButton = findViewById(R.id.chatbutton);
        NewQuestionBttn = findViewById(R.id.newquestionbutton);
        BotAnswer = findViewById(R.id.BotAnswer);
        QuestionTxt = findViewById(R.id.questiontxt);
        chatinfobutton = findViewById(R.id.chatinfobutton);

        chatinfobutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openDialog();


            }
        });



        ChatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (QuestionTxt.getText().toString().equalsIgnoreCase("hi") || QuestionTxt.getText().toString().equalsIgnoreCase("hello"))
                {
                    BotAnswer.setText("Hello how are you? What would you like to know today?\n "+
                            "Ask me what you want to know about from the choice of Movies, Concerts or Food ");
                }
                 else if (QuestionTxt.getText().toString().equalsIgnoreCase("movies") || QuestionTxt.getText().toString().equalsIgnoreCase("concerts")
                        || QuestionTxt.getText().toString().equalsIgnoreCase("food"))
                {
                    BotAnswer.setText("To learn information about your choice \n"
                            +"Enter the name of your choice and add information EG. Movie Information" );
                }

                else if (QuestionTxt.getText().toString().equalsIgnoreCase("Movie Information"))

                {
                    BotAnswer.setText("Going to see a movie can be enjoyable check out the movies that are on right now \n"+
                            "Go to the Event section of Event Now and you can choose from your favourite genre");
                }

                 else if (QuestionTxt.getText().toString().equalsIgnoreCase("Concert Information"))

                {
                    BotAnswer.setText("Right Now there are many concerts happening if you head over to the events you can browse acts there \n"+
                            "Or to see these concerts and there locations together check out the map");
                }
                else if (QuestionTxt.getText().toString().equalsIgnoreCase("Food Information"))

                {
                    BotAnswer.setText("Eating is something we all know we love to do but learning to cook it is different. \n" +
                            "Look at the map to see where you can learn to cook something it might be one of your favourites");
                }
            }
        });

        NewQuestionBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuestionTxt.getText().clear();
                BotAnswer.setText(null);
            }
        });

    }
    public void openDialog() {
        ChatInformationDialog chatinformationDialog = new ChatInformationDialog();
        chatinformationDialog.show(getSupportFragmentManager(), "ChatInformationDialog");

    }


}


