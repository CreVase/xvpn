package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes.dex */
public final class zzlw {
    private final zziv zza;

    @Deprecated
    public zzlw(Context context, zzcfl zzcflVar) {
        this.zza = new zziv(context, zzcflVar);
    }

    @Deprecated
    public final zzlw zza(final zzko zzkoVar) {
        zziv zzivVar = this.zza;
        zzdx.zzf(!zzivVar.zzq);
        zzkoVar.getClass();
        zzivVar.zzf = new zzftm() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return zzko.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlw zzb(final zzxq zzxqVar) {
        zziv zzivVar = this.zza;
        zzdx.zzf(!zzivVar.zzq);
        zzxqVar.getClass();
        zzivVar.zze = new zzftm() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return zzxq.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlx zzc() {
        zziv zzivVar = this.zza;
        zzdx.zzf(!zzivVar.zzq);
        zzivVar.zzq = true;
        return new zzlx(zzivVar);
    }
}
