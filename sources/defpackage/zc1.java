package defpackage;

import com.google.protobuf.Int32Value;
import com.google.protobuf.k0;
import com.google.protobuf.p0;

/* loaded from: classes2.dex */
public final class zc1 extends k0 implements ad1 {
    public /* synthetic */ zc1(p0 p0Var) {
        this();
    }

    public zc1 clearValue() {
        copyOnWrite();
        Int32Value.access$200((Int32Value) this.instance);
        return this;
    }

    @Override // defpackage.ad1
    public int getValue() {
        return ((Int32Value) this.instance).getValue();
    }

    public zc1 setValue(int i) {
        copyOnWrite();
        Int32Value.access$100((Int32Value) this.instance, i);
        return this;
    }

    private zc1() {
        super(Int32Value.access$000());
    }
}
