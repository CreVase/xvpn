package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class VungleInitializer implements InitializationListener {
    public static final VungleInitializer c = new VungleInitializer();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1440a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1441b = new ArrayList();

    /* loaded from: classes.dex */
    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public VungleInitializer() {
        VungleAds.setIntegrationName(VungleAds.WrapperFramework.admob, BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    public static VungleInitializer getInstance() {
        return c;
    }

    public void initialize(String str, Context context, VungleInitializationListener vungleInitializationListener) {
        if (VungleAds.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
            return;
        }
        boolean andSet = this.f1440a.getAndSet(true);
        ArrayList arrayList = this.f1441b;
        if (andSet) {
            arrayList.add(vungleInitializationListener);
            return;
        }
        updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        VungleAds.init(context, str, this);
        arrayList.add(vungleInitializationListener);
    }

    @Override // com.vungle.ads.InitializationListener
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        ArrayList arrayList = this.f1441b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VungleInitializationListener) it.next()).onInitializeError(adError);
        }
        arrayList.clear();
        this.f1440a.set(false);
    }

    @Override // com.vungle.ads.InitializationListener
    public void onSuccess() {
        ArrayList arrayList = this.f1441b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VungleInitializationListener) it.next()).onInitializeSuccess();
        }
        arrayList.clear();
        this.f1440a.set(false);
    }

    public void updateCoppaStatus(int i) {
        if (i != 0) {
            if (i == 1) {
                VunglePrivacySettings.setCOPPAStatus(true);
                return;
            }
            return;
        }
        VunglePrivacySettings.setCOPPAStatus(false);
    }
}
