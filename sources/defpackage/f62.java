package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class f62 implements mp2, au {

    /* renamed from: a, reason: collision with root package name */
    public final String f2048a;

    /* renamed from: b, reason: collision with root package name */
    public final n51 f2049b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final ui1 i;
    public final ui1 j;
    public final ui1 k;

    public f62(String str, n51 n51Var, int i) {
        this.f2048a = str;
        this.f2049b = n51Var;
        this.c = i;
        String[] strArr = new String[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = dr0.f1824a;
        kj1 kj1Var = kj1.f2954b;
        this.i = m20.D0(kj1Var, new e62(this, 1));
        this.j = m20.D0(kj1Var, new e62(this, 2));
        this.k = m20.D0(kj1Var, new e62(this, i2));
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.f2048a;
    }

    @Override // defpackage.au
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f62)) {
                return false;
            }
            mp2 mp2Var = (mp2) obj;
            if (!m20.L(this.f2048a, mp2Var.a()) || !Arrays.equals((mp2[]) this.j.getValue(), (mp2[]) ((f62) obj).j.getValue())) {
                return false;
            }
            int e = mp2Var.e();
            int i = this.c;
            if (i != e) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!m20.L(h(i2).a(), mp2Var.h(i2).a()) || !m20.L(h(i2).getKind(), mp2Var.h(i2).getKind())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        List list = this.f[i];
        if (list == null) {
            return cr0.f1659a;
        }
        return list;
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return cr0.f1659a;
    }

    @Override // defpackage.mp2
    public tp2 getKind() {
        return o23.f3589a;
    }

    @Override // defpackage.mp2
    public mp2 h(int i) {
        return ((uh1[]) this.i.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // defpackage.mp2
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return d20.K0(t9.I0(0, this.c), ", ", this.f2048a + '(', ")", new l63(this, 4), 24);
    }
}
