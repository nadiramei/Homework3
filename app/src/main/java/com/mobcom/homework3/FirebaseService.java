package com.mobcom.homework3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirebaseService extends Service {
    public FirebaseService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}