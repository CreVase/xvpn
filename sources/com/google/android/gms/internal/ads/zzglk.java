package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzglk implements zzgce {
    private static final zzglk zza = new zzglk();
    private static final zzgiu zzb = zzgiu.zzb(new zzgis() { // from class: com.google.android.gms.internal.ads.zzglh
        @Override // com.google.android.gms.internal.ads.zzgis
        public final Object zza(zzgbe zzgbeVar) {
            return zzglz.zzb((zzghx) zzgbeVar);
        }
    }, zzghx.class, zzgbv.class);

    public static void zzd() throws GeneralSecurityException {
        zzgcg.zzg(zza);
        zzgif.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final Class zza() {
        return zzgbv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final Class zzb() {
        return zzgbv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final /* bridge */ /* synthetic */ Object zzc(zzgcd zzgcdVar) throws GeneralSecurityException {
        Iterator it = zzgcdVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgbz zzgbzVar : (List) it.next()) {
                if (zzgbzVar.zzb() instanceof zzglf) {
                    zzglf zzglfVar = (zzglf) zzgbzVar.zzb();
                    zzgrx zzb2 = zzgrx.zzb(zzgbzVar.zzg());
                    if (!zzb2.equals(zzglfVar.zzc())) {
                        String valueOf = String.valueOf(zzglfVar.zzb());
                        String zzgrxVar = zzglfVar.zzc().toString();
                        throw new GeneralSecurityException(hx2.s(p71.q("Mac Key with parameters ", valueOf, " has wrong output prefix (", zzgrxVar, ") instead of ("), zzb2.toString(), ")"));
                    }
                }
            }
        }
        return new zzglj(zzgcdVar, null);
    }
}
