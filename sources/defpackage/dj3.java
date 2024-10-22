package defpackage;

import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.p1;

/* loaded from: classes2.dex */
public final class dj3 extends k0 implements hj3 {
    public /* synthetic */ dj3(p1 p1Var) {
        this();
    }

    public dj3 clearBoolValue() {
        copyOnWrite();
        ((Value) this.instance).clearBoolValue();
        return this;
    }

    public dj3 clearKind() {
        copyOnWrite();
        ((Value) this.instance).clearKind();
        return this;
    }

    public dj3 clearListValue() {
        copyOnWrite();
        ((Value) this.instance).clearListValue();
        return this;
    }

    public dj3 clearNullValue() {
        copyOnWrite();
        ((Value) this.instance).clearNullValue();
        return this;
    }

    public dj3 clearNumberValue() {
        copyOnWrite();
        ((Value) this.instance).clearNumberValue();
        return this;
    }

    public dj3 clearStringValue() {
        copyOnWrite();
        ((Value) this.instance).clearStringValue();
        return this;
    }

    public dj3 clearStructValue() {
        copyOnWrite();
        ((Value) this.instance).clearStructValue();
        return this;
    }

    @Override // defpackage.hj3
    public boolean getBoolValue() {
        return ((Value) this.instance).getBoolValue();
    }

    @Override // defpackage.hj3
    public ej3 getKindCase() {
        return ((Value) this.instance).getKindCase();
    }

    @Override // defpackage.hj3
    public ListValue getListValue() {
        return ((Value) this.instance).getListValue();
    }

    @Override // defpackage.hj3
    public r12 getNullValue() {
        return ((Value) this.instance).getNullValue();
    }

    @Override // defpackage.hj3
    public int getNullValueValue() {
        return ((Value) this.instance).getNullValueValue();
    }

    @Override // defpackage.hj3
    public double getNumberValue() {
        return ((Value) this.instance).getNumberValue();
    }

    @Override // defpackage.hj3
    public String getStringValue() {
        return ((Value) this.instance).getStringValue();
    }

    @Override // defpackage.hj3
    public g getStringValueBytes() {
        return ((Value) this.instance).getStringValueBytes();
    }

    @Override // defpackage.hj3
    public Struct getStructValue() {
        return ((Value) this.instance).getStructValue();
    }

    @Override // defpackage.hj3
    public boolean hasBoolValue() {
        return ((Value) this.instance).hasBoolValue();
    }

    @Override // defpackage.hj3
    public boolean hasListValue() {
        return ((Value) this.instance).hasListValue();
    }

    @Override // defpackage.hj3
    public boolean hasNullValue() {
        return ((Value) this.instance).hasNullValue();
    }

    @Override // defpackage.hj3
    public boolean hasNumberValue() {
        return ((Value) this.instance).hasNumberValue();
    }

    @Override // defpackage.hj3
    public boolean hasStringValue() {
        return ((Value) this.instance).hasStringValue();
    }

    @Override // defpackage.hj3
    public boolean hasStructValue() {
        return ((Value) this.instance).hasStructValue();
    }

    public dj3 mergeListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).mergeListValue(listValue);
        return this;
    }

    public dj3 mergeStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).mergeStructValue(struct);
        return this;
    }

    public dj3 setBoolValue(boolean z) {
        copyOnWrite();
        ((Value) this.instance).setBoolValue(z);
        return this;
    }

    public dj3 setListValue(ListValue listValue) {
        copyOnWrite();
        ((Value) this.instance).setListValue(listValue);
        return this;
    }

    public dj3 setNullValue(r12 r12Var) {
        copyOnWrite();
        ((Value) this.instance).setNullValue(r12Var);
        return this;
    }

    public dj3 setNullValueValue(int i) {
        copyOnWrite();
        ((Value) this.instance).setNullValueValue(i);
        return this;
    }

    public dj3 setNumberValue(double d) {
        copyOnWrite();
        ((Value) this.instance).setNumberValue(d);
        return this;
    }

    public dj3 setStringValue(String str) {
        copyOnWrite();
        ((Value) this.instance).setStringValue(str);
        return this;
    }

    public dj3 setStringValueBytes(g gVar) {
        copyOnWrite();
        ((Value) this.instance).setStringValueBytes(gVar);
        return this;
    }

    public dj3 setStructValue(Struct struct) {
        copyOnWrite();
        ((Value) this.instance).setStructValue(struct);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private dj3() {
        /*
            r1 = this;
            com.google.protobuf.Value r0 = com.google.protobuf.Value.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj3.<init>():void");
    }

    public dj3 setListValue(il1 il1Var) {
        copyOnWrite();
        ((Value) this.instance).setListValue((ListValue) il1Var.build());
        return this;
    }

    public dj3 setStructValue(k23 k23Var) {
        copyOnWrite();
        ((Value) this.instance).setStructValue((Struct) k23Var.build());
        return this;
    }
}
