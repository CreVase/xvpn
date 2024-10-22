package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class qh0 extends b11 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3997a;

    public qh0(Map map) {
        this.f3997a = map;
    }

    @Override // defpackage.b11, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:            if (r0.hasNext() == false) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:            if (r3.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:            if (r3 == null) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:            if (r0.hasNext() == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:            if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:            return true;     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            or2 r0 = (defpackage.or2) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            if (r3 != 0) goto L22
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto Lf
            goto L38
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L22
        L38:
            r3 = 1
            goto L3b
        L3a:
            r3 = 0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh0.containsValue(java.lang.Object):boolean");
    }

    @Override // defpackage.b11, java.util.Map
    public final Set entrySet() {
        return cp3.u(super.entrySet(), new ph0(1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && m20.f0(this, obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b11, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return cp3.z(entrySet());
    }

    @Override // defpackage.b11, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b11, java.util.Map
    public final Set keySet() {
        return cp3.u(super.keySet(), new ph0(0));
    }

    @Override // defpackage.b11, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
