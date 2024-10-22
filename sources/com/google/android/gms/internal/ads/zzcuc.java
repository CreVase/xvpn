package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcuc implements zzfzp {
    final /* synthetic */ zzcue zza;

    public zzcuc(zzcue zzcueVar) {
        this.zza = zzcueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        zzdcq zzdcqVar;
        zzdcqVar = this.zza.zzf;
        zzdcqVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdcq zzdcqVar;
        zzdcqVar = this.zza.zzf;
        zzdcqVar.zzn(true);
    }
}
