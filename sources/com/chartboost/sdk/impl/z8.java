package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import defpackage.p71;

/* loaded from: classes.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1338a;

    public z8(SharedPreferences sharedPreferences) {
        this.f1338a = sharedPreferences;
    }

    public final String a(String str) {
        String str2;
        try {
            return this.f1338a.getString(str, null);
        } catch (Exception e) {
            str2 = a9.f705a;
            p71.z("Load from shared prefs exception: ", e, str2);
            return null;
        }
    }

    public final void a(String str, String str2) {
        String str3;
        try {
            this.f1338a.edit().putString(str, str2).apply();
        } catch (Exception e) {
            str3 = a9.f705a;
            p71.z("Save to shared prefs exception: ", e, str3);
        }
    }
}
