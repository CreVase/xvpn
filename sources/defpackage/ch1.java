package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ch1 extends j0 {
    public final tg1 e;
    public final String f;
    public final mp2 g;
    public int h;
    public boolean i;

    public ch1(qf1 qf1Var, tg1 tg1Var, String str, mp2 mp2Var) {
        super(qf1Var);
        this.e = tg1Var;
        this.f = str;
        this.g = mp2Var;
    }

    @Override // defpackage.qy1
    public String P(mp2 mp2Var, int i) {
        Object obj;
        boolean z;
        String f = mp2Var.f(i);
        if (!this.d.l) {
            return f;
        }
        if (W().keySet().contains(f)) {
            return f;
        }
        Map map = (Map) this.c.c.f(mp2Var, new og1(mp2Var, 1));
        Iterator it = W().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return f;
    }

    @Override // defpackage.j0
    public eg1 T(String str) {
        return (eg1) jq1.l0(W(), str);
    }

    @Override // defpackage.j0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public tg1 W() {
        return this.e;
    }

    @Override // defpackage.j0, defpackage.f40
    public void a(mp2 mp2Var) {
        Object obj;
        Set set;
        int size;
        Set set2;
        wf1 wf1Var = this.d;
        if (!wf1Var.f4996b && !(mp2Var.getKind() instanceof i62)) {
            if (!wf1Var.l) {
                set2 = zf3.g(mp2Var);
            } else {
                Set g = zf3.g(mp2Var);
                ia0 ia0Var = this.c.c;
                d5 d5Var = pg1.f3838a;
                Map map = (Map) ((Map) ia0Var.f2559a).get(mp2Var);
                Integer num = null;
                if (map != null) {
                    obj = map.get(d5Var);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = fr0.f2138a;
                }
                Set set3 = set;
                if (set3 instanceof Collection) {
                    num = Integer.valueOf(set3.size());
                }
                if (num != null) {
                    size = g.size() + num.intValue();
                } else {
                    size = g.size() * 2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(bx3.N(size));
                linkedHashSet.addAll(g);
                c20.D0(set3, linkedHashSet);
                set2 = linkedHashSet;
            }
            for (String str : W().keySet()) {
                if (!set2.contains(str) && !m20.L(str, this.f)) {
                    String tg1Var = W().toString();
                    StringBuilder u = hx2.u("Encountered unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                    u.append((Object) t9.U(-1, tg1Var));
                    throw t9.e(-1, u.toString());
                }
            }
        }
    }

    @Override // defpackage.j0, defpackage.qe0
    public final f40 c(mp2 mp2Var) {
        if (mp2Var == this.g) {
            return this;
        }
        return super.c(mp2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:            if (defpackage.pg1.e(r4, r5, r7) != (-3)) goto L39;     */
    @Override // defpackage.f40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j(defpackage.mp2 r9) {
        /*
            r8 = this;
        L0:
            int r0 = r8.h
            int r1 = r9.e()
            if (r0 >= r1) goto L8e
            int r0 = r8.h
            int r1 = r0 + 1
            r8.h = r1
            java.lang.String r0 = r8.Q(r9, r0)
            int r1 = r8.h
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r8.i = r3
            tg1 r4 = r8.W()
            boolean r4 = r4.containsKey(r0)
            qf1 r5 = r8.c
            if (r4 != 0) goto L42
            wf1 r4 = r5.f3989a
            boolean r4 = r4.f
            if (r4 != 0) goto L3d
            boolean r4 = r9.i(r1)
            if (r4 != 0) goto L3d
            mp2 r4 = r9.h(r1)
            boolean r4 = r4.c()
            if (r4 == 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            r8.i = r4
            if (r4 == 0) goto L0
        L42:
            wf1 r4 = r8.d
            boolean r4 = r4.h
            if (r4 == 0) goto L8d
            mp2 r4 = r9.h(r1)
            boolean r6 = r4.c()
            if (r6 != 0) goto L5b
            eg1 r6 = r8.T(r0)
            boolean r6 = r6 instanceof defpackage.rg1
            if (r6 == 0) goto L5b
            goto L8b
        L5b:
            tp2 r6 = r4.getKind()
            sp2 r7 = defpackage.sp2.f4395b
            boolean r6 = defpackage.m20.L(r6, r7)
            if (r6 == 0) goto L8a
            eg1 r0 = r8.T(r0)
            boolean r6 = r0 instanceof defpackage.wg1
            r7 = 0
            if (r6 == 0) goto L73
            wg1 r0 = (defpackage.wg1) r0
            goto L74
        L73:
            r0 = r7
        L74:
            if (r0 == 0) goto L7f
            boolean r6 = r0 instanceof defpackage.rg1
            if (r6 == 0) goto L7b
            goto L7f
        L7b:
            java.lang.String r7 = r0.c()
        L7f:
            if (r7 != 0) goto L82
            goto L8a
        L82:
            int r0 = defpackage.pg1.e(r4, r5, r7)
            r4 = -3
            if (r0 != r4) goto L8a
            goto L8b
        L8a:
            r2 = 0
        L8b:
            if (r2 != 0) goto L0
        L8d:
            return r1
        L8e:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch1.j(mp2):int");
    }

    @Override // defpackage.j0, defpackage.qy1, defpackage.qe0
    public final boolean z() {
        if (!this.i && super.z()) {
            return true;
        }
        return false;
    }
}
