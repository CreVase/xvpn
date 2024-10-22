package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfjh implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzcaz zzf;
    private int zzi;
    private final zzdqg zzj;
    private final List zzk;
    private final zzebk zzm;
    private final zzbvs zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfjm zzg = zzfjp.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfjh(Context context, zzcaz zzcazVar, zzdqg zzdqgVar, zzebk zzebkVar, zzbvs zzbvsVar) {
        this.zze = context;
        this.zzf = zzcazVar;
        this.zzj = zzdqgVar;
        this.zzm = zzebkVar;
        this.zzn = zzbvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziB)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzfvs.zzl();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        boolean z;
        synchronized (zza) {
            if (zzb == null) {
                if (!((Boolean) zzbdu.zzb.zze()).booleanValue()) {
                    zzb = Boolean.FALSE;
                } else {
                    if (Math.random() < ((Double) zzbdu.zza.zze()).doubleValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzb = Boolean.valueOf(z);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzax;
        if (!zza()) {
            return;
        }
        Object obj = zzc;
        synchronized (obj) {
            if (this.zzg.zza() == 0) {
                return;
            }
            try {
                synchronized (obj) {
                    zzax = ((zzfjp) this.zzg.zzal()).zzax();
                    this.zzg.zzc();
                }
                new zzebj(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzebh((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziv), 60000, new HashMap(), zzax, "application/x-protobuf", false));
            } catch (Exception e) {
                if ((e instanceof zzdwm) && ((zzdwm) e).zza() == 3) {
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    public final void zzb(final zzfix zzfixVar) {
        zzcbg.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjg
            @Override // java.lang.Runnable
            public final void run() {
                zzfjh.this.zzc(zzfixVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfix zzfixVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziw)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkO)).booleanValue()) {
                        long j = intValue;
                        zzcbg.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = intValue;
                        zzcbg.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (!zza() || zzfixVar == null) {
            return;
        }
        synchronized (zzc) {
            if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzix)).intValue()) {
                return;
            }
            zzfjj zza2 = zzfjk.zza();
            zza2.zzt(zzfixVar.zzl());
            zza2.zzp(zzfixVar.zzk());
            zza2.zzg(zzfixVar.zzb());
            zza2.zzv(3);
            zza2.zzm(this.zzf.zza);
            zza2.zzb(this.zzh);
            zza2.zzk(Build.VERSION.RELEASE);
            zza2.zzq(Build.VERSION.SDK_INT);
            zza2.zzu(zzfixVar.zzn());
            zza2.zzj(zzfixVar.zza());
            zza2.zze(this.zzi);
            zza2.zzs(zzfixVar.zzm());
            zza2.zzc(zzfixVar.zzd());
            zza2.zzf(zzfixVar.zzf());
            zza2.zzh(zzfixVar.zzg());
            zza2.zzi(this.zzj.zzc(zzfixVar.zzg()));
            zza2.zzl(zzfixVar.zzh());
            zza2.zzd(zzfixVar.zze());
            zza2.zzr(zzfixVar.zzj());
            zza2.zzn(zzfixVar.zzi());
            zza2.zzo(zzfixVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziB)).booleanValue()) {
                zza2.zza(this.zzk);
            }
            zzfjm zzfjmVar = this.zzg;
            zzfjn zza3 = zzfjo.zza();
            zza3.zza(zza2);
            zzfjmVar.zzb(zza3);
        }
    }
}
