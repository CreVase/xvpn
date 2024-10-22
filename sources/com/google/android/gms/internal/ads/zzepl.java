package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepl implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzepl(zzgad zzgadVar, Context context) {
        this.zza = zzgadVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepl.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepm zzc() throws Exception {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkb)).booleanValue()) {
            i = com.google.android.gms.ads.internal.zzt.zzq().zzk(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzepm(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}
