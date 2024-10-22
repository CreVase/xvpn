package defpackage;

/* loaded from: classes2.dex */
public final class zt2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hu2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(hu2 hu2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = hu2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        zt2 zt2Var = new zt2(this.g, c90Var);
        zt2Var.f = obj;
        return zt2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((zt2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0041 -> B:5:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
