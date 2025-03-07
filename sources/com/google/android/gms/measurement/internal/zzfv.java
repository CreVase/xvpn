package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.p71;

/* loaded from: classes2.dex */
public final class zzfv {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    private zzfv(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder q = p71.q("origin=", str, ",name=", str2, ",params=");
        q.append(valueOf);
        return q.toString();
    }

    public final zzbg zza() {
        return new zzbg(this.zza, new zzbb(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzfv zza(zzbg zzbgVar) {
        return new zzfv(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzb(), zzbgVar.zzd);
    }
}
