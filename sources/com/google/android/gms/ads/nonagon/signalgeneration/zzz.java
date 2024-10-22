package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfzp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzz implements zzfzp {
    final /* synthetic */ zzaa zza;

    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzdst zzdstVar;
        zzdsj zzdsjVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdstVar = zzaaVar.zzr;
        zzdsjVar = zzaaVar.zzj;
        zzf.zzc(zzdstVar, zzdsjVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcat.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* synthetic */ void zzb(Object obj) {
        zzcat.zze("Initialized webview successfully for SDKCore.");
    }
}
