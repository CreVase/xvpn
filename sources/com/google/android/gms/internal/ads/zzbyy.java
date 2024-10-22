package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbyy {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    private String zze = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final AtomicReference zzj = new AtomicReference(null);
    private final BlockingQueue zzk = new ArrayBlockingQueue(20);
    private final Object zzl = new Object();

    private final void zzA(Context context, String str, String str2) {
        if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method method = (Method) this.zzi.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzi.put(str2, method);
                } catch (Exception unused) {
                    zzC(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzC(str2, false);
            }
        }
    }

    private final void zzB(Context context, final String str, String str2, Bundle bundle) {
        if (zzu(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzcat.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzv(context)) {
                zzD("logEventInternal", new zzbyx() { // from class: com.google.android.gms.internal.ads.zzbyn
                    @Override // com.google.android.gms.internal.ads.zzbyx
                    public final void zza(zzchs zzchsVar) {
                        zzchsVar.zzo("am", str, bundle2);
                    }
                });
                return;
            }
            if (zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method method = (Method) this.zzi.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzC("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzC("logEventInternal", true);
                }
            }
        }
    }

    private final void zzC(String str, boolean z) {
        if (!this.zza.get()) {
            zzcat.zzj("Invoke Firebase method " + str + " error.");
            if (z) {
                zzcat.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final void zzD(final String str, final zzbyx zzbyxVar) {
        synchronized (this.zzj) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyp
                @Override // java.lang.Runnable
                public final void run() {
                    zzbyy.this.zzj(zzbyxVar, str);
                }
            }, null);
            if (this.zzj.get() != null) {
                futureTask.run();
            } else {
                this.zzk.offer(futureTask);
            }
        }
    }

    private final boolean zzE(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbyh.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzC("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public static final boolean zzv(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzah)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzai)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaj)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzw(String str, Object obj, zzbyw zzbywVar) {
        synchronized (this.zzj) {
            if (((zzchs) this.zzj.get()) != null) {
                try {
                    return zzbywVar.zza((zzchs) this.zzj.get());
                } catch (Exception unused) {
                    zzC(str, false);
                }
            }
            return obj;
        }
    }

    private final Object zzx(String str, Context context) {
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return null;
        }
        try {
            return zzy(context, str).invoke(this.zzg.get(), new Object[0]);
        } catch (Exception unused) {
            zzC(str, true);
            return null;
        }
    }

    private final Method zzy(Context context, String str) {
        Method method = (Method) this.zzi.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzi.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzC(str, false);
            return null;
        }
    }

    private final ExecutorService zzz() {
        ExecutorService threadPoolExecutor;
        if (this.zzb.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzfpr.zza().zzc(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzag)).intValue(), new zzbyv(this), 2);
            } else {
                zzbca zzbcaVar = zzbci.zzag;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbcaVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyv(this));
            }
            zzbyh.zza(this.zzb, null, threadPoolExecutor);
        }
        return (ExecutorService) this.zzb.get();
    }

    public final String zza(Context context) {
        if (!zzu(context)) {
            return null;
        }
        if (zzv(context)) {
            Long l = (Long) zzw("getAdEventId", null, new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbys
                @Override // com.google.android.gms.internal.ads.zzbyw
                public final Object zza(zzchs zzchsVar) {
                    return Long.valueOf(zzchsVar.zzc());
                }
            });
            if (l == null) {
                return null;
            }
            return Long.toString(l.longValue());
        }
        Object zzx = zzx("generateEventId", context);
        if (zzx == null) {
            return null;
        }
        return zzx.toString();
    }

    public final String zzb(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zze;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zze = (String) zzw("getAppIdOrigin", this.zze, new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbym
                    @Override // com.google.android.gms.internal.ads.zzbyw
                    public final Object zza(zzchs zzchsVar) {
                        return zzchsVar.zze();
                    }
                });
            } else {
                this.zze = "fa";
            }
            return this.zze;
        }
    }

    public final String zzc(final Context context) {
        if (!zzu(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaf)).longValue();
        if (zzv(context)) {
            try {
                if (longValue < 0) {
                    return (String) zzw("getAppInstanceId", null, zzbyt.zza);
                }
                return (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzbyy.this.zzf();
                    }
                }).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (longValue < 0) {
            return (String) zzx("getAppInstanceId", context);
        }
        try {
            return (String) zzz().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzbyy.this.zzg(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzd(Context context) {
        if (!zzu(context)) {
            return "";
        }
        if (zzv(context)) {
            return (String) zzw("getCurrentScreenNameOrScreenClass", "", new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbyj
                @Override // com.google.android.gms.internal.ads.zzbyw
                public final Object zza(zzchs zzchsVar) {
                    String zzh = zzchsVar.zzh();
                    if (zzh == null && (zzh = zzchsVar.zzg()) == null) {
                        return "";
                    }
                    return zzh;
                }
            });
        }
        if (!zzE(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return "";
        }
        try {
            String str = (String) zzy(context, "getCurrentScreenName").invoke(this.zzg.get(), new Object[0]);
            if (str == null) {
                str = (String) zzy(context, "getCurrentScreenClass").invoke(this.zzg.get(), new Object[0]);
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception unused) {
            zzC("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            if (zzv(context)) {
                this.zzd = (String) zzw("getGmpAppId", this.zzd, new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbyr
                    @Override // com.google.android.gms.internal.ads.zzbyw
                    public final Object zza(zzchs zzchsVar) {
                        return zzchsVar.zzi();
                    }
                });
            } else {
                this.zzd = (String) zzx("getGmpAppId", context);
            }
            return this.zzd;
        }
    }

    public final /* synthetic */ String zzf() throws Exception {
        return (String) zzw("getAppInstanceId", null, zzbyt.zza);
    }

    public final /* synthetic */ String zzg(Context context) throws Exception {
        return (String) zzx("getAppInstanceId", context);
    }

    public final void zzh(Context context, final String str) {
        if (!zzu(context)) {
            return;
        }
        if (zzv(context)) {
            zzD("beginAdUnitExposure", new zzbyx() { // from class: com.google.android.gms.internal.ads.zzbyi
                @Override // com.google.android.gms.internal.ads.zzbyx
                public final void zza(zzchs zzchsVar) {
                    zzchsVar.zzl(str);
                }
            });
        } else {
            zzA(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzi(Context context, final String str) {
        if (!zzu(context)) {
            return;
        }
        if (zzv(context)) {
            zzD("endAdUnitExposure", new zzbyx() { // from class: com.google.android.gms.internal.ads.zzbyq
                @Override // com.google.android.gms.internal.ads.zzbyx
                public final void zza(zzchs zzchsVar) {
                    zzchsVar.zzn(str);
                }
            });
        } else {
            zzA(context, str, "endAdUnitExposure");
        }
    }

    public final /* synthetic */ void zzj(zzbyx zzbyxVar, String str) {
        if (((zzchs) this.zzj.get()) != null) {
            try {
                zzbyxVar.zza((zzchs) this.zzj.get());
            } catch (Exception unused) {
                zzC(str, false);
            }
        }
    }

    public final void zzk(Context context, String str) {
        zzB(context, "_aa", str, null);
    }

    public final void zzl(Context context, String str) {
        zzB(context, "_aq", str, null);
    }

    public final void zzm(Context context, String str) {
        zzB(context, "_ac", str, null);
    }

    public final void zzn(Context context, String str) {
        zzB(context, "_ai", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i) {
        if (!zzu(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i);
        zzB(context, "_ar", str, bundle);
        com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
    }

    public final void zzp(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzam)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzq(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzbyz.zzd(context).zzb().zzd(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzam)).booleanValue() && zzu(context) && zzv(context)) {
            synchronized (this.zzl) {
            }
        }
    }

    public final void zzr(final Bundle bundle) {
        zzD("setConsent", new zzbyx() { // from class: com.google.android.gms.internal.ads.zzbyu
            @Override // com.google.android.gms.internal.ads.zzbyx
            public final void zza(zzchs zzchsVar) {
                zzchsVar.zzr(bundle);
            }
        });
    }

    @Deprecated
    public final void zzs(final Context context, final String str) {
        if (!zzu(context) || !(context instanceof Activity)) {
            return;
        }
        if (zzv(context)) {
            zzD("setScreenName", new zzbyx() { // from class: com.google.android.gms.internal.ads.zzbyo
                @Override // com.google.android.gms.internal.ads.zzbyx
                public final void zza(zzchs zzchsVar) {
                    Context context2 = context;
                    zzchsVar.zzs(ObjectWrapper.wrap(context2), str, context2.getPackageName());
                }
            });
            return;
        }
        if (zzE(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
            Method method = (Method) this.zzi.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzi.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzC("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzC("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzt() {
        synchronized (this.zzl) {
        }
        return false;
    }

    public final boolean zzu(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaa)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzak)).booleanValue()) {
                return true;
            }
            if (this.zzf.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (!zzcam.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    if (zzcam.zzt(context)) {
                        zzcat.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzf.set(0);
                    }
                }
                this.zzf.set(1);
            }
            if (this.zzf.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
