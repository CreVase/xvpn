package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import defpackage.x80;

/* loaded from: classes.dex */
public final class zzeni implements zzetw {
    private final Context zza;

    public zzeni(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcG)).booleanValue()) {
            if (x80.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
                z = true;
            } else {
                z = false;
            }
            return zzfzt.zzh(new zzenj(z));
        }
        return zzfzt.zzh(null);
    }
}
