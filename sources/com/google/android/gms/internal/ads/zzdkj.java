package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdkj {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfdn zzc;
    private final zzdjo zzd;
    private final zzdjj zze;
    private final zzdkv zzf;
    private final zzdld zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfc zzj;
    private final zzdjg zzk;

    public zzdkj(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfdn zzfdnVar, zzdjo zzdjoVar, zzdjj zzdjjVar, zzdkv zzdkvVar, zzdld zzdldVar, Executor executor, Executor executor2, zzdjg zzdjgVar) {
        this.zzb = zzgVar;
        this.zzc = zzfdnVar;
        this.zzj = zzfdnVar.zzi;
        this.zzd = zzdjoVar;
        this.zze = zzdjjVar;
        this.zzf = zzdkvVar;
        this.zzg = zzdldVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdjgVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    return;
                }
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdG)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z;
        zzdjj zzdjjVar = this.zze;
        if (zzdjjVar.zzf() != null) {
            if (viewGroup != null) {
                z = true;
            } else {
                z = false;
            }
            if (zzdjjVar.zzc() != 2 && zzdjjVar.zzc() != 1) {
                if (zzdjjVar.zzc() == 6) {
                    this.zzb.zzJ(this.zzc.zzf, "2", z);
                    this.zzb.zzJ(this.zzc.zzf, "1", z);
                    return;
                }
                return;
            }
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            zzfdn zzfdnVar = this.zzc;
            zzgVar.zzJ(zzfdnVar.zzf, String.valueOf(zzdjjVar.zzc()), z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdlf zzdlfVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbfl zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdlfVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = zzdlfVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdjj zzdjjVar = this.zze;
        if (zzdjjVar.zze() != null) {
            zzbfc zzbfcVar = this.zzj;
            view = zzdjjVar.zze();
            if (zzbfcVar != null && viewGroup == null) {
                zzh(layoutParams, zzbfcVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdjjVar.zzl() instanceof zzbex)) {
            view = null;
        } else {
            zzbex zzbexVar = (zzbex) zzdjjVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbexVar.zzc());
                viewGroup = null;
            }
            View zzbeyVar = new zzbey(context2, zzbexVar, layoutParams);
            zzbeyVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdE));
            view = zzbeyVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdlfVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdlfVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdlfVar.zzq(zzdlfVar.zzk(), view, true);
        }
        zzfvs zzfvsVar = zzdkf.zza;
        int size = zzfvsVar.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View zzg2 = zzdlfVar.zzg((String) zzfvsVar.get(i2));
                i2++;
                if (zzg2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) zzg2;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // java.lang.Runnable
            public final void run() {
                zzdkj.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdjj zzdjjVar2 = this.zze;
                if (zzdjjVar2.zzs() != null) {
                    zzdjjVar2.zzs().zzao(new zzdki(zzdlfVar, viewGroup2));
                    return;
                }
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjt)).booleanValue() && zzi(viewGroup2, false)) {
                zzdjj zzdjjVar3 = this.zze;
                if (zzdjjVar3.zzq() != null) {
                    zzdjjVar3.zzq().zzao(new zzdki(zzdlfVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzf = zzdlfVar.zzf();
            if (zzf != null) {
                context = zzf.getContext();
            }
            if (context != null && (zza2 = this.zzk.zza()) != null) {
                try {
                    IObjectWrapper zzi = zza2.zzi();
                    if (zzi != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) != null) {
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(drawable);
                        IObjectWrapper zzj = zzdlfVar.zzj();
                        if (zzj != null) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzge)).booleanValue()) {
                                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup2.addView(imageView);
                            }
                        }
                        imageView.setScaleType(zza);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                } catch (RemoteException unused) {
                    zzcat.zzj("Could not get main image drawable");
                }
            }
        }
    }

    public final void zzc(zzdlf zzdlfVar) {
        if (zzdlfVar == null || this.zzf == null || zzdlfVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdlfVar.zzh().addView(this.zzf.zza());
        } catch (zzcgm e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdlf zzdlfVar) {
        if (zzdlfVar == null) {
            return;
        }
        Context context = zzdlfVar.zzf().getContext();
        if (!com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
            return;
        }
        if (!(context instanceof Activity)) {
            zzcat.zze("Activity context is needed for policy validator.");
            return;
        }
        if (this.zzg != null && zzdlfVar.zzh() != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdlfVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
            } catch (zzcgm e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdlf zzdlfVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // java.lang.Runnable
            public final void run() {
                zzdkj.this.zzb(zzdlfVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
