package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.vungle.ads.VungleError;
import defpackage.ll3;
import defpackage.xk3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class zzcgi extends WebViewClient implements zzcho {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzedz zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxu zza;
    private final zzcgb zzc;
    private final zzaxv zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzchm zzi;
    private zzchn zzj;
    private zzbhz zzk;
    private zzbib zzl;
    private zzdfd zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzz zzv;
    private zzbrx zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrs zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfA)).split(",")));

    public zzcgi(zzcgb zzcgbVar, zzaxv zzaxvVar, boolean z, zzbrx zzbrxVar, zzbrs zzbrsVar, zzedz zzedzVar) {
        this.zzd = zzaxvVar;
        this.zzc = zzcgbVar;
        this.zzs = z;
        this.zzw = zzbrxVar;
        this.zzE = zzedzVar;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaI)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        String trim;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(VungleError.DEFAULT);
                    openConnection.setReadTimeout(VungleError.DEFAULT);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                        zzcas zzcasVar = new zzcas(null);
                        zzcasVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcasVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzcat.zzj("Protocol is null");
                                return zzN();
                            }
                            if (!protocol.equals("http") && !protocol.equals("https")) {
                                zzcat.zzj("Unsupported scheme: " + protocol);
                                return zzN();
                            }
                            zzcat.zze("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            if (TextUtils.isEmpty(contentType)) {
                trim = "";
            } else {
                trim = contentType.split(";")[0].trim();
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith("charset")) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjj) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbxu zzbxuVar, final int i) {
        if (zzbxuVar.zzi() && i > 0) {
            zzbxuVar.zzg(view);
            if (zzbxuVar.zzi()) {
                com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgi.this.zzo(view, zzbxuVar, i);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean zzS(zzcgb zzcgbVar) {
        if (zzcgbVar.zzD() != null) {
            return zzcgbVar.zzD().zzak;
        }
        return false;
    }

    private static final boolean zzT(boolean z, zzcgb zzcgbVar) {
        if (z && !zzcgbVar.zzO().zzi() && !zzcgbVar.zzS().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzz = true;
            zzchn zzchnVar = this.zzj;
            if (zzchnVar != null) {
                zzchnVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkQ)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcgb zzcgbVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcgbVar.zzay(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxu zzbxuVar = this.zza;
                        if (zzbxuVar != null) {
                            zzbxuVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdfd zzdfdVar = this.zzm;
                    if (zzdfdVar != null) {
                        zzdfdVar.zzbK();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzaro zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcgb zzcgbVar = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcgbVar, zzcgbVar.zzi());
                    }
                } catch (zzarp unused) {
                    zzcat.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar != null && !zzbVar.zzc()) {
                    zzbVar.zzb(str);
                } else {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                zzcat.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzA(zzchm zzchmVar) {
        this.zzi = zzchmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzB(int i, int i2) {
        zzbrs zzbrsVar = this.zzy;
        if (zzbrsVar != null) {
            zzbrsVar.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcbg.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgi.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzG(zzchn zzchnVar) {
        this.zzj = zzchnVar;
    }

    public final void zzH(String str, zzbjj zzbjjVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbjjVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbjj> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbjj zzbjjVar : list) {
                if (predicate.apply(zzbjjVar)) {
                    arrayList.add(zzbjjVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhz zzbhzVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbjl zzbjlVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbrz zzbrzVar, zzbxu zzbxuVar, final zzedo zzedoVar, final zzfjx zzfjxVar, zzdso zzdsoVar, zzfib zzfibVar, zzbkc zzbkcVar, final zzdfd zzdfdVar, zzbkb zzbkbVar, zzbjv zzbjvVar, final zzcou zzcouVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxuVar, null) : zzbVar;
        this.zzy = new zzbrs(this.zzc, zzbrzVar);
        this.zza = zzbxuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaQ)).booleanValue()) {
            zzz("/adMetadata", new zzbhy(zzbhzVar));
        }
        if (zzbibVar != null) {
            zzz("/appEvent", new zzbia(zzbibVar));
        }
        zzz("/backButton", zzbji.zzj);
        zzz("/refresh", zzbji.zzk);
        zzz("/canOpenApp", zzbji.zzb);
        zzz("/canOpenURLs", zzbji.zza);
        zzz("/canOpenIntents", zzbji.zzc);
        zzz("/close", zzbji.zzd);
        zzz("/customClose", zzbji.zze);
        zzz("/instrument", zzbji.zzn);
        zzz("/delayPageLoaded", zzbji.zzp);
        zzz("/delayPageClosed", zzbji.zzq);
        zzz("/getLocationInfo", zzbji.zzr);
        zzz("/log", zzbji.zzg);
        zzz("/mraid", new zzbjp(zzbVar2, this.zzy, zzbrzVar));
        zzbrx zzbrxVar = this.zzw;
        if (zzbrxVar != null) {
            zzz("/mraidLoaded", zzbrxVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbju(zzbVar2, this.zzy, zzedoVar, zzdsoVar, zzfibVar, zzcouVar));
        zzz("/precache", new zzceo());
        zzz("/touch", zzbji.zzi);
        zzz("/video", zzbji.zzl);
        zzz("/videoMeta", zzbji.zzm);
        if (zzedoVar != null && zzfjxVar != null) {
            zzz("/click", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzfdt
                @Override // com.google.android.gms.internal.ads.zzbjj
                public final void zza(Object obj, Map map) {
                    zzcgb zzcgbVar = (zzcgb) obj;
                    zzbji.zzc(map, zzdfd.this);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcat.zzj("URL missing from click GMSG.");
                        return;
                    }
                    zzedo zzedoVar2 = zzedoVar;
                    zzfjx zzfjxVar2 = zzfjxVar;
                    zzfzt.zzr(zzbji.zza(zzcgbVar, str), new zzfdv(zzcgbVar, zzcouVar, zzfjxVar2, zzedoVar2), zzcbg.zza);
                }
            });
            zzz("/httpTrack", new zzbjj() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // com.google.android.gms.internal.ads.zzbjj
                public final void zza(Object obj, Map map) {
                    zzcfs zzcfsVar = (zzcfs) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcat.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzcfsVar.zzD().zzak) {
                        zzfjx.this.zzc(str, null);
                    } else {
                        zzedoVar.zzd(new zzedq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcgy) zzcfsVar).zzP().zzb, str, 2));
                    }
                }
            });
        } else {
            zzz("/click", new zzbih(zzdfdVar, zzcouVar));
            zzz("/httpTrack", zzbji.zzf);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbjo(this.zzc.getContext()));
        }
        if (zzbjlVar != null) {
            zzz("/setInterstitialProperties", new zzbjk(zzbjlVar));
        }
        if (zzbkcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbkcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zziY)).booleanValue() && zzbkbVar != null) {
            zzz("/shareSheet", zzbkbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjd)).booleanValue() && zzbjvVar != null) {
            zzz("/inspectorOutOfContextTest", zzbjvVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkx)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbji.zzu);
            zzz("/presentPlayStoreOverlay", zzbji.zzv);
            zzz("/expandPlayStoreOverlay", zzbji.zzw);
            zzz("/collapsePlayStoreOverlay", zzbji.zzx);
            zzz("/closePlayStoreOverlay", zzbji.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcX)).booleanValue()) {
            zzz("/setPAIDPersonalizationEnabled", zzbji.zzA);
            zzz("/resetPAID", zzbji.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkP)).booleanValue()) {
            zzcgb zzcgbVar = this.zzc;
            if (zzcgbVar.zzD() != null && zzcgbVar.zzD().zzas) {
                zzz("/writeToLocalStorage", zzbji.zzB);
                zzz("/clearLocalStorageKeys", zzbji.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbhzVar;
        this.zzl = zzbibVar;
        this.zzv = zzzVar;
        this.zzx = zzbVar3;
        this.zzm = zzdfdVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzdfd zzdfdVar = this.zzm;
        if (zzdfdVar != null) {
            zzdfdVar.zzbK();
        }
    }

    public final WebResourceResponse zzc(String str, Map map) {
        zzaxe zzb2;
        try {
            String zzc = zzbza.zzc(str, this.zzc.getContext(), this.zzC);
            if (!zzc.equals(str)) {
                return zzO(zzc, map);
            }
            zzaxh zza = zzaxh.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzcas.zzk() && ((Boolean) zzbdx.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbO)).booleanValue() && this.zzc.zzm() != null) {
                zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzchm zzchmVar = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            zzchmVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            zzbxuVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbrs zzbrsVar = this.zzy;
            if (zzbrsVar != null) {
                zzbrsVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzj(Uri uri) {
        final String str;
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfz)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfB)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzfzt.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcgg(this, list, path, uri), zzcbg.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            zzP(com.google.android.gms.ads.internal.util.zzt.zzO(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgI)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzf() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcgi.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzk() {
        zzaxv zzaxvVar = this.zzd;
        if (zzaxvVar != null) {
            zzaxvVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    public final /* synthetic */ void zzo(View view, zzbxu zzbxuVar, int i) {
        zzR(view, zzbxuVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzp(int i, int i2, boolean z) {
        zzbrx zzbrxVar = this.zzw;
        if (zzbrxVar != null) {
            zzbrxVar.zzb(i, i2);
        }
        zzbrs zzbrsVar = this.zzy;
        if (zzbrsVar != null) {
            zzbrsVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcho
    public final void zzq() {
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            WebView zzG = this.zzc.zzG();
            WeakHashMap weakHashMap = ll3.f3151a;
            if (xk3.b(zzG)) {
                zzR(zzG, zzbxuVar, 10);
                return;
            }
            zzQ();
            zzcgf zzcgfVar = new zzcgf(this, zzbxuVar);
            this.zzF = zzcgfVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcgfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
        zzdfd zzdfdVar = this.zzm;
        if (zzdfdVar != null) {
            zzdfdVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar;
        zzdfd zzdfdVar;
        zzcgb zzcgbVar = this.zzc;
        boolean zzaA = zzcgbVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgbVar);
        boolean z2 = true;
        if (!zzT && z) {
            z2 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzoVar = null;
        } else {
            zzoVar = this.zzh;
        }
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgb zzcgbVar2 = this.zzc;
        zzcaz zzn = zzcgbVar2.zzn();
        if (z2) {
            zzdfdVar = null;
        } else {
            zzdfdVar = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zzaVar, zzoVar, zzzVar, zzn, zzcgbVar2, zzdfdVar));
    }

    public final void zzu(String str, String str2, int i) {
        zzedz zzedzVar = this.zzE;
        zzcgb zzcgbVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcgbVar, zzcgbVar.zzn(), str, str2, 14, zzedzVar));
    }

    public final void zzv(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdfd zzdfdVar;
        zzedz zzedzVar;
        zzcgb zzcgbVar = this.zzc;
        boolean zzT = zzT(zzcgbVar.zzaA(), zzcgbVar);
        boolean z3 = true;
        if (!zzT && z2) {
            z3 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgb zzcgbVar2 = this.zzc;
        zzcaz zzn = zzcgbVar2.zzn();
        if (z3) {
            zzdfdVar = null;
        } else {
            zzdfdVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzedzVar = this.zzE;
        } else {
            zzedzVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcgbVar2, z, i, zzn, zzdfdVar, zzedzVar));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrs zzbrsVar = this.zzy;
        if (zzbrsVar != null) {
            z = zzbrsVar.zze();
        } else {
            z = false;
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !z);
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxuVar.zzh(str);
        }
    }

    public final void zzx(boolean z, int i, String str, String str2, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcgh zzcghVar;
        zzdfd zzdfdVar;
        zzedz zzedzVar;
        zzcgb zzcgbVar = this.zzc;
        boolean zzaA = zzcgbVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgbVar);
        boolean z3 = true;
        if (!zzT && z2) {
            z3 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzcghVar = null;
        } else {
            zzcghVar = new zzcgh(this.zzc, this.zzh);
        }
        zzbhz zzbhzVar = this.zzk;
        zzbib zzbibVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgb zzcgbVar2 = this.zzc;
        zzcaz zzn = zzcgbVar2.zzn();
        if (z3) {
            zzdfdVar = null;
        } else {
            zzdfdVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzedzVar = this.zzE;
        } else {
            zzedzVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzcghVar, zzbhzVar, zzbibVar, zzzVar, zzcgbVar2, z, i, str, str2, zzn, zzdfdVar, zzedzVar));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcgh zzcghVar;
        zzdfd zzdfdVar;
        zzedz zzedzVar;
        zzcgb zzcgbVar = this.zzc;
        boolean zzaA = zzcgbVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgbVar);
        boolean z4 = true;
        if (!zzT && z2) {
            z4 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzcghVar = null;
        } else {
            zzcghVar = new zzcgh(this.zzc, this.zzh);
        }
        zzbhz zzbhzVar = this.zzk;
        zzbib zzbibVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgb zzcgbVar2 = this.zzc;
        zzcaz zzn = zzcgbVar2.zzn();
        if (z4) {
            zzdfdVar = null;
        } else {
            zzdfdVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzedzVar = this.zzE;
        } else {
            zzedzVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzcghVar, zzbhzVar, zzbibVar, zzzVar, zzcgbVar2, z, i, str, zzn, zzdfdVar, zzedzVar, z3));
    }

    public final void zzz(String str, zzbjj zzbjjVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbjjVar);
        }
    }
}
