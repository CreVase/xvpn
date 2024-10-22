package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class zzhal extends zzhaj {
    private int zza;

    public zzhal(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzanr.zzc(byteBuffer.get());
        zzanr.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
