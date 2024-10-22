package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class du2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hu2 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(hu2 hu2Var, String str, String str2, c90 c90Var) {
        super(2, c90Var);
        this.g = hu2Var;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        du2 du2Var = new du2(this.g, this.h, this.i, c90Var);
        du2Var.f = obj;
        return du2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((du2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            sh0 sh0Var = vl0.c;
            cu2 cu2Var = new cu2(this.h, this.i, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, cu2Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        fc2 fc2Var = (fc2) obj;
        hu2 hu2Var = this.g;
        hu2Var.f.i(Boolean.FALSE);
        boolean z = fc2Var.f2076b;
        ch3 ch3Var = ch3.f636a;
        if (z) {
            return ch3Var;
        }
        if (!bw3.b(fc2Var.f2075a, "")) {
            Log.e("TAG", "signIn: " + fc2Var.f2075a);
            if (bw3.a(fc2Var.f2075a, "AccountV5AuthFailed")) {
                hu2Var.g.i(Boolean.TRUE);
            } else {
                boolean a2 = bw3.a(fc2Var.f2075a, "cplc2x6igx");
                ey1 ey1Var = hu2Var.k;
                if (!a2 && !bw3.a(fc2Var.f2075a, "Wrong email or password.")) {
                    if (bw3.a(fc2Var.f2075a, "The password is incorrect.")) {
                        String A = pd0.A(fc2Var.f2075a);
                        yb.f5305b.getClass();
                        yb.a(A);
                        ey1Var.i(A);
                    } else if (tf3.X(fc2Var.f2075a)) {
                        hu2Var.h.i(Boolean.TRUE);
                    } else if (bw3.a(fc2Var.f2075a, "wj76qv8gwh")) {
                        hu2.i(hu2Var);
                    } else {
                        ey1 ey1Var2 = hu2Var.j;
                        String A2 = pd0.A(fc2Var.f2075a);
                        yb.f5305b.getClass();
                        yb.a(A2);
                        ey1Var2.i(A2);
                    }
                } else {
                    ey1Var.i(pd0.A(fc2Var.f2075a.replace("cplc2x6igx", "")));
                }
            }
            return ch3Var;
        }
        hu2.i(hu2Var);
        return ch3Var;
    }
}
