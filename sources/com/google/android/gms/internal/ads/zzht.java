package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class zzht extends zzhn {
    public zzam zza;
    public final zzhq zzb = new zzhq();
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzbq.zzb("media3.decoder");
    }

    public zzht(int i, int i2) {
        this.zzg = i;
    }

    private final ByteBuffer zzl(int i) {
        int capacity;
        int i2 = this.zzg;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new zzhs(capacity, i);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzi(int i) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzl(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer zzl = zzl(i2);
        zzl.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzl.put(byteBuffer);
        }
        this.zzc = zzl;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return zzd(1073741824);
    }
}
