package defpackage;

/* loaded from: classes2.dex */
public class c40 {

    /* renamed from: a, reason: collision with root package name */
    public final ah1 f578a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f579b = true;

    public c40(ah1 ah1Var) {
        this.f578a = ah1Var;
    }

    public void a() {
        this.f579b = true;
    }

    public void b() {
        this.f579b = false;
    }

    public void c(byte b2) {
        long j = b2;
        ah1 ah1Var = this.f578a;
        ah1Var.getClass();
        ah1Var.c(String.valueOf(j));
    }

    public final void d(char c) {
        ah1 ah1Var = this.f578a;
        ah1Var.a(ah1Var.f87b, 1);
        char[] cArr = ah1Var.f86a;
        int i = ah1Var.f87b;
        ah1Var.f87b = i + 1;
        cArr[i] = c;
    }

    public void e(int i) {
        long j = i;
        ah1 ah1Var = this.f578a;
        ah1Var.getClass();
        ah1Var.c(String.valueOf(j));
    }

    public void f(long j) {
        ah1 ah1Var = this.f578a;
        ah1Var.getClass();
        ah1Var.c(String.valueOf(j));
    }

    public final void g(String str) {
        this.f578a.c(str);
    }

    public void h(short s) {
        long j = s;
        ah1 ah1Var = this.f578a;
        ah1Var.getClass();
        ah1Var.c(String.valueOf(j));
    }

    public final void i(String str) {
        int i;
        ah1 ah1Var = this.f578a;
        ah1Var.getClass();
        ah1Var.a(ah1Var.f87b, str.length() + 2);
        char[] cArr = ah1Var.f86a;
        int i2 = ah1Var.f87b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = a23.f17b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    ah1Var.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = a23.f17b;
                    if (charAt < bArr2.length) {
                        byte b2 = bArr2[charAt];
                        if (b2 == 0) {
                            i = i5 + 1;
                            ah1Var.f86a[i5] = charAt;
                        } else {
                            if (b2 == 1) {
                                String str2 = a23.f16a[charAt];
                                ah1Var.a(i5, str2.length());
                                str2.getChars(0, str2.length(), ah1Var.f86a, i5);
                                int length3 = str2.length() + i5;
                                ah1Var.f87b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = ah1Var.f86a;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b2;
                                i5 += 2;
                                ah1Var.f87b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ah1Var.f86a[i5] = charAt;
                    }
                    i5 = i;
                }
                ah1Var.a(i5, 1);
                ah1Var.f86a[i5] = '\"';
                ah1Var.f87b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        ah1Var.f87b = i4 + 1;
    }

    public void j() {
    }

    public void k() {
    }
}
