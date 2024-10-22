package defpackage;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.h1;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class cg3 extends k0 implements dg3 {
    public /* synthetic */ cg3(h1 h1Var) {
        this();
    }

    public cg3 clearValue() {
        copyOnWrite();
        UInt64Value.access$200((UInt64Value) this.instance);
        return this;
    }

    @Override // defpackage.dg3
    public long getValue() {
        return ((UInt64Value) this.instance).getValue();
    }

    public cg3 setValue(long j) {
        copyOnWrite();
        UInt64Value.access$100((UInt64Value) this.instance, j);
        return this;
    }

    private cg3() {
        super(UInt64Value.access$000());
    }
}
