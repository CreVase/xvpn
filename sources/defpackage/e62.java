package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e62 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ f62 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e62(f62 f62Var, int i) {
        super(0);
        this.f = i;
        this.g = f62Var;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        ArrayList arrayList;
        uh1[] typeParametersSerializers;
        uh1[] childSerializers;
        int i = this.f;
        f62 f62Var = this.g;
        switch (i) {
            case 0:
                return Integer.valueOf(t9.O(f62Var, (mp2[]) f62Var.j.getValue()));
            case 1:
                n51 n51Var = f62Var.f2049b;
                if (n51Var == null || (childSerializers = n51Var.childSerializers()) == null) {
                    return cp3.j;
                }
                return childSerializers;
            default:
                n51 n51Var2 = f62Var.f2049b;
                if (n51Var2 != null && (typeParametersSerializers = n51Var2.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (uh1 uh1Var : typeParametersSerializers) {
                        arrayList.add(uh1Var.getDescriptor());
                    }
                } else {
                    arrayList = null;
                }
                return zf3.k(arrayList);
        }
    }
}
