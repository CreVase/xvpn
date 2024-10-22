package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class zzaud implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzasp zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzaom zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzaud(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        this.zzb = zzaspVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzaomVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        long nanoTime;
        Method zzj;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzarj zzd = this.zzb.zzd();
        if (zzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
