package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzccr {
    private final Context zza;
    private final zzcdc zzb;
    private final ViewGroup zzc;
    private zzccq zzd;

    public zzccr(Context context, ViewGroup viewGroup, zzcgb zzcgbVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcgbVar;
        this.zzd = null;
    }

    public final zzccq zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzccq zzccqVar = this.zzd;
        if (zzccqVar != null) {
            return zzccqVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzccq zzccqVar = this.zzd;
        if (zzccqVar != null) {
            zzccqVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcdb zzcdbVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcdc zzcdcVar = this.zzb;
        zzccq zzccqVar = new zzccq(context, zzcdcVar, i5, z, zzcdcVar.zzm().zza(), zzcdbVar);
        this.zzd = zzccqVar;
        this.zzc.addView(zzccqVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzccq zzccqVar = this.zzd;
        if (zzccqVar != null) {
            zzccqVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzccq zzccqVar = this.zzd;
        if (zzccqVar != null) {
            zzccqVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzccq zzccqVar = this.zzd;
        if (zzccqVar != null) {
            zzccqVar.zzC(i);
        }
    }
}
