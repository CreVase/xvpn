package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatw extends zzaud {
    public zzatw(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", zzaomVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzask zzaskVar = new zzask((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzaskVar.zza.longValue());
            this.zze.zzq(zzaskVar.zzb.longValue());
        }
    }
}
