package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvm implements zzdwk, zzdux {
    private final zzdvu zza;
    private final zzdwl zzb;
    private final zzduy zzc;
    private final zzdvh zzd;
    private final zzduw zze;
    private final zzdwg zzf;
    private final String zzg;
    private final String zzh;
    private JSONObject zzm;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private long zzn = Long.MAX_VALUE;
    private zzdvi zzo = zzdvi.NONE;
    private zzdvl zzs = zzdvl.UNKNOWN;
    private long zzt = 0;

    public zzdvm(zzdvu zzdvuVar, zzdwl zzdwlVar, zzduy zzduyVar, Context context, zzcaz zzcazVar, zzdvh zzdvhVar, zzdwg zzdwgVar, String str) {
        this.zza = zzdvuVar;
        this.zzb = zzdwlVar;
        this.zzc = zzduyVar;
        this.zze = new zzduw(context);
        this.zzg = zzcazVar.zza;
        this.zzh = str;
        this.zzd = zzdvhVar;
        this.zzf = zzdwgVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzs() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdva zzdvaVar : (List) entry.getValue()) {
                if (zzdvaVar.zzg()) {
                    jSONArray.put(zzdvaVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzt() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        zzz(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzu() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzd());
    }

    private final synchronized void zzv(zzdvi zzdviVar, boolean z) {
        if (this.zzo == zzdviVar) {
            return;
        }
        if (zzp()) {
            zzx();
        }
        this.zzo = zzdviVar;
        if (zzp()) {
            zzy();
        }
        if (z) {
            zzu();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x000b, B:12:0x001d, B:14:0x0027, B:16:0x0036, B:22:0x002b, B:24:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzw(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzp     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzp = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zziU     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbcg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.zzy()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.zzp()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.zzx()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.zzu()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvm.zzw(boolean, boolean):void");
    }

    private final synchronized void zzx() {
        zzdvi zzdviVar = zzdvi.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zza();
            return;
        }
        this.zzb.zza();
    }

    private final synchronized void zzy() {
        zzdvi zzdviVar = zzdvi.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
            return;
        }
        this.zzb.zzb();
    }

    private final synchronized void zzz(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzw(jSONObject.optBoolean("isTestMode", false), false);
            zzv((zzdvi) Enum.valueOf(zzdvi.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdvi zza() {
        return this.zzo;
    }

    public final synchronized ml1 zzb(String str) {
        zzcbl zzcblVar;
        zzcblVar = new zzcbl();
        if (this.zzj.containsKey(str)) {
            zzcblVar.zzc((zzdva) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzcblVar);
        }
        return zzcblVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzp()) {
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
                this.zzn = Long.MAX_VALUE;
                return "";
            }
            if (this.zzl.equals("{}")) {
                return "";
            }
            return this.zzl;
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzh)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzh);
            }
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjf)).booleanValue()) {
                String zzm = com.google.android.gms.ads.internal.zzt.zzo().zzm();
                if (!TextUtils.isEmpty(zzm)) {
                    jSONObject.put("plugin", zzm);
                }
            }
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzs());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziV)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                zzcat.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziU)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "Inspector.toJson");
            zzcat.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdva zzdvaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzp()) {
            if (this.zzq >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziH)).intValue()) {
                zzcat.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdvaVar);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjd)).booleanValue()) {
                return;
            }
            String zzc = zzdvaVar.zzc();
            this.zzj.put(zzc, zzdvaVar);
            if (this.zzk.containsKey(zzc)) {
                List list = (List) this.zzk.get(zzc);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzcbl) it.next()).zzc(zzdvaVar);
                }
                list.clear();
            }
        }
    }

    public final void zzg() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziU)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP()) {
            zzt();
            return;
        }
        String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
        if (TextUtils.isEmpty(zzo)) {
            return;
        }
        try {
            if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                zzt();
            }
        } catch (JSONException unused) {
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdvl zzdvlVar) {
        if (!zzp()) {
            try {
                zzdaVar.zze(zzfeo.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcat.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            try {
                zzdaVar.zze(zzfeo.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcat.zzj("Ad inspector had an internal error.");
                return;
            }
        } else {
            this.zzs = zzdvlVar;
            this.zza.zzj(zzdaVar, new zzbkc(this), new zzbjv(this.zzf));
            return;
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzl = str;
        this.zzn = j;
        zzu();
    }

    public final synchronized void zzj(long j) {
        this.zzt += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:            if (r2 != false) goto L7;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzr
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzt()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzp
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzy()
            return
        L15:
            boolean r2 = r1.zzp()
            if (r2 != 0) goto L1e
            r1.zzx()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvm.zzk(boolean):void");
    }

    public final void zzl(zzdvi zzdviVar) {
        zzv(zzdviVar, true);
    }

    public final synchronized void zzm(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzn(boolean z) {
        if (!this.zzr && z) {
            zzt();
        }
        zzw(z, true);
    }

    public final boolean zzo() {
        return this.zzm != null;
    }

    public final synchronized boolean zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziU)).booleanValue()) {
            if (!this.zzp && !com.google.android.gms.ads.internal.zzt.zzs().zzl()) {
                return false;
            }
            return true;
        }
        return this.zzp;
    }

    public final synchronized boolean zzq() {
        return this.zzp;
    }

    public final boolean zzr() {
        if (this.zzt < ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzja)).longValue()) {
            return true;
        }
        return false;
    }
}
