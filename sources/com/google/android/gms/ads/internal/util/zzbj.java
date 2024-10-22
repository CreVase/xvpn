package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzcat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbj implements zzamk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    public zzbj(zzbq zzbqVar, String str, zzbn zzbnVar) {
        this.zza = str;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamk
    public final void zza(zzamp zzampVar) {
        zzcat.zzj("Failed to load URL: " + this.zza + "\n" + zzampVar.toString());
        this.zzb.zza((Object) null);
    }
}
