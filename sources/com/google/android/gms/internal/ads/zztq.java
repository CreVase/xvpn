package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zztq extends zzcv {
    private final zzbp zzc;

    public zztq(zzbp zzbpVar) {
        this.zzc = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zza(Object obj) {
        return obj == zztp.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final zzcs zzd(int i, zzcs zzcsVar, boolean z) {
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = zztp.zzd;
        }
        zzcsVar.zzl(num, obj, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final zzcu zze(int i, zzcu zzcuVar, long j) {
        zzcuVar.zza(zzcu.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcuVar.zzm = true;
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final Object zzf(int i) {
        return zztp.zzd;
    }
}
