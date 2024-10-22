package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class cn2 implements im3 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f670a;

    /* renamed from: b, reason: collision with root package name */
    public final hm3 f671b;
    public final Bundle c;
    public final vj1 d;
    public final zm2 e;

    public cn2(Application application, bn2 bn2Var, Bundle bundle) {
        hm3 hm3Var;
        this.e = bn2Var.getSavedStateRegistry();
        this.d = bn2Var.getLifecycle();
        this.c = bundle;
        this.f670a = application;
        if (application != null) {
            if (hm3.c == null) {
                hm3.c = new hm3(application);
            }
            hm3Var = hm3.c;
        } else {
            hm3Var = new hm3(null);
        }
        this.f671b = hm3Var;
    }

    @Override // defpackage.im3
    public final em3 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.im3
    public final em3 b(Class cls, dy1 dy1Var) {
        Constructor a2;
        String str = (String) dy1Var.a(v73.c);
        if (str != null) {
            if (dy1Var.a(pe0.n) != null && dy1Var.a(pe0.o) != null) {
                Application application = (Application) dy1Var.a(v73.f4791b);
                boolean isAssignableFrom = eb.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a2 = dn2.a(cls, dn2.f1811a);
                } else {
                    a2 = dn2.a(cls, dn2.f1812b);
                }
                if (a2 == null) {
                    return this.f671b.b(cls, dy1Var);
                }
                if (isAssignableFrom && application != null) {
                    return dn2.b(cls, a2, application, pe0.m(dy1Var));
                }
                return dn2.b(cls, a2, pe0.m(dy1Var));
            }
            if (this.d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final em3 c(Class cls, String str) {
        Constructor a2;
        em3 b2;
        vj1 vj1Var = this.d;
        if (vj1Var != null) {
            boolean isAssignableFrom = eb.class.isAssignableFrom(cls);
            Application application = this.f670a;
            if (isAssignableFrom && application != null) {
                a2 = dn2.a(cls, dn2.f1811a);
            } else {
                a2 = dn2.a(cls, dn2.f1812b);
            }
            if (a2 == null) {
                if (application != null) {
                    return this.f671b.a(cls);
                }
                if (jm3.f2794a == null) {
                    jm3.f2794a = new jm3();
                }
                return jm3.f2794a.a(cls);
            }
            zm2 zm2Var = this.e;
            Bundle a3 = zm2Var.a(str);
            Class[] clsArr = tm2.f;
            tm2 k = s71.k(a3, this.c);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, k);
            savedStateHandleController.c(vj1Var, zm2Var);
            uj1 uj1Var = ((ck1) vj1Var).d;
            if (uj1Var != uj1.INITIALIZED && !uj1Var.a(uj1.STARTED)) {
                vj1Var.a(new LegacySavedStateHandleController$tryToAddRecreator$1(vj1Var, zm2Var));
            } else {
                zm2Var.d();
            }
            if (isAssignableFrom && application != null) {
                b2 = dn2.b(cls, a2, application, k);
            } else {
                b2 = dn2.b(cls, a2, k);
            }
            b2.g(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
            return b2;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
