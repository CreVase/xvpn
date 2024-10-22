package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdkf extends zzbfr implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdlf {
    public static final zzfvs zza = zzfvs.zzo("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgad zzf;
    private View zzg;
    private zzdje zzi;
    private zzaux zzj;
    private zzbfl zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 233702000;

    public zzdkf(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcbt.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcbt.zzb(frameLayout, this);
        this.zzf = zzcbg.zze;
        this.zzj = new zzaux(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzcat.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // java.lang.Runnable
            public final void run() {
                zzdkf.this.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue() && this.zzi.zza() != 0) {
            this.zzo = new GestureDetector(this.zzd.getContext(), new zzdkl(this.zzi, this));
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null && zzdjeVar.zzS()) {
            this.zzi.zzt();
            this.zzi.zzB(view, this.zzd, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdjeVar.zzz(frameLayout, zzl(), zzm(), zzdje.zzV(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdjeVar.zzz(frameLayout, zzl(), zzm(), zzdje.zzV(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar == null) {
            return false;
        }
        zzdjeVar.zzI(view, motionEvent, this.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
            this.zzo.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzbA(IObjectWrapper iObjectWrapper) {
        this.zzi.zzK((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzbB(zzbfl zzbflVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbflVar;
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            zzdjeVar.zzc().zzb(zzbflVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzbC(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzbD(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdje)) {
            zzcat.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            zzdjeVar.zzQ(this);
        }
        zzu();
        zzdje zzdjeVar2 = (zzdje) unwrap;
        this.zzi = zzdjeVar2;
        zzdjeVar2.zzP(this);
        this.zzi.zzH(this.zzd);
        this.zzi.zzs(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdL)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzbz(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            zzdjeVar.zzQ(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized View zzg(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final zzaux zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized JSONObject zzo() {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            return zzdjeVar.zzi(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized JSONObject zzp() {
        zzdje zzdjeVar = this.zzi;
        if (zzdjeVar != null) {
            return zzdjeVar.zzk(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final synchronized void zzq(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbz.zzi(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
