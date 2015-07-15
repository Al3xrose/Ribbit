package alphonse.asr.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by alphonse on 6/23/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "z5LskkxcWYgHy7o2hYk3vp3agqRrQxzayCeGz10n", "9SnpzSD2mTxxDLKDV4Ani7kVRUNvAb6MfLyeGLAE");


    }
}
