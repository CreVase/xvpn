package com.google.ads.conversiontracking;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class n implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1407a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f1408b = new LinkedBlockingQueue();

    public IBinder a() throws InterruptedException {
        if (this.f1407a) {
            throw new IllegalStateException();
        }
        this.f1407a = true;
        return (IBinder) this.f1408b.take();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f1408b.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
