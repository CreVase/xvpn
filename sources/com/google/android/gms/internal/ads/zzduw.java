package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzduw {
    private final Context zza;
    private final ApplicationInfo zzb;
    private String zze = "";
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziS)).intValue();
    private final int zzd = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziT)).intValue();

    public zzduw(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        com.google.android.gms.ads.internal.zzt.zzp();
        jSONObject.put("adMobAppId", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).f3599b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap createBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = encodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
