package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzaty extends zzaud {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaty(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", zzaomVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
