package defpackage;

import com.vungle.ads.internal.VungleInternal;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class li3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3134b;

    public /* synthetic */ li3(Object obj, int i) {
        this.f3133a = i;
        this.f3134b = obj;
    }

    private final void a() {
        i91 i91Var = (i91) this.f3134b;
        Map map = null;
        ((AtomicReference) i91Var.c).set(null);
        synchronized (i91Var) {
            if (((AtomicMarkableReference) i91Var.f2557b).isMarked()) {
                map = ((di1) ((AtomicMarkableReference) i91Var.f2557b).getReference()).a();
                Object obj = i91Var.f2557b;
                ((AtomicMarkableReference) obj).set((di1) ((AtomicMarkableReference) obj).getReference(), false);
            }
        }
        if (map != null) {
            jx0 jx0Var = (jx0) i91Var.d;
            ((iw1) jx0Var.f2845a).e((String) jx0Var.c, map, i91Var.f2556a);
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        String str;
        switch (this.f3133a) {
            case 0:
                jx0 jx0Var = (jx0) this.f3134b;
                synchronized (((AtomicMarkableReference) jx0Var.f)) {
                    try {
                        z = false;
                        if (((AtomicMarkableReference) jx0Var.f).isMarked()) {
                            str = (String) ((AtomicMarkableReference) jx0Var.f).getReference();
                            ((AtomicMarkableReference) jx0Var.f).set(str, false);
                            z = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    ((iw1) jx0Var.f2845a).f((String) jx0Var.c, str);
                }
                return null;
            case 1:
                a();
                return null;
            default:
                return VungleInternal.a((ui1) this.f3134b);
        }
    }
}
