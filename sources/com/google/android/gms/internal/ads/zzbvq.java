package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.ml1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbvq extends zzbvr {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbnq zzd;

    public zzbvq(Context context, zzbnq zzbnqVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbnqVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PathProvider.JS_FOLDER, zzcaz.zza().zza);
            jSONObject.put("mf", zzbeb.zza.zze());
            jSONObject.put("cl", "575948185");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final ml1 zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbeb.zzb.zze()).longValue()) {
            return zzfzt.zzh(null);
        }
        return zzfzt.zzm(this.zzd.zzb(zzc(this.zzb)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbvp
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzbvq.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcbg.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbca zzbcaVar = zzbci.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb();
        SharedPreferences.Editor edit = zzbcc.zza(this.zzb).edit();
        com.google.android.gms.ads.internal.client.zzba.zza();
        zzbdn zzbdnVar = zzbds.zza;
        com.google.android.gms.ads.internal.client.zzba.zza().zze(edit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzba.zzb();
        edit.commit();
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
