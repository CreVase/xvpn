package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatx extends zzaud {
    private final zzasw zzi;
    private long zzj;

    public zzatx(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, zzasw zzaswVar) {
        super(zzaspVar, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzaomVar, i, 53);
        this.zzi = zzaswVar;
        if (zzaswVar != null) {
            this.zzj = zzaswVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
