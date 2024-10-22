package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzflh {
    private zzfmk zza;
    private long zzb;
    private int zzc;

    public zzflh() {
        zzb();
        this.zza = new zzfmk(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfla.zza().zzg(zza(), str);
        }
    }

    public final void zze(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfln.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfla.zza().zzf(zza(), jSONObject);
    }

    public final void zzf(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfla.zza().zzg(zza(), str);
        }
    }

    public void zzg(zzfkg zzfkgVar, zzfke zzfkeVar) {
        zzh(zzfkgVar, zzfkeVar, null);
    }

    public final void zzh(zzfkg zzfkgVar, zzfke zzfkeVar, JSONObject jSONObject) {
        String zzh = zzfkgVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfln.zze(jSONObject2, "environment", "app");
        zzfln.zze(jSONObject2, "adSessionType", zzfkeVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfln.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfln.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfln.zze(jSONObject3, "os", "Android");
        zzfln.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfln.zze(jSONObject2, "deviceCategory", zzflm.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfln.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfln.zze(jSONObject4, "partnerName", zzfkeVar.zze().zzb());
        zzfln.zze(jSONObject4, "partnerVersion", zzfkeVar.zze().zzc());
        zzfln.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfln.zze(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        zzfln.zze(jSONObject5, "appId", zzfky.zzb().zza().getApplicationContext().getPackageName());
        zzfln.zze(jSONObject2, "app", jSONObject5);
        if (zzfkeVar.zzf() != null) {
            zzfln.zze(jSONObject2, "contentUrl", zzfkeVar.zzf());
        }
        zzfln.zze(jSONObject2, "customReferenceData", zzfkeVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfkeVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfla.zza().zzh(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void zzi(float f) {
        zzfla.zza().zze(zza(), f);
    }

    public final void zzj(WebView webView) {
        this.zza = new zzfmk(webView);
    }

    public void zzk() {
    }

    public final boolean zzl() {
        if (this.zza.get() != 0) {
            return true;
        }
        return false;
    }
}
