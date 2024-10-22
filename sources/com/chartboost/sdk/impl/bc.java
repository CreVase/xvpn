package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class bc extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f733a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f734b;
    public final ya c;
    public final qb d;
    public float e;

    public bc(Handler handler, Context context, ya yaVar, qb qbVar) {
        super(handler);
        this.f733a = context;
        this.f734b = (AudioManager) context.getSystemService("audio");
        this.c = yaVar;
        this.d = qbVar;
    }

    public final float a() {
        return this.c.a(this.f734b.getStreamVolume(3), this.f734b.getStreamMaxVolume(3));
    }

    public final void b() {
        this.d.a(this.e);
    }

    public void c() {
        this.e = a();
        b();
        this.f733a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f733a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float a2 = a();
        if (a(a2)) {
            this.e = a2;
            b();
        }
    }

    public final boolean a(float f) {
        return f != this.e;
    }
}
