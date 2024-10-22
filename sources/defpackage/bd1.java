package defpackage;

import com.google.protobuf.Int64Value;
import com.google.protobuf.k0;
import com.google.protobuf.q0;

/* loaded from: classes2.dex */
public final class bd1 extends k0 implements cd1 {
    public /* synthetic */ bd1(q0 q0Var) {
        this();
    }

    public bd1 clearValue() {
        copyOnWrite();
        Int64Value.access$200((Int64Value) this.instance);
        return this;
    }

    @Override // defpackage.cd1
    public long getValue() {
        return ((Int64Value) this.instance).getValue();
    }

    public bd1 setValue(long j) {
        copyOnWrite();
        Int64Value.access$100((Int64Value) this.instance, j);
        return this;
    }

    private bd1() {
        super(Int64Value.access$000());
    }
}
