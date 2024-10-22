package com.google.ads.conversiontracking;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1413b;

    public u(e eVar, d dVar) {
        this.f1413b = eVar;
        this.f1412a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1413b.a(this.f1412a);
    }
}
