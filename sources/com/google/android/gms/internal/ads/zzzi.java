package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzzi extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzg zzd;
    private boolean zze;

    public /* synthetic */ zzzi(zzzg zzzgVar, SurfaceTexture surfaceTexture, boolean z, zzzh zzzhVar) {
        super(surfaceTexture);
        this.zzd = zzzgVar;
        this.zza = z;
    }

    public static zzzi zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdx.zzf(z2);
        zzzg zzzgVar = new zzzg();
        if (z) {
            i = zzb;
        }
        return zzzgVar.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        int i2;
        synchronized (zzzi.class) {
            if (!zzc) {
                if (zzeg.zzc(context)) {
                    if (zzeg.zzd()) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
