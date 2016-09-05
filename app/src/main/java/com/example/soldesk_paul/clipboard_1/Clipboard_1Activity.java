package com.example.soldesk_paul.clipboard_1;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Clipboard_1Activity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard_1);

        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
        ((Button) findViewById(R.id.button2)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        String txt = null;

        switch (v.getId()) {
            case R.id.button1:
                txt = ((EditText) findViewById(R.id.editText1)).getText().toString();
                clipboardManager.setText(txt);
                break;
            case R.id.button2:
                txt = clipboardManager.getText().toString();
                ((TextView) findViewById(R.id.textView1)).setText(txt);
                break;
        }
    }
}