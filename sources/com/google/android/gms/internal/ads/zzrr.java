package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.h00;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzrr extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private long zzk;
    private boolean zzl;
    private IllegalStateException zzm;
    private final Object zza = new Object();
    private final h00 zzd = new h00();
    private final h00 zze = new h00();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzrr(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzrr zzrrVar) {
        synchronized (zzrrVar.zza) {
            if (zzrrVar.zzl) {
                return;
            }
            long j = zzrrVar.zzk - 1;
            zzrrVar.zzk = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzrrVar.zza) {
                    zzrrVar.zzm = illegalStateException;
                }
                return;
            }
            zzrrVar.zzi();
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        h00 h00Var = this.zzd;
        h00Var.c = h00Var.f2349b;
        h00 h00Var2 = this.zze;
        h00Var2.c = h00Var2.f2349b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException;
    }

    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException == null) {
            return;
        }
        this.zzj = null;
        throw codecException;
    }

    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.a(i);
            this.zzf.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        boolean z;
        synchronized (this.zza) {
            zzj();
            zzk();
            int i = -1;
            if (zzl()) {
                return -1;
            }
            h00 h00Var = this.zzd;
            int i2 = h00Var.f2349b;
            int i3 = h00Var.c;
            if (i2 == i3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i2 != i3) {
                    i = h00Var.f2348a[i2];
                    h00Var.f2349b = (i2 + 1) & h00Var.d;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            return i;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        synchronized (this.zza) {
            zzj();
            zzk();
            if (zzl()) {
                return -1;
            }
            h00 h00Var = this.zze;
            int i = h00Var.f2349b;
            int i2 = h00Var.c;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            if (i != i2) {
                int i3 = h00Var.f2348a[i];
                h00Var.f2349b = (i + 1) & h00Var.d;
                if (i3 >= 0) {
                    zzdx.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i3 = -2;
                }
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i = zzfk.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final void run() {
                    zzrr.zzd(zzrr.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzf(z);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}
