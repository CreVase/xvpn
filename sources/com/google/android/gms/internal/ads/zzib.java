package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.p71;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzib {
    private final AudioManager zza;
    private final zzhz zzb;
    private zzia zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzib(Context context, Handler handler, zzia zziaVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zziaVar;
        this.zzb = new zzhz(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzib zzibVar, int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    p71.y("Unknown focus change type: ", i, "AudioFocusManager");
                    return;
                } else {
                    zzibVar.zzg(1);
                    zzibVar.zzf(1);
                    return;
                }
            }
            zzibVar.zzf(-1);
            zzibVar.zze();
            return;
        }
        if (i != -2) {
            zzibVar.zzg(3);
        } else {
            zzibVar.zzf(0);
            zzibVar.zzg(2);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfk.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        int zzY;
        zzia zziaVar = this.zzc;
        if (zziaVar != null) {
            zzjx zzjxVar = (zzjx) zziaVar;
            boolean zzv = zzjxVar.zza.zzv();
            zzY = zzkb.zzY(zzv, i);
            zzjxVar.zza.zzal(zzv, i, zzY);
        }
    }

    private final void zzg(int i) {
        float f;
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzia zziaVar = this.zzc;
        if (zziaVar != null) {
            ((zzjx) zziaVar).zza.zzai();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        if (z) {
            return 1;
        }
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
