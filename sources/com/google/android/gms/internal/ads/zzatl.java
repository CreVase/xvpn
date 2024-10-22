package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatl extends zzaud {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzatl(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzaomVar, i, 22);
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
            this.zze.zzy(zzi.longValue());
        }
    }
}
