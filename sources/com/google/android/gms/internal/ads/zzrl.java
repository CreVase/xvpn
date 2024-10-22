package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzrl implements zzrw {
    private final MediaCodec zza;
    private final zzrr zzb;
    private final zzrp zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zzrl(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzrk zzrkVar) {
        this.zza = mediaCodec;
        this.zzb = new zzrr(handlerThread);
        this.zzc = new zzrp(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ String zzd(int i) {
        return zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i) {
        return zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void zzh(zzrl zzrlVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzrlVar.zzb.zzf(zzrlVar.zza);
        int i2 = zzfk.zza;
        Trace.beginSection("configureCodec");
        zzrlVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzrlVar.zzc.zzg();
        Trace.beginSection("startCodec");
        zzrlVar.zza.start();
        Trace.endSection();
        zzrlVar.zze = 1;
    }

    public static String zzs(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzk(int i, int i2, zzhq zzhqVar, long j, int i3) {
        this.zzc.zze(i, 0, zzhqVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzr() {
        return false;
    }
}
