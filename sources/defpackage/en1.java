package defpackage;

import a.bx;
import a.du;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class en1 extends z33 implements l41 {
    public final /* synthetic */ in1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en1(in1 in1Var, c90 c90Var) {
        super(2, c90Var);
        this.e = in1Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new en1(this.e, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        en1 en1Var = (en1) create((aa0) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        en1Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        qb2 I = ew3.I();
        in1 in1Var = this.e;
        in1Var.g.clear();
        ArrayList arrayList = in1Var.h;
        arrayList.clear();
        ArrayList arrayList2 = in1Var.i;
        arrayList2.clear();
        ArrayList arrayList3 = in1Var.j;
        arrayList3.clear();
        in1Var.g.addAll(tf3.j0(fl.W(I.d, false)));
        arrayList.addAll(tf3.j0(fl.W(I.f3978a, true)));
        arrayList2.addAll(tf3.j0(fl.W(I.e, true)));
        arrayList3.addAll(tf3.j0(fl.W(I.f, false)));
        bx bxVar = new bx();
        du.d(194, bxVar);
        boolean q = bxVar.q();
        bxVar.h();
        if (!q) {
            in1Var.G(2, false);
        } else {
            in1Var.G(1, false);
        }
        return ch3.f636a;
    }
}
