package com.google.ads.conversiontracking;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public class AdWordsConversionReporter extends GoogleConversionReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1371b;
    public final String c;
    public final g.d d;
    public final String e;
    public final String f;
    public final boolean g;

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, boolean z) {
        this(context, str, str2, str3, null, z);
    }

    public static boolean registerReferrer(Context context, Uri uri) {
        if (uri == null) {
            Log.e("GoogleConversionReporter", "Failed to register referrer from a null click url");
            return false;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Registering: ");
        sb.append(valueOf);
        Log.i("GoogleConversionReporter", sb.toString());
        g.b a2 = g.a(uri);
        if (a2 == null) {
            new StringBuilder(String.valueOf(uri).length() + 31);
            return false;
        }
        boolean a3 = g.a(context, a2);
        if (a3) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 25);
            sb2.append("Successfully registered: ");
            sb2.append(valueOf2);
            Log.i("GoogleConversionReporter", sb2.toString());
        } else {
            new StringBuilder(String.valueOf(uri).length() + 20);
        }
        return a3;
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, z).report();
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        boolean z;
        g.c cVar = new g.c();
        String str = this.f1371b;
        g.c a2 = cVar.a(str);
        g.d dVar = this.d;
        g.c c = a2.a(dVar).b(this.c).c(this.e);
        String str2 = this.f;
        if (str2 != null) {
            c.d(str2);
        }
        g.d dVar2 = g.d.GOOGLE_CONVERSION;
        Context context = this.f1370a;
        if (dVar == dVar2) {
            c a3 = c.a(context);
            a3.c(str);
            c.a(a3.d(str));
        }
        boolean z2 = this.g;
        if (!g.a(context, c, z2)) {
            return;
        }
        if (dVar == dVar2) {
            try {
                c.a(g.a(context, str));
                z = true;
            } catch (Exception e) {
                Log.e("GoogleConversionReporter", "Error sending ping", e);
                return;
            }
        } else {
            z = false;
        }
        GoogleConversionReporter.a(context, c, true, z2, z);
    }

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, String str4, boolean z) {
        g.d dVar;
        this.f1370a = context;
        this.f1371b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        if (this instanceof DoubleClickConversionReporter) {
            dVar = g.d.DOUBLECLICK_CONVERSION;
        } else {
            dVar = g.d.GOOGLE_CONVERSION;
        }
        this.d = dVar;
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, String str4, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, str4, z).report();
    }
}
