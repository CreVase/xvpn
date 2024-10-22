package defpackage;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.g1;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class ag3 extends k0 implements bg3 {
    public /* synthetic */ ag3(g1 g1Var) {
        this();
    }

    public ag3 clearValue() {
        copyOnWrite();
        UInt32Value.access$200((UInt32Value) this.instance);
        return this;
    }

    @Override // defpackage.bg3
    public int getValue() {
        return ((UInt32Value) this.instance).getValue();
    }

    public ag3 setValue(int i) {
        copyOnWrite();
        UInt32Value.access$100((UInt32Value) this.instance, i);
        return this;
    }

    private ag3() {
        super(UInt32Value.access$000());
    }
}
