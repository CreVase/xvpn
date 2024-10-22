package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgno extends zzgtz implements zzgvk {
    private static final zzgno zzb;
    private int zzd;
    private zzgnr zze;
    private int zzf;

    static {
        zzgno zzgnoVar = new zzgno();
        zzb = zzgnoVar;
        zzgtz.zzaU(zzgno.class, zzgnoVar);
    }

    private zzgno() {
    }

    public static zzgnn zzc() {
        return (zzgnn) zzb.zzaA();
    }

    public static zzgno zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgno) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzg(zzgno zzgnoVar, zzgnr zzgnrVar) {
        zzgnrVar.getClass();
        zzgnoVar.zze = zzgnrVar;
        zzgnoVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnn(null);
                }
                return new zzgno();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgnr zzf() {
        zzgnr zzgnrVar = this.zze;
        if (zzgnrVar == null) {
            return zzgnr.zze();
        }
        return zzgnrVar;
    }
}
