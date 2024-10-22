package defpackage;

import com.google.protobuf.BytesValue;
import com.google.protobuf.g;
import com.google.protobuf.h;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class bt extends k0 implements ct {
    public /* synthetic */ bt(h hVar) {
        this();
    }

    public bt clearValue() {
        copyOnWrite();
        BytesValue.access$200((BytesValue) this.instance);
        return this;
    }

    @Override // defpackage.ct
    public g getValue() {
        return ((BytesValue) this.instance).getValue();
    }

    public bt setValue(g gVar) {
        copyOnWrite();
        BytesValue.access$100((BytesValue) this.instance, gVar);
        return this;
    }

    private bt() {
        super(BytesValue.access$000());
    }
}
