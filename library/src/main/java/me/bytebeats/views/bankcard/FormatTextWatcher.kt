package me.bytebeats.views.bankcard

import android.widget.EditText
import android.text.TextWatcher
import java.lang.StringBuffer
import android.text.Editable
import android.text.Selection
import android.text.InputFilter
import android.text.InputFilter.LengthFilter

/**
 * @author bytebeats || happychinapc[at]gmail[dot]com
 * @date 2015/3/25
 * @time 16:36
 */
class FormatTextWatcher(private val mEditText: EditText) : TextWatcher {
    //set anything you want, ' ', '-'...
    var splitter = Splitter.WHITESPACE
    private var prevTextLength = 0
    private var curTextLength = 0
    private var isChanged = false
    private var cursor = 0 // cursor's location;
    private var tmpCharArray: CharArray? = null
    private val buffer = StringBuffer()
    private var splitterCounter = 0


    init {
        mEditText.filters = arrayOf<InputFilter>(LengthFilter(LIMIT_OF_INPUT_LENGTH))
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        prevTextLength = s.length
        if (buffer.isNotEmpty()) {
            buffer.delete(0, buffer.length)
        }
        splitterCounter = 0
        for (element in s) {
            if (element == splitter.splitter) {
                splitterCounter++
            }
        }
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        curTextLength = s.length
        buffer.append(s)
        if (curTextLength == prevTextLength || curTextLength <= 3 || isChanged) {
            isChanged = false
            return
        }
        isChanged = true
    }

    override fun afterTextChanged(s: Editable) {
        if (isChanged) {
            cursor = mEditText.selectionEnd
            var index = 0
            while (index < buffer.length) {
                if (buffer[index] == splitter.splitter) {
                    buffer.deleteCharAt(index)
                } else {
                    index++
                }
            }
            index = 0
            var tmpPlaceHolderCount = 0
            while (index < buffer.length) {
                if (index == 4 || index == 9 || index == 14 || index == 19) {
                    buffer.insert(index, splitter.splitter)
                    tmpPlaceHolderCount++
                }
                index++
            }
            if (tmpPlaceHolderCount > splitterCounter) {
                cursor += tmpPlaceHolderCount - splitterCounter
            }
            tmpCharArray = CharArray(buffer.length)
            buffer.getChars(0, buffer.length, tmpCharArray, 0)
            val str = buffer.toString()
            if (cursor > str.length) {
                cursor = str.length
            } else if (cursor < 0) {
                cursor = 0
            }
            mEditText.setText(str)
            val editable = mEditText.text
            Selection.setSelection(editable, cursor)
            isChanged = false
        }
    }

    companion object {
        private const val LIMIT_OF_INPUT_LENGTH = 23
    }
}