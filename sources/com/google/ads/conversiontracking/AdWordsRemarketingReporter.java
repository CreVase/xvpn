package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import java.util.Map;

/* loaded from: classes.dex */
public final class AdWordsRemarketingReporter extends GoogleConversionReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1373b;
    public final Map c;

    public AdWordsRemarketingReporter(Context context, String str, Map<String, Object> map) {
        this.f1372a = context;
        this.f1373b = str;
        this.c = map;
    }

    public static void reportWithConversionId(Context context, String str, Map<String, Object> map) {
        new AdWordsRemarketingReporter(context, str, map).report();
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        Context context = this.f1372a;
        c a2 = c.a(context);
        String str = this.f1373b;
        a2.c(str);
        try {
            GoogleConversionReporter.a(context, new g.c().a(str).a().a(this.c).a(a2.d(str)), false, true, true);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public static void reportWithConversionId(Context context, String str) {
        reportWithConversionId(context, str, null);
    }

    public AdWordsRemarketingReporter(Context context, String str) {
        this.f1372a = context;
        this.f1373b = str;
        this.c = null;
    }
}
