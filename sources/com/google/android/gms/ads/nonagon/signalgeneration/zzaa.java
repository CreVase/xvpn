package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzarp;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzcwt;
import com.google.android.gms.internal.ads.zzdda;
import com.google.android.gms.internal.ads.zzdoi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfjh;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzfyz;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzgad;
import defpackage.ml1;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaa extends zzbzj {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcaz zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzchw zzf;
    private Context zzg;
    private final zzaro zzh;
    private final zzfek zzi;
    private final zzgad zzk;
    private final ScheduledExecutorService zzl;
    private zzbtt zzm;
    private final zzc zzq;
    private final zzdst zzr;
    private final zzfjx zzs;
    private zzdsj zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbci.zzhi)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbci.zzhh)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbci.zzhk)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbci.zzhm)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbci.zzhl);
    private final String zzy = (String) zzba.zzc().zzb(zzbci.zzhn);
    private final String zzC = (String) zzba.zzc().zzb(zzbci.zzho);

    public zzaa(zzchw zzchwVar, Context context, zzaro zzaroVar, zzfek zzfekVar, zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, zzdst zzdstVar, zzfjx zzfjxVar, zzcaz zzcazVar) {
        List list;
        this.zzf = zzchwVar;
        this.zzg = context;
        this.zzh = zzaroVar;
        this.zzi = zzfekVar;
        this.zzk = zzgadVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzchwVar.zzn();
        this.zzr = zzdstVar;
        this.zzs = zzfjxVar;
        this.zzA = zzcazVar;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzhp)).booleanValue()) {
            this.zzD = zzY((String) zzba.zzc().zzb(zzbci.zzhq));
            this.zzE = zzY((String) zzba.zzc().zzb(zzbci.zzhr));
            this.zzF = zzY((String) zzba.zzc().zzb(zzbci.zzhs));
            list = zzY((String) zzba.zzc().zzb(zzbci.zzht));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdsj zzdsjVar) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzgT)).booleanValue()) {
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgZ)).booleanValue()) {
            zzcbg.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                @Override // java.lang.Runnable
                public final void run() {
                    zzaa.this.zzI(str, str2, zzdsjVar);
                }
            });
        } else {
            zzaaVar.zzq.zzd(str, str2, zzdsjVar);
        }
    }

    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zzX(uri, "nas", str);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c;
        zzfdl zzfdlVar = new zzfdl();
        if ("REWARDED".equals(str2)) {
            zzfdlVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfdlVar.zzo().zza(3);
        }
        zzg zzo = this.zzf.zzo();
        zzcwt zzcwtVar = new zzcwt();
        zzcwtVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfdlVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfdlVar.zzE(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1 && c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            zzqVar = new com.google.android.gms.ads.internal.client.zzq();
                        } else {
                            zzqVar = com.google.android.gms.ads.internal.client.zzq.zzb();
                        }
                    } else {
                        zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
                    }
                } else {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                }
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            }
        }
        zzfdlVar.zzr(zzqVar);
        zzfdlVar.zzx(true);
        zzcwtVar.zzi(zzfdlVar.zzG());
        zzo.zza(zzcwtVar.zzj());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzo.zzb(new zzae(zzacVar, null));
        new zzdda();
        zzh zzc2 = zzo.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final ml1 zzR(final String str) {
        final zzdoi[] zzdoiVarArr = new zzdoi[1];
        ml1 zzn = zzfzt.zzn(this.zzi.zza(), new zzfza() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzaa.this.zzv(zzdoiVarArr, str, (zzdoi) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(zzdoiVarArr);
            }
        }, this.zzk);
        return zzfzt.zze(zzfzt.zzm((zzfzk) zzfzt.zzo(zzfzk.zzu(zzn), ((Integer) zzba.zzc().zzb(zzbci.zzhA)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                zzcat.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS() {
        ml1 zzc2;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjh)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzjk)).booleanValue()) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzkh)).booleanValue()) {
                    zzc2 = zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // com.google.android.gms.internal.ads.zzfyz
                        public final ml1 zza() {
                            return zzaa.this.zzu();
                        }
                    }, zzcbg.zza);
                } else {
                    zzc2 = zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
                }
                zzfzt.zzr(zzc2, new zzz(this), this.zzf.zzB());
            }
        }
    }

    private final void zzT(List list, final IObjectWrapper iObjectWrapper, zzbtk zzbtkVar, boolean z) {
        ml1 zzb2;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            zzcat.zzj("The updating URL feature is not enabled.");
            try {
                zzbtkVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcat.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            zzcat.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzN(uri)) {
                zzcat.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzfzt.zzh(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzW()) {
                    zzb2 = zzfzt.zzn(zzb2, new zzfza() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                        @Override // com.google.android.gms.internal.ads.zzfza
                        public final ml1 zza(Object obj) {
                            ml1 zzm;
                            zzm = zzfzt.zzm(r0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                                @Override // com.google.android.gms.internal.ads.zzfsk
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(r2, (String) obj2);
                                }
                            }, zzaa.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    zzcat.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzfzt.zzr(zzfzt.zzd(arrayList), new zzy(this, zzbtkVar, z), this.zzf.zzB());
    }

    private final void zzU(final List list, final IObjectWrapper iObjectWrapper, zzbtk zzbtkVar, boolean z) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            try {
                zzbtkVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcat.zzh("", e);
                return;
            }
        }
        ml1 zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzW()) {
            zzb2 = zzfzt.zzn(zzb2, new zzfza() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzcat.zzi("Asset view map is empty.");
        }
        zzfzt.zzr(zzb2, new zzx(this, zzbtkVar, z), this.zzf.zzB());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzW() {
        Map map;
        zzbtt zzbttVar = this.zzm;
        if (zzbttVar != null && (map = zzbttVar.zzb) != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzX(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            StringBuilder sb = new StringBuilder(uri2.substring(0, i));
            p71.A(sb, str, "=", str2, "&");
            sb.append(uri2.substring(i));
            return Uri.parse(sb.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzY(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzftl.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfje zzr(ml1 ml1Var, zzbzo zzbzoVar) {
        String str;
        if (!zzfjh.zza() || !((Boolean) zzbdu.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfje zzb2 = ((zzh) zzfzt.zzp(ml1Var)).zzb();
            zzb2.zzd(new ArrayList(Collections.singletonList(zzbzoVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbzoVar.zzd;
            if (zzlVar == null) {
                str = "";
            } else {
                str = zzlVar.zzp;
            }
            zzb2.zzb(str);
            return zzb2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzX(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        this.zzh.zzc();
        String zzh = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzO(uri)) {
                    zzcat.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzX(uri, "ms", zzh));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    public final /* synthetic */ void zzH(zzdoi[] zzdoiVarArr) {
        zzdoi zzdoiVar = zzdoiVarArr[0];
        if (zzdoiVar != null) {
            this.zzi.zzb(zzfzt.zzh(zzdoiVar));
        }
    }

    public final /* synthetic */ void zzI(String str, String str2, zzdsj zzdsjVar) {
        this.zzq.zzd(str, str2, zzdsjVar);
    }

    public final boolean zzN(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    public final boolean zzO(Uri uri) {
        return zzV(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zze(IObjectWrapper iObjectWrapper, final zzbzo zzbzoVar, zzbzh zzbzhVar) {
        ml1 zzh;
        ml1 zzc2;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfit zza2 = zzfis.zza(context, 22);
        zza2.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzkh)).booleanValue()) {
            zzgad zzgadVar = zzcbg.zza;
            zzh = zzgadVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzbzoVar);
                }
            });
            zzc2 = zzfzt.zzn(zzh, new zzfza() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzgadVar);
        } else {
            zzh zzQ = zzQ(this.zzg, zzbzoVar.zza, zzbzoVar.zzb, zzbzoVar.zzc, zzbzoVar.zzd);
            zzh = zzfzt.zzh(zzQ);
            zzc2 = zzQ.zzc();
        }
        zzfzt.zzr(zzc2, new zzw(this, zzh, zzbzoVar, zzbzhVar, zza2, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzf(zzbtt zzbttVar) {
        this.zzm = zzbttVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) {
        zzT(list, iObjectWrapper, zzbtkVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) {
        zzU(list, iObjectWrapper, zzbtkVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjg)).booleanValue()) {
            return;
        }
        zzbca zzbcaVar = zzbci.zzhy;
        if (!((Boolean) zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
            zzS();
        }
        WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
        if (webView == null) {
            zzcat.zzg("The webView cannot be null.");
            return;
        }
        if (this.zzp.contains(webView)) {
            zzcat.zzi("This webview has already been registered.");
            return;
        }
        this.zzp.add(webView);
        webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
        if (((Boolean) zzba.zzc().zzb(zzbcaVar)).booleanValue()) {
            zzS();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzj(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
        zzbtt zzbttVar = this.zzm;
        if (zzbttVar == null) {
            view = null;
        } else {
            view = zzbttVar.zza;
        }
        this.zzn = zzbz.zza(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzn;
        obtain.setLocation(point.x, point.y);
        this.zzh.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) {
        zzT(list, iObjectWrapper, zzbtkVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtkVar) {
        zzU(list, iObjectWrapper, zzbtkVar, false);
    }

    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzarp e) {
            zzcat.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzh zzq(zzbzo zzbzoVar) throws Exception {
        return zzQ(this.zzg, zzbzoVar.zza, zzbzoVar.zzb, zzbzoVar.zzc, zzbzoVar.zzd);
    }

    public final /* synthetic */ ml1 zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    public final /* synthetic */ ml1 zzv(zzdoi[] zzdoiVarArr, String str, zzdoi zzdoiVar) throws Exception {
        zzdoiVarArr[0] = zzdoiVar;
        Context context = this.zzg;
        zzbtt zzbttVar = this.zzm;
        Map map = zzbttVar.zzb;
        JSONObject zzd2 = zzbz.zzd(context, map, map, zzbttVar.zza, null);
        JSONObject zzg = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbz.zzf(this.zzm.zza);
        JSONObject zze2 = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdoiVar.zzd(str, jSONObject);
    }

    public final /* synthetic */ ml1 zzw(final ArrayList arrayList) throws Exception {
        return zzfzt.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfsk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
