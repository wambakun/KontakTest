package developerkampus.kontakapp;

import android.content.SharedPreferences;

/**
 * Created by Wambakun on 18/12/2016.
 */

public class Helper {
    static final String KEY_NAME = "key_name";
    static final String KEY_EMAIL = "key_email";
    static final String KEY_TELP = "key_telp";

    // The injected SharedPreferences implementation to use for persistence.
    private final SharedPreferences mSharedPreferences;

    public Helper(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }

    public boolean savePersonalInfo(SharedPreferenceEntry sharedPreferenceEntry){
        // Start a SharedPreferences transaction.
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(KEY_NAME, sharedPreferenceEntry.getName());
        editor.putString(KEY_EMAIL, sharedPreferenceEntry.getEmail());
        editor.putString(KEY_TELP, sharedPreferenceEntry.getTelp());

        // Commit changes to SharedPreferences.
        return editor.commit();
    }

    public SharedPreferenceEntry getPersonalInfo() {
        // Get data from the SharedPreferences.
        String name = mSharedPreferences.getString(KEY_NAME, "");
        String email = mSharedPreferences.getString(KEY_EMAIL, "");
        String telp= mSharedPreferences.getString(KEY_TELP,"");

        // Create and fill a SharedPreferenceEntry model object.
        return new SharedPreferenceEntry(name,email,telp);
    }
}
