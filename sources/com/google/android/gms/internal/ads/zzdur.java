package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.ml1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdur {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqj zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsy zzl;
    private final zzcaz zzm;
    private final zzdeg zzo;
    private final zzfjh zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcbl zze = new zzcbl();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdur(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqj zzdqjVar, ScheduledExecutorService scheduledExecutorService, zzdsy zzdsyVar, zzcaz zzcazVar, zzdeg zzdegVar, zzfjh zzfjhVar) {
        this.zzh = zzdqjVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsyVar;
        this.zzm = zzcazVar;
        this.zzo = zzdegVar;
        this.zzp = zzfjhVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdur zzdurVar, String str) {
        int i = 5;
        final zzfit zza = zzfis.zza(zzdurVar.zzf, 5);
        zza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfit zza2 = zzfis.zza(zzdurVar.zzf, i);
                zza2.zzh();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzcbl zzcblVar = new zzcbl();
                ml1 zzo = zzfzt.zzo(zzcblVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbM)).longValue(), TimeUnit.SECONDS, zzdurVar.zzk);
                zzdurVar.zzl.zzc(next);
                zzdurVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdur.this.zzq(obj, zzcblVar, next, elapsedRealtime, zza2);
                    }
                }, zzdurVar.zzi);
                arrayList.add(zzo);
                final zzduq zzduqVar = new zzduq(zzdurVar, obj, next, elapsedRealtime, zza2, zzcblVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblq(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdurVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfej zzc = zzdurVar.zzh.zzc(next, new JSONObject());
                        zzdurVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdum
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdur.this.zzn(next, zzduqVar, zzc, arrayList2);
                            }
                        });
                    } catch (zzfds unused2) {
                        zzduqVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzcat.zzh("", e);
                }
                i = 5;
            }
            zzfzt.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzduj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdur.this.zzf(zza);
                    return null;
                }
            }, zzdurVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdurVar.zzo.zza("MalformedJson");
            zzdurVar.zzl.zza("MalformedJson");
            zzdurVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "AdapterInitializer.updateAdapterStatus");
            zzfjh zzfjhVar = zzdurVar.zzp;
            zza.zzg(e2);
            zza.zzf(false);
            zzfjhVar.zzb(zza.zzl());
        }
    }

    private final synchronized ml1 zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfzt.zzh(zzc);
        }
        final zzcbl zzcblVar = new zzcbl();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduk
            @Override // java.lang.Runnable
            public final void run() {
                zzdur.this.zzo(zzcblVar);
            }
        });
        return zzcblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzblg(str, z, i, str2));
    }

    public final /* synthetic */ Object zzf(zzfit zzfitVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfitVar.zzf(true);
        this.zzp.zzb(zzfitVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzblg zzblgVar = (zzblg) this.zzn.get(str);
            arrayList.add(new zzblg(str, zzblgVar.zzb, zzblgVar.zzc, zzblgVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000c, code lost:            if (r3.equals("com.google.ads.mediation.admob.AdMobAdapter") == false) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzn(java.lang.String r3, com.google.android.gms.internal.ads.zzblk r4, com.google.android.gms.internal.ads.zzfej r5, java.util.List r6) {
        /*
            r2 = this;
            java.lang.String r0 = "Failed to initialize adapter. "
            java.lang.String r1 = "com.google.ads.mediation.admob.AdMobAdapter"
            if (r3 == r1) goto L1f
            if (r3 == 0) goto Le
            boolean r1 = r3.equals(r1)     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            if (r1 != 0) goto L1f
        Le:
            java.lang.ref.WeakReference r1 = r2.zzg     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            android.content.Context r1 = (android.content.Context) r1     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            if (r1 == 0) goto L19
            goto L1b
        L19:
            android.content.Context r1 = r2.zzf     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
        L1b:
            r5.zzi(r1, r4, r6)     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            return
        L1f:
            r4.zzf()     // Catch: android.os.RemoteException -> L23 com.google.android.gms.internal.ads.zzfds -> L2a
            return
        L23:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzftr r4 = new com.google.android.gms.internal.ads.zzftr
            r4.<init>(r3)
            throw r4
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L3f
            r5.<init>(r0)     // Catch: android.os.RemoteException -> L3f
            r5.append(r3)     // Catch: android.os.RemoteException -> L3f
            java.lang.String r3 = " does not implement the initialize() method."
            r5.append(r3)     // Catch: android.os.RemoteException -> L3f
            java.lang.String r3 = r5.toString()     // Catch: android.os.RemoteException -> L3f
            r4.zze(r3)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            r3 = move-exception
            java.lang.String r4 = ""
            com.google.android.gms.internal.ads.zzcat.zzh(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdur.zzn(java.lang.String, com.google.android.gms.internal.ads.zzblk, com.google.android.gms.internal.ads.zzfej, java.util.List):void");
    }

    public final /* synthetic */ void zzo(final zzcbl zzcblVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzcbl zzcblVar2 = zzcblVar;
                if (!isEmpty) {
                    zzcblVar2.zzc(zzc);
                } else {
                    zzcblVar2.zzd(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcbl zzcblVar, String str, long j, zzfit zzfitVar) {
        synchronized (obj) {
            if (!zzcblVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfjh zzfjhVar = this.zzp;
                zzfitVar.zzc("Timeout");
                zzfitVar.zzf(false);
                zzfjhVar.zzb(zzfitVar.zzl());
                zzcblVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbeh.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbL)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdun
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdur.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ml1 zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdur.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbN)).longValue(), TimeUnit.SECONDS);
                    zzfzt.zzr(zzu, new zzdup(this), this.zzi);
                    return;
                }
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(final zzbln zzblnVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdul
            @Override // java.lang.Runnable
            public final void run() {
                zzdur zzdurVar = zzdur.this;
                try {
                    zzblnVar.zzb(zzdurVar.zzg());
                } catch (RemoteException e) {
                    zzcat.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
