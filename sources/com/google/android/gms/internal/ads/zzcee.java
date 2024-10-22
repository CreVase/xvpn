package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcee implements Runnable {
    final /* synthetic */ zzcef zza;

    public zzcee(zzcef zzcefVar) {
        this.zza = zzcefVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}
