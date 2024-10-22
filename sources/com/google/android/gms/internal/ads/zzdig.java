package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.vungle.ads.internal.model.AdPayload;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdig implements zzdjr {
    private com.google.android.gms.ads.internal.client.zzcs zzA;
    private final Context zza;
    private final zzdju zzb;
    private final JSONObject zzc;
    private final zzdoi zzd;
    private final zzdjj zze;
    private final zzaro zzf;
    private final zzcyd zzg;
    private final zzcxj zzh;
    private final zzdfb zzi;
    private final zzfcr zzj;
    private final zzcaz zzk;
    private final zzfdn zzl;
    private final zzcpr zzm;
    private final zzdkn zzn;
    private final Clock zzo;
    private final zzdex zzp;
    private final zzfjx zzq;
    private final zzfje zzr;
    private boolean zzt;
    private boolean zzs = false;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdig(Context context, zzdju zzdjuVar, JSONObject jSONObject, zzdoi zzdoiVar, zzdjj zzdjjVar, zzaro zzaroVar, zzcyd zzcydVar, zzcxj zzcxjVar, zzdfb zzdfbVar, zzfcr zzfcrVar, zzcaz zzcazVar, zzfdn zzfdnVar, zzcpr zzcprVar, zzdkn zzdknVar, Clock clock, zzdex zzdexVar, zzfjx zzfjxVar, zzfje zzfjeVar) {
        this.zza = context;
        this.zzb = zzdjuVar;
        this.zzc = jSONObject;
        this.zzd = zzdoiVar;
        this.zze = zzdjjVar;
        this.zzf = zzaroVar;
        this.zzg = zzcydVar;
        this.zzh = zzcxjVar;
        this.zzi = zzdfbVar;
        this.zzj = zzfcrVar;
        this.zzk = zzcazVar;
        this.zzl = zzfdnVar;
        this.zzm = zzcprVar;
        this.zzn = zzdknVar;
        this.zzo = clock;
        this.zzp = zzdexVar;
        this.zzq = zzfjxVar;
        this.zzr = zzfjeVar;
    }

    private final String zzD(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdm)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzs.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzs.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzil)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdid(this, null));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdib(this, null));
            }
            this.zzd.zzi("/nativeImpression", new zzdif(this, null));
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.zzs) {
                this.zzs = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzE.toString(), this.zzl.zzf);
                return true;
            }
            return true;
        } catch (JSONException e) {
            zzcat.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzB() {
        return zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final boolean zzC(Bundle bundle) {
        if (!zzE("impression_reporting")) {
            zzcat.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzG(null, null, null, null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbz.zzg(context, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbz.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e) {
            zzcat.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e) {
            zzcat.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzA;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzh() {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzu) {
                return;
            }
            if (zzcwVar == null) {
                zzdjj zzdjjVar = this.zze;
                if (zzdjjVar.zzk() != null) {
                    this.zzu = true;
                    this.zzq.zzc(zzdjjVar.zzk().zzf(), this.zzr);
                    zzg();
                    return;
                }
            }
            this.zzu = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzr);
            zzg();
        } catch (RemoteException e) {
            zzcat.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3;
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbz.zzg(context, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbz.zze(context, view2);
        String zzD = zzD(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbz.zzc(zzD, context, this.zzx, this.zzw);
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdt)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        zzn(view3, zzg, zzd, zzf, zze, zzD, zzc, null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzm(Bundle bundle) {
        String str;
        if (bundle == null) {
            zzcat.zze("Click data is null. No click is reported.");
            return;
        }
        if (!zzE("click_reporting")) {
            zzcat.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        if (bundle2 != null) {
            str = bundle2.getString("asset_id");
        } else {
            str = null;
        }
        zzn(null, null, null, null, null, str, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false, false);
    }

    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z6 = false;
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jSONObject7.put("has_custom_click_handler", z3);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put(AdPayload.KEY_TEMPLATE, this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbfc zzbfcVar = this.zzl.zzi;
            if (zzbfcVar != null && zzbfcVar.zzg) {
                z4 = true;
            } else {
                z4 = false;
            }
            jSONObject8.put("custom_mute_requested", z4);
            if (!this.zze.zzH().isEmpty() && this.zze.zzk() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            jSONObject8.put("custom_mute_enabled", z5);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z6 = true;
            }
            jSONObject8.put("has_custom_click_handler", z6);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzcat.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzev)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzip)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziq)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzcat.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzv) {
                zzcat.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzcat.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbz.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbz.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbz.zze(this.zza, view2);
        String zzD = zzD(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbz.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        zzcat.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                zzcat.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String zzh;
        Context context = this.zza;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbz.zzg(context, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbz.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbz.zze(context, view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdm)).booleanValue()) {
            try {
                zzh = this.zzf.zzc().zzh(this.zza, view, null);
            } catch (Exception unused) {
                zzcat.zzg("Exception getting data.");
            }
            zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbz.zzh(this.zza, this.zzj));
        }
        zzh = null;
        zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbz.zzh(this.zza, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzr() {
        zzG(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = com.google.android.gms.ads.internal.util.zzbz.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzcat.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzE("touch_reporting")) {
            zzcat.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcat.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdkn zzdknVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdknVar);
        view.setClickable(true);
        zzdknVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzv() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzA = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzx(zzbhi zzbhiVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcat.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbhiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbz.zzi(this.zzk.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }
}
