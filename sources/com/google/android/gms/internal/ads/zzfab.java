package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfab implements zzfsk {
    final /* synthetic */ zzfae zza;

    public zzfab(zzfae zzfaeVar) {
        this.zza = zzfaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsk
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfad zzfadVar;
        zzbvg zzbvgVar = (zzbvg) obj;
        this.zza.zzd = new zzfad(zzbvgVar, new zzffm(zzbvgVar.zzj), null);
        zzfadVar = this.zza.zzd;
        return zzfadVar;
    }
}
