package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class zzhak extends zzhan implements zzans {
    zzant zza;
    protected final String zzb = "moov";

    public zzhak(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzb(zzhao zzhaoVar, ByteBuffer byteBuffer, long j, zzanp zzanpVar) throws IOException {
        zzhaoVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhaoVar;
        this.zzf = zzhaoVar.zzb();
        zzhaoVar.zze(zzhaoVar.zzb() + j);
        this.zzg = zzhaoVar.zzb();
        this.zzc = zzanpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzc(zzant zzantVar) {
        this.zza = zzantVar;
    }
}
