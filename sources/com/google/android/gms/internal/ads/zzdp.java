package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdp extends Exception {
    public final zzdo zza;

    public zzdp(String str, zzdo zzdoVar) {
        super("Unhandled input format: ".concat(String.valueOf(zzdoVar)));
        this.zza = zzdoVar;
    }
}
