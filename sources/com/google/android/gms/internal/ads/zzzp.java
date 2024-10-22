package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzp implements DisplayManager.DisplayListener, zzzn {
    private final DisplayManager zza;
    private zzzk zzb;

    private zzzp(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzzn zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzzp(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzzk zzzkVar = this.zzb;
        if (zzzkVar != null && i == 0) {
            zzzr.zzb(zzzkVar.zza, zzd());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zzb(zzzk zzzkVar) {
        this.zzb = zzzkVar;
        this.zza.registerDisplayListener(this, zzfk.zzv(null));
        zzzr.zzb(zzzkVar.zza, zzd());
    }
}
