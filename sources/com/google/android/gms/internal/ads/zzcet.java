package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.p71;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzcet extends zzcen implements zzhk {
    private String zzd;
    private final zzcdb zze;
    private boolean zzf;
    private final zzces zzg;
    private final zzcdy zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcet(zzcdc zzcdcVar, zzcdb zzcdbVar) {
        super(zzcdcVar);
        String str;
        int i;
        this.zze = zzcdbVar;
        this.zzg = new zzces();
        this.zzh = new zzcdy();
        this.zzk = new Object();
        if (zzcdcVar != null) {
            str = zzcdcVar.zzbl();
        } else {
            str = null;
        }
        this.zzl = (String) zzfss.zzd(str).zzb("");
        if (zzcdcVar != null) {
            i = zzcdcVar.zzf();
        } else {
            i = 0;
        }
        this.zzm = i;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzcam.zze(str)));
    }

    private final void zzv() {
        boolean z;
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcct.zzs();
        int zzu = zzcct.zzu();
        String str = this.zzd;
        String zzm = zzm(str);
        long j = round;
        if (round > 0) {
            z = true;
        } else {
            z = false;
        }
        zzn(str, zzm, position, zza, j, zza2, z, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgiVar, zzgn zzgnVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgiVar, zzgn zzgnVar, boolean z) {
        if (zzgiVar instanceof zzgv) {
            this.zzg.zzb((zzgv) zzgiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcen
    public final boolean zzt(String str) {
        String str2;
        String str3;
        zzcet zzcetVar;
        String str4;
        String str5 = str;
        this.zzd = str5;
        String zzm = zzm(str);
        int i = 0;
        try {
            zzgq zzgqVar = new zzgq();
            zzgqVar.zzf(this.zzb);
            zzgqVar.zzc(this.zze.zzd);
            zzgqVar.zzd(this.zze.zzf);
            zzgqVar.zzb(true);
            zzgqVar.zze(this);
            zzgi zza = zzgqVar.zza();
            if (this.zze.zzj) {
                zza = new zzcdw(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzgn(Uri.parse(str)));
            zzcdc zzcdcVar = (zzcdc) this.zzc.get();
            if (zzcdcVar != null) {
                zzcdcVar.zzt(zzm, this);
            }
            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
            long currentTimeMillis = zzB.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzy)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzx)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            str2 = MRAIDPresenter.ERROR;
            long j = currentTimeMillis;
            while (true) {
                try {
                    int zza2 = zza.zza(bArr, i, Math.min(this.zzi.remaining(), i2));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzj(str5, zzm, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    synchronized (this.zzk) {
                        try {
                            if (!this.zzf) {
                                str5 = null;
                                this.zzi.put(bArr, 0, zza2);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            zzcetVar = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e = e;
                                        str4 = str2;
                                        String m = p71.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                                        zzcat.zzj("Failed to preload url " + str3 + " Exception: " + m);
                                        zzcetVar.zzg(str3, zzm, str4, m);
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzv();
                        return true;
                    }
                    try {
                        if (!this.zzf) {
                            long currentTimeMillis2 = zzB.currentTimeMillis();
                            if (currentTimeMillis2 - j >= longValue) {
                                zzv();
                                j = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis <= 1000 * longValue2) {
                                i = 0;
                                i2 = 8192;
                                str5 = str;
                            } else {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                        } else {
                            throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zzcetVar = this;
                        str4 = str5;
                        str3 = str;
                        String m2 = p71.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzcat.zzj("Failed to preload url " + str3 + " Exception: " + m2);
                        zzcetVar.zzg(str3, zzm, str4, m2);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str2;
                    String m22 = p71.m(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzcat.zzj("Failed to preload url " + str3 + " Exception: " + m22);
                    zzcetVar.zzg(str3, zzm, str4, m22);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
            str2 = MRAIDPresenter.ERROR;
        }
    }
}
