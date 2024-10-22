package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class xo2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ yo2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo2(yo2 yo2Var, int i, Context context, c90 c90Var) {
        super(2, c90Var);
        this.f = yo2Var;
        this.g = i;
        this.h = context;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new xo2(this.f, this.g, this.h, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((xo2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        List R0;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        du3 du3Var = null;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            sh0 sh0Var = vl0.c;
            wo2 wo2Var = new wo2(null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, wo2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        List list = (List) obj;
        mz2.f3379a = list;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(a20.C0(list2, 10));
        for (String str : list2) {
            d5 d5Var = gf.f2243a;
            Context context = this.h;
            arrayList.add(new ef(d5.x(context, str), d5.w(context, str), str, false, 0, 56));
        }
        if (arrayList.size() <= 1) {
            R0 = d20.Q0(arrayList);
        } else {
            R0 = d20.R0(arrayList);
            Collections.reverse(R0);
        }
        yo2 yo2Var = this.f;
        ac acVar = yo2Var.f;
        if (acVar != null) {
            acVar.e = R0;
        }
        if (R0.isEmpty()) {
            du3 du3Var2 = yo2Var.e;
            if (du3Var2 != null) {
                du3Var = du3Var2;
            }
            du3Var.requestFocus();
        } else {
            ac acVar2 = yo2Var.f;
            if (acVar2 != null) {
                int N = tf3.N(R0);
                int i2 = this.g;
                if (i2 > N) {
                    i2 = tf3.N(R0);
                }
                acVar2.h = i2;
            }
        }
        ac acVar3 = yo2Var.f;
        if (acVar3 != null) {
            acVar3.f();
        }
        return ch3.f636a;
    }
}
