package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzanw extends zzhaj {
    ByteBuffer zza;

    public zzanw(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
