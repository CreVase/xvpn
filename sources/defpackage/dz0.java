package defpackage;

import com.google.protobuf.FloatValue;
import com.google.protobuf.h0;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class dz0 extends k0 implements ez0 {
    public /* synthetic */ dz0(h0 h0Var) {
        this();
    }

    public dz0 clearValue() {
        copyOnWrite();
        FloatValue.access$200((FloatValue) this.instance);
        return this;
    }

    @Override // defpackage.ez0
    public float getValue() {
        return ((FloatValue) this.instance).getValue();
    }

    public dz0 setValue(float f) {
        copyOnWrite();
        FloatValue.access$100((FloatValue) this.instance, f);
        return this;
    }

    private dz0() {
        super(FloatValue.access$000());
    }
}
