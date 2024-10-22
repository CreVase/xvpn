package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;

/* loaded from: classes.dex */
public class x1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f1286a;

    /* renamed from: b, reason: collision with root package name */
    public final CBError f1287b;

    public x1(T t, CBError cBError) {
        this.f1286a = t;
        this.f1287b = cBError;
    }

    public static <T> x1<T> a(T t) {
        return new x1<>(t, null);
    }

    public static <T> x1<T> a(CBError cBError) {
        return new x1<>(null, cBError);
    }
}
