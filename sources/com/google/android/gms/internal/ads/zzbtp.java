package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbtp extends zzbtj {
    final /* synthetic */ List zza;

    public zzbtp(zzbts zzbtsVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zze(String str) {
        zzcat.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzf(List list) {
        zzcat.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
