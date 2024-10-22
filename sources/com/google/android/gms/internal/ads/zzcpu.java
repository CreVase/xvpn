package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcpu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcpu(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcpr zzcprVar = (zzcpr) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        if (((JSONObject) this.zzc.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdev(zzcprVar, zzgadVar));
        }
        zzhbk.zzb(singleton);
        return singleton;
    }
}
