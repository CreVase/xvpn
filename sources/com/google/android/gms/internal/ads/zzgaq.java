package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgaq extends zzgac {
    final /* synthetic */ zzgas zza;
    private final zzfyz zzb;

    public zzgaq(zzgas zzgasVar, zzfyz zzfyzVar) {
        this.zza = zzgasVar;
        this.zzb = zzfyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfyz zzfyzVar = this.zzb;
        ml1 zza = zzfyzVar.zza();
        zzfsw.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfyzVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ml1) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
