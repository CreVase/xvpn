package defpackage;

import com.google.protobuf.BoolValue;
import com.google.protobuf.f;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class lq extends k0 implements mq {
    public /* synthetic */ lq(f fVar) {
        this();
    }

    public lq clearValue() {
        copyOnWrite();
        BoolValue.access$200((BoolValue) this.instance);
        return this;
    }

    @Override // defpackage.mq
    public boolean getValue() {
        return ((BoolValue) this.instance).getValue();
    }

    public lq setValue(boolean z) {
        copyOnWrite();
        BoolValue.access$100((BoolValue) this.instance, z);
        return this;
    }

    private lq() {
        super(BoolValue.access$000());
    }
}
