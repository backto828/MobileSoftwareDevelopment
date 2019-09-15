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
                text_view_language.setText("语言");
                button_change_language.setText("改变语言");
            }
            else if(suoxie.equals("en"))
            {
                text_view_language.setText("Language");
                button_change_language.setText("Change language");
            }
            else if(suoxie.equals("jp"))
            {
                text_view_language.setText("言語");
                button_change_language.setText("言語を変更する");
            }
            else if(suoxie.equals("kr"))
            {
                text_view_language.setText("언어");
                button_change_language.setText("언어 변경");
            }
        }
    }
}
