package defpackage;

import com.security.xvpn.z35kb.livechat.ChatActivity;

/* loaded from: classes2.dex */
public final class uy extends z33 implements l41 {
    public Object e;
    public tt3 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ String i;
    public final /* synthetic */ ChatActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(ChatActivity chatActivity, String str, c90 c90Var) {
        super(2, c90Var);
        this.i = str;
        this.j = chatActivity;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        uy uyVar = new uy(this.j, this.i, c90Var);
        uyVar.h = obj;
        return uyVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((uy) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4 A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x001e, B:8:0x00c9, B:12:0x00d4, B:21:0x00af), top: B:2:0x000e }] */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
