package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdhu implements zzhbc {
    private final zzhbp zza;

    public zzdhu(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdhr) this.zza).zza().zze() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        zzhbk.zzb(emptySet);
        return emptySet;
    }
}
