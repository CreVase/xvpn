package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes.dex */
public abstract class zzcci extends TextureView implements zzcdf {
    protected final zzccw zza;
    protected final zzcdg zzb;

    public zzcci(Context context) {
        super(context);
        this.zza = new zzccw();
        this.zzb = new zzcdg(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public void zzC(String str, String[] strArr, Integer num) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i);

    public abstract void zzr(zzcch zzcchVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f, float f2);

    public Integer zzw() {
        return null;
    }

    public void zzx(int i) {
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
