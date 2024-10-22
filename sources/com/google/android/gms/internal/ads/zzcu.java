package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzcu {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    public static final zzn zzb;
    private static final zzbp zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public zzbf zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbp zze = zzs;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("androidx.media3.common.Timeline");
        zzarVar.zzb(Uri.EMPTY);
        zzs = zzarVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzct
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcu.class.equals(obj.getClass())) {
            zzcu zzcuVar = (zzcu) obj;
            if (zzfk.zzE(this.zzc, zzcuVar.zzc) && zzfk.zzE(this.zze, zzcuVar.zze) && zzfk.zzE(null, null) && zzfk.zzE(this.zzl, zzcuVar.zzl) && this.zzf == zzcuVar.zzf && this.zzg == zzcuVar.zzg && this.zzh == zzcuVar.zzh && this.zzi == zzcuVar.zzi && this.zzj == zzcuVar.zzj && this.zzm == zzcuVar.zzm && this.zzo == zzcuVar.zzo && this.zzp == zzcuVar.zzp && this.zzq == zzcuVar.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbf zzbfVar = this.zzl;
        if (zzbfVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzbfVar.hashCode();
        }
        int i = ((hashCode2 * 961) + hashCode) * 31;
        long j = this.zzf;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzg;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzh;
        int i4 = ((((((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j4 = this.zzo;
        return ((((((i4 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzcu zza(Object obj, zzbp zzbpVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzbf zzbfVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zze = zzbpVar == null ? zzs : zzbpVar;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = zzbfVar != null;
        this.zzl = zzbfVar;
        this.zzn = 0L;
        this.zzo = j5;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        boolean z;
        boolean z2;
        boolean z3 = this.zzk;
        if (this.zzl == null) {
            z = false;
        } else {
            z = true;
        }
        if (z3 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdx.zzf(z2);
        if (this.zzl == null) {
            return false;
        }
        return true;
    }
}
