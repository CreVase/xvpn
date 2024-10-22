package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class le1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3111a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3112b;
    public boolean c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public /* synthetic */ le1(String str, int i) {
        this(str);
    }

    public final int[] a() {
        boolean z;
        synchronized (this) {
            if (this.f3112b && !this.c) {
                int length = ((long[]) this.d).length;
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < length) {
                        if (((long[]) this.d)[i] > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Object obj = this.e;
                        if (z != ((boolean[]) obj)[i]) {
                            int[] iArr = (int[]) this.f;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            ((int[]) this.f)[i] = 0;
                        }
                        ((boolean[]) obj)[i] = z;
                        i++;
                    } else {
                        this.c = true;
                        this.f3112b = false;
                        return (int[]) this.f;
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:            if (((java.lang.CharSequence) r5).length() == 0) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:            r8 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:            if (java.lang.reflect.Array.getLength(r5) == 0) goto L31;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            int r0 = r9.f3111a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            boolean r0 = r9.f3112b
            boolean r1 = r9.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 32
            r2.<init>(r3)
            java.io.Serializable r3 = r9.d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            java.lang.Object r3 = r9.e
            y33 r3 = (defpackage.y33) r3
            java.lang.Object r3 = r3.d
            y33 r3 = (defpackage.y33) r3
            java.lang.String r4 = ""
        L2b:
            if (r3 == 0) goto Lb9
            java.lang.Object r5 = r3.c
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L36
            if (r0 != 0) goto Lb3
            goto L80
        L36:
            if (r1 == 0) goto L80
            boolean r8 = r5 instanceof java.lang.CharSequence
            if (r8 == 0) goto L46
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L7d
            goto L7b
        L46:
            boolean r8 = r5 instanceof java.util.Collection
            if (r8 == 0) goto L52
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            goto L7e
        L52:
            boolean r8 = r5 instanceof java.util.Map
            if (r8 == 0) goto L5e
            r8 = r5
            java.util.Map r8 = (java.util.Map) r8
            boolean r8 = r8.isEmpty()
            goto L7e
        L5e:
            boolean r8 = r5 instanceof defpackage.p32
            if (r8 == 0) goto L6b
            r8 = r5
            p32 r8 = (defpackage.p32) r8
            boolean r8 = r8.b()
            r8 = r8 ^ r7
            goto L7e
        L6b:
            java.lang.Class r8 = r5.getClass()
            boolean r8 = r8.isArray()
            if (r8 == 0) goto L7d
            int r8 = java.lang.reflect.Array.getLength(r5)
            if (r8 != 0) goto L7d
        L7b:
            r8 = 1
            goto L7e
        L7d:
            r8 = 0
        L7e:
            if (r8 != 0) goto Lb3
        L80:
            r2.append(r4)
            java.lang.Object r4 = r3.f5263b
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L91
            r2.append(r4)
            r4 = 61
            r2.append(r4)
        L91:
            if (r5 == 0) goto Lae
            java.lang.Class r4 = r5.getClass()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto Lae
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r6] = r5
            java.lang.String r4 = java.util.Arrays.deepToString(r4)
            int r5 = r4.length()
            int r5 = r5 - r7
            r2.append(r4, r7, r5)
            goto Lb1
        Lae:
            r2.append(r5)
        Lb1:
            java.lang.String r4 = ", "
        Lb3:
            java.lang.Object r3 = r3.d
            y33 r3 = (defpackage.y33) r3
            goto L2b
        Lb9:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le1.toString():java.lang.String");
    }

    public le1(String str) {
        y33 y33Var = new y33();
        this.e = y33Var;
        this.f = y33Var;
        this.f3112b = false;
        this.c = false;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long[], java.io.Serializable] */
    public le1(int i) {
        ?? r1 = new long[i];
        this.d = r1;
        boolean[] zArr = new boolean[i];
        this.e = zArr;
        this.f = new int[i];
        Arrays.fill((long[]) r1, 0L);
        Arrays.fill(zArr, false);
    }
}
