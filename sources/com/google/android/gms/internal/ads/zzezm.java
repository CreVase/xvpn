package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzezm implements zzffu {
    private final zzfai zza;

    public zzezm(zzfai zzfaiVar) {
        this.zza = zzfaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffu
    public final ml1 zza(zzffv zzffvVar) {
        zzezn zzeznVar = (zzezn) zzffvVar;
        return ((zzezj) this.zza).zzb(zzeznVar.zzb, zzeznVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffu
    public final void zzb(zzffj zzffjVar) {
        zzffjVar.zza = ((zzezj) this.zza).zza();
    }
}
