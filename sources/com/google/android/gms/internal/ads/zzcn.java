package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcn {
    public final Object zzb;
    public final int zzc;
    public final zzbp zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcm
    };

    public zzcn(Object obj, int i, zzbp zzbpVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbpVar;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcn.class == obj.getClass()) {
            zzcn zzcnVar = (zzcn) obj;
            if (this.zzc == zzcnVar.zzc && this.zzf == zzcnVar.zzf && this.zzg == zzcnVar.zzg && this.zzh == zzcnVar.zzh && this.zzi == zzcnVar.zzi && this.zzj == zzcnVar.zzj && zzfsr.zza(this.zzb, zzcnVar.zzb) && zzfsr.zza(this.zze, zzcnVar.zze) && zzfsr.zza(this.zzd, zzcnVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
