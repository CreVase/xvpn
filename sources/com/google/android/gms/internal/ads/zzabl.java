package com.google.android.gms.internal.ads;

import com.google.protobuf.v;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabl implements zzacs {
    private final byte[] zza = new byte[v.DEFAULT_BUFFER_SIZE];

    @Override // com.google.android.gms.internal.ads.zzacs
    public final /* synthetic */ int zzf(zzt zztVar, int i, boolean z) {
        return zzacq.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final int zzg(zzt zztVar, int i, boolean z, int i2) throws IOException {
        int zza = zztVar.zza(this.zza, 0, Math.min(v.DEFAULT_BUFFER_SIZE, i));
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzl(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final /* synthetic */ void zzr(zzfb zzfbVar, int i) {
        zzacq.zzb(this, zzfbVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzs(zzfb zzfbVar, int i, int i2) {
        zzfbVar.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final void zzt(long j, int i, int i2, int i3, zzacr zzacrVar) {
    }
}
