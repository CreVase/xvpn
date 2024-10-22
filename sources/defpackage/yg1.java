package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class yg1 extends l0 {
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg1(qf1 qf1Var, x31 x31Var, int i) {
        super(qf1Var, x31Var);
        this.e = i;
        if (i != 1) {
            if (i != 2) {
                this.f4237a.add("primitive");
                return;
            } else {
                super(qf1Var, x31Var);
                this.f = new ArrayList();
                return;
            }
        }
        super(qf1Var, x31Var);
        this.f = new LinkedHashMap();
    }

    @Override // defpackage.ry1, defpackage.g40
    public final void A(mp2 mp2Var, int i, uh1 uh1Var, Object obj) {
        switch (this.e) {
            case 1:
                if (obj != null || this.d.f) {
                    super.A(mp2Var, i, uh1Var, obj);
                    return;
                }
                return;
            default:
                super.A(mp2Var, i, uh1Var, obj);
                return;
        }
    }

    @Override // defpackage.l0
    public eg1 L() {
        switch (this.e) {
            case 0:
                eg1 eg1Var = (eg1) this.f;
                if (eg1Var != null) {
                    return eg1Var;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
            case 1:
                return new tg1((Map) this.f);
            default:
                return new rf1((ArrayList) this.f);
        }
    }

    @Override // defpackage.l0
    public void M(String str, eg1 eg1Var) {
        boolean z;
        switch (this.e) {
            case 0:
                boolean z2 = true;
                if (str == "primitive") {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((eg1) this.f) != null) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f = eg1Var;
                        return;
                    }
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
                }
                throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
            case 1:
                ((Map) this.f).put(str, eg1Var);
                return;
            default:
                ((ArrayList) this.f).add(Integer.parseInt(str), eg1Var);
                return;
        }
    }
}
