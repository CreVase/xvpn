package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzav extends zzcz {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    public zzav(zzay zzayVar, Context context) {
        this.zzb = zzayVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.zzb.zzi(this.zza, zzeVar.zzb, true, true);
    }
}
