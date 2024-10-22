package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfns;
import com.google.android.gms.internal.ads.zzfom;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzi implements Runnable, zzark {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfmq zzi;
    private Context zzj;
    private final Context zzk;
    private zzcaz zzl;
    private final zzcaz zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzcaz zzcazVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcazVar;
        this.zzm = zzcazVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbci.zzcg)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfmq.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbci.zzcc)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbci.zzch)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcf)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzdj)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdc)).booleanValue()) {
            zzcbg.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (zzcam.zzu()) {
            zzcbg.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzark zzj() {
        if (zzi() == 2) {
            return (zzark) this.zze.get();
        }
        return (zzark) this.zzd.get();
    }

    private final void zzm() {
        List list = this.zzc;
        zzark zzj = zzj();
        if (!list.isEmpty() && zzj != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzj.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzp(boolean z) {
        this.zzd.set(zzarn.zzu(this.zzl.zza, zzq(this.zzj), z, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdj)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzaV)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzp(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzarh zza = zzarh.zza(this.zzl.zza, zzq(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzp(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzp(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzarh.zza(this.zzm.zza, zzq(this.zzk), z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public final boolean zzc() {
        Context context = this.zzj;
        zzh zzhVar = new zzh(this);
        zzfmq zzfmqVar = this.zzi;
        return new zzfom(this.zzj, zzfns.zzb(context, zzfmqVar), zzhVar, ((Boolean) zzba.zzc().zzb(zzbci.zzcd)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            zzcat.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzark zzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzI(view, 4, null);
            }
            if (zzj != null) {
                zzm();
                return zzj.zzf(zzq(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzg(Context context) {
        zzark zzj;
        if (zzd() && (zzj = zzj()) != null) {
            zzm();
            return zzj.zzg(zzq(context));
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjO)).booleanValue()) {
            if (zzd()) {
                zzark zzj = zzj();
                if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
                }
                if (zzj != null) {
                    return zzj.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzark zzj2 = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjP)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
        }
        if (zzj2 != null) {
            return zzj2.zzh(context, view, activity);
        }
        return "";
    }

    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzk(MotionEvent motionEvent) {
        zzark zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzk(motionEvent);
        } else {
            this.zzc.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzl(int i, int i2, int i3) {
        zzark zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzl(i, i2, i3);
        } else {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzark zzj;
        if (zzd() && (zzj = zzj()) != null) {
            zzj.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final void zzo(View view) {
        zzark zzj = zzj();
        if (zzj != null) {
            zzj.zzo(view);
        }
    }
}
