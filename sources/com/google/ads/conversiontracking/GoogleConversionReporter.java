package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public abstract class GoogleConversionReporter {
    public static void a(Context context, g.c cVar, boolean z, boolean z2, boolean z3) {
        new Thread(new t(context, cVar, z, z2, z3)).start();
    }

    public abstract void report();
}
