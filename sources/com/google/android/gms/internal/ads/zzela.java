package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class zzela {
    private final zzdgx zza;

    public zzela(zzdgx zzdgxVar) {
        this.zza = zzdgxVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, View view, zzekw zzekwVar) {
        zzeky zzekyVar = new zzeky(this, new zzdhf() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
            }
        });
        zzdfx zze = this.zza.zze(new zzctm(zzfdeVar, zzfcrVar, null), zzekyVar);
        zzekwVar.zzd(new zzekz(this, zze));
        return zze.zzg();
    }
}
