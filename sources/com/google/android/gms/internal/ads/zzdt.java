package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class zzdt implements zzdq {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdo zze;
    private zzdo zzf;
    private zzdo zzg;
    private zzdo zzh;
    private boolean zzi;
    private zzds zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdt() {
        zzdo zzdoVar = zzdo.zza;
        this.zze = zzdoVar;
        this.zzf = zzdoVar;
        this.zzg = zzdoVar;
        this.zzh = zzdoVar;
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final zzdo zza(zzdo zzdoVar) throws zzdp {
        if (zzdoVar.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzdoVar.zzb;
            }
            this.zze = zzdoVar;
            zzdo zzdoVar2 = new zzdo(i, zzdoVar.zzc, 2);
            this.zzf = zzdoVar2;
            this.zzi = true;
            return zzdoVar2;
        }
        throw new zzdp("Unhandled input format:", zzdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final ByteBuffer zzb() {
        int zza;
        zzds zzdsVar = this.zzj;
        if (zzdsVar != null && (zza = zzdsVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdsVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdq.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzc() {
        if (zzg()) {
            zzdo zzdoVar = this.zze;
            this.zzg = zzdoVar;
            zzdo zzdoVar2 = this.zzf;
            this.zzh = zzdoVar2;
            if (this.zzi) {
                this.zzj = new zzds(zzdoVar.zzb, zzdoVar.zzc, this.zzc, this.zzd, zzdoVar2.zzb);
            } else {
                zzds zzdsVar = this.zzj;
                if (zzdsVar != null) {
                    zzdsVar.zzc();
                }
            }
        }
        this.zzm = zzdq.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzd() {
        zzds zzdsVar = this.zzj;
        if (zzdsVar != null) {
            zzdsVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zze(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzds zzdsVar = this.zzj;
        zzdsVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.zzn += remaining;
        zzdsVar.zzf(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdo zzdoVar = zzdo.zza;
        this.zze = zzdoVar;
        this.zzf = zzdoVar;
        this.zzg = zzdoVar;
        this.zzh = zzdoVar;
        ByteBuffer byteBuffer = zzdq.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) < 1.0E-4f && Math.abs(this.zzd - 1.0f) < 1.0E-4f && this.zzf.zzb == this.zze.zzb) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzds zzdsVar = this.zzj;
        return zzdsVar == null || zzdsVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j3 = this.zzn;
            this.zzj.getClass();
            long zzb = j3 - r3.zzb();
            int i = this.zzh.zzb;
            int i2 = this.zzg.zzb;
            if (i == i2) {
                return zzfk.zzr(j, zzb, j2);
            }
            return zzfk.zzr(j, zzb * i, j2 * i2);
        }
        return (long) (this.zzc * j);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
