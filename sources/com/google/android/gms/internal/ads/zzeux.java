package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import defpackage.ml1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeux implements zzetw {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbzt zzd;

    public zzeux(zzbzt zzbztVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzd = zzbztVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzf(zzfzt.zzm(zzfzt.zzh(this.zzb), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeuv
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzeuy((String) obj);
            }
        }, this.zza), Throwable.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeux.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ ml1 zzc(Throwable th) throws Exception {
        return zzfzt.zzh(new zzeuy(this.zzb));
    }
}
