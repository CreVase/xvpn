package defpackage;

import com.google.protobuf.Duration;
import com.google.protobuf.k0;
import com.google.protobuf.z;

/* loaded from: classes2.dex */
public final class oo0 extends k0 implements ro0 {
    public /* synthetic */ oo0(z zVar) {
        this();
    }

    public oo0 clearNanos() {
        copyOnWrite();
        Duration.access$400((Duration) this.instance);
        return this;
    }

    public oo0 clearSeconds() {
        copyOnWrite();
        Duration.access$200((Duration) this.instance);
        return this;
    }

    @Override // defpackage.ro0
    public int getNanos() {
        return ((Duration) this.instance).getNanos();
    }

    @Override // defpackage.ro0
    public long getSeconds() {
        return ((Duration) this.instance).getSeconds();
    }

    public oo0 setNanos(int i) {
        copyOnWrite();
        Duration.access$300((Duration) this.instance, i);
        return this;
    }

    public oo0 setSeconds(long j) {
        copyOnWrite();
        Duration.access$100((Duration) this.instance, j);
        return this;
    }

    private oo0() {
        super(Duration.access$000());
    }
}
