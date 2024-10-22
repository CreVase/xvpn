package com.security.xvpn.z35kb.util;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.XApplication;
import defpackage.ya0;

/* loaded from: classes2.dex */
public class NotificationCheckService extends IntentService {
    public NotificationCheckService() {
        super("Notify");
    }

    @Override // android.app.IntentService, android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        XApplication.d();
        ya0.h = true;
        intent.getStringExtra("title");
        intent.getStringExtra("content");
        intent.getStringExtra("type");
        intent.getStringExtra("type");
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.setFlags(270532608);
        intent2.addCategory("android.intent.category.LAUNCHER");
    }
}
