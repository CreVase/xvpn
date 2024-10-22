package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public final class hn extends z33 implements l41 {
    public int e;
    public final /* synthetic */ kn f;
    public final /* synthetic */ y82 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(kn knVar, y82 y82Var, c90 c90Var) {
        super(2, c90Var);
        this.f = knVar;
        this.g = y82Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new hn(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((hn) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        y82 y82Var = this.g;
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
                if (knVar.g(y82Var) == ba0Var) {
                    return ba0Var;
                }
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            knVar.c(y82Var, stringWriter.toString());
        }
        return ch3.f636a;
    }
}
