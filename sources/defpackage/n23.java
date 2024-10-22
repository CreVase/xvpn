package defpackage;

import com.google.protobuf.r0;

/* loaded from: classes2.dex */
public final class n23 implements tv1 {
    private final int[] checkInitialized;
    private final yv1 defaultInstance;
    private final pw0[] fields;
    private final boolean messageSetWireFormat;
    private final ga2 syntax;

    public n23(ga2 ga2Var, boolean z, int[] iArr, pw0[] pw0VarArr, Object obj) {
        this.syntax = ga2Var;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = pw0VarArr;
        this.defaultInstance = (yv1) r0.checkNotNull(obj, "defaultInstance");
    }

    public static m23 newBuilder() {
        return new m23();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // defpackage.tv1
    public yv1 getDefaultInstance() {
        return this.defaultInstance;
    }

    public pw0[] getFields() {
        return this.fields;
    }

    @Override // defpackage.tv1
    public ga2 getSyntax() {
        return this.syntax;
    }

    @Override // defpackage.tv1
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static m23 newBuilder(int i) {
        return new m23(i);
    }
}
