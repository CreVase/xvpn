package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.uu2;

/* loaded from: classes.dex */
public final class zzci {
    private final uu2 zza;

    public zzci(uu2 uu2Var) {
        this.zza = uu2Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        uu2 uu2Var = (uu2) this.zza.getOrDefault(uri.toString(), null);
        if (uu2Var == null) {
            return null;
        }
        return (String) uu2Var.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
