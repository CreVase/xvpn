package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzepb implements zzetv {
    final String zza;
    final int zzb;

    public zzepb(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza = zzfdz.zza(bundle, "pii");
            bundle.putBundle("pii", zza);
            zza.putString("pvid", this.zza);
            zza.putInt("pvid_s", this.zzb);
        }
    }
}
