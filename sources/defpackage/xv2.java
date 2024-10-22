package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class xv2 extends d90 {
    public yv2 e;
    public File f;
    public FileOutputStream g;
    public FileOutputStream h;
    public /* synthetic */ Object i;
    public final /* synthetic */ yv2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(yv2 yv2Var, c90 c90Var) {
        super(c90Var);
        this.j = yv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(null, this);
    }
}
