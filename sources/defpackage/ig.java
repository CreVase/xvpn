package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class ig extends z10 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2584b;
    public final eg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(uh1 uh1Var, int i) {
        super(uh1Var);
        this.f2584b = i;
        if (i != 1) {
            if (i != 2) {
                this.c = new eg(uh1Var.getDescriptor(), 1);
                return;
            } else {
                super(uh1Var);
                this.c = new eg(uh1Var.getDescriptor(), 3);
                return;
            }
        }
        super(uh1Var);
        this.c = new eg(uh1Var.getDescriptor(), 2);
    }

    @Override // defpackage.u
    public final Object a() {
        switch (this.f2584b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        switch (this.f2584b) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        switch (this.f2584b) {
            case 0:
                return new ArrayList((Collection) null);
            case 1:
                return new HashSet((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        switch (this.f2584b) {
            case 0:
                return (ArrayList) obj;
            case 1:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.y10
    public final void i(int i, Object obj, Object obj2) {
        switch (this.f2584b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                return;
            case 1:
                ((HashSet) obj).add(obj2);
                return;
            default:
                ((LinkedHashSet) obj).add(obj2);
                return;
        }
    }
}
