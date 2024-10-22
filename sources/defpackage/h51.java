package defpackage;

import com.google.protobuf.m;
import com.google.protobuf.o0;

/* loaded from: classes2.dex */
public final class h51 extends m1 {
    private final o0 defaultInstance;

    public h51(o0 o0Var) {
        this.defaultInstance = o0Var;
    }

    @Override // defpackage.m1, defpackage.s42
    public o0 parsePartialFrom(m mVar, xu0 xu0Var) throws he1 {
        return o0.parsePartialFrom(this.defaultInstance, mVar, xu0Var);
    }

    @Override // defpackage.m1, defpackage.s42
    public o0 parsePartialFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        o0 parsePartialFrom;
        parsePartialFrom = o0.parsePartialFrom(this.defaultInstance, bArr, i, i2, xu0Var);
        return parsePartialFrom;
    }
}
