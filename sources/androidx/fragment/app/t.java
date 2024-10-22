package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.an2;
import defpackage.bc0;
import defpackage.bn2;
import defpackage.ck1;
import defpackage.cn2;
import defpackage.dy1;
import defpackage.im3;
import defpackage.k71;
import defpackage.km3;
import defpackage.lm3;
import defpackage.nw3;
import defpackage.pe0;
import defpackage.tj1;
import defpackage.v73;
import defpackage.vj1;
import defpackage.zm2;

/* loaded from: classes.dex */
public final class t implements k71, bn2, lm3 {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f243a;

    /* renamed from: b, reason: collision with root package name */
    public final km3 f244b;
    public final Runnable c;
    public im3 d;
    public ck1 e = null;
    public an2 f = null;

    public t(Fragment fragment, km3 km3Var, nw3 nw3Var) {
        this.f243a = fragment;
        this.f244b = km3Var;
        this.c = nw3Var;
    }

    public final void a(tj1 tj1Var) {
        this.e.e(tj1Var);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new ck1(this);
            an2 an2Var = new an2(this);
            this.f = an2Var;
            an2Var.a();
            this.c.run();
        }
    }

    @Override // defpackage.k71
    public final bc0 getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f243a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        dy1 dy1Var = new dy1();
        if (application != null) {
            dy1Var.b(v73.f4791b, application);
        }
        dy1Var.b(pe0.n, fragment);
        dy1Var.b(pe0.o, this);
        if (fragment.getArguments() != null) {
            dy1Var.b(pe0.p, fragment.getArguments());
        }
        return dy1Var;
    }

    @Override // defpackage.k71
    public final im3 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f243a;
        im3 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.d = new cn2(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    @Override // defpackage.bk1
    public final vj1 getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.bn2
    public final zm2 getSavedStateRegistry() {
        b();
        return this.f.f117b;
    }

    @Override // defpackage.lm3
    public final km3 getViewModelStore() {
        b();
        return this.f244b;
    }
}
