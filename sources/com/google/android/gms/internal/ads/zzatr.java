package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzatr extends zzaud {
    public zzatr(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2) {
        super(zzaspVar, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", zzaomVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzarv zzarvVar = new zzarv((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcx)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzj(zzarvVar.zza);
            this.zze.zzC(zzarvVar.zzb);
        }
    }
}
