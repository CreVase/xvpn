package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatz extends zzaud {
    public zzatz(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", zzaomVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzag(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzag(2);
            } else {
                this.zze.zzag(1);
            }
        }
    }
}
