package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzccp implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzccq zzb;

    public zzccp(zzccq zzccqVar, boolean z) {
        this.zzb = zzccqVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
