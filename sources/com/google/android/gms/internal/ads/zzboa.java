package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzboa {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbny();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbnz();
    private final zzbnm zzc;

    public zzboa(Context context, zzcaz zzcazVar, String str, zzfjh zzfjhVar) {
        this.zzc = new zzbnm(context, zzcazVar, str, zza, zzb, zzfjhVar);
    }

    public final zzbnq zza(String str, zzbnt zzbntVar, zzbns zzbnsVar) {
        return new zzboe(this.zzc, str, zzbntVar, zzbnsVar);
    }

    public final zzboj zzb() {
        return new zzboj(this.zzc);
    }
}
