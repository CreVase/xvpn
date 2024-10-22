package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class kh0 implements gv0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2944b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final y33 c = new y33(new qb0(13));
    public static final y33 d = new y33(new qb0(14));

    /* renamed from: a, reason: collision with root package name */
    public final ji2 f2945a;

    public kh0() {
        db1 db1Var = hb1.f2394b;
        this.f2945a = ji2.e;
    }

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new b2());
                return;
            case 1:
                arrayList.add(new e2());
                return;
            case 2:
                arrayList.add(new h8());
                return;
            case 3:
                arrayList.add(new oa());
                return;
            case 4:
                dv0 v = c.v(0);
                if (v != null) {
                    arrayList.add(v);
                    return;
                } else {
                    arrayList.add(new qy0());
                    return;
                }
            case 5:
                arrayList.add(new uz0());
                return;
            case 6:
                arrayList.add(new kr1());
                return;
            case 7:
                arrayList.add(new lx1());
                return;
            case 8:
                arrayList.add(new e31());
                arrayList.add(new nx1(0));
                return;
            case 9:
                arrayList.add(new b22());
                return;
            case 10:
                arrayList.add(new jb2());
                return;
            case 11:
                arrayList.add(new oc3(new f93(0L), new oj0(this.f2945a)));
                return;
            case 12:
                arrayList.add(new oo3());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new of1());
                return;
            case 15:
                dv0 v2 = d.v(new Object[0]);
                if (v2 != null) {
                    arrayList.add(v2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new qm());
                return;
        }
    }

    @Override // defpackage.gv0
    public final synchronized dv0[] e(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f2944b;
        arrayList = new ArrayList(16);
        int K = zf3.K(map);
        if (K != -1) {
            a(K, arrayList);
        }
        int L = zf3.L(uri);
        if (L != -1 && L != K) {
            a(L, arrayList);
        }
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i];
            if (i2 != K && i2 != L) {
                a(i2, arrayList);
            }
        }
        return (dv0[]) arrayList.toArray(new dv0[arrayList.size()]);
    }
}
