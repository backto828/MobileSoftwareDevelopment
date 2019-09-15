package com.example.textview001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button button_change_language;
    private TextView text_view_language;
    private EditText edit_text_country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        button_change_language=this.findViewById(R.id.button_change_language);
        text_view_language=this.findViewById(R.id.text_view_language);
        edit_text_country=this.findViewById(R.id.edit_text_country);

        button_change_language.setOnClickListener(new mClick());


    }

    private class mClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String suoxie;
            suoxie = edit_text_country.getText().toString();

            if(suoxie.equals("cn"))
            {
                text_view_language.setText(R.string.language_cn);
                button_change_language.setText(R.string.change_language_cn);
            }
            else if(suoxie.equals("en"))
            {
                text_view_language.setText(R.string.language_en);
                button_change_language.setText(R.string.change_language_en);
            }
            else if(suoxie.equals("jp"))
            {
                text_view_language.setText(R.string.language_jp);
                button_change_language.setText(R.string.change_language_jp);
            }
            else if(suoxie.equals("kr"))
            {
                text_view_language.setText(R.string.language_kr);
                button_change_language.setText(R.string.change_language_kr);
            }
        }
    }
}
