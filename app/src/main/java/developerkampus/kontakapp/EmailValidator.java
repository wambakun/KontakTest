package developerkampus.kontakapp;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.regex.Pattern;

/**
 * Created by Wambakun on 18/12/2016.
 */

public class EmailValidator implements TextWatcher {
    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );
    private boolean mIsValid = false;

    public boolean isValid() {
        return mIsValid;
    }
    public static boolean isValidEmail(CharSequence email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    final public void afterTextChanged(Editable editableText) {
        mIsValid = isValidEmail(editableText);
    }

    final public void beforeTextChanged(CharSequence s, int start, int count, int after) {/*No-op*/}

    final public void onTextChanged(CharSequence s, int start, int before, int count) {/*No-op*/}
}
