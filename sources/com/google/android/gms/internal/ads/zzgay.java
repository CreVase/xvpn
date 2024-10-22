package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzgay {
    private final InputStream zza;

    private zzgay(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgay zzb(byte[] bArr) {
        return new zzgay(new ByteArrayInputStream(bArr));
    }

    public final zzgpm zza() throws IOException {
        try {
            return zzgpm.zzg(this.zza, zzgtl.zza());
        } finally {
            this.zza.close();
        }
    }
}
