package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgib {
    public static final zzgmd zza = new zzgia(null);

    public static zzgmj zza(zzgcd zzgcdVar) {
        zzgbj zzgbjVar;
        zzgmf zzgmfVar = new zzgmf();
        zzgmfVar.zzb(zzgcdVar.zzb());
        Iterator it = zzgcdVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgbz zzgbzVar : (List) it.next()) {
                int zzh = zzgbzVar.zzh() - 2;
                if (zzh != 1) {
                    if (zzh != 2) {
                        if (zzh == 3) {
                            zzgbjVar = zzgbj.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzgbjVar = zzgbj.zzb;
                    }
                } else {
                    zzgbjVar = zzgbj.zza;
                }
                int zza2 = zzgbzVar.zza();
                String zzf = zzgbzVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzgmfVar.zza(zzgbjVar, zza2, zzf, zzgbzVar.zzc().name());
            }
        }
        if (zzgcdVar.zza() != null) {
            zzgmfVar.zzc(zzgcdVar.zza().zza());
        }
        try {
            return zzgmfVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
