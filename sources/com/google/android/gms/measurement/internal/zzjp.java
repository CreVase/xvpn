package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjp implements zznf {
    private final /* synthetic */ zziq zza;

    public zzjp(zziq zziqVar) {
        this.zza = zziqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznf
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zza("auto", str2, bundle, str);
        } else {
            this.zza.zzb("auto", str2, bundle);
        }
    }
}
