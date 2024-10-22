package com.google.ads.conversiontracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import java.util.Map;

/* loaded from: classes.dex */
public class DoubleClickAudienceReporter extends GoogleConversionReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1375b;
    public final Map c;

    public DoubleClickAudienceReporter(Context context, String str, Map map) {
        this.f1374a = context;
        this.f1375b = str;
        this.c = map;
    }

    public static void reportActivity(Context context, String str, Map<String, String> map) {
        new DoubleClickAudienceReporter((Context) g.a(context), g.a(str), map).report();
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        String str = this.f1375b;
        if (TextUtils.isEmpty(str)) {
            Log.e("GoogleConversionReporter", "Error sending activity ping with empty ad unit id.");
            return;
        }
        try {
            GoogleConversionReporter.a(this.f1374a, new g.c().a(g.d.DOUBLECLICK_AUDIENCE).a(this.c).c(str), false, true, false);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
