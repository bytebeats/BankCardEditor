package me.pc.edittext.numformat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import me.pc.edittext.numformat.library.CardNumFormatEditText;
import me.pc.edittext.numformat.library.CardNumFormatTextWatcher;

public class MainActivity extends Activity {
    private EditText mEditText;
    private CardNumFormatEditText mCardNumFormatEditText;
    private CardNumFormatEditText mCardNumFormatEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.edittext);
        mEditText.addTextChangedListener(new CardNumFormatTextWatcher(mEditText));
        mCardNumFormatEditText = (CardNumFormatEditText) findViewById(R.id.cardnumformatedittext);
        mCardNumFormatEditText2 = (CardNumFormatEditText) findViewById(R.id.cardnumformatedittext2);
    }
}
