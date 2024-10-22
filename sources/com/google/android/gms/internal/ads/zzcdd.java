package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcdd {
    private final Context zza;
    private final String zzb;
    private final zzcaz zzc;
    private final zzbcx zzd;
    private final zzbda zze;
    private final com.google.android.gms.ads.internal.util.zzbh zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcci zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcdd(Context context, zzcaz zzcazVar, String str, zzbda zzbdaVar, zzbcx zzbcxVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbfVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcazVar;
        this.zzb = str;
        this.zze = zzbdaVar;
        this.zzd = zzbcxVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzg[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzcat.zzk("Unable to parse frame hash target time number.", e);
                this.zzg[i] = -1;
            }
        }
    }

    public final void zza(zzcci zzcciVar) {
        zzbcs.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcciVar.zzj());
        this.zzn = zzcciVar;
    }

    public final void zzb() {
        if (this.zzi && !this.zzj) {
            zzbcs.zza(this.zze, this.zzd, "vfr2");
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if (this.zzj && !this.zzk) {
            zzbcs.zza(this.zze, this.zzd, "vfp2");
            this.zzk = true;
        }
    }

    public final void zzd() {
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && !this.zzo) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, this.zzb);
            bundle.putString("player", this.zzn.zzj());
            for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.zzf.zza()) {
                String valueOf = String.valueOf(zzbeVar.zza);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.zze));
                String valueOf2 = String.valueOf(zzbeVar.zza);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.zzd));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzg;
                if (i < jArr.length) {
                    String str = this.zzh[i];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
                    }
                    i++;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzp().zzh(this.zza, this.zzc.zza, "gmob-apps", bundle, true);
                    this.zzo = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcci zzcciVar) {
        long j;
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbcs.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzB)).longValue();
        long zza = zzcciVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i < strArr.length) {
                if (strArr[i] == null && longValue > Math.abs(zza - this.zzg[i])) {
                    String[] strArr2 = this.zzh;
                    int i2 = 8;
                    Bitmap bitmap = zzcciVar.getBitmap(8, 8);
                    long j2 = 63;
                    long j3 = 0;
                    int i3 = 0;
                    while (i3 < i2) {
                        int i4 = 0;
                        while (i4 < i2) {
                            int pixel = bitmap.getPixel(i4, i3);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            j3 |= j << ((int) j2);
                            j2--;
                            i4++;
                            i2 = 8;
                        }
                        i3++;
                        i2 = 8;
                    }
                    strArr2[i] = String.format("%016X", Long.valueOf(j3));
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
