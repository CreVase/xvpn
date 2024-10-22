package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import defpackage.ji3;
import defpackage.ki3;
import defpackage.n60;
import defpackage.o60;
import defpackage.r60;
import defpackage.w01;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbq {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbq(zzdr zzdrVar, Executor executor) {
        this.zza = zzdrVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzbe zzbeVar) {
        final AtomicReference atomicReference = this.zzd;
        zzbeVar.zzb(new ki3() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // defpackage.ki3
            public final void onConsentFormLoadSuccess(o60 o60Var) {
                atomicReference.set(o60Var);
            }
        }, new ji3() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
            @Override // defpackage.ji3
            public final void onConsentFormLoadFailure(w01 w01Var) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(w01Var.f4923b)));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzb(ki3 ki3Var, ji3 ji3Var) {
        zzct.zza();
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            ji3Var.onConsentFormLoadFailure(new zzi(3, "No available form can be built.").zza());
            return;
        }
        ?? zzb = this.zza.zzb();
        zzb.zza(zzbsVar);
        zzb.zzb().zza().zzb(ki3Var, ji3Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.consent_sdk.zzay, java.lang.Object] */
    public final void zzc() {
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ?? zzb = this.zza.zzb();
        zzb.zza(zzbsVar);
        final zzbe zza = zzb.zzb().zza();
        zza.zza = true;
        zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                zzbq.this.zza(zza);
            }
        });
    }

    public final void zzd(zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(Activity activity, final n60 n60Var) {
        zzct.zza();
        zzl zzb = zzc.zza(activity).zzb();
        if (zzb == null) {
            zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    n60.this.a(new zzi(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        boolean isConsentFormAvailable = zzb.isConsentFormAvailable();
        r60 r60Var = r60.NOT_REQUIRED;
        if (!isConsentFormAvailable && zzb.getPrivacyOptionsRequirementStatus() != r60Var) {
            zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                @Override // java.lang.Runnable
                public final void run() {
                    n60.this.a(new zzi(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == r60Var) {
                zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        n60.this.a(new zzi(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            o60 o60Var = (o60) this.zzd.get();
            if (o60Var == null) {
                zzct.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
                    @Override // java.lang.Runnable
                    public final void run() {
                        n60.this.a(new zzi(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                o60Var.show(activity, n60Var);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbq.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        if (this.zzc.get() != null) {
            return true;
        }
        return false;
    }
}
