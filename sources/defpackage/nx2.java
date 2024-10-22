package defpackage;

import com.google.protobuf.SourceContext;
import com.google.protobuf.a1;
import com.google.protobuf.g;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class nx2 extends k0 implements ox2 {
    public /* synthetic */ nx2(a1 a1Var) {
        this();
    }

    public nx2 clearFileName() {
        copyOnWrite();
        ((SourceContext) this.instance).clearFileName();
        return this;
    }

    @Override // defpackage.ox2
    public String getFileName() {
        return ((SourceContext) this.instance).getFileName();
    }

    @Override // defpackage.ox2
    public g getFileNameBytes() {
        return ((SourceContext) this.instance).getFileNameBytes();
    }

    public nx2 setFileName(String str) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileName(str);
        return this;
    }

    public nx2 setFileNameBytes(g gVar) {
        copyOnWrite();
        ((SourceContext) this.instance).setFileNameBytes(gVar);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private nx2() {
        /*
            r1 = this;
            com.google.protobuf.SourceContext r0 = com.google.protobuf.SourceContext.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx2.<init>():void");
    }
}
