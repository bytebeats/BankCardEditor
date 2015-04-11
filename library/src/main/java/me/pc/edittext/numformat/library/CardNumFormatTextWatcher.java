package me.pc.edittext.numformat.library;
/**
 * Copyright 2014 Peter Pan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.   
 */

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * @author SilentKnight || happychinapc[at]gmail[dot]com
 * @version V 1.0.0
 * @project FormatCardNumEditText
 * @package me.pc.edittext.numformat.libary
 * @date 2015/3/25
 * @time 16:36
 * @FIX ME IF ANYTHING INAPPRICIATE
 */

public class CardNumFormatTextWatcher implements TextWatcher {
    public static final int LIMIT_OF_INPUT_LENGTH = 23;
    //set anything you want, ' ', '-'...
    private char placeHolder = PLACEHOLDER.WHITESPACE.getPlaceHolder();
    private EditText mEditText;
    int prevTextLength = 0;
    int curTextLength = 0;
    boolean isChanged = false;

    int cursor = 0;// cursor's location;
    private char[] tmpCharArray;
    private StringBuffer buffer = new StringBuffer();
    int placeHolderCount = 0;

    public CardNumFormatTextWatcher(EditText editText) {
        mEditText = editText;
        mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(LIMIT_OF_INPUT_LENGTH)});
    }

    public void setPlaceHolder(PLACEHOLDER enumPlaceholder) {
        placeHolder = enumPlaceholder.getPlaceHolder();
    }

    public char getPlaceHolder() {
        return placeHolder;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        prevTextLength = s.length();
        if (buffer.length() > 0) {
            buffer.delete(0, buffer.length());
        }
        placeHolderCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == placeHolder) {
                placeHolderCount++;
            }
        }
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        curTextLength = s.length();
        buffer.append(s.toString());
        if (curTextLength == prevTextLength || curTextLength <= 3
                || isChanged) {
            isChanged = false;
            return;
        }
        isChanged = true;
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (isChanged) {
            cursor = mEditText.getSelectionEnd();
            int index = 0;
            while (index < buffer.length()) {
                if (buffer.charAt(index) == placeHolder) {
                    buffer.deleteCharAt(index);
                } else {
                    index++;
                }
            }

            index = 0;
            int tmpPlaceHolderCount = 0;
            while (index < buffer.length()) {
                if ((index == 4 || index == 9 || index == 14 || index == 19)) {
                    buffer.insert(index, placeHolder);
                    tmpPlaceHolderCount++;
                }
                index++;
            }

            if (tmpPlaceHolderCount > placeHolderCount) {
                cursor += (tmpPlaceHolderCount - placeHolderCount);
            }

            tmpCharArray = new char[buffer.length()];
            buffer.getChars(0, buffer.length(), tmpCharArray, 0);
            String str = buffer.toString();
            if (cursor > str.length()) {
                cursor = str.length();
            } else if (cursor < 0) {
                cursor = 0;
            }

            mEditText.setText(str);
            Editable editable = mEditText.getText();
            Selection.setSelection(editable, cursor);
            isChanged = false;
        }
    }

    public static enum PLACEHOLDER {
        WHITESPACE(' '), POUND('#'), HYPHEN('-');
        private char placeHolder;

        private PLACEHOLDER(char placeHolder) {
            this.placeHolder = placeHolder;
        }

        public char getPlaceHolder() {
            return placeHolder;
        }
    }
}
