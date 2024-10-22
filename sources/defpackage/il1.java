package defpackage;

import com.google.protobuf.ListValue;
import com.google.protobuf.Value;
import com.google.protobuf.k0;
import com.google.protobuf.s0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class il1 extends k0 implements jl1 {
    public /* synthetic */ il1(s0 s0Var) {
        this();
    }

    public il1 addAllValues(Iterable<? extends Value> iterable) {
        copyOnWrite();
        ((ListValue) this.instance).addAllValues(iterable);
        return this;
    }

    public il1 addValues(Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(value);
        return this;
    }

    public il1 clearValues() {
        copyOnWrite();
        ((ListValue) this.instance).clearValues();
        return this;
    }

    @Override // defpackage.jl1
    public Value getValues(int i) {
        return ((ListValue) this.instance).getValues(i);
    }

    @Override // defpackage.jl1
    public int getValuesCount() {
        return ((ListValue) this.instance).getValuesCount();
    }

    @Override // defpackage.jl1
    public List<Value> getValuesList() {
        return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
    }

    public il1 removeValues(int i) {
        copyOnWrite();
        ((ListValue) this.instance).removeValues(i);
        return this;
    }

    public il1 setValues(int i, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i, value);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private il1() {
        /*
            r1 = this;
            com.google.protobuf.ListValue r0 = com.google.protobuf.ListValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il1.<init>():void");
    }

    public il1 addValues(int i, Value value) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i, value);
        return this;
    }

    public il1 setValues(int i, dj3 dj3Var) {
        copyOnWrite();
        ((ListValue) this.instance).setValues(i, (Value) dj3Var.build());
        return this;
    }

    public il1 addValues(dj3 dj3Var) {
        copyOnWrite();
        ((ListValue) this.instance).addValues((Value) dj3Var.build());
        return this;
    }

    public il1 addValues(int i, dj3 dj3Var) {
        copyOnWrite();
        ((ListValue) this.instance).addValues(i, (Value) dj3Var.build());
        return this;
    }
}
