package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbdk {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfje zze;
    private final zzbdm zzf;

    public zzbdk(Context context, ScheduledExecutorService scheduledExecutorService, zzbdm zzbdmVar, zzfje zzfjeVar) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbdmVar;
        this.zze = zzfjeVar;
    }

    public final ml1 zza() {
        return (zzfzk) zzfzt.zzo(zzfzk.zzu(zzfzt.zzh(null)), ((Long) zzbea.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
