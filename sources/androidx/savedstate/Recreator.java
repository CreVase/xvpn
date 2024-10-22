package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import defpackage.bk1;
import defpackage.bn2;
import defpackage.em3;
import defpackage.hx2;
import defpackage.km3;
import defpackage.lm3;
import defpackage.pe0;
import defpackage.tj1;
import defpackage.vj1;
import defpackage.xm2;
import defpackage.zj1;
import defpackage.zm2;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Recreator implements zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final bn2 f287a;

    public Recreator(bn2 bn2Var) {
        this.f287a = bn2Var;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        LinkedHashMap linkedHashMap;
        if (tj1Var == tj1.ON_CREATE) {
            bk1Var.getLifecycle().b(this);
            bn2 bn2Var = this.f287a;
            Bundle a2 = bn2Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(xm2.class);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (bn2Var instanceof lm3) {
                                    km3 viewModelStore = ((lm3) bn2Var).getViewModelStore();
                                    zm2 savedStateRegistry = bn2Var.getSavedStateRegistry();
                                    viewModelStore.getClass();
                                    Iterator it = new HashSet(viewModelStore.f2977a.keySet()).iterator();
                                    while (true) {
                                        boolean hasNext = it.hasNext();
                                        linkedHashMap = viewModelStore.f2977a;
                                        if (!hasNext) {
                                            break;
                                        }
                                        em3 em3Var = (em3) linkedHashMap.get((String) it.next());
                                        vj1 lifecycle = bn2Var.getLifecycle();
                                        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) em3Var.e("androidx.lifecycle.savedstate.vm.tag");
                                        if (savedStateHandleController != null && !savedStateHandleController.c) {
                                            savedStateHandleController.c(lifecycle, savedStateRegistry);
                                            pe0.V(lifecycle, savedStateRegistry);
                                        }
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        savedStateRegistry.d();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(hx2.p("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(hx2.q("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
