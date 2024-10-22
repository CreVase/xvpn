package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdld {
    private final zzdpt zza;
    private final zzdoi zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdld(zzdpt zzdptVar, zzdoi zzdoiVar) {
        this.zza = zzdptVar;
        this.zzb = zzdoiVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzcam.zzx(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcgm {
        zzcgb zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzad("/sendMessageToSdk", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdld.this.zzb((zzcgb) obj, map);
            }
        });
        zza.zzad("/hideValidatorOverlay", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdky
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdld.this.zzc(windowManager, view, (zzcgb) obj, map);
            }
        });
        zza.zzad("/open", new zzbju(null, null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzdld.this.zze(view, windowManager, (zzcgb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzdla
            @Override // com.google.android.gms.internal.ads.zzbjj
            public final void zza(Object obj, Map map) {
                zzcat.zze("Show native ad policy validator overlay.");
                ((zzcgb) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcgb zzcgbVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcgb zzcgbVar, Map map) {
        zzcat.zze("Hide native ad policy validator overlay.");
        zzcgbVar.zzF().setVisibility(8);
        if (zzcgbVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcgbVar.zzF());
        }
        zzcgbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    public final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcgb zzcgbVar, final Map map) {
        int i;
        zzcgbVar.zzN().zzA(new zzchm() { // from class: com.google.android.gms.internal.ads.zzdlc
            @Override // com.google.android.gms.internal.ads.zzchm
            public final void zza(boolean z, int i2, String str, String str2) {
                zzdld.this.zzd(map, z, i2, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhQ)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhR)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcgbVar.zzag(zzchq.zzb(zzf, zzf2));
        try {
            zzcgbVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhS)).booleanValue());
            zzcgbVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhT)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbz.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcgbVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!"1".equals(str) && !"2".equals(str)) {
                i = rect.top;
            } else {
                i = rect.bottom;
            }
            final int i2 = i - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdlb
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcgb zzcgbVar2 = zzcgbVar;
                        if (zzcgbVar2.zzF().getWindowToken() != null) {
                            int i3 = i2;
                            WindowManager.LayoutParams layoutParams = zzb;
                            String str2 = str;
                            if (!"1".equals(str2) && !"2".equals(str2)) {
                                layoutParams.y = rect2.top - i3;
                            } else {
                                layoutParams.y = rect2.bottom - i3;
                            }
                            windowManager.updateViewLayout(zzcgbVar2.zzF(), layoutParams);
                        }
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (!TextUtils.isEmpty(str2)) {
            zzcgbVar.loadUrl(str2);
        }
    }
}
