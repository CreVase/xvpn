package defpackage;

import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class wy extends z33 implements l41 {
    public /* synthetic */ Object e;
    public final /* synthetic */ ChatActivity f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(ChatActivity chatActivity, String str, c90 c90Var) {
        super(2, c90Var);
        this.f = chatActivity;
        this.g = str;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        wy wyVar = new wy(this.f, this.g, c90Var);
        wyVar.e = obj;
        return wyVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((wy) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        aa0 aa0Var = (aa0) this.e;
        tt3 tt3Var = new tt3();
        tt3Var.c = this.g;
        tt3Var.d = "Text";
        tt3Var.m = tf3.j();
        tt3Var.h = cz.x;
        ChatActivity chatActivity = this.f;
        chatActivity.Z().k.setText("");
        boolean b0 = ChatActivity.b0(chatActivity, tt3Var);
        ch3 ch3Var = ch3.f636a;
        if (b0) {
            return ch3Var;
        }
        zf3.d(aa0Var, vl0.c, new vy(tt3Var, null), 2);
        return ch3Var;
    }
}
