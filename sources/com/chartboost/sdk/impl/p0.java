package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static p0 f1057b = new p0(new Handler(Looper.getMainLooper()));

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1058a;

    public p0(Handler handler) {
        this.f1058a = handler;
    }

    public static p0 b() {
        return f1057b;
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }

    public Task<AppSetIdInfo> a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e) {
            Log.e("CBAndroid", "Cannot retrieve appSetId client: " + e);
            return null;
        }
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
}
