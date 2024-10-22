package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbae extends zzgtz implements zzgvk {
    private static final zzguf zzb = new zzbac();
    private static final zzbae zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgue zzj = zzgtz.zzaJ();
    private zzazz zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzbae zzbaeVar = new zzbae();
        zzd = zzbaeVar;
        zzgtz.zzaU(zzbae.class, zzbaeVar);
    }

    private zzbae() {
    }

    public static /* synthetic */ void zzA(zzbae zzbaeVar, int i) {
        zzbaeVar.zzm = i - 1;
        zzbaeVar.zze |= 64;
    }

    public static /* synthetic */ void zzB(zzbae zzbaeVar, int i) {
        zzbaeVar.zzn = i - 1;
        zzbaeVar.zze |= 128;
    }

    public static /* synthetic */ void zzC(zzbae zzbaeVar, int i) {
        zzbaeVar.zzp = i - 1;
        zzbaeVar.zze |= 512;
    }

    public static zzbad zzg() {
        return (zzbad) zzd.zzaA();
    }

    public static zzbae zzi(byte[] bArr) throws zzgul {
        return (zzbae) zzgtz.zzaF(zzd, bArr);
    }

    public static /* synthetic */ void zzl(zzbae zzbaeVar, long j) {
        zzbaeVar.zze |= 1;
        zzbaeVar.zzf = j;
    }

    public static /* synthetic */ void zzm(zzbae zzbaeVar, long j) {
        zzbaeVar.zze |= 4;
        zzbaeVar.zzh = j;
    }

    public static /* synthetic */ void zzn(zzbae zzbaeVar, long j) {
        zzbaeVar.zze |= 8;
        zzbaeVar.zzi = j;
    }

    public static /* synthetic */ void zzo(zzbae zzbaeVar, Iterable iterable) {
        zzgue zzgueVar = zzbaeVar.zzj;
        if (!zzgueVar.zzc()) {
            zzbaeVar.zzj = zzgtz.zzaK(zzgueVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbaeVar.zzj.zzh(((zzayt) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzp(zzbae zzbaeVar, zzazz zzazzVar) {
        zzazzVar.getClass();
        zzbaeVar.zzk = zzazzVar;
        zzbaeVar.zze |= 16;
    }

    public static /* synthetic */ void zzq(zzbae zzbaeVar, int i) {
        zzbaeVar.zze |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        zzbaeVar.zzo = i;
    }

    public static /* synthetic */ void zzr(zzbae zzbaeVar, zzbai zzbaiVar) {
        zzbaeVar.zzq = zzbaiVar.zza();
        zzbaeVar.zze |= UserVerificationMethods.USER_VERIFY_ALL;
    }

    public static /* synthetic */ void zzs(zzbae zzbaeVar, long j) {
        zzbaeVar.zze |= 2048;
        zzbaeVar.zzr = j;
    }

    public static /* synthetic */ void zzy(zzbae zzbaeVar, int i) {
        zzbaeVar.zzg = i - 1;
        zzbaeVar.zze |= 2;
    }

    public static /* synthetic */ void zzz(zzbae zzbaeVar, int i) {
        zzbaeVar.zzl = i - 1;
        zzbaeVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzayc zzaycVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzbad(zzaycVar);
                }
                return new zzbae();
            }
            zzgud zzgudVar = zzazi.zza;
            return zzgtz.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgudVar, "zzh", "zzi", "zzj", zzays.zza, "zzk", "zzl", zzgudVar, "zzm", zzgudVar, "zzn", zzgudVar, "zzo", "zzp", zzgudVar, "zzq", zzbah.zza, "zzr"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazz zzf() {
        zzazz zzazzVar = this.zzk;
        if (zzazzVar == null) {
            return zzazz.zzd();
        }
        return zzazzVar;
    }

    public final zzbai zzj() {
        zzbai zzb2 = zzbai.zzb(this.zzq);
        if (zzb2 == null) {
            return zzbai.UNSPECIFIED;
        }
        return zzb2;
    }

    public final List zzk() {
        return new zzgug(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzazj.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzazj.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzazj.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzazj.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzazj.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
