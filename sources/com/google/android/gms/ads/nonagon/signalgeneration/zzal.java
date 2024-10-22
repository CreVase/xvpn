package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbk;
import com.google.android.gms.internal.ads.zzhbp;

/* loaded from: classes.dex */
public final class zzal implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzal(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzak(zzgadVar, ((zzdxl) this.zzb).zzb());
    }
}
