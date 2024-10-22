package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatb extends zzaud {
    public zzatb(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", zzaomVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzaom zzaomVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzaomVar.zzaa(i);
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof Settings.SettingNotFoundException) {
            } else {
                throw e;
            }
        }
    }
}
