package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ml1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzebf extends zzbuv {
    private final Context zza;
    private final zzevk zzb;
    private final zzevi zzc;
    private final zzebn zzd;
    private final zzgad zze;
    private final zzebk zzf;
    private final zzbvs zzg;

    public zzebf(Context context, zzevk zzevkVar, zzevi zzeviVar, zzebk zzebkVar, zzebn zzebnVar, zzgad zzgadVar, zzbvs zzbvsVar) {
        this.zza = context;
        this.zzb = zzevkVar;
        this.zzc = zzeviVar;
        this.zzf = zzebkVar;
        this.zzd = zzebnVar;
        this.zze = zzgadVar;
        this.zzg = zzbvsVar;
    }

    private final void zzc(ml1 ml1Var, zzbuz zzbuzVar) {
        zzfzt.zzr(zzfzt.zzn(zzfzk.zzu(ml1Var), new zzfza() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(zzfen.zza((InputStream) obj));
            }
        }, zzcbg.zza), new zzebe(this, zzbuzVar), zzcbg.zzf);
    }

    public final ml1 zzb(zzbuo zzbuoVar, int i) {
        ml1 zzh;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbuoVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final zzebh zzebhVar = new zzebh(zzbuoVar.zza, zzbuoVar.zzb, hashMap, zzbuoVar.zzd, "", zzbuoVar.zze);
        zzevi zzeviVar = this.zzc;
        zzeviVar.zza(new zzewp(zzbuoVar));
        boolean z = zzebhVar.zzf;
        zzevj zzb = zzeviVar.zzb();
        if (z) {
            String str2 = zzbuoVar.zza;
            String str3 = (String) zzbei.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzftj.zzc(zzfsh.zzc(';')).zzd(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzfzt.zzm(zzb.zza().zza(new JSONObject()), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeax
                                @Override // com.google.android.gms.internal.ads.zzfsk
                                public final Object apply(Object obj) {
                                    zzebh zzebhVar2 = zzebh.this;
                                    zzebn.zza(zzebhVar2.zzc, (JSONObject) obj);
                                    return zzebhVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzfzt.zzh(zzebhVar);
        zzfhr zzb2 = zzb.zzb();
        return zzfzt.zzn(zzb2.zzb(zzfhl.HTTP, zzh).zze(new zzebj(this.zza, "", this.zzg, i)).zza(), new zzfza() { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                zzebi zzebiVar = (zzebi) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzebiVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzebiVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzebiVar.zzb.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzebiVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzebiVar.zzd);
                    return zzfzt.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    zzcat.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zze(zzbuo zzbuoVar, zzbuz zzbuzVar) {
        zzc(zzb(zzbuoVar, Binder.getCallingUid()), zzbuzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf(zzbuk zzbukVar, zzbuz zzbuzVar) {
        zzeuz zzeuzVar = new zzeuz(zzbukVar, Binder.getCallingUid());
        zzevk zzevkVar = this.zzb;
        zzevkVar.zza(zzeuzVar);
        final zzevl zzb = zzevkVar.zzb();
        zzfhr zzb2 = zzb.zzb();
        zzfgw zza = zzb2.zzb(zzfhl.GMS_SIGNALS, zzfzt.zzi()).zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzebb
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzevl.this.zza().zza(new JSONObject());
            }
        }).zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzeaz
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbuzVar);
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            final zzebn zzebnVar = this.zzd;
            zzebnVar.getClass();
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebd
                @Override // java.lang.Runnable
                public final void run() {
                    zzebn.this.zzb();
                }
            }, this.zze);
        }
    }
}
