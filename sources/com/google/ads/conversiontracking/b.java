package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public class b extends GoogleConversionReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1380a;

    public b(Context context) {
        this.f1380a = context;
    }

    public void a(String str, long j) {
        try {
            GoogleConversionReporter.a(this.f1380a, new g.c().a(str).a(true).b().a(j), false, true, true);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
    }
}
