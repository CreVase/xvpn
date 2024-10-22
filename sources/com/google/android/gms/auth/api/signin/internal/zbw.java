package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.gm1;
import defpackage.hm1;

/* loaded from: classes.dex */
final class zbw implements hm1 {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // defpackage.hm1
    public final gm1 onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // defpackage.hm1
    public final /* bridge */ /* synthetic */ void onLoadFinished(gm1 gm1Var, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(signInHubActivity));
        this.zba.finish();
    }

    @Override // defpackage.hm1
    public final void onLoaderReset(gm1 gm1Var) {
    }
}
