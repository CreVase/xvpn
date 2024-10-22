package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdjn extends zzdjo {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdjn(zzfcr zzfcrVar, JSONObject jSONObject) {
        super(zzfcrVar);
        JSONObject jSONObject2;
        this.zzb = com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbw.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbw.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbw.zzk(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbw.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeW)).booleanValue()) {
            jSONObject2 = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObject2 = null;
        }
        this.zzh = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final zzfdq zza() {
        JSONObject jSONObject = this.zzh;
        if (jSONObject != null) {
            return new zzfdq(jSONObject);
        }
        return this.zza.zzX;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzB);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdjo
    public final boolean zzg() {
        return this.zzf;
    }
}
