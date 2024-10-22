package defpackage;

import com.google.protobuf.FieldMask;
import com.google.protobuf.g;
import com.google.protobuf.g0;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class qw0 extends k0 implements rw0 {
    public /* synthetic */ qw0(g0 g0Var) {
        this();
    }

    public qw0 addAllPaths(Iterable<String> iterable) {
        copyOnWrite();
        FieldMask.access$300((FieldMask) this.instance, iterable);
        return this;
    }

    public qw0 addPaths(String str) {
        copyOnWrite();
        FieldMask.access$200((FieldMask) this.instance, str);
        return this;
    }

    public qw0 addPathsBytes(g gVar) {
        copyOnWrite();
        FieldMask.access$500((FieldMask) this.instance, gVar);
        return this;
    }

    public qw0 clearPaths() {
        copyOnWrite();
        FieldMask.access$400((FieldMask) this.instance);
        return this;
    }

    @Override // defpackage.rw0
    public String getPaths(int i) {
        return ((FieldMask) this.instance).getPaths(i);
    }

    @Override // defpackage.rw0
    public g getPathsBytes(int i) {
        return ((FieldMask) this.instance).getPathsBytes(i);
    }

    @Override // defpackage.rw0
    public int getPathsCount() {
        return ((FieldMask) this.instance).getPathsCount();
    }

    @Override // defpackage.rw0
    public List<String> getPathsList() {
        return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
    }

    public qw0 setPaths(int i, String str) {
        copyOnWrite();
        FieldMask.access$100((FieldMask) this.instance, i, str);
        return this;
    }

    private qw0() {
        super(FieldMask.access$000());
    }
}
