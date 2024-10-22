package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class zzhax {
    final LinkedHashMap zza;

    public zzhax(int i) {
        this.zza = zzhaz.zzb(i);
    }

    public final zzhax zza(Object obj, zzhbp zzhbpVar) {
        zzhbk.zza(obj, "key");
        zzhbk.zza(zzhbpVar, "provider");
        this.zza.put(obj, zzhbpVar);
        return this;
    }
}
