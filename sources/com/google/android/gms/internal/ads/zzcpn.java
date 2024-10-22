package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcpn implements zzbnt {
    private final Context zza;
    private final zzaus zzb;
    private final PowerManager zzc;

    public zzcpn(Context context, zzaus zzausVar) {
        this.zza = context;
        this.zzb = zzausVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcpq zzcpqVar) throws JSONException {
        JSONObject jSONObject;
        Integer valueOf;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzauv zzauvVar = zzcpqVar.zzf;
        if (zzauvVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z = zzauvVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcpqVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcpqVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzac.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfE)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(audioManager.getMode());
                }
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzauvVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzauvVar.zzc.top).put("bottom", zzauvVar.zzc.bottom).put("left", zzauvVar.zzc.left).put("right", zzauvVar.zzc.right)).put("adBox", new JSONObject().put("top", zzauvVar.zzd.top).put("bottom", zzauvVar.zzd.bottom).put("left", zzauvVar.zzd.left).put("right", zzauvVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzauvVar.zze.top).put("bottom", zzauvVar.zze.bottom).put("left", zzauvVar.zze.left).put("right", zzauvVar.zze.right)).put("globalVisibleBoxVisible", zzauvVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzauvVar.zzg.top).put("bottom", zzauvVar.zzg.bottom).put("left", zzauvVar.zzg.left).put("right", zzauvVar.zzg.right)).put("localVisibleBoxVisible", zzauvVar.zzh).put("hitBox", new JSONObject().put("top", zzauvVar.zzi.top).put("bottom", zzauvVar.zzi.bottom).put("left", zzauvVar.zzi.left).put("right", zzauvVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcpqVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbn)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzauvVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcpqVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
