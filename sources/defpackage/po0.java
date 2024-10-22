package defpackage;

import java.util.NoSuchElementException;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class po0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f3882b;
    public static final long c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f3883a;

    static {
        int i = qo0.f4029a;
        f3882b = fl.w(4611686018427387903L);
        c = fl.w(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (new io1(-4611686018426L, 4611686018426L).c(j5)) {
            return fl.y((j5 * j3) + (j2 - (j4 * j3)));
        }
        return fl.w(t9.x(j5));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        boolean z2;
        int i4;
        CharSequence charSequence;
        boolean z3;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i2);
            if (i3 >= 0) {
                if (i3 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i3);
                    kd1 kd1Var = new kd1(1, i3 - valueOf.length());
                    int i5 = kd1Var.f2572b;
                    int i6 = kd1Var.c;
                    if (i6 <= 0 ? 1 >= i5 : 1 <= i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                    while (z2) {
                        if (i4 == i5) {
                            if (z2) {
                                z2 = false;
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            i4 += i6;
                        }
                        sb2.append('0');
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i7 = -1;
                int length = obj.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i8 = length - 1;
                        if (obj.charAt(length) != '0') {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            i7 = length;
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            length = i8;
                        }
                    }
                }
                int i9 = i7 + 1;
                if (!z && i9 < 3) {
                    sb.append((CharSequence) obj, 0, i9);
                } else {
                    sb.append((CharSequence) obj, 0, ((i9 + 2) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(p71.k("Desired length ", i3, " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final int d(long j) {
        long j2;
        boolean z = false;
        if (e(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            z = true;
        }
        if (z) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        return (int) j2;
    }

    public static final boolean e(long j) {
        if (j != f3882b && j != c) {
            return false;
        }
        return true;
    }

    public static final long f(long j, long j2) {
        boolean z = true;
        if (e(j)) {
            if (!(!e(j2)) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        }
        if (e(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        boolean z2 = false;
        if (i == (((int) j2) & 1)) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (i != 0) {
                z = false;
            }
            if (z) {
                if (new io1(-4611686018426999999L, 4611686018426999999L).c(j3)) {
                    return fl.y(j3);
                }
                return fl.w(j3 / 1000000);
            }
            return fl.x(j3);
        }
        if (i == 1) {
            z2 = true;
        }
        if (z2) {
            return a(j >> 1, j2 >> 1);
        }
        return a(j2 >> 1, j >> 1);
    }

    public static final long g(long j, to0 to0Var) {
        to0 to0Var2;
        if (j == f3882b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        boolean z = true;
        long j2 = j >> 1;
        if ((((int) j) & 1) != 0) {
            z = false;
        }
        if (z) {
            to0Var2 = to0.f4550b;
        } else {
            to0Var2 = to0.c;
        }
        return to0Var.f4551a.convert(j2, to0Var2.f4551a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f3883a, ((po0) obj).f3883a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po0)) {
            return false;
        }
        if (this.f3883a != ((po0) obj).f3883a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f3883a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z;
        boolean z2;
        int g;
        int g2;
        int g3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        long j = this.f3883a;
        if (j == 0) {
            return "0s";
        }
        if (j == f3882b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = (((int) j) & 1) + ((-(j >> 1)) << 1);
            int i2 = qo0.f4029a;
        }
        long g4 = g(j, to0.g);
        if (e(j)) {
            g = 0;
        } else {
            g = (int) (g(j, to0.f) % 24);
        }
        if (e(j)) {
            g2 = 0;
        } else {
            g2 = (int) (g(j, to0.e) % 60);
        }
        if (e(j)) {
            g3 = 0;
        } else {
            g3 = (int) (g(j, to0.d) % 60);
        }
        int d2 = d(j);
        if (g4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (g3 == 0 && d2 == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3) {
            sb.append(g4);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g);
            sb.append('h');
            i = i3;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g2);
            sb.append('m');
            i = i4;
        }
        if (z6) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (g3 == 0 && !z3 && !z4 && !z5) {
                if (d2 >= 1000000) {
                    b(sb, d2 / 1000000, d2 % 1000000, 6, "ms", false);
                } else if (d2 >= 1000) {
                    b(sb, d2 / 1000, d2 % 1000, 3, "us", false);
                } else {
                    sb.append(d2);
                    sb.append("ns");
                }
            } else {
                b(sb, g3, d2, 9, "s", false);
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
