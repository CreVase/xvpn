package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import defpackage.ob2;
import defpackage.p60;
import defpackage.q60;
import defpackage.r60;
import defpackage.s60;
import defpackage.w01;

/* loaded from: classes.dex */
public final class zzl {
    private final zzas zza;
    private final zzx zzb;
    private final zzbq zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private s60 zzh = new s60(new ob2());

    public zzl(zzas zzasVar, zzx zzxVar, zzbq zzbqVar) {
        this.zza = zzasVar;
        this.zzb = zzxVar;
        this.zzc = zzbqVar;
    }

    public final boolean canRequestAds() {
        int zza;
        if (!zzc()) {
            zza = 0;
        } else {
            zza = this.zza.zza();
        }
        if (zza != 1 && zza != 3) {
            return false;
        }
        return true;
    }

    public final int getConsentStatus() {
        if (!zzc()) {
            return 0;
        }
        return this.zza.zza();
    }

    public final r60 getPrivacyOptionsRequirementStatus() {
        if (!zzc()) {
            return r60.UNKNOWN;
        }
        return this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, s60 s60Var, q60 q60Var, p60 p60Var) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = s60Var;
        this.zzb.zzc(activity, s60Var, q60Var, p60Var);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new q60() { // from class: com.google.android.gms.internal.consent_sdk.zzj
                @Override // defpackage.q60
                public final void onConsentInfoUpdateSuccess() {
                    zzl.this.zzb(false);
                }
            }, new p60() { // from class: com.google.android.gms.internal.consent_sdk.zzk
                @Override // defpackage.p60
                public final void onConsentInfoUpdateFailure(w01 w01Var) {
                    zzl.this.zzb(false);
                }
            });
        } else {
            zzc();
            zzd();
        }
    }

    public final void zzb(boolean z) {
        synchronized (this.zze) {
            this.zzg = z;
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzd) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzg;
        }
        return z;
    }
}
