package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzczu extends zzdcz implements zzcyf, zzczk {
    private final zzfcr zzb;
    private final AtomicBoolean zzc;

    public zzczu(Set set, zzfcr zzfcrVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfcrVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhC)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzag) != null && zzsVar.zza == 3) {
            zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzczt
                @Override // com.google.android.gms.internal.ads.zzdcy
                public final void zza(Object obj) {
                    zzczu.this.zza((zzczw) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzczw zzczwVar) throws Exception {
        zzczwVar.zzh(this.zzb.zzag);
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        int i = this.zzb.zzb;
        if (i != 2 && i != 5 && i != 4 && i != 6 && i != 7) {
            return;
        }
        zzb();
    }
}
