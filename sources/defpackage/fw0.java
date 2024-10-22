package defpackage;

import com.google.protobuf.Field;
import com.google.protobuf.Option;
import com.google.protobuf.f0;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class fw0 extends k0 implements sw0 {
    public /* synthetic */ fw0(f0 f0Var) {
        this();
    }

    public fw0 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Field) this.instance).addAllOptions(iterable);
        return this;
    }

    public fw0 addOptions(Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(option);
        return this;
    }

    public fw0 clearCardinality() {
        copyOnWrite();
        ((Field) this.instance).clearCardinality();
        return this;
    }

    public fw0 clearDefaultValue() {
        copyOnWrite();
        ((Field) this.instance).clearDefaultValue();
        return this;
    }

    public fw0 clearJsonName() {
        copyOnWrite();
        ((Field) this.instance).clearJsonName();
        return this;
    }

    public fw0 clearKind() {
        copyOnWrite();
        ((Field) this.instance).clearKind();
        return this;
    }

    public fw0 clearName() {
        copyOnWrite();
        ((Field) this.instance).clearName();
        return this;
    }

    public fw0 clearNumber() {
        copyOnWrite();
        ((Field) this.instance).clearNumber();
        return this;
    }

    public fw0 clearOneofIndex() {
        copyOnWrite();
        ((Field) this.instance).clearOneofIndex();
        return this;
    }

    public fw0 clearOptions() {
        copyOnWrite();
        ((Field) this.instance).clearOptions();
        return this;
    }

    public fw0 clearPacked() {
        copyOnWrite();
        ((Field) this.instance).clearPacked();
        return this;
    }

    public fw0 clearTypeUrl() {
        copyOnWrite();
        ((Field) this.instance).clearTypeUrl();
        return this;
    }

    @Override // defpackage.sw0
    public iw0 getCardinality() {
        return ((Field) this.instance).getCardinality();
    }

    @Override // defpackage.sw0
    public int getCardinalityValue() {
        return ((Field) this.instance).getCardinalityValue();
    }

    @Override // defpackage.sw0
    public String getDefaultValue() {
        return ((Field) this.instance).getDefaultValue();
    }

    @Override // defpackage.sw0
    public g getDefaultValueBytes() {
        return ((Field) this.instance).getDefaultValueBytes();
    }

    @Override // defpackage.sw0
    public String getJsonName() {
        return ((Field) this.instance).getJsonName();
    }

    @Override // defpackage.sw0
    public g getJsonNameBytes() {
        return ((Field) this.instance).getJsonNameBytes();
    }

    @Override // defpackage.sw0
    public lw0 getKind() {
        return ((Field) this.instance).getKind();
    }

    @Override // defpackage.sw0
    public int getKindValue() {
        return ((Field) this.instance).getKindValue();
    }

    @Override // defpackage.sw0
    public String getName() {
        return ((Field) this.instance).getName();
    }

    @Override // defpackage.sw0
    public g getNameBytes() {
        return ((Field) this.instance).getNameBytes();
    }

    @Override // defpackage.sw0
    public int getNumber() {
        return ((Field) this.instance).getNumber();
    }

    @Override // defpackage.sw0
    public int getOneofIndex() {
        return ((Field) this.instance).getOneofIndex();
    }

    @Override // defpackage.sw0
    public Option getOptions(int i) {
        return ((Field) this.instance).getOptions(i);
    }

    @Override // defpackage.sw0
    public int getOptionsCount() {
        return ((Field) this.instance).getOptionsCount();
    }

    @Override // defpackage.sw0
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
    }

    @Override // defpackage.sw0
    public boolean getPacked() {
        return ((Field) this.instance).getPacked();
    }

    @Override // defpackage.sw0
    public String getTypeUrl() {
        return ((Field) this.instance).getTypeUrl();
    }

    @Override // defpackage.sw0
    public g getTypeUrlBytes() {
        return ((Field) this.instance).getTypeUrlBytes();
    }

    public fw0 removeOptions(int i) {
        copyOnWrite();
        ((Field) this.instance).removeOptions(i);
        return this;
    }

    public fw0 setCardinality(iw0 iw0Var) {
        copyOnWrite();
        ((Field) this.instance).setCardinality(iw0Var);
        return this;
    }

    public fw0 setCardinalityValue(int i) {
        copyOnWrite();
        ((Field) this.instance).setCardinalityValue(i);
        return this;
    }

    public fw0 setDefaultValue(String str) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValue(str);
        return this;
    }

    public fw0 setDefaultValueBytes(g gVar) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValueBytes(gVar);
        return this;
    }

    public fw0 setJsonName(String str) {
        copyOnWrite();
        ((Field) this.instance).setJsonName(str);
        return this;
    }

    public fw0 setJsonNameBytes(g gVar) {
        copyOnWrite();
        ((Field) this.instance).setJsonNameBytes(gVar);
        return this;
    }

    public fw0 setKind(lw0 lw0Var) {
        copyOnWrite();
        ((Field) this.instance).setKind(lw0Var);
        return this;
    }

    public fw0 setKindValue(int i) {
        copyOnWrite();
        ((Field) this.instance).setKindValue(i);
        return this;
    }

    public fw0 setName(String str) {
        copyOnWrite();
        ((Field) this.instance).setName(str);
        return this;
    }

    public fw0 setNameBytes(g gVar) {
        copyOnWrite();
        ((Field) this.instance).setNameBytes(gVar);
        return this;
    }

    public fw0 setNumber(int i) {
        copyOnWrite();
        ((Field) this.instance).setNumber(i);
        return this;
    }

    public fw0 setOneofIndex(int i) {
        copyOnWrite();
        ((Field) this.instance).setOneofIndex(i);
        return this;
    }

    public fw0 setOptions(int i, Option option) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i, option);
        return this;
    }

    public fw0 setPacked(boolean z) {
        copyOnWrite();
        ((Field) this.instance).setPacked(z);
        return this;
    }

    public fw0 setTypeUrl(String str) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrl(str);
        return this;
    }

    public fw0 setTypeUrlBytes(g gVar) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrlBytes(gVar);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private fw0() {
        /*
            r1 = this;
            com.google.protobuf.Field r0 = com.google.protobuf.Field.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw0.<init>():void");
    }

    public fw0 addOptions(int i, Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i, option);
        return this;
    }

    public fw0 setOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i, (Option) n32Var.build());
        return this;
    }

    public fw0 addOptions(n32 n32Var) {
        copyOnWrite();
        ((Field) this.instance).addOptions((Option) n32Var.build());
        return this;
    }

    public fw0 addOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i, (Option) n32Var.build());
        return this;
    }
}
