package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.hx2;
import defpackage.ml1;
import defpackage.p71;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdlz {
    private final zzgad zza;
    private final zzdmm zzb;
    private final zzdmr zzc;

    public zzdlz(zzgad zzgadVar, zzdmm zzdmmVar, zzdmr zzdmrVar) {
        this.zza = zzgadVar;
        this.zzb = zzdmmVar;
        this.zzc = zzdmrVar;
    }

    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar, final JSONObject jSONObject) {
        ml1 zzn;
        final ml1 zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                zzdjj zzdjjVar = new zzdjj();
                JSONObject jSONObject2 = jSONObject;
                zzdjjVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdjjVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("omid_partner_name");
                } else {
                    str = null;
                }
                zzfde zzfdeVar2 = zzfdeVar;
                zzdjjVar.zzV(str);
                zzfdn zzfdnVar = zzfdeVar2.zza.zza;
                if (zzfdnVar.zzg.contains(Integer.toString(zzdjjVar.zzc()))) {
                    if (zzdjjVar.zzc() == 3) {
                        if (zzdjjVar.zzA() != null) {
                            if (!zzfdnVar.zzh.contains(zzdjjVar.zzA())) {
                                throw new zzeir(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzeir(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzfcr zzfcrVar2 = zzfcrVar;
                    zzdjjVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzfcrVar2.zzO) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        optString = p71.m(com.google.android.gms.ads.internal.util.zzt.zzx(), " : ", optString);
                    }
                    zzdjjVar.zzZ("headline", optString);
                    zzdjjVar.zzZ("body", jSONObject2.optString("body", null));
                    zzdjjVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdjjVar.zzZ("store", jSONObject2.optString("store", null));
                    zzdjjVar.zzZ("price", jSONObject2.optString("price", null));
                    zzdjjVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdjjVar;
                }
                throw new zzeir(1, hx2.m("Invalid template ID: ", zzdjjVar.zzc()));
            }
        });
        final ml1 zzf = this.zzb.zzf(jSONObject, "images");
        zzfcv zzfcvVar = zzfdeVar.zzb.zzb;
        zzdmm zzdmmVar = this.zzb;
        final ml1 zzg = zzdmmVar.zzg(jSONObject, "images", zzfcrVar, zzfcvVar);
        final ml1 zze = zzdmmVar.zze(jSONObject, "secondary_image");
        final ml1 zze2 = zzdmmVar.zze(jSONObject, "app_icon");
        final ml1 zzd = zzdmmVar.zzd(jSONObject, "attribution");
        final ml1 zzh = this.zzb.zzh(jSONObject, zzfcrVar, zzfdeVar.zzb.zzb);
        final ml1 zza = this.zzc.zza(jSONObject, "custom_assets");
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzfzt.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfzt.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfzt.zzh(null);
                } else {
                    final zzdmm zzdmmVar2 = this.zzb;
                    zzn = zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmb
                        @Override // com.google.android.gms.internal.ads.zzfza
                        public final ml1 zza(Object obj) {
                            return zzdmm.this.zzc(optString, obj);
                        }
                    }, zzcbg.zze);
                }
            }
        }
        final ml1 ml1Var = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            arrayList.add(ml1Var);
        }
        return zzfzt.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdjj zzdjjVar = (zzdjj) zzb.get();
                zzdjjVar.zzP((List) zzf.get());
                zzdjjVar.zzM((zzbfo) zze2.get());
                zzdjjVar.zzQ((zzbfo) zze.get());
                zzdjjVar.zzJ((zzbfg) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdjjVar.zzS(zzdmm.zzj(jSONObject2));
                zzdjjVar.zzL(zzdmm.zzi(jSONObject2));
                zzcgb zzcgbVar = (zzcgb) zzh.get();
                if (zzcgbVar != null) {
                    zzdjjVar.zzad(zzcgbVar);
                    zzdjjVar.zzac(zzcgbVar.zzF());
                    zzdjjVar.zzab(zzcgbVar.zzq());
                }
                zzcgb zzcgbVar2 = (zzcgb) zzg.get();
                if (zzcgbVar2 != null) {
                    zzdjjVar.zzO(zzcgbVar2);
                    zzdjjVar.zzae(zzcgbVar2.zzF());
                }
                ml1 ml1Var2 = ml1Var;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
                    zzdjjVar.zzU(ml1Var2);
                    zzdjjVar.zzX(new zzcbl());
                } else {
                    zzcgb zzcgbVar3 = (zzcgb) ml1Var2.get();
                    if (zzcgbVar3 != null) {
                        zzdjjVar.zzT(zzcgbVar3);
                    }
                }
                for (zzdmq zzdmqVar : (List) zza.get()) {
                    if (zzdmqVar.zza != 1) {
                        zzdjjVar.zzN(zzdmqVar.zzb, zzdmqVar.zzd);
                    } else {
                        zzdjjVar.zzZ(zzdmqVar.zzb, zzdmqVar.zzc);
                    }
                }
                return zzdjjVar;
            }
        }, this.zza);
    }
}
