package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmr implements zzfx {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzmp zzb;

    public zzmr(zzmp zzmpVar, String str) {
        this.zzb = zzmpVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfx
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(true, i, th, bArr, this.zza);
    }
}
