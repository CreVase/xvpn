package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgpm extends zzgtz implements zzgvk {
    private static final zzgpm zzb;
    private int zzd;
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgpm zzgpmVar = new zzgpm();
        zzb = zzgpmVar;
        zzgtz.zzaU(zzgpm.class, zzgpmVar);
    }

    private zzgpm() {
    }

    public static zzgpj zzd() {
        return (zzgpj) zzb.zzaA();
    }

    public static zzgpm zzg(InputStream inputStream, zzgtl zzgtlVar) throws IOException {
        return (zzgpm) zzgtz.zzaH(zzb, inputStream, zzgtlVar);
    }

    public static /* synthetic */ void zzj(zzgpm zzgpmVar, zzgpl zzgplVar) {
        zzgplVar.getClass();
        zzgui zzguiVar = zzgpmVar.zze;
        if (!zzguiVar.zzc()) {
            zzgpmVar.zze = zzgtz.zzaO(zzguiVar);
        }
        zzgpmVar.zze.add(zzgplVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgpi zzgpiVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpj(zzgpiVar);
                }
                return new zzgpm();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgpl.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgpl zze(int i) {
        return (zzgpl) this.zze.get(i);
    }

    public final List zzh() {
        return this.zze;
    }
}
