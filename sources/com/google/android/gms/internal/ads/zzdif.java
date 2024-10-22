package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdif implements zzbjj {
    private final WeakReference zza;

    public /* synthetic */ zzdif(zzdig zzdigVar, zzdie zzdieVar) {
        this.zza = new WeakReference(zzdigVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        zzdig zzdigVar = (zzdig) this.zza.get();
        if (zzdigVar == null) {
            return;
        }
        zzdig.zzc(zzdigVar).zza();
    }
}
