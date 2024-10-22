package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.List;

/* loaded from: classes.dex */
final class zzbxo implements zzfzp {
    final /* synthetic */ ml1 zza;

    public zzbxo(zzbxp zzbxpVar, ml1 ml1Var) {
        this.zza = ml1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        List list;
        list = zzbxp.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbxp.zzc;
        list.remove(this.zza);
    }
}
