package developerkampus.kontakapp;

/**
 * Created by Wambakun on 18/12/2016.
 */

public class SharedPreferenceEntry {
    private final String mNama;
    private final String mEmail;
    private final String mTelp;

    public SharedPreferenceEntry(String name, String email, String telp) {
        mNama = name;
        mEmail = email;
        mTelp = telp;
    }

    public String getName() {
        return mNama;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getTelp() {
        return mTelp;
    }
}
