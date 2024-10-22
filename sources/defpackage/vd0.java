package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vd0 extends z33 implements l41 {
    public Iterator e;
    public Object f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ List i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd0(List list, List list2, c90 c90Var) {
        super(2, c90Var);
        this.i = list;
        this.j = list2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        vd0 vd0Var = new vd0(this.i, this.j, c90Var);
        vd0Var.h = obj;
        return vd0Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((vd0) create(obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        ba0 ba0Var = ba0.f430a;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    it = this.e;
                    list = (List) this.h;
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f;
                Iterator it2 = this.e;
                List list2 = (List) this.h;
                fl.a0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new ud0(null));
                    this.h = list2;
                    this.e = it2;
                    this.f = null;
                    this.g = 2;
                    throw null;
                }
            }
        } else {
            fl.a0(obj);
            obj = this.h;
            it = this.i.iterator();
            list = this.j;
        }
        if (!it.hasNext()) {
            return obj;
        }
        p71.C(it.next());
        this.h = list;
        this.e = it;
        this.f = obj;
        this.g = 1;
        throw null;
    }
}
