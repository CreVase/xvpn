package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcwx implements zzhbc {
    private final zzcwv zza;
    private final zzhbp zzb;

    public zzcwx(zzcwv zzcwvVar, zzhbp zzhbpVar) {
        this.zza = zzcwvVar;
        this.zzb = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = this.zza.zza(((zzcic) this.zzb).zza());
        zzhbk.zzb(zza);
        return zza;
    }
}
