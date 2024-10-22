package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* loaded from: classes.dex */
public final class an2 {

    /* renamed from: a, reason: collision with root package name */
    public final bn2 f116a;

    /* renamed from: b, reason: collision with root package name */
    public final zm2 f117b = new zm2();
    public boolean c;

    public an2(bn2 bn2Var) {
        this.f116a = bn2Var;
    }

    public final void a() {
        boolean z;
        bn2 bn2Var = this.f116a;
        vj1 lifecycle = bn2Var.getLifecycle();
        if (((ck1) lifecycle).d == uj1.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.a(new Recreator(bn2Var));
            final zm2 zm2Var = this.f117b;
            if (!zm2Var.f5513b) {
                lifecycle.a(new zj1() { // from class: wm2
                    @Override // defpackage.zj1
                    public final void e(bk1 bk1Var, tj1 tj1Var) {
                        tj1 tj1Var2 = tj1.ON_START;
                        zm2 zm2Var2 = zm2.this;
                        if (tj1Var == tj1Var2) {
                            zm2Var2.f = true;
                        } else if (tj1Var == tj1.ON_STOP) {
                            zm2Var2.f = false;
                        }
                    }
                });
                zm2Var.f5513b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.c) {
            a();
        }
        ck1 ck1Var = (ck1) this.f116a.getLifecycle();
        if (!ck1Var.d.a(uj1.STARTED)) {
            zm2 zm2Var = this.f117b;
            if (zm2Var.f5513b) {
                if (!zm2Var.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    zm2Var.c = bundle2;
                    zm2Var.d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + ck1Var.d).toString());
    }

    public final void c(Bundle bundle) {
        zm2 zm2Var = this.f117b;
        zm2Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = zm2Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        jm2 jm2Var = zm2Var.f5512a;
        jm2Var.getClass();
        gm2 gm2Var = new gm2(jm2Var);
        jm2Var.c.put(gm2Var, Boolean.FALSE);
        while (gm2Var.hasNext()) {
            Map.Entry entry = (Map.Entry) gm2Var.next();
            bundle2.putBundle((String) entry.getKey(), ((ym2) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
