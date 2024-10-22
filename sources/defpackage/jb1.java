package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jb1 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2738a;

    /* renamed from: b, reason: collision with root package name */
    public int f2739b = 0;
    public ib1 c;

    public jb1(int i) {
        this.f2738a = new Object[i * 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018b  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oi2 a() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb1.a():oi2");
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.f2739b + 1) * 2;
        Object[] objArr = this.f2738a;
        if (i > objArr.length) {
            this.f2738a = Arrays.copyOf(objArr, pe0.q(objArr.length, i));
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = this.f2738a;
                int i2 = this.f2739b;
                int i3 = i2 * 2;
                objArr2[i3] = obj;
                objArr2[i3 + 1] = obj2;
                this.f2739b = i2 + 1;
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }
}
