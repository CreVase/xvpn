package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzxe {
    public final int zza;
    public final zzcx zzb;
    public final int zzc;
    public final zzam zzd;

    public zzxe(int i, zzcx zzcxVar, int i2) {
        this.zza = i;
        this.zzb = zzcxVar;
        this.zzc = i2;
        this.zzd = zzcxVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzxe zzxeVar);
}
