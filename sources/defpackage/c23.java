package defpackage;

import com.google.protobuf.StringValue;
import com.google.protobuf.b1;
import com.google.protobuf.g;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class c23 extends k0 implements d23 {
    public /* synthetic */ c23(b1 b1Var) {
        this();
    }

    public c23 clearValue() {
        copyOnWrite();
        StringValue.access$200((StringValue) this.instance);
        return this;
    }

    @Override // defpackage.d23
    public String getValue() {
        return ((StringValue) this.instance).getValue();
    }

    @Override // defpackage.d23
    public g getValueBytes() {
        return ((StringValue) this.instance).getValueBytes();
    }

    public c23 setValue(String str) {
        copyOnWrite();
        StringValue.access$100((StringValue) this.instance, str);
        return this;
    }

    public c23 setValueBytes(g gVar) {
        copyOnWrite();
        StringValue.access$300((StringValue) this.instance, gVar);
        return this;
    }

    private c23() {
        super(StringValue.access$000());
    }
}
