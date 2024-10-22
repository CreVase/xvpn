package defpackage;

import com.google.protobuf.EnumValue;
import com.google.protobuf.Option;
import com.google.protobuf.c0;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class bs0 extends k0 implements cs0 {
    public /* synthetic */ bs0(c0 c0Var) {
        this();
    }

    public bs0 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((EnumValue) this.instance).addAllOptions(iterable);
        return this;
    }

    public bs0 addOptions(Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(option);
        return this;
    }

    public bs0 clearName() {
        copyOnWrite();
        ((EnumValue) this.instance).clearName();
        return this;
    }

    public bs0 clearNumber() {
        copyOnWrite();
        ((EnumValue) this.instance).clearNumber();
        return this;
    }

    public bs0 clearOptions() {
        copyOnWrite();
        ((EnumValue) this.instance).clearOptions();
        return this;
    }

    @Override // defpackage.cs0
    public String getName() {
        return ((EnumValue) this.instance).getName();
    }

    @Override // defpackage.cs0
    public g getNameBytes() {
        return ((EnumValue) this.instance).getNameBytes();
    }

    @Override // defpackage.cs0
    public int getNumber() {
        return ((EnumValue) this.instance).getNumber();
    }

    @Override // defpackage.cs0
    public Option getOptions(int i) {
        return ((EnumValue) this.instance).getOptions(i);
    }

    @Override // defpackage.cs0
    public int getOptionsCount() {
        return ((EnumValue) this.instance).getOptionsCount();
    }

    @Override // defpackage.cs0
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
    }

    public bs0 removeOptions(int i) {
        copyOnWrite();
        ((EnumValue) this.instance).removeOptions(i);
        return this;
    }

    public bs0 setName(String str) {
        copyOnWrite();
        ((EnumValue) this.instance).setName(str);
        return this;
    }

    public bs0 setNameBytes(g gVar) {
        copyOnWrite();
        ((EnumValue) this.instance).setNameBytes(gVar);
        return this;
    }

    public bs0 setNumber(int i) {
        copyOnWrite();
        ((EnumValue) this.instance).setNumber(i);
        return this;
    }

    public bs0 setOptions(int i, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i, option);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private bs0() {
        /*
            r1 = this;
            com.google.protobuf.EnumValue r0 = com.google.protobuf.EnumValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs0.<init>():void");
    }

    public bs0 addOptions(int i, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i, option);
        return this;
    }

    public bs0 setOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i, (Option) n32Var.build());
        return this;
    }

    public bs0 addOptions(n32 n32Var) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions((Option) n32Var.build());
        return this;
    }

    public bs0 addOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i, (Option) n32Var.build());
        return this;
    }
}
