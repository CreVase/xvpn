package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.util.PathProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzbry {
    private final zzcgb zza;
    private final String zzb;

    public zzbry(zzcgb zzcgbVar, String str) {
        this.zza = zzcgbVar;
        this.zzb = str;
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcgb zzcgbVar = this.zza;
            if (zzcgbVar != null) {
                zzcgbVar.zze("onError", put);
            }
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put(PathProvider.JS_FOLDER, str));
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
