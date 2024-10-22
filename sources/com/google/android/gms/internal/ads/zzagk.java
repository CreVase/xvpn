package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
final class zzagk {
    private final zzfb zza = new zzfb(8);
    private int zzb;

    private final long zzb(zzabn zzabnVar) throws IOException {
        int i;
        zzabc zzabcVar = (zzabc) zzabnVar;
        int i2 = 0;
        zzabcVar.zzm(this.zza.zzI(), 0, 1, false);
        int i3 = this.zza.zzI()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while (true) {
                i = i5 + 1;
                if ((i3 & i4) != 0) {
                    break;
                }
                i4 >>= 1;
                i5 = i;
            }
            int i6 = i3 & (~i4);
            zzabcVar.zzm(this.zza.zzI(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zzI()[i2] & 255) + (i6 << 8);
            }
            this.zzb += i;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzabn zzabnVar) throws IOException {
        long zzd = zzabnVar.zzd();
        long j = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (zzd != -1 && zzd <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j = zzd;
        }
        zzabc zzabcVar = (zzabc) zzabnVar;
        zzabcVar.zzm(this.zza.zzI(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzabcVar.zzm(this.zza.zzI(), 0, 1, false);
            zzt = ((zzt << 8) & (-256)) | (this.zza.zzI()[0] & 255);
        }
        long zzb = zzb(zzabnVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j3 = j2 + zzb;
            if (zzd == -1 || j3 < zzd) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzabnVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzabnVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i3 = (int) zzb2;
                            zzabcVar.zzl(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
