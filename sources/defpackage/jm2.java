package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class jm2 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public fm2 f2792a;

    /* renamed from: b, reason: collision with root package name */
    public fm2 f2793b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public fm2 b(Object obj) {
        fm2 fm2Var = this.f2792a;
        while (fm2Var != null && !fm2Var.f2119a.equals(obj)) {
            fm2Var = fm2Var.c;
        }
        return fm2Var;
    }

    public Object c(Object obj, Object obj2) {
        fm2 b2 = b(obj);
        if (b2 != null) {
            return b2.f2120b;
        }
        fm2 fm2Var = new fm2(obj, obj2);
        this.d++;
        fm2 fm2Var2 = this.f2793b;
        if (fm2Var2 == null) {
            this.f2792a = fm2Var;
            this.f2793b = fm2Var;
            return null;
        }
        fm2Var2.c = fm2Var;
        fm2Var.d = fm2Var2;
        this.f2793b = fm2Var;
        return null;
    }

    public Object e(Object obj) {
        fm2 b2 = b(obj);
        if (b2 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((im2) it.next()).a(b2);
            }
        }
        fm2 fm2Var = b2.d;
        if (fm2Var != null) {
            fm2Var.c = b2.c;
        } else {
            this.f2792a = b2.c;
        }
        fm2 fm2Var2 = b2.c;
        if (fm2Var2 != null) {
            fm2Var2.d = fm2Var;
        } else {
            this.f2793b = fm2Var;
        }
        b2.c = null;
        b2.d = null;
        return b2.f2120b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:            if (r3.hasNext() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:            if (((defpackage.hm2) r7).hasNext() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:            return false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.jm2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jm2 r7 = (defpackage.jm2) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            hm2 r3 = (defpackage.hm2) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            hm2 r4 = (defpackage.hm2) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            hm2 r7 = (defpackage.hm2) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            hm2 hm2Var = (hm2) it;
            if (hm2Var.hasNext()) {
                i += ((Map.Entry) hm2Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        em2 em2Var = new em2(this.f2792a, this.f2793b, 0);
        this.c.put(em2Var, Boolean.FALSE);
        return em2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            hm2 hm2Var = (hm2) it;
            if (hm2Var.hasNext()) {
                sb.append(((Map.Entry) hm2Var.next()).toString());
                if (hm2Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
