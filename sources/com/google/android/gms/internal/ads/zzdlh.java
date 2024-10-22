package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzdlh implements zzfzp {
    final /* synthetic */ zzdli zza;

    public zzdlh(zzdli zzdliVar) {
        this.zza = zzdliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "omid native display exp");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcgb zzcgbVar = (zzcgb) list.get(0);
            if (zzcgbVar != null) {
                this.zza.zzb(zzcgbVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "omid native display exp");
        }
    }
}
