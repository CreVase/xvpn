package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzgmf {
    private ArrayList zza = new ArrayList();
    private zzgmc zzb = zzgmc.zza;
    private Integer zzc = null;

    public final zzgmf zza(zzgbj zzgbjVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgmh(zzgbjVar, i, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgmf zzb(zzgmc zzgmcVar) {
        if (this.zza != null) {
            this.zzb = zzgmcVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgmf zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgmj zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int zza = ((zzgmh) arrayList.get(i)).zza();
                    i++;
                    if (zza == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgmj zzgmjVar = new zzgmj(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgmjVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
