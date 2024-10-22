package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l1 extends AbstractList implements List, rh1 {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        gg ggVar = (gg) this;
        int i2 = ggVar.c;
        if (i >= 0 && i < i2) {
            if (i == tf3.N(ggVar)) {
                return ggVar.i();
            }
            if (i == 0) {
                return ggVar.h();
            }
            int g = ggVar.g(ggVar.f2246a + i);
            Object[] objArr = ggVar.f2247b;
            Object obj = objArr[g];
            int i3 = 0;
            if (i < (ggVar.c >> 1)) {
                int i4 = ggVar.f2246a;
                if (g >= i4) {
                    System.arraycopy(objArr, i4, objArr, i4 + 1, g - i4);
                } else {
                    System.arraycopy(objArr, 0, objArr, 1, g - 0);
                    Object[] objArr2 = ggVar.f2247b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = ggVar.f2246a;
                    System.arraycopy(objArr2, i5, objArr2, i5 + 1, (objArr2.length - 1) - i5);
                }
                Object[] objArr3 = ggVar.f2247b;
                int i6 = ggVar.f2246a;
                objArr3[i6] = null;
                if (i6 != objArr3.length - 1) {
                    i3 = i6 + 1;
                }
                ggVar.f2246a = i3;
            } else {
                int g2 = ggVar.g(tf3.N(ggVar) + ggVar.f2246a);
                if (g <= g2) {
                    Object[] objArr4 = ggVar.f2247b;
                    int i7 = g + 1;
                    System.arraycopy(objArr4, i7, objArr4, g, (g2 + 1) - i7);
                } else {
                    Object[] objArr5 = ggVar.f2247b;
                    int i8 = g + 1;
                    System.arraycopy(objArr5, i8, objArr5, g, objArr5.length - i8);
                    Object[] objArr6 = ggVar.f2247b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    System.arraycopy(objArr6, 1, objArr6, 0, (g2 + 1) - 1);
                }
                ggVar.f2247b[g2] = null;
            }
            ggVar.c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(hx2.n("index: ", i, ", size: ", i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((gg) this).c;
    }
}
