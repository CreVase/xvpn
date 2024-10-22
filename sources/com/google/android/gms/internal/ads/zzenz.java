package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzenz implements zzetw {
    private final ml1 zza;
    private final Executor zzb;

    public zzenz(ml1 ml1Var, Executor executor) {
        this.zza = ml1Var;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzn(this.zza, new zzfza() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                final String str = (String) obj;
                return zzfzt.zzh(new zzetv() { // from class: com.google.android.gms.internal.ads.zzenx
                    @Override // com.google.android.gms.internal.ads.zzetv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
