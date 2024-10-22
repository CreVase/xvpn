package defpackage;

import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class py extends z33 implements l41 {
    public int e;
    public final /* synthetic */ tt3 f;
    public final /* synthetic */ ChatActivity g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(tt3 tt3Var, ChatActivity chatActivity, int i, c90 c90Var) {
        super(2, c90Var);
        this.f = tt3Var;
        this.g = chatActivity;
        this.h = i;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new py(this.f, this.g, this.h, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((py) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        int i2 = this.h;
        ChatActivity chatActivity = this.g;
        boolean z = true;
        tt3 tt3Var = this.f;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            tt3Var.h = cz.x;
            chatActivity.m.g(i2);
            sh0 sh0Var = vl0.c;
            oy oyVar = new oy(tt3Var, null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, oyVar);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            tt3Var.h = cz.y;
        } else {
            tt3Var.h = cz.z;
        }
        chatActivity.m.g(i2);
        return ch3.f636a;
    }
}
