package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ec3 implements mv0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1917a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f1918b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;

    public /* synthetic */ ec3(Provider provider, Provider provider2, mv0 mv0Var, Provider provider3, Provider provider4, int i) {
        this.f1917a = i;
        this.f1918b = provider;
        this.c = provider2;
        this.d = mv0Var;
        this.e = provider3;
        this.f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.f1917a;
        Provider provider = this.f;
        Provider provider2 = this.e;
        Provider provider3 = this.d;
        Provider provider4 = this.c;
        Provider provider5 = this.f1918b;
        switch (i) {
            case 0:
                return new dc3((g10) provider5.get(), (g10) provider4.get(), (fn2) provider3.get(), (fi3) provider2.get(), (gs3) provider.get());
            case 1:
                return new ri0((Executor) provider5.get(), (jw1) provider4.get(), (ps3) provider3.get(), (os0) provider2.get(), (j43) provider.get());
            default:
                g10 g10Var = (g10) provider5.get();
                g10 g10Var2 = (g10) provider4.get();
                Object obj = provider3.get();
                return new am2(g10Var, g10Var2, (ql) obj, (qn2) provider2.get(), this.f);
        }
    }
}
