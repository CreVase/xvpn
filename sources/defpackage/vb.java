package defpackage;

import com.google.protobuf.Api;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.c;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class vb extends k0 implements xb {
    public /* synthetic */ vb(c cVar) {
        this();
    }

    public vb addAllMethods(Iterable<? extends Method> iterable) {
        copyOnWrite();
        Api.access$700((Api) this.instance, iterable);
        return this;
    }

    public vb addAllMixins(Iterable<? extends Mixin> iterable) {
        copyOnWrite();
        Api.access$2500((Api) this.instance, iterable);
        return this;
    }

    public vb addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Api.access$1300((Api) this.instance, iterable);
        return this;
    }

    public vb addMethods(Method method) {
        copyOnWrite();
        Api.access$500((Api) this.instance, method);
        return this;
    }

    public vb addMixins(Mixin mixin) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, mixin);
        return this;
    }

    public vb addOptions(Option option) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, option);
        return this;
    }

    public vb clearMethods() {
        copyOnWrite();
        Api.access$800((Api) this.instance);
        return this;
    }

    public vb clearMixins() {
        copyOnWrite();
        Api.access$2600((Api) this.instance);
        return this;
    }

    public vb clearName() {
        copyOnWrite();
        Api.access$200((Api) this.instance);
        return this;
    }

    public vb clearOptions() {
        copyOnWrite();
        Api.access$1400((Api) this.instance);
        return this;
    }

    public vb clearSourceContext() {
        copyOnWrite();
        Api.access$2100((Api) this.instance);
        return this;
    }

    public vb clearSyntax() {
        copyOnWrite();
        Api.access$3000((Api) this.instance);
        return this;
    }

    public vb clearVersion() {
        copyOnWrite();
        Api.access$1700((Api) this.instance);
        return this;
    }

    @Override // defpackage.xb
    public Method getMethods(int i) {
        return ((Api) this.instance).getMethods(i);
    }

    @Override // defpackage.xb
    public int getMethodsCount() {
        return ((Api) this.instance).getMethodsCount();
    }

    @Override // defpackage.xb
    public List<Method> getMethodsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
    }

    @Override // defpackage.xb
    public Mixin getMixins(int i) {
        return ((Api) this.instance).getMixins(i);
    }

    @Override // defpackage.xb
    public int getMixinsCount() {
        return ((Api) this.instance).getMixinsCount();
    }

    @Override // defpackage.xb
    public List<Mixin> getMixinsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
    }

    @Override // defpackage.xb
    public String getName() {
        return ((Api) this.instance).getName();
    }

    @Override // defpackage.xb
    public g getNameBytes() {
        return ((Api) this.instance).getNameBytes();
    }

    @Override // defpackage.xb
    public Option getOptions(int i) {
        return ((Api) this.instance).getOptions(i);
    }

    @Override // defpackage.xb
    public int getOptionsCount() {
        return ((Api) this.instance).getOptionsCount();
    }

    @Override // defpackage.xb
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
    }

    @Override // defpackage.xb
    public SourceContext getSourceContext() {
        return ((Api) this.instance).getSourceContext();
    }

    @Override // defpackage.xb
    public o43 getSyntax() {
        return ((Api) this.instance).getSyntax();
    }

    @Override // defpackage.xb
    public int getSyntaxValue() {
        return ((Api) this.instance).getSyntaxValue();
    }

    @Override // defpackage.xb
    public String getVersion() {
        return ((Api) this.instance).getVersion();
    }

    @Override // defpackage.xb
    public g getVersionBytes() {
        return ((Api) this.instance).getVersionBytes();
    }

    @Override // defpackage.xb
    public boolean hasSourceContext() {
        return ((Api) this.instance).hasSourceContext();
    }

    public vb mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$2000((Api) this.instance, sourceContext);
        return this;
    }

    public vb removeMethods(int i) {
        copyOnWrite();
        Api.access$900((Api) this.instance, i);
        return this;
    }

    public vb removeMixins(int i) {
        copyOnWrite();
        Api.access$2700((Api) this.instance, i);
        return this;
    }

    public vb removeOptions(int i) {
        copyOnWrite();
        Api.access$1500((Api) this.instance, i);
        return this;
    }

    public vb setMethods(int i, Method method) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i, method);
        return this;
    }

    public vb setMixins(int i, Mixin mixin) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i, mixin);
        return this;
    }

    public vb setName(String str) {
        copyOnWrite();
        Api.access$100((Api) this.instance, str);
        return this;
    }

    public vb setNameBytes(g gVar) {
        copyOnWrite();
        Api.access$300((Api) this.instance, gVar);
        return this;
    }

    public vb setOptions(int i, Option option) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i, option);
        return this;
    }

    public vb setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, sourceContext);
        return this;
    }

    public vb setSyntax(o43 o43Var) {
        copyOnWrite();
        Api.access$2900((Api) this.instance, o43Var);
        return this;
    }

    public vb setSyntaxValue(int i) {
        copyOnWrite();
        Api.access$2800((Api) this.instance, i);
        return this;
    }

    public vb setVersion(String str) {
        copyOnWrite();
        Api.access$1600((Api) this.instance, str);
        return this;
    }

    public vb setVersionBytes(g gVar) {
        copyOnWrite();
        Api.access$1800((Api) this.instance, gVar);
        return this;
    }

    private vb() {
        super(Api.access$000());
    }

    public vb addMethods(int i, Method method) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i, method);
        return this;
    }

    public vb addMixins(int i, Mixin mixin) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i, mixin);
        return this;
    }

    public vb addOptions(int i, Option option) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i, option);
        return this;
    }

    public vb setMethods(int i, qw1 qw1Var) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i, (Method) qw1Var.build());
        return this;
    }

    public vb setMixins(int i, yw1 yw1Var) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i, (Mixin) yw1Var.build());
        return this;
    }

    public vb setOptions(int i, n32 n32Var) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i, (Option) n32Var.build());
        return this;
    }

    public vb setSourceContext(nx2 nx2Var) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, (SourceContext) nx2Var.build());
        return this;
    }

    public vb addMethods(qw1 qw1Var) {
        copyOnWrite();
        Api.access$500((Api) this.instance, (Method) qw1Var.build());
        return this;
    }

    public vb addMixins(yw1 yw1Var) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, (Mixin) yw1Var.build());
        return this;
    }

    public vb addOptions(n32 n32Var) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, (Option) n32Var.build());
        return this;
    }

    public vb addMethods(int i, qw1 qw1Var) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i, (Method) qw1Var.build());
        return this;
    }

    public vb addMixins(int i, yw1 yw1Var) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i, (Mixin) yw1Var.build());
        return this;
    }

    public vb addOptions(int i, n32 n32Var) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i, (Option) n32Var.build());
        return this;
    }
}
