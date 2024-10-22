package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public enum o6 {
    UNKNOWN(0, "Unknown"),
    ETHERNET(1, "Ethernet"),
    WIFI(2, "WIFI"),
    CELLULAR_UNKNOWN(3, "Cellular_Unknown"),
    CELLULAR_2G(4, "Cellular_2G"),
    CELLULAR_3G(5, "Cellular_3G"),
    CELLULAR_4G(6, "Cellular_4G"),
    CELLULAR_5G(7, "Cellular_5G");


    /* renamed from: a, reason: collision with root package name */
    public final int f1042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1043b;

    o6(int i, String str) {
        this.f1042a = i;
        this.f1043b = str;
    }

    public final String b() {
        return this.f1043b;
    }

    public final int c() {
        return this.f1042a;
    }
}
