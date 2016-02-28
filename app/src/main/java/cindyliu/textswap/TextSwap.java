package cindyliu.textswap;

import com.firebase.client.Firebase;

/**
 * Created by cindyliu on 2/27/16.
 */
public class TextSwap extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
