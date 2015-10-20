package it.jaschke.alexandria;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by edu on 14/10/2015.
 */
public class Utility {

    public static boolean isNetworkAvailable(Activity callingActivity) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) callingActivity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
