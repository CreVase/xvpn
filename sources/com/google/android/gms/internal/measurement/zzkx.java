package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkx {
    private static final zzkx zza = new zzkx();
    private final ConcurrentMap<Class<?>, zzlb<?>> zzc = new ConcurrentHashMap();
    private final zzle zzb = new zzjx();

    private zzkx() {
    }

    public static zzkx zza() {
        return zza;
    }

    public final <T> zzlb<T> zza(Class<T> cls) {
        zziz.zza(cls, "messageType");
        zzlb<T> zzlbVar = (zzlb) this.zzc.get(cls);
        if (zzlbVar != null) {
            return zzlbVar;
        }
        zzlb<T> zza2 = this.zzb.zza(cls);
        zziz.zza(cls, "messageType");
        zziz.zza(zza2, "schema");
        zzlb<T> zzlbVar2 = (zzlb) this.zzc.putIfAbsent(cls, zza2);
        return zzlbVar2 != null ? zzlbVar2 : zza2;
    }

    public final <T> zzlb<T> zza(T t) {
        return zza((Class) t.getClass());
    }
}
