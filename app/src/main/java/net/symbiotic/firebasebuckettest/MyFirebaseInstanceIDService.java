package net.symbiotic.firebasebuckettest;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by oscar on 16/01/18.
 */

public class MyFirebaseInstanceIDService extends com.google.firebase.iid.FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        System.out.println();
    }
}