package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaxl extends zzcbl {
    final /* synthetic */ zzaxr zza;

    public zzaxl(zzaxr zzaxrVar) {
        this.zza = zzaxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzaxr.zze(this.zza);
        return super.cancel(z);
    }
}
