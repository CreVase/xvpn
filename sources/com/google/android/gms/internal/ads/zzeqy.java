package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeqy implements zzetv {
    private final boolean zza;

    public zzeqy(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
