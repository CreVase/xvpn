package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class oj0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3674a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f3675b;

    public oj0(ji2 ji2Var) {
        this.f3675b = ji2Var;
    }

    public final List a(wz1 wz1Var) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z2;
        byte[] bArr;
        boolean b2 = b(32);
        List list2 = this.f3675b;
        if (b2) {
            return list2;
        }
        r42 r42Var = new r42((byte[]) wz1Var.d);
        while (r42Var.c - r42Var.f4099b > 0) {
            int v = r42Var.v();
            int v2 = r42Var.f4099b + r42Var.v();
            if (v == 134) {
                ArrayList arrayList = new ArrayList();
                int v3 = r42Var.v() & 31;
                for (int i2 = 0; i2 < v3; i2++) {
                    String s = r42Var.s(3);
                    int v4 = r42Var.v();
                    if ((v4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = v4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v5 = (byte) r42Var.v();
                    r42Var.H(1);
                    if (z) {
                        if ((v5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    x01 x01Var = new x01();
                    x01Var.k = str;
                    x01Var.c = s;
                    x01Var.C = i;
                    x01Var.m = list;
                    arrayList.add(new y01(x01Var));
                }
                list2 = arrayList;
            }
            r42Var.G(v2);
        }
        return list2;
    }

    public final boolean b(int i) {
        if ((i & this.f3674a) != 0) {
            return true;
        }
        return false;
    }
}
