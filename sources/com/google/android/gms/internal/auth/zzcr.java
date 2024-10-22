package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.kg;

/* loaded from: classes.dex */
public final class zzcr {
    private static final kg zza = new kg();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            kg kgVar = zza;
            Uri uri = (Uri) kgVar.getOrDefault("com.google.android.gms.auth_account", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                kgVar.put("com.google.android.gms.auth_account", parse);
                return parse;
            }
            return uri;
        }
    }
}
