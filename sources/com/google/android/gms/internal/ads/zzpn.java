package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpn extends zzdr {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final zzdo zzi(zzdo zzdoVar) throws zzdp {
        boolean z;
        boolean z2;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdo.zza;
        }
        if (zzdoVar.zzd == 2) {
            if (zzdoVar.zzc != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i < length) {
                    int i2 = iArr[i];
                    if (i2 < zzdoVar.zzc) {
                        if (i2 != i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z |= z2;
                        i++;
                    } else {
                        throw new zzdp("Unhandled input format:", zzdoVar);
                    }
                } else {
                    if (z) {
                        return new zzdo(zzdoVar.zzb, length, 2);
                    }
                    return zzdo.zza;
                }
            }
        } else {
            throw new zzdp("Unhandled input format:", zzdoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
