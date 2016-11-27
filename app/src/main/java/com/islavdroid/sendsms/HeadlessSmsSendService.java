package com.islavdroid.sendsms;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by islav on 27.11.2016.
 */

public class HeadlessSmsSendService extends IntentService {
    public HeadlessSmsSendService() {
        super(HeadlessSmsSendService.class.getName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}