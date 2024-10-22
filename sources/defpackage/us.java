package defpackage;

import com.google.protobuf.g;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class us extends g {
    public abstract boolean equalsRange(g gVar, int i, int i2);

    @Override // com.google.protobuf.g
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.g
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.g, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.protobuf.g
    public void writeToReverse(fs fsVar) throws IOException {
        writeTo(fsVar);
    }
}
