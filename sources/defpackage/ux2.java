package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ux2 {

    /* renamed from: a, reason: collision with root package name */
    public tx2 f4753a;

    /* renamed from: b, reason: collision with root package name */
    public sx2 f4754b;
    public final Fragment c;
    public final ArrayList d = new ArrayList();
    public final LinkedHashSet e = new LinkedHashSet();
    public boolean f;
    public boolean g;

    public ux2(tx2 tx2Var, sx2 sx2Var, Fragment fragment, xu xuVar) {
        this.f4753a = tx2Var;
        this.f4754b = sx2Var;
        this.c = fragment;
        xuVar.a(new z5(this, 2));
    }

    public final void a() {
        LinkedHashSet<xu> linkedHashSet;
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        LinkedHashSet linkedHashSet2 = this.e;
        if (linkedHashSet2 instanceof Collection) {
            linkedHashSet = new LinkedHashSet(linkedHashSet2);
        } else {
            linkedHashSet = new LinkedHashSet();
            d20.P0(linkedHashSet2, linkedHashSet);
        }
        for (xu xuVar : linkedHashSet) {
            synchronized (xuVar) {
                if (!xuVar.f5222a) {
                    xuVar.f5222a = true;
                    xuVar.c = true;
                    wu wuVar = xuVar.f5223b;
                    if (wuVar != null) {
                        try {
                            wuVar.b();
                        } catch (Throwable th) {
                            synchronized (xuVar) {
                                xuVar.c = false;
                                xuVar.notifyAll();
                                throw th;
                            }
                        }
                    }
                    synchronized (xuVar) {
                        xuVar.c = false;
                        xuVar.notifyAll();
                    }
                }
            }
        }
    }

    public abstract void b();

    public final void c(tx2 tx2Var, sx2 sx2Var) {
        int ordinal = sx2Var.ordinal();
        tx2 tx2Var2 = tx2.REMOVED;
        Fragment fragment = this.c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (p.I(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f4753a);
                        Objects.toString(this.f4754b);
                    }
                    this.f4753a = tx2Var2;
                    this.f4754b = sx2.REMOVING;
                    return;
                }
                return;
            }
            if (this.f4753a == tx2Var2) {
                if (p.I(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f4754b);
                }
                this.f4753a = tx2.VISIBLE;
                this.f4754b = sx2.ADDING;
                return;
            }
            return;
        }
        if (this.f4753a != tx2Var2) {
            if (p.I(2)) {
                Objects.toString(fragment);
                Objects.toString(this.f4753a);
                tx2Var.toString();
            }
            this.f4753a = tx2Var;
        }
    }

    public abstract void d();

    public final String toString() {
        StringBuilder u = hx2.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        u.append(this.f4753a);
        u.append(" lifecycleImpact = ");
        u.append(this.f4754b);
        u.append(" fragment = ");
        u.append(this.c);
        u.append('}');
        return u.toString();
    }
}
