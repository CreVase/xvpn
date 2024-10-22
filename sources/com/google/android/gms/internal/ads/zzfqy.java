package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* loaded from: classes.dex */
final class zzfqy {
    private static final zzfrl zzb = new zzfrl("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfrw zza;
    private final String zzd;

    public zzfqy(Context context) {
        if (zzfrz.zza(context)) {
            this.zza = new zzfrw(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfqt.zza, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    public final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    public final void zzd(zzfqp zzfqpVar, zzfrd zzfrdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfqv(this, taskCompletionSource, zzfqpVar, zzfrdVar, taskCompletionSource), taskCompletionSource);
        }
    }

    public final void zze(zzfra zzfraVar, zzfrd zzfrdVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfraVar.zzg() == null) {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfrb zzc2 = zzfrc.zzc();
            zzc2.zzb(8160);
            zzfrdVar.zza(zzc2.zzc());
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfqu(this, taskCompletionSource, zzfraVar, zzfrdVar, taskCompletionSource), taskCompletionSource);
    }

    public final void zzf(zzfrf zzfrfVar, zzfrd zzfrdVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfqw(this, taskCompletionSource, zzfrfVar, i, zzfrdVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
