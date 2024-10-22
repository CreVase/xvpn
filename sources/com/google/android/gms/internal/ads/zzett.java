package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzett implements zzetw {
    private final zzgad zza;
    private final Context zzb;

    public zzett(zzgad zzgadVar, Context context) {
        this.zza = zzgadVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzett.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetv zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgb));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzetv() { // from class: com.google.android.gms.internal.ads.zzets
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
