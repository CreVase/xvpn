package defpackage;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rq2 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ sq2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq2(String str, sq2 sq2Var, c90 c90Var) {
        super(2, c90Var);
        this.f = str;
        this.g = sq2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new rq2(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((rq2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        Group group;
        RecyclerView recyclerView2;
        Group group2;
        RecyclerView recyclerView3;
        gc3 F;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            this.e = 1;
            if (t9.C(300L, this) == ba0Var) {
                return ba0Var;
            }
        }
        ArrayList j0 = tf3.j0(fl.X(this.f));
        sq2 sq2Var = this.g;
        lq2 lq2Var = sq2Var.g;
        lq2 lq2Var2 = null;
        if (lq2Var == null) {
            lq2Var = null;
        }
        if (lq2Var.c() > 1) {
            lq2 lq2Var3 = sq2Var.g;
            if (lq2Var3 == null) {
                lq2Var3 = null;
            }
            for (gc3 gc3Var : lq2Var3.f) {
                if (gc3Var.c && (F = tf3.F(gc3Var, j0)) != null) {
                    F.c = true;
                }
            }
        }
        d21 d21Var = sq2Var.i;
        if (d21Var != null && (recyclerView3 = d21Var.c) != null) {
            recyclerView3.l0();
        }
        lq2 lq2Var4 = sq2Var.g;
        if (lq2Var4 == null) {
            lq2Var4 = null;
        }
        lq2Var4.f = tf3.L(j0);
        lq2 lq2Var5 = sq2Var.g;
        if (lq2Var5 == null) {
            lq2Var5 = null;
        }
        lq2Var5.f();
        lq2 lq2Var6 = sq2Var.g;
        if (lq2Var6 != null) {
            lq2Var2 = lq2Var6;
        }
        List list = lq2Var2.f;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            d21 d21Var2 = sq2Var.i;
            if (d21Var2 != null && (group2 = d21Var2.f1721b) != null) {
                m20.Y0(group2);
            }
            d21 d21Var3 = sq2Var.i;
            if (d21Var3 != null && (recyclerView2 = d21Var3.c) != null) {
                m20.w0(recyclerView2);
            }
        } else {
            d21 d21Var4 = sq2Var.i;
            if (d21Var4 != null && (group = d21Var4.f1721b) != null) {
                m20.w0(group);
            }
            d21 d21Var5 = sq2Var.i;
            if (d21Var5 != null && (recyclerView = d21Var5.c) != null) {
                m20.Y0(recyclerView);
            }
        }
        return ch3.f636a;
    }
}
