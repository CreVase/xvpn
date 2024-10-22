package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class zzbiz implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcgbVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "GMSG clear local storage keys handler");
        }
    }
}
