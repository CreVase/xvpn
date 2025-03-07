package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.protobuf.v;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzcac {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcag zzc;
    private boolean zzd;
    private Context zze;
    private zzcaz zzf;
    private String zzg;
    private zzbcq zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzcab zzk;
    private final Object zzl;
    private ml1 zzm;
    private final AtomicBoolean zzn;

    public zzcac() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcag(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzcab(null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjW)).booleanValue()) {
                return zzcax.zza(this.zze).getResources();
            }
            zzcax.zza(this.zze).getResources();
            return null;
        } catch (zzcaw e) {
            zzcat.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbcq zzf() {
        zzbcq zzbcqVar;
        synchronized (this.zza) {
            zzbcqVar = this.zzh;
        }
        return zzbcqVar;
    }

    public final zzcag zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final ml1 zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcy)).booleanValue()) {
                synchronized (this.zzl) {
                    ml1 ml1Var = this.zzm;
                    if (ml1Var != null) {
                        return ml1Var;
                    }
                    ml1 zzb = zzcbg.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzx
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcac.this.zzn();
                        }
                    });
                    this.zzm = zzb;
                    return zzb;
                }
            }
        }
        return zzfzt.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzn() throws Exception {
        Context zza = zzbvu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, v.DEFAULT_BUFFER_SIZE);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzs(Context context, zzcaz zzcazVar) {
        zzbcq zzbcqVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcazVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbty.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (!((Boolean) zzbdv.zzc.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcqVar = null;
                } else {
                    zzbcqVar = new zzbcq();
                }
                this.zzh = zzbcqVar;
                if (zzbcqVar != null) {
                    zzcbj.zza(new zzbzy(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzih)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzz(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcazVar.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbty.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbek.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbty.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzih)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
