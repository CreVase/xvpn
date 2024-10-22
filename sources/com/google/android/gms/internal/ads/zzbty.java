package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.p71;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzbty implements zzbua {
    static zzbua zza;
    static zzbua zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcaz zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbty(Context context, zzcaz zzcazVar) {
        zzfpr.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcazVar;
    }

    public static zzbua zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbek.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhB)).booleanValue()) {
                        zza = new zzbty(context, zzcaz.zza());
                    }
                }
                zza = new zzbtz();
            }
        }
        return zza;
    }

    public static zzbua zzb(Context context, zzcaz zzcazVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbek.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhB)).booleanValue()) {
                        zzbty zzbtyVar = new zzbty(context, zzcazVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbtyVar.zzd) {
                                zzbtyVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbtx(zzbtyVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbtw(zzbtyVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbtyVar;
                    }
                }
                zzb = new zzbtz();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzftl.zzc(zzcam.zzf(zzc(th)));
    }

    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcam.zzo(stackTraceElement.getClassName());
                    z2 |= zzbty.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                zzg(th, "", 1.0f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void zzg(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        int i;
        String str3;
        String str4;
        Handler handler = zzcam.zza;
        boolean z = false;
        if (((Boolean) zzbek.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzcam.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th2 = new Throwable(th4.getMessage());
                    } else {
                        th2 = new Throwable(th4.getMessage(), th2);
                    }
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziA)).booleanValue()) {
            str2 = zzd(th);
        } else {
            str2 = "";
        }
        double d = f;
        double random = Math.random();
        if (f > 0.0f) {
            i = (int) (1.0f / f);
        } else {
            i = 1;
        }
        if (random < d) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th5) {
                zzcat.zzh("Error fetching instant app info", th5);
            }
            try {
                str3 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcat.zzj("Cannot obtain package name, proceeding.");
                str3 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str5 = Build.MANUFACTURER;
            String str6 = Build.MODEL;
            if (!str6.startsWith(str5)) {
                str6 = p71.m(str5, " ", str6);
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter(PathProvider.JS_FOLDER, this.zzh.zza).appendQueryParameter(VungleConstants.KEY_APP_ID, str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "575948185").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbek.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze)));
            if (true != this.zzh.zze) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("lite", str4);
            if (!TextUtils.isEmpty(str2)) {
                appendQueryParameter3.appendQueryParameter("hash", str2);
            }
            arrayList2.add(appendQueryParameter3.toString());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                final String str7 = (String) it.next();
                final zzcay zzcayVar = new zzcay(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcay.this.zza(str7);
                    }
                });
            }
        }
    }
}
