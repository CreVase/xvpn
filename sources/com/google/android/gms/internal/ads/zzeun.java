package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzeun implements zzetv {
    final String zza;
    final int zzb;

    public /* synthetic */ zzeun(String str, int i, zzeum zzeumVar) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjC)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i = this.zzb;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
