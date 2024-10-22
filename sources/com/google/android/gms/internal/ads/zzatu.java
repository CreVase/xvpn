package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatu extends zzaud {
    private final boolean zzi;

    public zzatu(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzaomVar, i, 61);
        this.zzi = zzaspVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(longValue);
        }
    }
}
