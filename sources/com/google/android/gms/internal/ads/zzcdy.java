package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzcdy {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzanv zzanvVar;
        zzanu zzanuVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzanq(new zzcdx(duplicate), zzcea.zzb).zze().iterator();
            while (true) {
                zzanvVar = null;
                if (it.hasNext()) {
                    zzans zzansVar = (zzans) it.next();
                    if (zzansVar instanceof zzanu) {
                        zzanuVar = (zzanu) zzansVar;
                        break;
                    }
                } else {
                    zzanuVar = null;
                    break;
                }
            }
            Iterator it2 = zzanuVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzans zzansVar2 = (zzans) it2.next();
                if (zzansVar2 instanceof zzanv) {
                    zzanvVar = (zzanv) zzansVar2;
                    break;
                }
            }
            long zzd = (zzanvVar.zzd() * 1000) / zzanvVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
