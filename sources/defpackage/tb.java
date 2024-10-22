package defpackage;

import com.google.protobuf.Any;
import com.google.protobuf.b;
import com.google.protobuf.g;
import com.google.protobuf.k0;

/* loaded from: classes2.dex */
public final class tb extends k0 implements ub {
    public /* synthetic */ tb(b bVar) {
        this();
    }

    public tb clearTypeUrl() {
        copyOnWrite();
        ((Any) this.instance).clearTypeUrl();
        return this;
    }

    public tb clearValue() {
        copyOnWrite();
        ((Any) this.instance).clearValue();
        return this;
    }

    @Override // defpackage.ub
    public String getTypeUrl() {
        return ((Any) this.instance).getTypeUrl();
    }

    @Override // defpackage.ub
    public g getTypeUrlBytes() {
        return ((Any) this.instance).getTypeUrlBytes();
    }

    @Override // defpackage.ub
    public g getValue() {
        return ((Any) this.instance).getValue();
    }

    public tb setTypeUrl(String str) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrl(str);
        return this;
    }

    public tb setTypeUrlBytes(g gVar) {
        copyOnWrite();
        ((Any) this.instance).setTypeUrlBytes(gVar);
        return this;
    }

    public tb setValue(g gVar) {
        copyOnWrite();
        ((Any) this.instance).setValue(gVar);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb() {
        /*
            r1 = this;
            com.google.protobuf.Any r0 = com.google.protobuf.Any.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb.<init>():void");
    }
}
