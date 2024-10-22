package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzarh implements zzark {
    private static zzarh zzb;
    private final Context zzc;
    private final zzfof zzd;
    private final zzfom zze;
    private final zzfoo zzf;
    private final zzasj zzg;
    private final zzfmq zzh;
    private final Executor zzi;
    private final zzfol zzj;
    private final zzasy zzl;
    private final zzasq zzm;
    private final zzash zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzarh(Context context, zzfmq zzfmqVar, zzfof zzfofVar, zzfom zzfomVar, zzfoo zzfooVar, zzasj zzasjVar, Executor executor, zzfml zzfmlVar, int i, zzasy zzasyVar, zzasq zzasqVar, zzash zzashVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfmqVar;
        this.zzd = zzfofVar;
        this.zze = zzfomVar;
        this.zzf = zzfooVar;
        this.zzg = zzasjVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzasyVar;
        this.zzm = zzasqVar;
        this.zzn = zzashVar;
        this.zzq = false;
        this.zzj = new zzarf(this, zzfmlVar);
    }

    public static synchronized zzarh zza(String str, Context context, boolean z, boolean z2) {
        zzarh zzb2;
        synchronized (zzarh.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzarh zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzarh zzarhVar;
        zzars zzarsVar;
        zzasy zzasyVar;
        zzasq zzasqVar;
        zzash zzashVar;
        synchronized (zzarh.class) {
            if (zzb == null) {
                zzfmr zza = zzfms.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfms zzd = zza.zzd();
                zzfmq zza2 = zzfmq.zza(context, executor, z2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdf)).booleanValue()) {
                    zzarsVar = zzars.zzc(context);
                } else {
                    zzarsVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdg)).booleanValue()) {
                    zzasyVar = zzasy.zzd(context, executor);
                } else {
                    zzasyVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
                    zzasqVar = new zzasq();
                } else {
                    zzasqVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcw)).booleanValue()) {
                    zzashVar = new zzash();
                } else {
                    zzashVar = null;
                }
                zzfnj zze = zzfnj.zze(context, executor, zza2, zzd);
                zzasi zzasiVar = new zzasi(context);
                zzasj zzasjVar = new zzasj(zzd, zze, new zzasw(context, zzasiVar), zzasiVar, zzarsVar, zzasyVar, zzasqVar, zzashVar);
                int zzb2 = zzfns.zzb(context, zza2);
                zzfml zzfmlVar = new zzfml();
                zzarh zzarhVar2 = new zzarh(context, zza2, new zzfof(context, zzb2), new zzfom(context, zzb2, new zzare(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcd)).booleanValue()), new zzfoo(context, zzasjVar, zza2, zzfmlVar), zzasjVar, executor, zzfmlVar, zzb2, zzasyVar, zzasqVar, zzashVar);
                zzb = zzarhVar2;
                zzarhVar2.zzm();
                zzb.zzp();
            }
            zzarhVar = zzb;
        }
        return zzarhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:            if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L48;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzarh r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarh.zzj(com.google.android.gms.internal.ads.zzarh):void");
    }

    private final void zzs() {
        zzasy zzasyVar = this.zzl;
        if (zzasyVar != null) {
            zzasyVar.zzh();
        }
    }

    private final zzfoe zzt(int i) {
        if (!zzfns.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcb)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfmt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfmt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcu)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfmt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzk(MotionEvent motionEvent) {
        zzfmt zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfon e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzl(int i, int i2, int i3) {
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfoe zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzash zzashVar = this.zzn;
        if (zzashVar != null) {
            zzashVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (!this.zzp) {
            synchronized (this.zzo) {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfoe zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfns.zza(this.zzr)) {
                        this.zzi.execute(new zzarg(this));
                    }
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
