package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzasg extends zzapy {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzasg() {
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzasg(String str) {
        HashMap zza = zzapy.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }
}
