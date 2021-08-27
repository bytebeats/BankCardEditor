package me.bytebeats.views.bankcard.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import me.bytebeats.views.bankcard.FormatEditText;
import me.bytebeats.views.bankcard.FormatTextWatcher;

public class MainActivity extends Activity {
    private EditText mEditText;
    private FormatEditText formatEditText;
    private FormatEditText formatEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.edittext);
        mEditText.addTextChangedListener(new FormatTextWatcher(mEditText));
        formatEditText = findViewById(R.id.format_edit_text);
        formatEditText2 = findViewById(R.id.format_edit_text_2);
    }
}
