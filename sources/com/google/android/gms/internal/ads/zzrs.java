package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzrs extends zzht {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzrs() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzht, com.google.android.gms.internal.ads.zzhn
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzl() {
        return this.zzh;
    }

    public final long zzm() {
        return this.zzg;
    }

    public final void zzn(int i) {
        this.zzi = i;
    }

    public final boolean zzo(zzht zzhtVar) {
        ByteBuffer byteBuffer;
        zzdx.zzd(!zzhtVar.zzd(1073741824));
        zzdx.zzd(!zzhtVar.zzd(268435456));
        zzdx.zzd(!zzhtVar.zzd(4));
        if (zzp()) {
            if (this.zzh < this.zzi) {
                ByteBuffer byteBuffer2 = zzhtVar.zzc;
                if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzhtVar.zze;
            if (zzhtVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhtVar.zzc;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhtVar.zze;
        return true;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }
}
