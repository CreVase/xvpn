package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzewc implements zzetw {
    final zzgad zza;
    final Context zzb;
    final zzaxk zzc;

    public zzewc(zzaxk zzaxkVar, zzgad zzgadVar, Context context) {
        this.zzc = zzaxkVar;
        this.zza = zzgadVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewd(new JSONObject());
            }
        });
    }
}
