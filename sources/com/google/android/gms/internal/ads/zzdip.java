package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdip implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdip(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcaz zza = ((zzcio) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzaus(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
