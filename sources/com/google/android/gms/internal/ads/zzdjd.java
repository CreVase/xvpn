package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdjd implements zzfzp {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdje zzb;

    public zzdjd(zzdje zzdjeVar, View view) {
        this.zzb = zzdjeVar;
        this.zza = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzab(this.zza, (zzfkc) obj);
    }
}
