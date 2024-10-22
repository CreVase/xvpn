package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class dm3 extends ok2 implements l41 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm3(View view, c90 c90Var) {
        super(2, c90Var);
        this.h = view;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        dm3 dm3Var = new dm3(this.h, c90Var);
        dm3Var.g = obj;
        return dm3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((dm3) create((gp2) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.f;
        View view = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                gp2 gp2Var = (gp2) this.g;
                fl.a0(obj);
                if (view instanceof ViewGroup) {
                    yl3 yl3Var = new yl3(new zl3((ViewGroup) view, null), 2);
                    this.g = null;
                    this.f = 2;
                    if (gp2Var.c(yl3Var, this) == ba0Var) {
                        return ba0Var;
                    }
                }
            }
            return ch3.f636a;
        }
        fl.a0(obj);
        gp2 gp2Var2 = (gp2) this.g;
        this.g = gp2Var2;
        this.f = 1;
        gp2Var2.f2299b = view;
        gp2Var2.f2298a = 3;
        gp2Var2.d = this;
        return ba0Var;
    }
}
