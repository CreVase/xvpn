package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzfqx extends zzfrj {
    final /* synthetic */ zzfqy zza;
    private final zzfrd zzb;

    public zzfqx(zzfqy zzfqyVar, zzfrd zzfrdVar) {
        this.zza = zzfqyVar;
        this.zzb = zzfrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrb zzc = zzfrc.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
