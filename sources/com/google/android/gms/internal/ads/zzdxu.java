package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.ui.AdActivity;
import defpackage.ml1;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdxu {
    private final zzchw zza;
    private final Context zzb;
    private final zzcaz zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfje zzg;
    private final zzfea zzh;
    private final zzdsj zzi;

    public zzdxu(zzchw zzchwVar, Context context, zzcaz zzcazVar, zzfdn zzfdnVar, Executor executor, String str, zzfje zzfjeVar, zzdsj zzdsjVar) {
        this.zza = zzchwVar;
        this.zzb = context;
        this.zzc = zzcazVar;
        this.zzd = zzfdnVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfjeVar;
        this.zzh = zzchwVar.zzw();
        this.zzi = zzdsjVar;
    }

    private final ml1 zzc(final String str, final String str2) {
        zzfit zza = zzfis.zza(this.zzb, 11);
        zza.zzh();
        zzboa zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzz());
        zzbnu zzbnuVar = zzbnx.zza;
        final zzbnq zza3 = zza2.zza("google.afma.response.normalize", zzbnuVar, zzbnuVar);
        ml1 zzn = zzfzt.zzn(zzfzt.zzn(zzfzt.zzn(zzfzt.zzh(""), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(AdActivity.REQUEST_KEY_EXTRA, jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfzt.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzbnq.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdxu.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfjd.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcat.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ml1 zza() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxu.zza():ml1");
    }

    public final /* synthetic */ ml1 zzb(JSONObject jSONObject) throws Exception {
        return zzfzt.zzh(new zzfde(new zzfdb(this.zzd), zzfdd.zza(new StringReader(jSONObject.toString()))));
    }
}
