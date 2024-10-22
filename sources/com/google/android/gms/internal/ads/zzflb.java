package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzflb implements zzfkv {
    private static zzflb zza;
    private float zzb = 0.0f;
    private final zzfkr zzc;
    private final zzfkp zzd;
    private zzfkq zze;
    private zzfku zzf;

    public zzflb(zzfkr zzfkrVar, zzfkp zzfkpVar) {
        this.zzc = zzfkrVar;
        this.zzd = zzfkpVar;
    }

    public static zzflb zzb() {
        if (zza == null) {
            zza = new zzflb(new zzfkr(), new zzfkp());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final void zzc(boolean z) {
        if (z) {
            zzfmc.zzd().zzi();
        } else {
            zzfmc.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzfkq(new Handler(), context, new zzfko(), this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfku.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfkg) it.next()).zzg().zzi(f);
        }
    }

    public final void zzf() {
        zzfkt.zza().zze(this);
        zzfkt.zza().zzf();
        zzfmc.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfmc.zzd().zzj();
        zzfkt.zza().zzg();
        this.zze.zzb();
    }
}
