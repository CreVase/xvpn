package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfaa implements zzfsk {
    final /* synthetic */ zzfae zza;

    public zzfaa(zzfae zzfaeVar) {
        this.zza = zzfaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzffk zze;
        zzfad zzfadVar;
        zzcat.zzh("", (zzdyo) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfae zzfaeVar = this.zza;
        zze = zzfaeVar.zze();
        zzfaeVar.zzd = new zzfad(null, zze, null);
        zzfadVar = this.zza.zzd;
        return zzfadVar;
    }
}
