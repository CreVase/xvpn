package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfg implements zzei {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfg(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzff zzffVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzffVar);
            }
        }
    }

    private static zzff zzm() {
        zzff zzffVar;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzffVar = new zzff(null);
            } else {
                zzffVar = (zzff) list.remove(list.size() - 1);
            }
        }
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzb(int i) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(i), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(i, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final zzeh zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzff zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final boolean zzk(zzeh zzehVar) {
        return ((zzff) zzehVar).zzc(this.zzb);
    }
}
