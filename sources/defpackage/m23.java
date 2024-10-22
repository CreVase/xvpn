package defpackage;

import com.google.protobuf.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m23 {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<pw0> fields;
    private boolean messageSetWireFormat;
    private ga2 syntax;
    private boolean wasBuilt;

    public m23() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public n23 build() {
        if (!this.wasBuilt) {
            if (this.syntax != null) {
                this.wasBuilt = true;
                Collections.sort(this.fields);
                return new n23(this.syntax, this.messageSetWireFormat, this.checkInitialized, (pw0[]) this.fields.toArray(new pw0[0]), this.defaultInstance);
            }
            throw new IllegalStateException("Must specify a proto syntax");
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(pw0 pw0Var) {
        if (!this.wasBuilt) {
            this.fields.add(pw0Var);
            return;
        }
        throw new IllegalStateException("Builder can only build once");
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ga2 ga2Var) {
        this.syntax = (ga2) r0.checkNotNull(ga2Var, "syntax");
    }

    public m23(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
