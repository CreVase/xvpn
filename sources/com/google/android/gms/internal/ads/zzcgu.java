package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzfps;
import com.vungle.ads.VungleError;
import defpackage.ml1;
import defpackage.p71;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class zzcgu extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcgb {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbfb zzC;
    private zzbez zzD;
    private zzawj zzE;
    private int zzF;
    private int zzG;
    private zzbcx zzH;
    private final zzbcx zzI;
    private zzbcx zzJ;
    private final zzbcy zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzco zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzaxv zzV;
    private final zzchp zzb;
    private final zzaro zzc;
    private final zzbdk zzd;
    private final zzcaz zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfcr zzj;
    private zzfcv zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcgi zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzfkc zzp;
    private zzchq zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcgx zzz;

    public zzcgu(zzchp zzchpVar, zzchq zzchqVar, String str, boolean z, boolean z2, zzaro zzaroVar, zzbdk zzbdkVar, zzcaz zzcazVar, zzbda zzbdaVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxv zzaxvVar, zzfcr zzfcrVar, zzfcv zzfcvVar) {
        super(zzchpVar);
        zzfcv zzfcvVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzchpVar;
        this.zzq = zzchqVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaroVar;
        this.zzd = zzbdkVar;
        this.zze = zzcazVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        this.zzh = zzs;
        this.zzi = zzs.density;
        this.zzV = zzaxvVar;
        this.zzj = zzfcrVar;
        this.zzk = zzfcvVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzco(zzchpVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcat.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkD)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzchpVar, zzcazVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfps zzfpsVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaJ)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzchb(this, new zzcha(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbcy zzbcyVar = new zzbcy(new zzbda(true, "make_wv", this.zzr));
        this.zzK = zzbcyVar;
        zzbcyVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && (zzfcvVar2 = this.zzk) != null && zzfcvVar2.zzb != null) {
            zzbcyVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbcyVar.zza();
        zzbcx zzf = zzbda.zzf();
        this.zzI = zzf;
        zzbcyVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzck.zza().zzb(zzchpVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzfcr zzfcrVar = this.zzj;
        if (zzfcrVar != null && zzfcrVar.zzao) {
            zzcat.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcat.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzcat.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (!this.zzN) {
            this.zzN = true;
            com.google.android.gms.ads.internal.zzt.zzo().zzq();
        }
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcat.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbcs.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcen) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbcy zzbcyVar = this.zzK;
        if (zzbcyVar == null) {
            return;
        }
        zzbda zza2 = zzbcyVar.zza();
        zzbcq zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbb() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjV)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzcat.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaz()) {
            super.loadData(str, str2, str3);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaz()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final synchronized void loadUrl(String str) {
        if (!zzaz()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
                zzcat.zzk("Could not call loadUrl. ", th);
                return;
            }
        }
        zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null && zzcgiVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcgi zzcgiVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcgiVar = this.zzn) != null && zzcgiVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkf)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzcat.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null && zzaR) {
            zzL.zzn();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzcat.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzcat.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzn.zzL() && !this.zzn.zzJ()) {
            synchronized (this) {
                zzbfb zzbfbVar = this.zzC;
                if (zzbfbVar != null) {
                    zzbfbVar.zzd(motionEvent);
                }
            }
        } else {
            zzaro zzaroVar = this.zzc;
            if (zzaroVar != null) {
                zzaroVar.zzd(motionEvent);
            }
            zzbdk zzbdkVar = this.zzd;
            if (zzbdkVar != null) {
                zzbdkVar.zzb(motionEvent);
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcgi) {
            this.zzn = (zzcgi) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzcat.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zzC(zzcgx zzcgxVar) {
        if (this.zzz != null) {
            zzcat.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcgxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcfs
    public final zzfcr zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchl
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchj
    public final zzaro zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized zzawj zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized zzbfb zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final /* synthetic */ zzcho zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchi
    public final synchronized zzchq zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcgy
    public final zzfcv zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized zzfkc zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final ml1 zzR() {
        zzbdk zzbdkVar = this.zzd;
        if (zzbdkVar == null) {
            return zzfzt.zzh(null);
        }
        return zzbdkVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzT(zzfcr zzfcrVar, zzfcv zzfcvVar) {
        this.zzj = zzfcrVar;
        this.zzk = zzfcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcgt(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzW(int i) {
        if (i == 0) {
            zzbcy zzbcyVar = this.zzK;
            zzbcs.zza(zzbcyVar.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzX() {
        if (this.zzH == null) {
            zzbcy zzbcyVar = this.zzK;
            zzbcs.zza(zzbcyVar.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbcx zzf = zzbda.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaE(String str, String str2, int i) {
        this.zzn.zzu(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaG(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzx(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzaH(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzn.zzy(z, i, str, z2, z3);
    }

    public final zzcgi zzaJ() {
        return this.zzn;
    }

    public final synchronized Boolean zzaK() {
        return this.zzw;
    }

    public final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            evaluateJavascript(str, null);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaO(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaK() == null) {
                zzbb();
            }
            if (zzaK().booleanValue()) {
                zzaN(str, null);
                return;
            } else {
                zzaP("javascript:".concat(str));
                return;
            }
        }
        zzaP("javascript:".concat(str));
    }

    public final synchronized void zzaP(String str) {
        if (!zzaz()) {
            loadUrl(str);
        } else {
            zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzv = zzcam.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzv2 = zzcam.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 != null && zza2.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzP = com.google.android.gms.ads.internal.util.zzt.zzP(zza2);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzv3 = zzcam.zzv(this.zzh, zzP[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            i2 = zzcam.zzv(this.zzh, zzP[1]);
            i = zzv3;
        } else {
            i = zzv;
            i2 = zzv2;
        }
        int i3 = this.zzQ;
        if (i3 == zzv && this.zzP == zzv2 && this.zzR == i && this.zzS == i2) {
            return false;
        }
        if (i3 != zzv || this.zzP != zzv2) {
            z = true;
        }
        this.zzQ = zzv;
        this.zzP = zzv2;
        this.zzR = i;
        this.zzS = i2;
        new zzbry(this, "").zzi(zzv, zzv2, i, i2, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (!zzaz()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzP);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzcat.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzchh.zza(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        zzcat.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbcx zzf = zzbda.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzad(String str, zzbjj zzbjjVar) {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.zzz(str, zzbjjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzag(zzchq zzchqVar) {
        this.zzq = zzchqVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzah(zzawj zzawjVar) {
        this.zzE = zzawjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzam(zzbez zzbezVar) {
        this.zzD = zzbezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzan(boolean z) {
        String str;
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzQ)).booleanValue() || !this.zzq.zzi()) {
                zzbry zzbryVar = new zzbry(this, "");
                if (true != z) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                zzbryVar.zzk(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzao(zzbfb zzbfbVar) {
        this.zzC = zzbfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzap(zzfkc zzfkcVar) {
        this.zzp = zzfkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF;
        int i2 = 1;
        if (true != z) {
            i2 = -1;
        }
        int i3 = i + i2;
        this.zzF = i3;
        if (i3 <= 0 && (zzlVar = this.zzo) != null) {
            zzlVar.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized void zzat(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzB(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzau(String str, zzbjj zzbjjVar) {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.zzH(str, zzbjjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzav(String str, Predicate predicate) {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzaxu() { // from class: com.google.android.gms.internal.ads.zzcgr
            @Override // com.google.android.gms.internal.ads.zzaxu
            public final void zza(zzazk zzazkVar) {
                int i2 = zzcgu.zza;
                zzbbp zza2 = zzbbq.zza();
                boolean zzc = zza2.zzc();
                boolean z2 = z;
                if (zzc != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i);
                zzazkVar.zzj((zzbbq) zza2.zzal());
            }
        });
        this.zzV.zzc(VungleError.CONFIGURATION_ERROR);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized String zzbl() {
        zzfcv zzfcvVar = this.zzk;
        if (zzfcvVar == null) {
            return null;
        }
        return zzfcvVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzbt(zzauv zzauvVar) {
        boolean z;
        synchronized (this) {
            z = zzauvVar.zzj;
            this.zzA = z;
        }
        zzaV(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcat.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder q = p71.q("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzcat.zze("Dispatching AFMA event: ".concat(q.toString()));
        zzaO(q.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzcdc
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzbcx zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final zzbcy zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzchk, com.google.android.gms.internal.ads.zzcdc
    public final zzcaz zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final zzccr zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized zzcen zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcen) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final synchronized zzcgx zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
        zzcgi zzcgiVar = this.zzn;
        if (zzcgiVar != null) {
            zzcgiVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb, com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zzt(String str, zzcen zzcenVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzv(boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final synchronized void zzw() {
        zzbez zzbezVar = this.zzD;
        if (zzbezVar != null) {
            final zzdnj zzdnjVar = (zzdnj) zzbezVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnh
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdnj.this.zzd();
                    } catch (RemoteException e) {
                        zzcat.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdc
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
