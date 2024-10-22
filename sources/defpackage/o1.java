package defpackage;

/* loaded from: classes2.dex */
public abstract class o1 implements uh1 {
    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        j62 j62Var = (j62) this;
        f40 c = qe0Var.c(j62Var.getDescriptor());
        c.A();
        String str = null;
        while (true) {
            int j = c.j(j62Var.getDescriptor());
            if (j != -1) {
                if (j != 0) {
                    if (j != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(j);
                        throw new wp2(sb.toString());
                    }
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    c.b().getClass();
                    fl.J(1, null);
                    zf3.l0(str, j62Var.f2709a);
                    throw null;
                }
                str = c.o(j62Var.getDescriptor(), j);
            } else {
                throw new IllegalArgumentException(hx2.p("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        zf3.r(this, ir0Var, obj);
        throw null;
    }
}
