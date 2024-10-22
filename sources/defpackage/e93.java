package defpackage;

import com.google.protobuf.Timestamp;
import com.google.protobuf.e1;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class e93 extends k0 implements g93 {
    public /* synthetic */ e93(e1 e1Var) {
        this();
    }

    public e93 clearNanos() {
        copyOnWrite();
        Timestamp.access$400((Timestamp) this.instance);
        return this;
    }

    public e93 clearSeconds() {
        copyOnWrite();
        Timestamp.access$200((Timestamp) this.instance);
        return this;
    }

    @Override // defpackage.g93
    public int getNanos() {
        return ((Timestamp) this.instance).getNanos();
    }

    @Override // defpackage.g93
    public long getSeconds() {
        return ((Timestamp) this.instance).getSeconds();
    }

    public e93 setNanos(int i) {
        copyOnWrite();
        Timestamp.access$300((Timestamp) this.instance, i);
        return this;
    }

    public e93 setSeconds(long j) {
        copyOnWrite();
        Timestamp.access$100((Timestamp) this.instance, j);
        return this;
    }

    private e93() {
        super(Timestamp.access$000());
    }
}
