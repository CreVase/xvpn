package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgcy {
    public static final zzgcy zza = new zzgcy("SHA1");
    public static final zzgcy zzb = new zzgcy("SHA224");
    public static final zzgcy zzc = new zzgcy("SHA256");
    public static final zzgcy zzd = new zzgcy("SHA384");
    public static final zzgcy zze = new zzgcy("SHA512");
    private final String zzf;

    private zzgcy(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
