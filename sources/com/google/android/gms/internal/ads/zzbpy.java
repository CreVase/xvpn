package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbpy extends zzboz {
    private final Object zza;
    private zzbqa zzb;
    private zzbwh zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzbpy(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        zzcat.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw p71.i("", th);
        }
    }

    private static final boolean zzW(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (!zzlVar.zzf) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            if (!zzcam.zzr()) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static final String zzX(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e) {
                zzcat.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzlVar, str, new zzbqb((Adapter) obj, this.zzc));
            return;
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e) {
                zzcat.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th) {
            throw p71.i("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th) {
            throw p71.i("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzcat.zzh("", th);
                return;
            }
        }
        zzcat.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzj;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcat.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            zzcat.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                throw p71.i("", th);
            }
        }
        zzcat.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            zzcat.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzI();
            return;
        }
        zzcat.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd != null) {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzcat.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcat.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } else {
                zzcat.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !zzbpq.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (this.zzc != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzcat.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgi zzi() {
        zzbqa zzbqaVar = this.zzb;
        if (zzbqaVar != null) {
            NativeCustomTemplateAd zza = zzbqaVar.zza();
            if (zza instanceof zzbgj) {
                return ((zzbgj) zza).zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbpz(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbqa zzbqaVar = this.zzb;
            if (zzbqaVar != null && (zzb = zzbqaVar.zzb()) != null) {
                return new zzbqd(zzb);
            }
            return null;
        }
        if ((obj instanceof Adapter) && (unifiedNativeAdMapper = this.zzg) != null) {
            return new zzbqd(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrj zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrj.zza(((Adapter) obj).getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrj zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrj.zza(((Adapter) obj).getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw p71.i("", th);
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        zzcat.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th) {
            throw p71.i("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbwh zzbwhVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !zzbpq.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbwhVar;
        zzbwhVar.zzl(ObjectWrapper.wrap(this.zza));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0072. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzq(IObjectWrapper iObjectWrapper, zzblk zzblkVar, List list) throws RemoteException {
        char c;
        if (this.zza instanceof Adapter) {
            zzbps zzbpsVar = new zzbps(this, zzblkVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblq zzblqVar = (zzblq) it.next();
                String str = zzblqVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                c = 65535;
                AdFormat adFormat = null;
                switch (c) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzkM)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzblqVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpsVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwhVar, List list) throws RemoteException {
        zzcat.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbpx(this, zzbpdVar));
                return;
            } catch (Exception e) {
                zzcat.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        AdSize zzc;
        RemoteException i;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            zzcat.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcat.zze("Requesting banner ad from adapter.");
        if (zzqVar.zzn) {
            zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbpp zzbppVar = new zzbpp(date, zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpdVar), zzV(str, zzlVar, str2), adSize, zzbppVar, bundle);
                return;
            } finally {
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), adSize, this.zzk), new zzbpt(this, zzbpdVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbpr(this, zzbpdVar, adapter));
                return;
            } catch (Exception e) {
                zzcat.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcat.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbpd zzbpdVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        RemoteException i;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            zzcat.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcat.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                HashSet hashSet2 = hashSet;
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbpp zzbppVar = new zzbpp(date, zzlVar.zzd, hashSet2, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpdVar), zzV(str, zzlVar, str2), zzbppVar, bundle);
                return;
            } finally {
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk), new zzbpu(this, zzbpdVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbpd zzbpdVar, zzbfc zzbfcVar, List list) throws RemoteException {
        RemoteException i;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            zzcat.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcat.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.zze;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                HashSet hashSet2 = hashSet;
                long j = zzlVar.zzb;
                if (j == -1) {
                    date = null;
                } else {
                    date = new Date(j);
                }
                zzbqc zzbqcVar = new zzbqc(date, zzlVar.zzd, hashSet2, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzbfcVar, list, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.zzb = new zzbqa(zzbpdVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzlVar, str2), zzbqcVar, bundle);
                return;
            } finally {
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk, zzbfcVar), new zzbpv(this, zzbpdVar));
            } finally {
            }
        }
    }

    public zzbpy(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
