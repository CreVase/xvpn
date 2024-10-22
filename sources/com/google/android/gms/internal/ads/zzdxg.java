package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class zzdxg implements zzhbc {
    public static zzdxg zza() {
        zzdxg zzdxgVar;
        zzdxgVar = zzdxf.zza;
        return zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhbk.zzb(uuid);
        return uuid;
    }
}
