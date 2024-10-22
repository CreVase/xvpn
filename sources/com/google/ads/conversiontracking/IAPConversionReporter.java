package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public class IAPConversionReporter extends GoogleConversionReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1377a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1378b;
    public final String c;
    public final g.d d = g.d.IAP_CONVERSION;
    public final String e;

    public IAPConversionReporter(Context context, String str, String str2, boolean z) {
        this.f1377a = context;
        this.c = str;
        this.e = str2;
        this.f1378b = z;
    }

    public static void reportWithProductId(Context context, String str, String str2, boolean z) {
        new IAPConversionReporter(context, str, str2, z).report();
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        g.c c = new g.c().e(this.c).a(this.d).c(this.e);
        Context context = this.f1377a;
        boolean z = this.f1378b;
        if (!g.a(context, c, z)) {
            return;
        }
        GoogleConversionReporter.a(context, c, true, z, true);
    }
}
