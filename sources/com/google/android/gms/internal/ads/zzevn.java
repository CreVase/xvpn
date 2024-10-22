package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzevn implements zzetw {
    private final Context zza;
    private final String zzb;
    private final zzgad zzc;

    public zzevn(zzbvi zzbviVar, Context context, String str, zzgad zzgadVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevo(new JSONObject());
            }
        });
    }
}
