package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class zzanv extends zzhal {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhav zzm;
    private long zzn;

    public zzanv() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhav.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzhaq.zza(zzanr.zzf(byteBuffer));
            this.zzh = zzhaq.zza(zzanr.zzf(byteBuffer));
            this.zzi = zzanr.zze(byteBuffer);
            this.zzj = zzanr.zzf(byteBuffer);
        } else {
            this.zza = zzhaq.zza(zzanr.zze(byteBuffer));
            this.zzh = zzhaq.zza(zzanr.zze(byteBuffer));
            this.zzi = zzanr.zze(byteBuffer);
            this.zzj = zzanr.zze(byteBuffer);
        }
        this.zzk = zzanr.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzanr.zzd(byteBuffer);
        zzanr.zze(byteBuffer);
        zzanr.zze(byteBuffer);
        this.zzm = new zzhav(zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer), zzanr.zza(byteBuffer), zzanr.zza(byteBuffer), zzanr.zza(byteBuffer), zzanr.zzb(byteBuffer), zzanr.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzanr.zze(byteBuffer);
    }
}
