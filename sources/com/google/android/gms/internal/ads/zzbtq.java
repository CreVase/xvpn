package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbtq extends zzbtj {
    final /* synthetic */ List zza;

    public zzbtq(zzbts zzbtsVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zze(String str) {
        zzcat.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    public final void zzf(List list) {
        zzcat.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
