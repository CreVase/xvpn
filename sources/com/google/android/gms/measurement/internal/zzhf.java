package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzoi;
import defpackage.hx2;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzhf implements zzif {
    private static volatile zzhf zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzae zzh;
    private final zzaf zzi;
    private final zzgd zzj;
    private final zzfr zzk;
    private final zzgy zzl;
    private final zzlx zzm;
    private final zznd zzn;
    private final zzfq zzo;
    private final Clock zzp;
    private final zzkh zzq;
    private final zziq zzr;
    private final zzb zzs;
    private final zzkc zzt;
    private final String zzu;
    private zzfo zzv;
    private zzkp zzw;
    private zzba zzx;
    private zzfl zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    private zzhf(zzio zzioVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzioVar);
        zzae zzaeVar = new zzae(zzioVar.zza);
        this.zzh = zzaeVar;
        zzff.zza = zzaeVar;
        Context context = zzioVar.zza;
        this.zzc = context;
        this.zzd = zzioVar.zzb;
        this.zze = zzioVar.zzc;
        this.zzf = zzioVar.zzd;
        this.zzg = zzioVar.zzh;
        this.zzac = zzioVar.zze;
        this.zzu = zzioVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzioVar.zzg;
        if (zzddVar != null && (bundle = zzddVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzddVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzgn.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        Long l = zzioVar.zzi;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzaf(this);
        zzgd zzgdVar = new zzgd(this);
        zzgdVar.zzac();
        this.zzj = zzgdVar;
        zzfr zzfrVar = new zzfr(this);
        zzfrVar.zzac();
        this.zzk = zzfrVar;
        zznd zzndVar = new zznd(this);
        zzndVar.zzac();
        this.zzn = zzndVar;
        this.zzo = new zzfq(new zzin(zzioVar, this));
        this.zzs = new zzb(this);
        zzkh zzkhVar = new zzkh(this);
        zzkhVar.zzv();
        this.zzq = zzkhVar;
        zziq zziqVar = new zziq(this);
        zziqVar.zzv();
        this.zzr = zziqVar;
        zzlx zzlxVar = new zzlx(this);
        zzlxVar.zzv();
        this.zzm = zzlxVar;
        zzkc zzkcVar = new zzkc(this);
        zzkcVar.zzac();
        this.zzt = zzkcVar;
        zzgy zzgyVar = new zzgy(this);
        zzgyVar.zzac();
        this.zzl = zzgyVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar2 = zzioVar.zzg;
        if (zzddVar2 != null && zzddVar2.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zziq zzp = zzp();
            if (zzp.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) zzp.zza().getApplicationContext();
                if (zzp.zza == null) {
                    zzp.zza = new zzjx(zzp);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzp.zza);
                    application.registerActivityLifecycleCallbacks(zzp.zza);
                    zzp.zzj().zzp().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzgyVar.zzb(new zzhg(this, zzioVar));
    }

    private final zzkc zzai() {
        zza((zzic) this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return this.zzc;
    }

    public final void zzaa() {
        this.zzag++;
    }

    public final boolean zzab() {
        if (this.zzac != null && this.zzac.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzac() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    public final boolean zzaf() {
        boolean z;
        if (this.zzz) {
            zzl().zzt();
            Boolean bool = this.zzaa;
            if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
                this.zzab = this.zzp.elapsedRealtime();
                boolean z2 = true;
                if (zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzw() || (zznd.zza(this.zzc) && zznd.zza(this.zzc, false)))) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.zzaa = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                        z2 = false;
                    }
                    this.zzaa = Boolean.valueOf(z2);
                }
            }
            return this.zzaa.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        Bundle bundle;
        int i;
        String str;
        zzl().zzt();
        zza((zzic) zzai());
        String zzad = zzh().zzad();
        Pair<String, Boolean> zza = zzn().zza(zzad);
        boolean z = false;
        if (this.zzi.zzp() && !((Boolean) zza.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zza.first)) {
            if (!zzai().zzc()) {
                zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            if (zznp.zza() && this.zzi.zza(zzbi.zzcn)) {
                zziq zzp = zzp();
                zzp.zzt();
                zzam zzaa = zzp.zzo().zzaa();
                if (zzaa != null) {
                    bundle = zzaa.zza;
                } else {
                    bundle = null;
                }
                int i2 = 1;
                if (bundle == null) {
                    int i3 = this.zzah;
                    this.zzah = i3 + 1;
                    if (i3 < 10) {
                        z = true;
                    }
                    zzft zzc = zzj().zzc();
                    if (z) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    zzc.zza(hx2.q("Failed to retrieve DMA consent from the service, ", str, " retryCount"), Integer.valueOf(this.zzah));
                    return z;
                }
                zzih zza2 = zzih.zza(bundle, 100);
                sb.append("&gcs=");
                sb.append(zza2.zzf());
                zzay zza3 = zzay.zza(bundle, 100);
                sb.append("&dma=");
                if (zza3.zzd() == Boolean.FALSE) {
                    i = 0;
                } else {
                    i = 1;
                }
                sb.append(i);
                if (!TextUtils.isEmpty(zza3.zze())) {
                    sb.append("&dma_cps=");
                    sb.append(zza3.zze());
                }
                if (zzay.zza(bundle) == Boolean.TRUE) {
                    i2 = 0;
                }
                sb.append("&npa=");
                sb.append(i2);
                zzj().zzp().zza("Consent query parameters to Bow", sb);
            }
            zznd zzt = zzt();
            zzh();
            URL zza4 = zzt.zza(82001L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
            if (zza4 != null) {
                zzkc zzai = zzai();
                zzkb zzkbVar = new zzkb() { // from class: com.google.android.gms.measurement.internal.zzhh
                    @Override // com.google.android.gms.measurement.internal.zzkb
                    public final void zza(String str2, int i4, Throwable th, byte[] bArr, Map map) {
                        zzhf.this.zza(str2, i4, th, bArr, map);
                    }
                };
                zzai.zzt();
                zzai.zzab();
                Preconditions.checkNotNull(zza4);
                Preconditions.checkNotNull(zzkbVar);
                zzai.zzl().zza(new zzke(zzai, zzad, zza4, null, null, zzkbVar));
            }
            return false;
        }
        zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return this.zzp;
    }

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzv()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean zzu = zzn().zzu();
        if (zzu != null) {
            if (zzu.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean zzg = this.zzi.zzg("firebase_analytics_collection_enabled");
        if (zzg != null) {
            if (zzg.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zzad;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.zzac == null || this.zzac.booleanValue()) {
            return 0;
        }
        return 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return this.zzh;
    }

    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzaf zzf() {
        return this.zzi;
    }

    public final zzba zzg() {
        zza((zzic) this.zzx);
        return this.zzx;
    }

    public final zzfl zzh() {
        zza((zze) this.zzy);
        return this.zzy;
    }

    public final zzfo zzi() {
        zza((zze) this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        zza((zzic) this.zzk);
        return this.zzk;
    }

    public final zzfq zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        zza((zzic) this.zzl);
        return this.zzl;
    }

    public final zzfr zzm() {
        zzfr zzfrVar = this.zzk;
        if (zzfrVar != null && zzfrVar.zzae()) {
            return this.zzk;
        }
        return null;
    }

    public final zzgd zzn() {
        zza((zzid) this.zzj);
        return this.zzj;
    }

    public final zzgy zzo() {
        return this.zzl;
    }

    public final zziq zzp() {
        zza((zze) this.zzr);
        return this.zzr;
    }

    public final zzkh zzq() {
        zza((zze) this.zzq);
        return this.zzq;
    }

    public final zzkp zzr() {
        zza((zze) this.zzw);
        return this.zzw;
    }

    public final zzlx zzs() {
        zza((zze) this.zzm);
        return this.zzm;
    }

    public final zznd zzt() {
        zza((zzid) this.zzn);
        return this.zzn;
    }

    public final String zzu() {
        return this.zzd;
    }

    public final String zzv() {
        return this.zze;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzu;
    }

    public final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void zzz() {
        this.zzai.incrementAndGet();
    }

    public static zzhf zza(Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.zze == null || zzddVar.zzf == null)) {
            zzddVar = new com.google.android.gms.internal.measurement.zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, zzddVar.zzd, null, null, zzddVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhf.class) {
                if (zzb == null) {
                    zzb = new zzhf(new zzio(context, zzddVar, l));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzddVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    public final void zzb(boolean z) {
        zzl().zzt();
        this.zzaf = z;
    }

    public static /* synthetic */ void zza(zzhf zzhfVar, zzio zzioVar) {
        zzhfVar.zzl().zzt();
        zzba zzbaVar = new zzba(zzhfVar);
        zzbaVar.zzac();
        zzhfVar.zzx = zzbaVar;
        zzfl zzflVar = new zzfl(zzhfVar, zzioVar.zzf);
        zzflVar.zzv();
        zzhfVar.zzy = zzflVar;
        zzfo zzfoVar = new zzfo(zzhfVar);
        zzfoVar.zzv();
        zzhfVar.zzv = zzfoVar;
        zzkp zzkpVar = new zzkp(zzhfVar);
        zzkpVar.zzv();
        zzhfVar.zzw = zzkpVar;
        zzhfVar.zzn.zzad();
        zzhfVar.zzj.zzad();
        zzhfVar.zzy.zzw();
        zzhfVar.zzj().zzn().zza("App measurement initialized, version", 82001L);
        zzhfVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzad = zzflVar.zzad();
        if (TextUtils.isEmpty(zzhfVar.zzd)) {
            if (zzhfVar.zzt().zzf(zzad)) {
                zzhfVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhfVar.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzad);
            }
        }
        zzhfVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhfVar.zzag != zzhfVar.zzai.get()) {
            zzhfVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhfVar.zzag), Integer.valueOf(zzhfVar.zzai.get()));
        }
        zzhfVar.zzz = true;
    }

    private static void zza(zzid zzidVar) {
        if (zzidVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zze zzeVar) {
        if (zzeVar != null) {
            if (!zzeVar.zzy()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzeVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzic zzicVar) {
        if (zzicVar != null) {
            if (!zzicVar.zzae()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzicVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr != null && bArr.length != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    zzj().zzc().zza("Deferred Deep Link is empty.");
                    return;
                }
                Bundle bundle = new Bundle();
                if (zzoi.zza() && this.zzi.zza(zzbi.zzcs)) {
                    if (!zzt().zzi(optString)) {
                        zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                        return;
                    }
                    bundle.putString("gbraid", optString3);
                } else if (!zzt().zzi(optString)) {
                    zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                this.zzr.zzc("auto", "_cmp", bundle);
                zznd zzt = zzt();
                if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                    return;
                }
                zzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                return;
            } catch (JSONException e) {
                zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
                return;
            }
        }
        zzj().zzc().zza("Deferred Deep Link response empty.");
    }

    public final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d8, code lost:            if (r1.zzi() != false) goto L37;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhf.zza(com.google.android.gms.internal.measurement.zzdd):void");
    }
}
