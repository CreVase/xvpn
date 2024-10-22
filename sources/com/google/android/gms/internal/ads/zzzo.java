package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzo implements zzzn {
    private final WindowManager zza;

    private zzzo(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzzn zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzzo(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zzb(zzzk zzzkVar) {
        zzzr.zzb(zzzkVar.zza, this.zza.getDefaultDisplay());
    }
}
