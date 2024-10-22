package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class yb0 implements mv0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5307a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f5308b;
    public final Provider c;
    public final Provider d;

    public /* synthetic */ yb0(Provider provider, s71 s71Var, c02 c02Var, int i) {
        this.f5307a = i;
        this.f5308b = provider;
        this.c = s71Var;
        this.d = c02Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.f5307a;
        Provider provider = this.d;
        Provider provider2 = this.c;
        Provider provider3 = this.f5308b;
        switch (i) {
            case 0:
                return new xb0((Context) provider3.get(), (g10) provider2.get(), (g10) provider.get());
            default:
                return new qn2((Context) provider3.get(), (String) provider2.get(), ((Integer) provider.get()).intValue());
        }
    }
}
