package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzccn implements Runnable {
    final /* synthetic */ zzccq zza;

    public zzccn(zzccq zzccqVar) {
        this.zza = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
