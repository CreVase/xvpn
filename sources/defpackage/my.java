package defpackage;

import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class my extends z33 implements l41 {
    public int e;
    public final /* synthetic */ ChatActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(ChatActivity chatActivity, c90 c90Var) {
        super(2, c90Var);
        this.f = chatActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new my(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((my) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            ly lyVar = new ly(null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, lyVar);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        this.f.o.j((wt3) obj);
        return ch3.f636a;
    }
}
