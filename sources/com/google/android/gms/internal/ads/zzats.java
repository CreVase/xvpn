package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzats extends zzaud {
    public zzats(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", zzaomVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzaom zzaomVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzaomVar.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
