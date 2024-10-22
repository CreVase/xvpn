package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.c f1411b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public t(Context context, g.c cVar, boolean z, boolean z2, boolean z3) {
        this.f1410a = context;
        this.f1411b = cVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f1410a;
        try {
            String a2 = g.a(context, this.f1411b);
            if (a2 != null) {
                g.a(context).a(a2, this.f1411b, this.c, this.d, this.e);
            }
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
