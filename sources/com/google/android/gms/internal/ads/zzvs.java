package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzvs extends zzcv {
    private static final Object zzc = new Object();
    private static final zzbp zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbp zzh;
    private final zzbf zzi;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("SinglePeriodTimeline");
        zzarVar.zzb(Uri.EMPTY);
        zzd = zzarVar.zzc();
    }

    public zzvs(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzbp zzbpVar, zzbf zzbfVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        zzbpVar.getClass();
        this.zzh = zzbpVar;
        this.zzi = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final int zza(Object obj) {
        if (zzc.equals(obj)) {
            return 0;
        }
        return -1;
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
        Object obj;
        zzdx.zza(i, 0, 1);
        if (z) {
            obj = zzc;
        } else {
            obj = null;
        }
        zzcsVar.zzl(null, obj, 0, this.zze, 0L, zzd.zza, false);
        return zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final zzcu zze(int i, zzcu zzcuVar, long j) {
        zzdx.zza(i, 0, 1);
        Object obj = zzcu.zza;
        zzbp zzbpVar = this.zzh;
        long j2 = this.zzf;
        zzcuVar.zza(obj, zzbpVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, j2, 0, 0, 0L);
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcv
    public final Object zzf(int i) {
        zzdx.zza(i, 0, 1);
        return zzc;
    }
}
