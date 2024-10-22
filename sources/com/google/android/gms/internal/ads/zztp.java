package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zztp extends zztk {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zztp(zzcv zzcvVar, Object obj, Object obj2) {
        super(zzcvVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zztp zzq(zzbp zzbpVar) {
        return new zztp(new zztq(zzbpVar), zzcu.zza, zzd);
    }

    public static zztp zzr(zzcv zzcvVar, Object obj, Object obj2) {
        return new zztp(zzcvVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zzcv
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zzcv
    public final zzcs zzd(int i, zzcs zzcsVar, boolean z) {
        this.zzc.zzd(i, zzcsVar, z);
        if (zzfk.zzE(zzcsVar.zzc, this.zzf) && z) {
            zzcsVar.zzc = zzd;
        }
        return zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zzcv
    public final zzcu zze(int i, zzcu zzcuVar, long j) {
        this.zzc.zze(i, zzcuVar, j);
        if (zzfk.zzE(zzcuVar.zzc, this.zze)) {
            zzcuVar.zzc = zzcu.zza;
        }
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zzcv
    public final Object zzf(int i) {
        Object zzf = this.zzc.zzf(i);
        if (zzfk.zzE(zzf, this.zzf)) {
            return zzd;
        }
        return zzf;
    }

    public final zztp zzp(zzcv zzcvVar) {
        return new zztp(zzcvVar, this.zze, this.zzf);
    }
}
