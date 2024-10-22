package com.google.android.gms.internal.consent_sdk;

import defpackage.ji3;
import defpackage.ki3;
import defpackage.o60;
import defpackage.w01;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbd implements ki3, ji3 {
    private final ki3 zza;
    private final ji3 zzb;

    public /* synthetic */ zzbd(ki3 ki3Var, ji3 ji3Var, zzbc zzbcVar) {
        this.zza = ki3Var;
        this.zzb = ji3Var;
    }

    @Override // defpackage.ji3
    public final void onConsentFormLoadFailure(w01 w01Var) {
        this.zzb.onConsentFormLoadFailure(w01Var);
    }

    @Override // defpackage.ki3
    public final void onConsentFormLoadSuccess(o60 o60Var) {
        this.zza.onConsentFormLoadSuccess(o60Var);
    }
}
