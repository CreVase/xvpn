package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgrf {
    public static final zzgrf zza = new zzgrf(new zzgrg());
    public static final zzgrf zzb = new zzgrf(new zzgrk());
    public static final zzgrf zzc = new zzgrf(new zzgrm());
    public static final zzgrf zzd = new zzgrf(new zzgrl());
    public static final zzgrf zze = new zzgrf(new zzgrh());
    public static final zzgrf zzf = new zzgrf(new zzgrj());
    public static final zzgrf zzg = new zzgrf(new zzgri());
    private final zzgre zzh;

    public zzgrf(zzgrn zzgrnVar) {
        if (zzghg.zzb()) {
            this.zzh = new zzgrd(zzgrnVar, null);
        } else if (zzgru.zza()) {
            this.zzh = new zzgqz(zzgrnVar, null);
        } else {
            this.zzh = new zzgrb(zzgrnVar, null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
