package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzcid implements zzhbc {
    private final zzchz zza;

    public zzcid(zzchz zzchzVar) {
        this.zza = zzchzVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzhbk.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzhbk.zzb(zzf);
        return zzf;
    }
}
