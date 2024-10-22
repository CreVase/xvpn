package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbxp implements zzbxu {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgyd zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxr zzi;
    private final zzbxq zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxp(Context context, zzcaz zzcazVar, zzbxr zzbxrVar, String str, zzbxq zzbxqVar) {
        Preconditions.checkNotNull(zzbxrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbxqVar;
        this.zzi = zzbxrVar;
        Iterator it = zzbxrVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgyd zza = zzgzy.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgye zza2 = zzgyf.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzgyf) zza2.zzal());
        zzgzs zza3 = zzgzt.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcazVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgzt) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final zzbxr zza() {
        return this.zzi;
    }

    public final /* synthetic */ ml1 zzb(Map map) throws Exception {
        zzgzq zzgzqVar;
        ml1 zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgzqVar = (zzgzq) this.zze.get(str);
                            }
                            if (zzgzqVar == null) {
                                zzbxt.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzgzqVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.zza;
                                if (length > 0) {
                                    z = true;
                                }
                                this.zza = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbej.zzb.zze()).booleanValue()) {
                    zzcat.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfzt.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z3 = this.zza;
        if ((z3 && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z3 && this.zzi.zzd))) {
            synchronized (this.zzj) {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzgzr) ((zzgzq) it.next()).zzal());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbxt.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzgzr zzgzrVar : this.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzgzrVar.zza());
                        sb.append("] ");
                        sb.append(zzgzrVar.zze());
                    }
                    zzbxt.zza(sb.toString());
                }
                ml1 zzb2 = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgzy) this.zzd.zzal()).zzax());
                if (zzbxt.zzb()) {
                    zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbxt.zza("Pinged SB successfully.");
                        }
                    }, zzcbg.zza);
                }
                zzm = zzfzt.zzm(zzb2, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbxn
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        int i2 = zzbxp.zzb;
                        return null;
                    }
                }, zzcbg.zzf);
            }
            return zzm;
        }
        return zzfzt.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzd(String str, Map map, int i) {
        String str2;
        String str3;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzgzq) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzgzq zzc2 = zzgzr.zzc();
            int zza = zzgzp.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgyq zza2 = zzgyt.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgyo zza3 = zzgyp.zza();
                        zza3.zza(zzgsr.zzw(str2));
                        zza3.zzb(zzgsr.zzw(str3));
                        zza2.zza((zzgyp) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzgyt) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ml1 zzh = zzfzt.zzh(Collections.emptyMap());
            zzfza zzfzaVar = new zzfza() { // from class: com.google.android.gms.internal.ads.zzbxk
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzbxp.this.zzb((Map) obj);
                }
            };
            zzgad zzgadVar = zzcbg.zzf;
            ml1 zzn = zzfzt.zzn(zzh, zzfzaVar, zzgadVar);
            ml1 zzo = zzfzt.zzo(zzn, 10L, TimeUnit.SECONDS, zzcbg.zzd);
            zzfzt.zzr(zzn, new zzbxo(this, zzo), zzgadVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgso zzt = zzgsr.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgyd zzgydVar = this.zzd;
            zzgzj zza = zzgzl.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgydVar.zzi((zzgzl) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxr r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcat.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcat.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcat.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxt.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxl r8 = new com.google.android.gms.internal.ads.zzbxl
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzgad r0 = com.google.android.gms.internal.ads.zzcbg.zza
            r0.execute(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxp.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzi() {
        if (PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl) {
            return true;
        }
        return false;
    }
}
