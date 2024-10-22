package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzati implements Callable {
    private final zzasp zza;
    private final zzaom zzb;

    public zzati(zzasp zzaspVar, zzaom zzaomVar) {
        this.zza = zzaspVar;
        this.zzb = zzaomVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzapj zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzaom zzaomVar = this.zzb;
                    byte[] zzax = zzc.zzax();
                    zzaomVar.zzak(zzax, 0, zzax.length, zzgtl.zza());
                }
                return null;
            } catch (zzgul | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
