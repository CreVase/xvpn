package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcvh implements zzhbc {
    private final zzcvg zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcvh(zzcvg zzcvgVar, zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzcvgVar;
        this.zzb = zzhbpVar;
        this.zzc = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbxu) this.zzc.zzb(), null);
    }
}
