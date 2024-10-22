package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhz implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzib zza;
    private final Handler zzb;

    public zzhz(zzib zzibVar, Handler handler) {
        this.zza = zzibVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhy
            @Override // java.lang.Runnable
            public final void run() {
                zzib.zzc(zzhz.this.zza, i);
            }
        });
    }
}
