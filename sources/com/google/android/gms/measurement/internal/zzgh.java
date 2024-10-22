package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.p71;

/* loaded from: classes2.dex */
public final class zzgh {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzgd zze;

    private final long zzb() {
        return this.zze.zzc().getLong(this.zza, 0L);
    }

    private final void zzc() {
        this.zze.zzt();
        long currentTimeMillis = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.zze.zzc().edit();
        edit.remove(this.zzb);
        edit.remove(this.zzc);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair<String, Long> zza() {
        long abs;
        this.zze.zzt();
        this.zze.zzt();
        long zzb = zzb();
        if (zzb == 0) {
            zzc();
            abs = 0;
        } else {
            abs = Math.abs(zzb - this.zze.zzb().currentTimeMillis());
        }
        long j = this.zzd;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzc().getString(this.zzc, null);
        long j2 = this.zze.zzc().getLong(this.zzb, 0L);
        zzc();
        if (string != null && j2 > 0) {
            return new Pair<>(string, Long.valueOf(j2));
        }
        return zzgd.zza;
    }

    private zzgh(zzgd zzgdVar, String str, long j) {
        this.zze = zzgdVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zza = str + ":start";
        this.zzb = p71.l(str, ":count");
        this.zzc = p71.l(str, ":value");
        this.zzd = j;
    }

    public final void zza(String str, long j) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.zze.zzc().getLong(this.zzb, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzc().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.zze.zzc().edit();
        if (z) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j3);
        edit2.apply();
    }
}
