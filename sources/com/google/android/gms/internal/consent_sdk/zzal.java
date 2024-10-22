package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal {
    private Application zza;

    private zzal() {
    }

    public /* synthetic */ zzal(zzak zzakVar) {
    }

    public final zzc zza() {
        zzdq.zzb(this.zza, Application.class);
        return new zzaj(this.zza, null);
    }

    public final zzal zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
