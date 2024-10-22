package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatj extends zzaud {
    private final zzasq zzi;

    public zzatj(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, zzasq zzasqVar) {
        super(zzaspVar, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", zzaomVar, i, 85);
        this.zzi = zzasqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
