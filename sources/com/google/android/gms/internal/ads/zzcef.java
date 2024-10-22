package com.google.android.gms.internal.ads;

import defpackage.ml1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcef extends com.google.android.gms.ads.internal.util.zzb {
    final zzcdc zza;
    final zzcen zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcef(zzcdc zzcdcVar, zzcen zzcenVar, String str, String[] strArr) {
        this.zza = zzcdcVar;
        this.zzb = zzcenVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcee(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ml1 zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbU)).booleanValue() && (this.zzb instanceof zzcew)) {
            return zzcbg.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzced
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcef.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
