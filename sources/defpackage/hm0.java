package defpackage;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.k0;
import com.google.protobuf.y;

/* loaded from: classes2.dex */
public final class hm0 extends k0 implements im0 {
    public /* synthetic */ hm0(y yVar) {
        this();
    }

    public hm0 clearValue() {
        copyOnWrite();
        DoubleValue.access$200((DoubleValue) this.instance);
        return this;
    }

    @Override // defpackage.im0
    public double getValue() {
        return ((DoubleValue) this.instance).getValue();
    }

    public hm0 setValue(double d) {
        copyOnWrite();
        DoubleValue.access$100((DoubleValue) this.instance, d);
        return this;
    }

    private hm0() {
        super(DoubleValue.access$000());
    }
}
