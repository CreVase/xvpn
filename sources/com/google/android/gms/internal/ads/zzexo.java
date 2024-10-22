package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.ml1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzexo implements zzetw {
    private final zzgad zza;

    public zzexo(zzgad zzgadVar) {
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzK);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzL)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzcn.zza(str2));
                        }
                    }
                }
                return new zzexp(hashMap);
            }
        });
    }
}
