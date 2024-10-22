package com.facebook.ads.internal.dynamicloading;

import defpackage.hp0;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Method f1363a;

    /* renamed from: b, reason: collision with root package name */
    public final hp0 f1364b = new hp0(this);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f1364b));
    }
}
