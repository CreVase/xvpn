package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcbl;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbp extends zzamg {
    private final zzcbl zza;
    private final zzcas zzb;

    public zzbp(String str, Map map, zzcbl zzcblVar) {
        super(0, str, new zzbo(zzcblVar));
        this.zza = zzcblVar;
        zzcas zzcasVar = new zzcas(null);
        this.zzb = zzcasVar;
        zzcasVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    public final zzamm zzh(zzamc zzamcVar) {
        return zzamm.zzb(zzamcVar, zzand.zzb(zzamcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzamg
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzamc zzamcVar = (zzamc) obj;
        this.zzb.zzf(zzamcVar.zzc, zzamcVar.zza);
        byte[] bArr = zzamcVar.zzb;
        if (zzcas.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzamcVar);
    }
}
