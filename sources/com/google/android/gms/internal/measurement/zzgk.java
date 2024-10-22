package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import defpackage.kg;
import defpackage.p71;

/* loaded from: classes.dex */
public final class zzgk {
    private static final kg zza = new kg();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzgk.class) {
            kg kgVar = zza;
            uri = (Uri) kgVar.getOrDefault(str, null);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                kgVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return p71.m(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }
}
