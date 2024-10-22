package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzatc extends zzaud {
    private static final zzaue zzi = new zzaue();
    private final Context zzj;

    public zzatc(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, Context context) {
        super(zzaspVar, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", zzaomVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzapz.zza(str.getBytes(), true));
        }
    }
}
