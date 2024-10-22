package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeho implements zzehi {
    private final zzdht zza;
    private final zzgad zzb;
    private final zzdlz zzc;
    private final zzfek zzd;
    private final zzdoo zze;

    public zzeho(zzdht zzdhtVar, zzgad zzgadVar, zzdlz zzdlzVar, zzfek zzfekVar, zzdoo zzdooVar) {
        this.zza = zzdhtVar;
        this.zzb = zzgadVar;
        this.zzc = zzdlzVar;
        this.zzd = zzfekVar;
        this.zze = zzdooVar;
    }

    private final ml1 zzg(final zzfde zzfdeVar, final zzfcr zzfcrVar, final JSONObject jSONObject) {
        zzdlz zzdlzVar = this.zzc;
        final ml1 zza = this.zzd.zza();
        final ml1 zza2 = zzdlzVar.zza(zzfdeVar, zzfcrVar, jSONObject);
        return zzfzt.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeho.this.zzc(zza2, zza, zzfdeVar, zzfcrVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        return zzfzt.zzn(zzfzt.zzn(this.zzd.zza(), new zzfza() { // from class: com.google.android.gms.internal.ads.zzehl
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeho.this.zze(zzfcrVar, (zzdoi) obj);
            }
        }, this.zzb), new zzfza() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeho.this.zzf(zzfdeVar, zzfcrVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final boolean zzb(zzfde zzfdeVar, zzfcr zzfcrVar) {
        zzfcx zzfcxVar = zzfcrVar.zzu;
        if (zzfcxVar != null && zzfcxVar.zzc != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzdje zzc(ml1 ml1Var, ml1 ml1Var2, zzfde zzfdeVar, zzfcr zzfcrVar, JSONObject jSONObject) throws Exception {
        zzdjj zzdjjVar = (zzdjj) ml1Var.get();
        zzdoi zzdoiVar = (zzdoi) ml1Var2.get();
        zzdjk zzd = this.zza.zzd(new zzctm(zzfdeVar, zzfcrVar, null), new zzdjv(zzdjjVar), new zzdii(jSONObject, zzdoiVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdoiVar);
        zzd.zzg().zza(zzdjjVar.zzs());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    public final /* synthetic */ ml1 zzd(zzdoi zzdoiVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfzt.zzh(zzdoiVar));
        if (jSONObject.optBoolean("success")) {
            return zzfzt.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnp("process json failed");
    }

    public final /* synthetic */ ml1 zze(zzfcr zzfcrVar, final zzdoi zzdoiVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzio)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfcrVar.zzu.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfzt.zzn(zzdoiVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfza() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeho.this.zzd(zzdoiVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ml1 zzf(zzfde zzfdeVar, zzfcr zzfcrVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfzt.zzg(new zzdwm(3));
        }
        if (zzfdeVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfdeVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfdeVar.zza.zza.zzk);
            for (int i = 0; i < zzfdeVar.zza.zza.zzk; i++) {
                if (i < length) {
                    arrayList.add(zzg(zzfdeVar, zzfcrVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzfzt.zzg(new zzdwm(3)));
                }
            }
            return zzfzt.zzh(arrayList);
        }
        return zzfzt.zzm(zzg(zzfdeVar, zzfcrVar, jSONArray.getJSONObject(0)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfzt.zzh((zzdje) obj));
            }
        }, this.zzb);
    }
}
