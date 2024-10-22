package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public final class fn extends z33 implements l41 {
    public int e;
    public final /* synthetic */ kn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(kn knVar, c90 c90Var) {
        super(2, c90Var);
        this.f = knVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new fn(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fn) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        kn knVar = this.f;
        try {
            if (i != 0) {
                if (i == 1) {
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                fl.a0(obj);
                this.e = 1;
                if (knVar.h() == ba0Var) {
                    return ba0Var;
                }
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            knVar.a(stringWriter.toString());
        }
        return ch3.f636a;
    }
}
