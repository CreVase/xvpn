package defpackage;

/* loaded from: classes2.dex */
public final class me3 extends z33 implements l41 {
    public boolean e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pe3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(pe3 pe3Var, c90 c90Var) {
        super(2, c90Var);
        this.h = pe3Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        me3 me3Var = new me3(this.h, c90Var);
        me3Var.g = obj;
        return me3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((me3) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
