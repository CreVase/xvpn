package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.hx2;

/* loaded from: classes.dex */
public final class zzsc extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrz zzc;
    public final String zzd;
    public final zzsc zze;

    public zzsc(zzam zzamVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(zzamVar), th, zzamVar.zzm, false, null, hx2.m("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i)), null);
    }

    public static /* bridge */ /* synthetic */ zzsc zza(zzsc zzscVar, zzsc zzscVar2) {
        return new zzsc(zzscVar.getMessage(), zzscVar.getCause(), zzscVar.zza, false, zzscVar.zzc, zzscVar.zzd, zzscVar2);
    }

    public zzsc(zzam zzamVar, Throwable th, boolean z, zzrz zzrzVar) {
        this("Decoder init failed: " + zzrzVar.zza + ", " + String.valueOf(zzamVar), th, zzamVar.zzm, false, zzrzVar, (zzfk.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzsc(String str, Throwable th, String str2, boolean z, zzrz zzrzVar, String str3, zzsc zzscVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrzVar;
        this.zzd = str3;
        this.zze = zzscVar;
    }
}
