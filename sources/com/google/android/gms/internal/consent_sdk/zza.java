package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zza {
    private final Application zza;

    public zza(Application application) {
        this.zza = application;
    }

    public final String zza() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.zza).getId();
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            return null;
        }
    }
}
