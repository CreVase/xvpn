package com.google.android.gms.internal.ads;

import defpackage.p71;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbme {
    public static void zza(zzbmf zzbmfVar, String str, Map map) {
        try {
            zzbmfVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcat.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmf zzbmfVar, String str, JSONObject jSONObject) {
        StringBuilder q = p71.q("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcat.zze("Dispatching AFMA event: ".concat(q.toString()));
        zzbmfVar.zza(q.toString());
    }

    public static void zzc(zzbmf zzbmfVar, String str, String str2) {
        zzbmfVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmf zzbmfVar, String str, JSONObject jSONObject) {
        zzbmfVar.zzb(str, jSONObject.toString());
    }
}
