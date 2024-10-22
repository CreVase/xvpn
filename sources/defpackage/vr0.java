package defpackage;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumValue;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.b0;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class vr0 extends k0 implements zr0 {
    public /* synthetic */ vr0(b0 b0Var) {
        this();
    }

    public vr0 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        copyOnWrite();
        Enum.access$700((Enum) this.instance, iterable);
        return this;
    }

    public vr0 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Enum.access$1300((Enum) this.instance, iterable);
        return this;
    }

    public vr0 addEnumvalue(EnumValue enumValue) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, enumValue);
        return this;
    }

    public vr0 addOptions(Option option) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, option);
        return this;
    }

    public vr0 clearEnumvalue() {
        copyOnWrite();
        Enum.access$800((Enum) this.instance);
        return this;
    }

    public vr0 clearName() {
        copyOnWrite();
        Enum.access$200((Enum) this.instance);
        return this;
    }

    public vr0 clearOptions() {
        copyOnWrite();
        Enum.access$1400((Enum) this.instance);
        return this;
    }

    public vr0 clearSourceContext() {
        copyOnWrite();
        Enum.access$1800((Enum) this.instance);
        return this;
    }

    public vr0 clearSyntax() {
        copyOnWrite();
        Enum.access$2100((Enum) this.instance);
        return this;
    }

    @Override // defpackage.zr0
    public EnumValue getEnumvalue(int i) {
        return ((Enum) this.instance).getEnumvalue(i);
    }

    @Override // defpackage.zr0
    public int getEnumvalueCount() {
        return ((Enum) this.instance).getEnumvalueCount();
    }

    @Override // defpackage.zr0
    public List<EnumValue> getEnumvalueList() {
        return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
    }

    @Override // defpackage.zr0
    public String getName() {
        return ((Enum) this.instance).getName();
    }

    @Override // defpackage.zr0
    public g getNameBytes() {
        return ((Enum) this.instance).getNameBytes();
    }

    @Override // defpackage.zr0
    public Option getOptions(int i) {
        return ((Enum) this.instance).getOptions(i);
    }

    @Override // defpackage.zr0
    public int getOptionsCount() {
        return ((Enum) this.instance).getOptionsCount();
    }

    @Override // defpackage.zr0
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
    }

    @Override // defpackage.zr0
    public SourceContext getSourceContext() {
        return ((Enum) this.instance).getSourceContext();
    }

    @Override // defpackage.zr0
    public o43 getSyntax() {
        return ((Enum) this.instance).getSyntax();
    }

    @Override // defpackage.zr0
    public int getSyntaxValue() {
        return ((Enum) this.instance).getSyntaxValue();
    }

    @Override // defpackage.zr0
    public boolean hasSourceContext() {
        return ((Enum) this.instance).hasSourceContext();
    }

    public vr0 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1700((Enum) this.instance, sourceContext);
        return this;
    }

    public vr0 removeEnumvalue(int i) {
        copyOnWrite();
        Enum.access$900((Enum) this.instance, i);
        return this;
    }

    public vr0 removeOptions(int i) {
        copyOnWrite();
        Enum.access$1500((Enum) this.instance, i);
        return this;
    }

    public vr0 setEnumvalue(int i, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i, enumValue);
        return this;
    }

    public vr0 setName(String str) {
        copyOnWrite();
        Enum.access$100((Enum) this.instance, str);
        return this;
    }

    public vr0 setNameBytes(g gVar) {
        copyOnWrite();
        Enum.access$300((Enum) this.instance, gVar);
        return this;
    }

    public vr0 setOptions(int i, Option option) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i, option);
        return this;
    }

    public vr0 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, sourceContext);
        return this;
    }

    public vr0 setSyntax(o43 o43Var) {
        copyOnWrite();
        Enum.access$2000((Enum) this.instance, o43Var);
        return this;
    }

    public vr0 setSyntaxValue(int i) {
        copyOnWrite();
        Enum.access$1900((Enum) this.instance, i);
        return this;
    }

    private vr0() {
        super(Enum.access$000());
    }

    public vr0 addEnumvalue(int i, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i, enumValue);
        return this;
    }

    public vr0 addOptions(int i, Option option) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i, option);
        return this;
    }

    public vr0 setEnumvalue(int i, bs0 bs0Var) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i, (EnumValue) bs0Var.build());
        return this;
    }

    public vr0 setOptions(int i, n32 n32Var) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i, (Option) n32Var.build());
        return this;
    }

    public vr0 setSourceContext(nx2 nx2Var) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, (SourceContext) nx2Var.build());
        return this;
    }

    public vr0 addEnumvalue(bs0 bs0Var) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, (EnumValue) bs0Var.build());
        return this;
    }

    public vr0 addOptions(n32 n32Var) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, (Option) n32Var.build());
        return this;
    }

    public vr0 addEnumvalue(int i, bs0 bs0Var) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i, (EnumValue) bs0Var.build());
        return this;
    }

    public vr0 addOptions(int i, n32 n32Var) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i, (Option) n32Var.build());
        return this;
    }
}
