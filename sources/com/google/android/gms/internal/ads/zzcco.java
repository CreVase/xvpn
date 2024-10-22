package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcco implements Runnable {
    final /* synthetic */ zzccq zza;

    public zzcco(zzccq zzccqVar) {
        this.zza = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
