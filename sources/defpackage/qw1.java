package defpackage;

import com.google.protobuf.Method;
import com.google.protobuf.Option;
import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.x0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class qw1 extends k0 implements sw1 {
    public /* synthetic */ qw1(x0 x0Var) {
        this();
    }

    public qw1 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Method) this.instance).addAllOptions(iterable);
        return this;
    }

    public qw1 addOptions(Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(option);
        return this;
    }

    public qw1 clearName() {
        copyOnWrite();
        ((Method) this.instance).clearName();
        return this;
    }

    public qw1 clearOptions() {
        copyOnWrite();
        ((Method) this.instance).clearOptions();
        return this;
    }

    public qw1 clearRequestStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearRequestStreaming();
        return this;
    }

    public qw1 clearRequestTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearRequestTypeUrl();
        return this;
    }

    public qw1 clearResponseStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearResponseStreaming();
        return this;
    }

    public qw1 clearResponseTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearResponseTypeUrl();
        return this;
    }

    public qw1 clearSyntax() {
        copyOnWrite();
        ((Method) this.instance).clearSyntax();
        return this;
    }

    @Override // defpackage.sw1
    public String getName() {
        return ((Method) this.instance).getName();
    }

    @Override // defpackage.sw1
    public g getNameBytes() {
        return ((Method) this.instance).getNameBytes();
    }

    @Override // defpackage.sw1
    public Option getOptions(int i) {
        return ((Method) this.instance).getOptions(i);
    }

    @Override // defpackage.sw1
    public int getOptionsCount() {
        return ((Method) this.instance).getOptionsCount();
    }

    @Override // defpackage.sw1
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
    }

    @Override // defpackage.sw1
    public boolean getRequestStreaming() {
        return ((Method) this.instance).getRequestStreaming();
    }

    @Override // defpackage.sw1
    public String getRequestTypeUrl() {
        return ((Method) this.instance).getRequestTypeUrl();
    }

    @Override // defpackage.sw1
    public g getRequestTypeUrlBytes() {
        return ((Method) this.instance).getRequestTypeUrlBytes();
    }

    @Override // defpackage.sw1
    public boolean getResponseStreaming() {
        return ((Method) this.instance).getResponseStreaming();
    }

    @Override // defpackage.sw1
    public String getResponseTypeUrl() {
        return ((Method) this.instance).getResponseTypeUrl();
    }

    @Override // defpackage.sw1
    public g getResponseTypeUrlBytes() {
        return ((Method) this.instance).getResponseTypeUrlBytes();
    }

    @Override // defpackage.sw1
    public o43 getSyntax() {
        return ((Method) this.instance).getSyntax();
    }

    @Override // defpackage.sw1
    public int getSyntaxValue() {
        return ((Method) this.instance).getSyntaxValue();
    }

    public qw1 removeOptions(int i) {
        copyOnWrite();
        ((Method) this.instance).removeOptions(i);
        return this;
    }

    public qw1 setName(String str) {
        copyOnWrite();
        ((Method) this.instance).setName(str);
        return this;
    }

    public qw1 setNameBytes(g gVar) {
        copyOnWrite();
        ((Method) this.instance).setNameBytes(gVar);
        return this;
    }

    public qw1 setOptions(int i, Option option) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i, option);
        return this;
    }

    public qw1 setRequestStreaming(boolean z) {
        copyOnWrite();
        ((Method) this.instance).setRequestStreaming(z);
        return this;
    }

    public qw1 setRequestTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrl(str);
        return this;
    }

    public qw1 setRequestTypeUrlBytes(g gVar) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrlBytes(gVar);
        return this;
    }

    public qw1 setResponseStreaming(boolean z) {
        copyOnWrite();
        ((Method) this.instance).setResponseStreaming(z);
        return this;
    }

    public qw1 setResponseTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrl(str);
        return this;
    }

    public qw1 setResponseTypeUrlBytes(g gVar) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrlBytes(gVar);
        return this;
    }

    public qw1 setSyntax(o43 o43Var) {
        copyOnWrite();
        ((Method) this.instance).setSyntax(o43Var);
        return this;
    }

    public qw1 setSyntaxValue(int i) {
        copyOnWrite();
        ((Method) this.instance).setSyntaxValue(i);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private qw1() {
        /*
            r1 = this;
            com.google.protobuf.Method r0 = com.google.protobuf.Method.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw1.<init>():void");
    }

    public qw1 addOptions(int i, Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i, option);
        return this;
    }

    public qw1 setOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i, (Option) n32Var.build());
        return this;
    }

    public qw1 addOptions(n32 n32Var) {
        copyOnWrite();
        ((Method) this.instance).addOptions((Option) n32Var.build());
        return this;
    }

    public qw1 addOptions(int i, n32 n32Var) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i, (Option) n32Var.build());
        return this;
    }
}
