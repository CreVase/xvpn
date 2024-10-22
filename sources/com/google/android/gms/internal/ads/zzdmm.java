package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.ml1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdmm {
    private final Context zza;
    private final zzdlv zzb;
    private final zzaro zzc;
    private final zzcaz zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzaxv zzf;
    private final Executor zzg;
    private final zzbfc zzh;
    private final zzdne zzi;
    private final zzdpt zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoo zzl;
    private final zzdso zzm;
    private final zzfib zzn;
    private final zzfjx zzo;
    private final zzedo zzp;
    private final zzedz zzq;

    public zzdmm(Context context, zzdlv zzdlvVar, zzaro zzaroVar, zzcaz zzcazVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxv zzaxvVar, Executor executor, zzfdn zzfdnVar, zzdne zzdneVar, zzdpt zzdptVar, ScheduledExecutorService scheduledExecutorService, zzdso zzdsoVar, zzfib zzfibVar, zzfjx zzfjxVar, zzedo zzedoVar, zzdoo zzdooVar, zzedz zzedzVar) {
        this.zza = context;
        this.zzb = zzdlvVar;
        this.zzc = zzaroVar;
        this.zzd = zzcazVar;
        this.zze = zzaVar;
        this.zzf = zzaxvVar;
        this.zzg = executor;
        this.zzh = zzfdnVar.zzi;
        this.zzi = zzdneVar;
        this.zzj = zzdptVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsoVar;
        this.zzn = zzfibVar;
        this.zzo = zzfjxVar;
        this.zzp = zzedoVar;
        this.zzl = zzdooVar;
        this.zzq = zzedzVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfvs.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfvs.zzj(arrayList);
        }
        return zzfvs.zzl();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }

    private static ml1 zzl(ml1 ml1Var, Object obj) {
        final Object obj2 = null;
        return zzfzt.zzf(ml1Var, Exception.class, new zzfza(obj2) { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfzt.zzh(null);
            }
        }, zzcbg.zzf);
    }

    private static ml1 zzm(boolean z, final ml1 ml1Var, Object obj) {
        if (z) {
            return zzfzt.zzn(ml1Var, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdml
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj2) {
                    if (obj2 != null) {
                        return ml1.this;
                    }
                    return zzfzt.zzg(new zzeir(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcbg.zzf);
        }
        return zzl(ml1Var, null);
    }

    private final ml1 zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfzt.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfzt.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfzt.zzh(new zzbfa(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfzt.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzbfa(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final ml1 zzo(JSONArray jSONArray, boolean z, boolean z2) {
        int i;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                i = jSONArray.length();
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i2), z));
            }
            return zzfzt.zzm(zzfzt.zzd(arrayList), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdmh
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbfa zzbfaVar : (List) obj) {
                        if (zzbfaVar != null) {
                            arrayList2.add(zzbfaVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzfzt.zzh(Collections.emptyList());
    }

    private final ml1 zzp(JSONObject jSONObject, zzfcr zzfcrVar, zzfcv zzfcvVar) {
        final ml1 zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcrVar, zzfcvVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfzt.zzn(zzb, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                zzcgb zzcgbVar = (zzcgb) obj;
                if (zzcgbVar != null && zzcgbVar.zzq() != null) {
                    return ml1.this;
                }
                throw new zzeir(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzcbg.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    public final /* synthetic */ zzbex zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbex(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ ml1 zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfcr zzfcrVar, zzfcv zzfcvVar, String str, String str2, Object obj) throws Exception {
        zzcgb zza = this.zzj.zza(zzqVar, zzfcrVar, zzfcvVar);
        final zzcbk zza2 = zzcbk.zza(zza);
        zzdol zzb = this.zzl.zzb();
        zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdC)).booleanValue()) {
            zza.zzad("/getNativeAdViewSignals", zzbji.zzs);
        }
        zza.zzad("/getNativeClickMeta", zzbji.zzt);
        zza.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcbk zzcbkVar = zzcbk.this;
                if (z) {
                    zzcbkVar.zzb();
                    return;
                }
                zzcbkVar.zzd(new zzeir(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ml1 zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcgb zza = zzcgn.zza(this.zza, zzchq.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        final zzcbk zza2 = zzcbk.zza(zza);
        zza.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcbk.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeV)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final ml1 zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfzt.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfzt.zzm(zzo(optJSONArray, false, true), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzdmm.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ml1 zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ml1 zzf(JSONObject jSONObject, String str) {
        zzbfc zzbfcVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfcVar.zzb, zzbfcVar.zzd);
    }

    public final ml1 zzg(JSONObject jSONObject, String str, final zzfcr zzfcrVar, final zzfcv zzfcvVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjt)).booleanValue()) {
            return zzfzt.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzfzt.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzfzt.zzh(null);
            }
            final ml1 zzn = zzfzt.zzn(zzfzt.zzh(null), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdme
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzdmm.this.zzb(zzk, zzfcrVar, zzfcvVar, optString, optString2, obj);
                }
            }, zzcbg.zze);
            return zzfzt.zzn(zzn, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdmf
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    if (((zzcgb) obj) != null) {
                        return ml1.this;
                    }
                    throw new zzeir(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcbg.zzf);
        }
        return zzfzt.zzh(null);
    }

    public final ml1 zzh(JSONObject jSONObject, zzfcr zzfcrVar, zzfcv zzfcvVar) {
        ml1 zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfzt.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjs)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    zzcat.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzfzt.zzh(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzfzt.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdD)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfcrVar, zzfcvVar);
            return zzl(zzfzt.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdD)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzfcrVar, zzfcvVar);
    }
}
