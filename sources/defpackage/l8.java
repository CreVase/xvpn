package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes2.dex */
public final class l8 extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m8 f3079a;

    public l8(m8 m8Var) {
        this.f3079a = m8Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        m8 m8Var = this.f3079a;
        m8Var.e = null;
        m8Var.a(loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f3079a.b();
    }
}
