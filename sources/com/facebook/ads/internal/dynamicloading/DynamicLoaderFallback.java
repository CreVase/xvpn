package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import defpackage.gp0;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        if (method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        b bVar = new b();
        DynamicLoader dynamicLoader = (DynamicLoader) bVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(bVar.f1363a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(bVar.f1363a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(bVar.f1363a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(bVar.f1363a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = bVar.f1363a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = bVar.f1363a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) bVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(bVar.f1363a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(bVar.f1363a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(bVar.f1363a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) bVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(bVar.f1363a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(bVar.f1363a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.f1363a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) bVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(bVar.f1363a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(bVar.f1363a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.f1363a);
        AdViewApi adViewApi = (AdViewApi) bVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(bVar.f1363a);
        adViewApi.loadAd(null);
        arrayList2.add(bVar.f1363a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(bVar.f1363a);
        ((AdView.AdViewLoadConfigBuilder) bVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f1363a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) bVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f1363a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) bVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f1363a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) bVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f1363a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new gp0(adListener, ad), 500L);
        return true;
    }
}
