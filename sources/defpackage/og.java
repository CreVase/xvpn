package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class og extends m20 {
    public static final byte[] j1(int i, byte[] bArr, int i2) {
        int length = bArr.length;
        if (i2 <= length) {
            return Arrays.copyOfRange(bArr, i, i2);
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static final ArrayList k1(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int l1(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (m20.L(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final List m1(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new dg(objArr, false));
            }
            return Collections.singletonList(objArr[0]);
        }
        return cr0.f1659a;
    }
}
