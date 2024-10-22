package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzanq extends zzhan {
    private static final zzhau zza = zzhau.zzb(zzanq.class);

    public zzanq(zzhao zzhaoVar, zzanp zzanpVar) throws IOException {
        zzf(zzhaoVar, zzhaoVar.zzc(), zzanpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhan, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
