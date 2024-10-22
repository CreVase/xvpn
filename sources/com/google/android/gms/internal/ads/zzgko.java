package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgko implements zzgce {
    private static final zzgko zza = new zzgko();

    private zzgko() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgcg.zzg(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final Class zza() {
        return zzgkl.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final Class zzb() {
        return zzgkl.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final /* bridge */ /* synthetic */ Object zzc(zzgcd zzgcdVar) throws GeneralSecurityException {
        if (zzgcdVar.zza() != null) {
            Iterator it = zzgcdVar.zzd().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new zzgkn(zzgcdVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
