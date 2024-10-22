package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzhau {
    public static zzhau zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhap(cls.getSimpleName());
        }
        return new zzhar(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
