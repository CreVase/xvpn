package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcsj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcsj(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcsj zza(Context context, View view, zzfcr zzfcrVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcsj zzcsjVar = new zzcsj(context);
        if (!zzfcrVar.zzw.isEmpty() && (resources = zzcsjVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((zzfcs) zzfcrVar.zzw.get(0)).zza;
            float f2 = displayMetrics.density;
            zzcsjVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r1.zzb * f2)));
        }
        zzcsjVar.zzb = view;
        zzcsjVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcbt.zzb(zzcsjVar, zzcsjVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcbt.zza(zzcsjVar, zzcsjVar);
        JSONObject jSONObject = zzfcrVar.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcsjVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcsjVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcsjVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcsjVar.addView(relativeLayout);
        return zzcsjVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzcam.zzx(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
