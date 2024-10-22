package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzetp implements zzetw {
    private final boolean zza;

    public zzetp(zzfam zzfamVar) {
        this.zza = zzfamVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzeto zzetoVar;
        if (this.zza) {
            zzetoVar = new zzetv() { // from class: com.google.android.gms.internal.ads.zzeto
                @Override // com.google.android.gms.internal.ads.zzetv
                public final void zzj(Object obj) {
                    ((Bundle) obj).putBoolean("sdk_prefetch", true);
                }
            };
        } else {
            zzetoVar = null;
        }
        return zzfzt.zzh(zzetoVar);
    }
}
