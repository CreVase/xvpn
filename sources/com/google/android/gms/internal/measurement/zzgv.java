package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.h41;

/* loaded from: classes.dex */
public final class zzgv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final h41 zzh;
    private final boolean zzi;

    public zzgv(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzgv zza() {
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzgv zzb() {
        if (this.zzc.isEmpty()) {
            h41 h41Var = this.zzh;
            if (h41Var == null) {
                return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, h41Var);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private zzgv(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, h41 h41Var) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = z2;
        this.zzi = z3;
        this.zzg = z4;
        this.zzh = h41Var;
    }

    public final zzgn<Double> zza(String str, double d) {
        return zzgn.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgn<Long> zza(String str, long j) {
        return zzgn.zza(this, str, Long.valueOf(j), true);
    }

    public final zzgn<String> zza(String str, String str2) {
        return zzgn.zza(this, str, str2, true);
    }

    public final zzgn<Boolean> zza(String str, boolean z) {
        return zzgn.zza(this, str, Boolean.valueOf(z), true);
    }
}
