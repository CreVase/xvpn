package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaul extends zzgtz implements zzgvk {
    private static final zzaul zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzaul zzaulVar = new zzaul();
        zzb = zzaulVar;
        zzgtz.zzaU(zzaul.class, zzaulVar);
    }

    private zzaul() {
    }

    public static zzauk zze() {
        return (zzauk) zzb.zzaA();
    }

    public static zzaul zzg() {
        return zzb;
    }

    public static zzaul zzh(zzgsr zzgsrVar) throws zzgul {
        return (zzaul) zzgtz.zzaE(zzb, zzgsrVar);
    }

    public static zzaul zzi(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzaul) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzl(zzaul zzaulVar, String str) {
        str.getClass();
        zzaulVar.zzd |= 1;
        zzaulVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzaul zzaulVar, long j) {
        zzaulVar.zzd |= 16;
        zzaulVar.zzi = j;
    }

    public static /* synthetic */ void zzn(zzaul zzaulVar, String str) {
        str.getClass();
        zzaulVar.zzd |= 2;
        zzaulVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzaul zzaulVar, long j) {
        zzaulVar.zzd |= 4;
        zzaulVar.zzg = j;
    }

    public static /* synthetic */ void zzp(zzaul zzaulVar, long j) {
        zzaulVar.zzd |= 8;
        zzaulVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzauj zzaujVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzauk(zzaujVar);
                }
                return new zzaul();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
