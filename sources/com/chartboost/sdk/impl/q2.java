package com.chartboost.sdk.impl;

import defpackage.tt;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1081a = "p2";

    public static final int b(tt ttVar, tt ttVar2) {
        long j = ttVar.f;
        long j2 = ttVar2.f;
        if (j - j2 == 0) {
            return ttVar.compareTo(ttVar2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
