package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import defpackage.m20;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1007b = "n0";
    public q9 c = q9.TRACKING_UNKNOWN;
    public String d;

    public n0(Context context) {
        this.f1006a = context;
    }

    public final void a() {
        if (a(this.f1006a)) {
            this.c = q9.TRACKING_LIMITED;
            this.d = null;
            return;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f1006a);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                this.c = q9.TRACKING_LIMITED;
                this.d = null;
            } else {
                this.c = q9.TRACKING_ENABLED;
                String id = advertisingIdInfo.getId();
                this.d = id;
                if (m20.L("00000000-0000-0000-0000-000000000000", id)) {
                    this.c = q9.TRACKING_LIMITED;
                    this.d = null;
                }
            }
        } catch (GooglePlayServicesNotAvailableException e) {
            f6.b(this.f1007b, "Google play service is not available. " + e);
        } catch (GooglePlayServicesRepairableException e2) {
            f6.b(this.f1007b, "There was a recoverable error connecting to Google Play Services. " + e2);
        } catch (IOException e3) {
            f6.b(this.f1007b, "The connection to Google Play Services failed. " + e3);
        } catch (IllegalStateException e4) {
            f6.b(this.f1007b, "This should have been called off the main thread. " + e4);
        }
    }

    public final String b() {
        return this.d;
    }

    public final q9 c() {
        return this.c;
    }

    public final boolean a(Context context) {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(context, COPPA.COPPA_STANDARD);
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e) {
            Log.e(this.f1007b, "isChildDirected error: " + e);
            return false;
        }
    }
}
