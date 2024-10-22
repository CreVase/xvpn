package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.v;

/* loaded from: classes2.dex */
public final class ts {
    private final byte[] buffer;
    private final v output;

    public /* synthetic */ ts(int i, is isVar) {
        this(i);
    }

    public g build() {
        this.output.checkNoSpaceLeft();
        return new ws(this.buffer);
    }

    public v getCodedOutput() {
        return this.output;
    }

    private ts(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.output = v.newInstance(bArr);
    }
}
