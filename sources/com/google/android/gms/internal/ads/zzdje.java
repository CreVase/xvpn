package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.kg;
import defpackage.ml1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdje extends zzcsx {
    public static final zzfvs zzc = zzfvs.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzauy zzA;
    private final Executor zzd;
    private final zzdjj zze;
    private final zzdjr zzf;
    private final zzdkj zzg;
    private final zzdjo zzh;
    private final zzdju zzi;
    private final zzhaw zzj;
    private final zzhaw zzk;
    private final zzhaw zzl;
    private final zzhaw zzm;
    private final zzhaw zzn;
    private zzdlf zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbyg zzs;
    private final zzaro zzt;
    private final zzcaz zzu;
    private final Context zzv;
    private final zzdjg zzw;
    private final zzemn zzx;
    private final Map zzy;
    private final List zzz;

    public zzdje(zzcsw zzcswVar, Executor executor, zzdjj zzdjjVar, zzdjr zzdjrVar, zzdkj zzdkjVar, zzdjo zzdjoVar, zzdju zzdjuVar, zzhaw zzhawVar, zzhaw zzhawVar2, zzhaw zzhawVar3, zzhaw zzhawVar4, zzhaw zzhawVar5, zzbyg zzbygVar, zzaro zzaroVar, zzcaz zzcazVar, Context context, zzdjg zzdjgVar, zzemn zzemnVar, zzauy zzauyVar) {
        super(zzcswVar);
        this.zzd = executor;
        this.zze = zzdjjVar;
        this.zzf = zzdjrVar;
        this.zzg = zzdkjVar;
        this.zzh = zzdjoVar;
        this.zzi = zzdjuVar;
        this.zzj = zzhawVar;
        this.zzk = zzhawVar2;
        this.zzl = zzhawVar3;
        this.zzm = zzhawVar4;
        this.zzn = zzhawVar5;
        this.zzs = zzbygVar;
        this.zzt = zzaroVar;
        this.zzu = zzcazVar;
        this.zzv = context;
        this.zzw = zzdjgVar;
        this.zzx = zzemnVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzauyVar;
    }

    public static boolean zzV(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            long zzv = com.google.android.gms.ads.internal.util.zzt.zzv(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (zzv >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzjN)).intValue()) {
                    return true;
                }
            }
            return false;
        }
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            return true;
        }
        return false;
    }

    private final synchronized View zzX(Map map) {
        if (map == null) {
            return null;
        }
        zzfvs zzfvsVar = zzc;
        int size = zzfvsVar.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfvsVar.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzY() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhL)).booleanValue()) {
            return null;
        }
        zzdlf zzdlfVar = this.zzo;
        if (zzdlfVar == null) {
            zzcat.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdlfVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
        }
        return zzdkj.zza;
    }

    private final void zzZ(String str, boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            ml1 zzw = this.zze.zzw();
            if (zzw == null) {
                return;
            }
            zzfzt.zzr(zzw, new zzdjc(this, "Google", true), this.zzd);
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzaa(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzY());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab(View view, zzfkc zzfkcVar) {
        zzcgb zzr = this.zze.zzr();
        if (this.zzh.zzd() && zzfkcVar != null && zzr != null && view != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfkcVar, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzx(zzdlf zzdlfVar) {
        Iterator<String> keys;
        View view;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdlfVar;
        this.zzg.zze(zzdlfVar);
        this.zzf.zzy(zzdlfVar.zzf(), zzdlfVar.zzm(), zzdlfVar.zzn(), zzdlfVar, zzdlfVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcs)).booleanValue()) {
            this.zzt.zzc().zzo(zzdlfVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbI)).booleanValue()) {
            zzfcr zzfcrVar = this.zzb;
            if (zzfcrVar.zzam && (keys = zzfcrVar.zzal.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzaux zzauxVar = new zzaux(this.zzv, view);
                        this.zzz.add(zzauxVar);
                        zzauxVar.zzc(new zzdjb(this, next));
                    }
                }
            }
        }
        if (zzdlfVar.zzi() != null) {
            zzdlfVar.zzi().zzc(this.zzs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzy(zzdlf zzdlfVar) {
        this.zzf.zzz(zzdlfVar.zzf(), zzdlfVar.zzl());
        if (zzdlfVar.zzh() != null) {
            zzdlfVar.zzh().setClickable(false);
            zzdlfVar.zzh().removeAllViews();
        }
        if (zzdlfVar.zzi() != null) {
            zzdlfVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzq(zzdje zzdjeVar) {
        try {
            zzdjj zzdjjVar = zzdjeVar.zze;
            int zzc2 = zzdjjVar.zzc();
            if (zzc2 != 1) {
                if (zzc2 != 2) {
                    if (zzc2 != 3) {
                        if (zzc2 != 6) {
                            if (zzc2 != 7) {
                                zzcat.zzg("Wrong native template id!");
                                return;
                            }
                            zzdju zzdjuVar = zzdjeVar.zzi;
                            if (zzdjuVar.zzg() != null) {
                                zzdjuVar.zzg().zzg((zzblv) zzdjeVar.zzm.zzb());
                                return;
                            }
                            return;
                        }
                        if (zzdjeVar.zzi.zzf() != null) {
                            zzdjeVar.zzZ("Google", true);
                            zzdjeVar.zzi.zzf().zze((zzbhl) zzdjeVar.zzl.zzb());
                            return;
                        }
                        return;
                    }
                    if (zzdjeVar.zzi.zzd(zzdjjVar.zzA()) != null) {
                        if (zzdjeVar.zze.zzs() != null) {
                            zzdjeVar.zzf("Google", true);
                        }
                        zzdjeVar.zzi.zzd(zzdjeVar.zze.zzA()).zze((zzbgi) zzdjeVar.zzn.zzb());
                        return;
                    }
                    return;
                }
                if (zzdjeVar.zzi.zza() != null) {
                    zzdjeVar.zzZ("Google", true);
                    zzdjeVar.zzi.zza().zze((zzbgd) zzdjeVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzdjeVar.zzi.zzb() != null) {
                zzdjeVar.zzZ("Google", true);
                zzdjeVar.zzi.zzb().zze((zzbgf) zzdjeVar.zzj.zzb());
            }
        } catch (RemoteException e) {
            zzcat.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzB(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzY());
        if (this.zzr) {
            zzdjj zzdjjVar = this.zze;
            if (zzdjjVar.zzs() != null) {
                zzdjjVar.zzs().zzd("onSdkAdUserInteractionClick", new kg());
            }
        }
    }

    public final synchronized void zzC(final View view, final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
            return;
        }
        zzdlf zzdlfVar = this.zzo;
        if (zzdlfVar == null) {
            zzcat.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            final boolean z = zzdlfVar instanceof zzdkd;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiy
                @Override // java.lang.Runnable
                public final void run() {
                    zzdje.this.zzv(view, z, i);
                }
            });
        }
    }

    public final synchronized void zzD(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzF() {
        zzdlf zzdlfVar = this.zzo;
        if (zzdlfVar == null) {
            zzcat.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdlfVar instanceof zzdkd;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdja
                @Override // java.lang.Runnable
                public final void run() {
                    zzdje.this.zzw(z);
                }
            });
        }
    }

    public final synchronized void zzG() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzH(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            zzcbl zzp = this.zze.zzp();
            if (zzp == null) {
                return;
            }
            zzfzt.zzr(zzp, new zzdjd(this, view), this.zzd);
            return;
        }
        zzab(view, this.zze.zzu());
    }

    public final synchronized void zzI(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzJ(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzK(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzL() {
        this.zzf.zzv();
    }

    public final synchronized void zzM(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzO(zzbhi zzbhiVar) {
        this.zzf.zzx(zzbhiVar);
    }

    public final synchronized void zzP(final zzdlf zzdlfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiu
                @Override // java.lang.Runnable
                public final void run() {
                    zzdje.this.zzx(zzdlfVar);
                }
            });
        } else {
            zzx(zzdlfVar);
        }
    }

    public final synchronized void zzQ(final zzdlf zzdlfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbG)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiv
                @Override // java.lang.Runnable
                public final void run() {
                    zzdje.this.zzy(zzdlfVar);
                }
            });
        } else {
            zzy(zzdlfVar);
        }
    }

    public final boolean zzR() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzS() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzB();
    }

    public final boolean zzU() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzW(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcsx
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // java.lang.Runnable
            public final void run() {
                zzdje.this.zzu();
            }
        });
        super.zzb();
    }

    public final zzdjg zzc() {
        return this.zzw;
    }

    public final zzfkc zzf(String str, boolean z) {
        boolean z2;
        boolean z3;
        String str2;
        zzeep zzeepVar;
        zzeep zzeepVar2;
        zzeeo zzeeoVar;
        String str3;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdjj zzdjjVar = this.zze;
        zzcgb zzr = zzdjjVar.zzr();
        zzcgb zzs = zzdjjVar.zzs();
        if (zzr == null && zzs == null) {
            zzcat.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z4 = false;
        if (zzr != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zzs != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeW)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i = zzb - 1;
            if (i != 0) {
                if (i != 1) {
                    if (zzb != 1) {
                        if (zzb != 2) {
                            str3 = "UNKNOWN";
                        } else {
                            str3 = "DISPLAY";
                        }
                    } else {
                        str3 = "VIDEO";
                    }
                    zzcat.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (zzr != null) {
                    z4 = true;
                    z3 = false;
                } else {
                    zzcat.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs != null) {
                z3 = true;
            } else {
                zzcat.zzj("Omid media type was video but there was no video webview.");
                return null;
            }
        } else {
            z4 = z2;
        }
        if (z4) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr = zzs;
        }
        zzr.zzG();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzv)) {
            zzcat.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcaz zzcazVar = this.zzu;
        String str4 = zzcazVar.zzb + "." + zzcazVar.zzc;
        if (z3) {
            zzeeoVar = zzeeo.VIDEO;
            zzeepVar2 = zzeep.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdjj zzdjjVar2 = this.zze;
            zzeeo zzeeoVar2 = zzeeo.NATIVE_DISPLAY;
            if (zzdjjVar2.zzc() == 3) {
                zzeepVar = zzeep.UNSPECIFIED;
            } else {
                zzeepVar = zzeep.ONE_PIXEL;
            }
            zzeepVar2 = zzeepVar;
            zzeeoVar = zzeeoVar2;
        }
        zzfkc zzb2 = com.google.android.gms.ads.internal.zzt.zzA().zzb(str4, zzr.zzG(), "", "javascript", str2, str, zzeepVar2, zzeeoVar, this.zzb.zzan);
        if (zzb2 == null) {
            zzcat.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzb2);
        zzr.zzap(zzb2);
        if (z3) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzb2, zzs.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzb2);
            zzr.zzd("onSdkLoaded", new kg());
        }
        return zzb2;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzcsx
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiw
            @Override // java.lang.Runnable
            public final void run() {
                zzdje.zzq(zzdje.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdjr zzdjrVar = this.zzf;
            zzdjrVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdix
                @Override // java.lang.Runnable
                public final void run() {
                    zzdjr.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzY());
    }

    public final void zzs(View view) {
        zzfkc zzu = this.zze.zzu();
        if (this.zzh.zzd() && zzu != null && view != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzf(zzu, view);
        }
    }

    public final synchronized void zzt() {
        this.zzf.zzh();
    }

    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzv(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzY(), i);
    }

    public final /* synthetic */ void zzw(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzY(), 0);
    }

    public final synchronized void zzz(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbI)).booleanValue() && this.zzb.zzam) {
            Iterator it = this.zzy.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdI)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && zzV(view2)) {
                        zzaa(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzX = zzX(map);
        if (zzX == null) {
            zzaa(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdJ)).booleanValue()) {
            if (zzV(zzX)) {
                zzaa(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzdK)).booleanValue()) {
            Rect rect = new Rect();
            if (zzX.getGlobalVisibleRect(rect, null) && zzX.getHeight() == rect.height() && zzX.getWidth() == rect.width()) {
                zzaa(view, map, map2);
                return;
            }
            return;
        }
        zzaa(view, map, map2);
    }
}
