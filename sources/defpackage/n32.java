package defpackage;

import com.google.protobuf.Any;
import com.google.protobuf.Option;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class n32 extends k0 implements o32 {
    public /* synthetic */ n32(z0 z0Var) {
        this();
    }

    public n32 clearName() {
        copyOnWrite();
        ((Option) this.instance).clearName();
        return this;
    }

    public n32 clearValue() {
        copyOnWrite();
        ((Option) this.instance).clearValue();
        return this;
    }

    @Override // defpackage.o32
    public String getName() {
        return ((Option) this.instance).getName();
    }

    @Override // defpackage.o32
    public g getNameBytes() {
        return ((Option) this.instance).getNameBytes();
    }

    @Override // defpackage.o32
    public Any getValue() {
        return ((Option) this.instance).getValue();
    }

    @Override // defpackage.o32
    public boolean hasValue() {
        return ((Option) this.instance).hasValue();
    }

    public n32 mergeValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).mergeValue(any);
        return this;
    }

    public n32 setName(String str) {
        copyOnWrite();
        ((Option) this.instance).setName(str);
        return this;
    }

    public n32 setNameBytes(g gVar) {
        copyOnWrite();
        ((Option) this.instance).setNameBytes(gVar);
        return this;
    }

    public n32 setValue(Any any) {
        copyOnWrite();
        ((Option) this.instance).setValue(any);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private n32() {
        /*
            r1 = this;
            com.google.protobuf.Option r0 = com.google.protobuf.Option.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n32.<init>():void");
    }

    public n32 setValue(tb tbVar) {
        copyOnWrite();
        ((Option) this.instance).setValue((Any) tbVar.build());
        return this;
    }
}
