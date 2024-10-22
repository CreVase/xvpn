package defpackage;

import com.google.protobuf.Mixin;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.y0;

/* loaded from: classes2.dex */
public final class yw1 extends k0 implements zw1 {
    public /* synthetic */ yw1(y0 y0Var) {
        this();
    }

    public yw1 clearName() {
        copyOnWrite();
        Mixin.access$200((Mixin) this.instance);
        return this;
    }

    public yw1 clearRoot() {
        copyOnWrite();
        Mixin.access$500((Mixin) this.instance);
        return this;
    }

    @Override // defpackage.zw1
    public String getName() {
        return ((Mixin) this.instance).getName();
    }

    @Override // defpackage.zw1
    public g getNameBytes() {
        return ((Mixin) this.instance).getNameBytes();
    }

    @Override // defpackage.zw1
    public String getRoot() {
        return ((Mixin) this.instance).getRoot();
    }

    @Override // defpackage.zw1
    public g getRootBytes() {
        return ((Mixin) this.instance).getRootBytes();
    }

    public yw1 setName(String str) {
        copyOnWrite();
        Mixin.access$100((Mixin) this.instance, str);
        return this;
    }

    public yw1 setNameBytes(g gVar) {
        copyOnWrite();
        Mixin.access$300((Mixin) this.instance, gVar);
        return this;
    }

    public yw1 setRoot(String str) {
        copyOnWrite();
        Mixin.access$400((Mixin) this.instance, str);
        return this;
    }

    public yw1 setRootBytes(g gVar) {
        copyOnWrite();
        Mixin.access$600((Mixin) this.instance, gVar);
        return this;
    }

    private yw1() {
        super(Mixin.access$000());
    }
}
