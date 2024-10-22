package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jr implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public lr f2813a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2814b;
    public so2 c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void a(long j) {
        boolean z;
        lr lrVar = this.f2813a;
        if (lrVar != null) {
            if (this.f2814b) {
                long j2 = lrVar.f3176b;
                int i = 1;
                if (j <= j2) {
                    if (j >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            so2 so2Var = lrVar.f3175a.g;
                            int i2 = so2Var.c;
                            long j4 = i2 - so2Var.f4387b;
                            if (j4 <= j3) {
                                lrVar.f3175a = so2Var.a();
                                uo2.a(so2Var);
                                j3 -= j4;
                            } else {
                                so2Var.c = i2 - ((int) j3);
                                break;
                            }
                        }
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.g = -1;
                    } else {
                        throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "newSize < 0: ").toString());
                    }
                } else if (j > j2) {
                    long j5 = j - j2;
                    boolean z2 = true;
                    while (j5 > 0) {
                        so2 S = lrVar.S(i);
                        int min = (int) Math.min(j5, 8192 - S.c);
                        int i3 = S.c + min;
                        S.c = i3;
                        j5 -= min;
                        if (z2) {
                            this.c = S;
                            this.d = j2;
                            this.e = S.f4386a;
                            this.f = i3 - min;
                            this.g = i3;
                            i = 1;
                            z2 = false;
                        } else {
                            i = 1;
                        }
                    }
                }
                lrVar.f3176b = j;
                return;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public final int c(long j) {
        lr lrVar = this.f2813a;
        if (lrVar != null) {
            if (j >= -1) {
                long j2 = lrVar.f3176b;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        so2 so2Var = lrVar.f3175a;
                        so2 so2Var2 = this.c;
                        long j3 = 0;
                        if (so2Var2 != null) {
                            long j4 = this.d - (this.f - so2Var2.f4387b);
                            if (j4 > j) {
                                j2 = j4;
                            } else {
                                j3 = j4;
                                so2Var2 = so2Var;
                                so2Var = so2Var2;
                            }
                        } else {
                            so2Var2 = so2Var;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                long j5 = (so2Var.c - so2Var.f4387b) + j3;
                                if (j < j5) {
                                    break;
                                }
                                so2Var = so2Var.f;
                                j3 = j5;
                            }
                        } else {
                            while (j2 > j) {
                                so2Var2 = so2Var2.g;
                                j2 -= so2Var2.c - so2Var2.f4387b;
                            }
                            j3 = j2;
                            so2Var = so2Var2;
                        }
                        if (this.f2814b && so2Var.d) {
                            byte[] bArr = so2Var.f4386a;
                            so2 so2Var3 = new so2(Arrays.copyOf(bArr, bArr.length), so2Var.f4387b, so2Var.c, false, true);
                            if (lrVar.f3175a == so2Var) {
                                lrVar.f3175a = so2Var3;
                            }
                            so2Var.b(so2Var3);
                            so2Var3.g.a();
                            so2Var = so2Var3;
                        }
                        this.c = so2Var;
                        this.d = j;
                        this.e = so2Var.f4386a;
                        int i = so2Var.f4387b + ((int) (j - j3));
                        this.f = i;
                        int i2 = so2Var.c;
                        this.g = i2;
                        return i2 - i;
                    }
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + lrVar.f3176b);
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f2813a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f2813a = null;
            this.c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.g = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }
}
