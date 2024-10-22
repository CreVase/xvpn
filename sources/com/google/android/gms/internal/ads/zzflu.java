package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzflu {
    private final zzfkx zza;
    private final ArrayList zzb;

    public zzflu(zzfkx zzfkxVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfkxVar;
        arrayList.add(str);
    }

    public final zzfkx zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
