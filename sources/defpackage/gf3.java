package defpackage;

import com.google.protobuf.Field;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Type;
import com.google.protobuf.f1;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gf3 extends k0 implements hf3 {
    public /* synthetic */ gf3(f1 f1Var) {
        this();
    }

    public gf3 addAllFields(Iterable<? extends Field> iterable) {
        copyOnWrite();
        Type.access$700((Type) this.instance, iterable);
        return this;
    }

    public gf3 addAllOneofs(Iterable<String> iterable) {
        copyOnWrite();
        Type.access$1200((Type) this.instance, iterable);
        return this;
    }

    public gf3 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Type.access$1800((Type) this.instance, iterable);
        return this;
    }

    public gf3 addFields(Field field) {
        copyOnWrite();
        Type.access$500((Type) this.instance, field);
        return this;
    }

    public gf3 addOneofs(String str) {
        copyOnWrite();
        Type.access$1100((Type) this.instance, str);
        return this;
    }

    public gf3 addOneofsBytes(g gVar) {
        copyOnWrite();
        Type.access$1400((Type) this.instance, gVar);
        return this;
    }

    public gf3 addOptions(Option option) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, option);
        return this;
    }

    public gf3 clearFields() {
        copyOnWrite();
        Type.access$800((Type) this.instance);
        return this;
    }

    public gf3 clearName() {
        copyOnWrite();
        Type.access$200((Type) this.instance);
        return this;
    }

    public gf3 clearOneofs() {
        copyOnWrite();
        Type.access$1300((Type) this.instance);
        return this;
    }

    public gf3 clearOptions() {
        copyOnWrite();
        Type.access$1900((Type) this.instance);
        return this;
    }

    public gf3 clearSourceContext() {
        copyOnWrite();
        Type.access$2300((Type) this.instance);
        return this;
    }

    public gf3 clearSyntax() {
        copyOnWrite();
        Type.access$2600((Type) this.instance);
        return this;
    }

    @Override // defpackage.hf3
    public Field getFields(int i) {
        return ((Type) this.instance).getFields(i);
    }

    @Override // defpackage.hf3
    public int getFieldsCount() {
        return ((Type) this.instance).getFieldsCount();
    }

    @Override // defpackage.hf3
    public List<Field> getFieldsList() {
        return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
    }

    @Override // defpackage.hf3
    public String getName() {
        return ((Type) this.instance).getName();
    }

    @Override // defpackage.hf3
    public g getNameBytes() {
        return ((Type) this.instance).getNameBytes();
    }

    @Override // defpackage.hf3
    public String getOneofs(int i) {
        return ((Type) this.instance).getOneofs(i);
    }

    @Override // defpackage.hf3
    public g getOneofsBytes(int i) {
        return ((Type) this.instance).getOneofsBytes(i);
    }

    @Override // defpackage.hf3
    public int getOneofsCount() {
        return ((Type) this.instance).getOneofsCount();
    }

    @Override // defpackage.hf3
    public List<String> getOneofsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
    }

    @Override // defpackage.hf3
    public Option getOptions(int i) {
        return ((Type) this.instance).getOptions(i);
    }

    @Override // defpackage.hf3
    public int getOptionsCount() {
        return ((Type) this.instance).getOptionsCount();
    }

    @Override // defpackage.hf3
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
    }

    @Override // defpackage.hf3
    public SourceContext getSourceContext() {
        return ((Type) this.instance).getSourceContext();
    }

    @Override // defpackage.hf3
    public o43 getSyntax() {
        return ((Type) this.instance).getSyntax();
    }

    @Override // defpackage.hf3
    public int getSyntaxValue() {
        return ((Type) this.instance).getSyntaxValue();
    }

    @Override // defpackage.hf3
    public boolean hasSourceContext() {
        return ((Type) this.instance).hasSourceContext();
    }

    public gf3 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2200((Type) this.instance, sourceContext);
        return this;
    }

    public gf3 removeFields(int i) {
        copyOnWrite();
        Type.access$900((Type) this.instance, i);
        return this;
    }

    public gf3 removeOptions(int i) {
        copyOnWrite();
        Type.access$2000((Type) this.instance, i);
        return this;
    }

    public gf3 setFields(int i, Field field) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i, field);
        return this;
    }

    public gf3 setName(String str) {
        copyOnWrite();
        Type.access$100((Type) this.instance, str);
        return this;
    }

    public gf3 setNameBytes(g gVar) {
        copyOnWrite();
        Type.access$300((Type) this.instance, gVar);
        return this;
    }

    public gf3 setOneofs(int i, String str) {
        copyOnWrite();
        Type.access$1000((Type) this.instance, i, str);
        return this;
    }

    public gf3 setOptions(int i, Option option) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i, option);
        return this;
    }

    public gf3 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, sourceContext);
        return this;
    }

    public gf3 setSyntax(o43 o43Var) {
        copyOnWrite();
        Type.access$2500((Type) this.instance, o43Var);
        return this;
    }

    public gf3 setSyntaxValue(int i) {
        copyOnWrite();
        Type.access$2400((Type) this.instance, i);
        return this;
    }

    private gf3() {
        super(Type.access$000());
    }

    public gf3 addFields(int i, Field field) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i, field);
        return this;
    }

    public gf3 addOptions(int i, Option option) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i, option);
        return this;
    }

    public gf3 setFields(int i, fw0 fw0Var) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i, (Field) fw0Var.build());
        return this;
    }

    public gf3 setOptions(int i, n32 n32Var) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i, (Option) n32Var.build());
        return this;
    }

    public gf3 setSourceContext(nx2 nx2Var) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, (SourceContext) nx2Var.build());
        return this;
    }

    public gf3 addFields(fw0 fw0Var) {
        copyOnWrite();
        Type.access$500((Type) this.instance, (Field) fw0Var.build());
        return this;
    }

    public gf3 addOptions(n32 n32Var) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, (Option) n32Var.build());
        return this;
    }

    public gf3 addFields(int i, fw0 fw0Var) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i, (Field) fw0Var.build());
        return this;
    }

    public gf3 addOptions(int i, n32 n32Var) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i, (Option) n32Var.build());
        return this;
    }
}
