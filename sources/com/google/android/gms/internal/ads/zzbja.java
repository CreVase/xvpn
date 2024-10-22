package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbja implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        if (zzcgbVar.zzJ() != null) {
            zzcgbVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzcgbVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzcgbVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzcat.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
