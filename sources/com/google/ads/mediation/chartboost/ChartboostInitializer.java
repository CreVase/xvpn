package com.google.ads.mediation.chartboost;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.ads.MobileAds;
import defpackage.gx;
import defpackage.hx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ChartboostInitializer {
    public static ChartboostInitializer d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1422a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1423b = false;
    public final ArrayList c = new ArrayList();

    public static ChartboostInitializer getInstance() {
        if (d == null) {
            d = new ChartboostInitializer();
        }
        return d;
    }

    public void initialize(Context context, ChartboostParams chartboostParams, hx hxVar) {
        boolean z = this.f1422a;
        ArrayList arrayList = this.c;
        if (z) {
            arrayList.add(hxVar);
            return;
        }
        if (this.f1423b) {
            hxVar.onInitializationSucceeded();
            return;
        }
        this.f1422a = true;
        arrayList.add(hxVar);
        a.d(context, MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        Chartboost.startWithAppId(context, chartboostParams.getAppId(), chartboostParams.getAppSignature(), new gx(this));
    }
}
