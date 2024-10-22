package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class zzcby implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzccg zzb;

    public zzcby(zzccg zzccgVar, MediaPlayer mediaPlayer) {
        this.zzb = zzccgVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcch zzcchVar;
        zzcch zzcchVar2;
        zzccg.zzl(this.zzb, this.zza);
        zzccg zzccgVar = this.zzb;
        zzcchVar = zzccgVar.zzq;
        if (zzcchVar != null) {
            zzcchVar2 = zzccgVar.zzq;
            zzcchVar2.zzf();
        }
    }
}
