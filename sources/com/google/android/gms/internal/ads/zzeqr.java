package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzeqr implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzeqr(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzeqp(context, zzgadVar);
    }
}
