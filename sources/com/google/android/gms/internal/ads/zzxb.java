package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzxb {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxb(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z;
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z = true;
        } else {
            z = false;
        }
        this.zzb = z;
    }

    public static zzxb zza(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            spatializer = audioManager.getSpatializer();
            return new zzxb(spatializer);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzwz] */
    public final void zzb(zzxi zzxiVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxa(this, zzxiVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzwz
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i = zzfk.zza;
            handler.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzk zzkVar, zzam zzamVar) {
        int i;
        boolean canBeSpatialized;
        if ("audio/eac3-joc".equals(zzamVar.zzm) && zzamVar.zzz == 16) {
            i = 12;
        } else {
            i = zzamVar.zzz;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzfk.zzg(i));
        int i2 = zzamVar.zzA;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        canBeSpatialized = this.zza.canBeSpatialized(zzkVar.zza().zza, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean zze() {
        boolean isAvailable;
        isAvailable = this.zza.isAvailable();
        return isAvailable;
    }

    public final boolean zzf() {
        boolean isEnabled;
        isEnabled = this.zza.isEnabled();
        return isEnabled;
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
