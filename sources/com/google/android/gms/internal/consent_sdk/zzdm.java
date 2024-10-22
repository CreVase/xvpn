package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zza(zzdr zzdrVar, zzdr zzdrVar2) {
        zzdm zzdmVar = (zzdm) zzdrVar;
        if (zzdmVar.zza == null) {
            zzdmVar.zza = zzdrVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        zzdr zzdrVar = this.zza;
        if (zzdrVar != null) {
            return zzdrVar.zzb();
        }
        throw new IllegalStateException();
    }
}
