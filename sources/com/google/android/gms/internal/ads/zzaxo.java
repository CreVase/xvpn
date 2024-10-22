package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class zzaxo extends PushbackInputStream {
    final /* synthetic */ zzaxp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaxo(zzaxp zzaxpVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzaxpVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzaxr.zze(this.zza.zzc);
        super.close();
    }
}
