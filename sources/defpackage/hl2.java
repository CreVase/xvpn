package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class hl2 implements v33, Closeable {
    public static final TreeMap i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2447b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public final int g;
    public int h;

    public hl2(int i2) {
        this.g = i2;
        int i3 = i2 + 1;
        this.f = new int[i3];
        this.f2447b = new long[i3];
        this.c = new double[i3];
        this.d = new String[i3];
        this.e = new byte[i3];
    }

    public static hl2 a(int i2, String str) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                hl2 hl2Var = (hl2) ceilingEntry.getValue();
                hl2Var.f2446a = str;
                hl2Var.h = i2;
                return hl2Var;
            }
            hl2 hl2Var2 = new hl2(i2);
            hl2Var2.f2446a = str;
            hl2Var2.h = i2;
            return hl2Var2;
        }
    }

    public final void K(int i2, String str) {
        this.f[i2] = 4;
        this.d[i2] = str;
    }

    @Override // defpackage.v33
    public final String c() {
        return this.f2446a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(int i2, long j) {
        this.f[i2] = 2;
        this.f2447b[i2] = j;
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // defpackage.v33
    public final void w(n31 n31Var) {
        for (int i2 = 1; i2 <= this.h; i2++) {
            int i3 = this.f[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                n31Var.a(i2, this.e[i2]);
                            }
                        } else {
                            n31Var.x(i2, this.d[i2]);
                        }
                    } else {
                        n31Var.c(i2, this.c[i2]);
                    }
                } else {
                    n31Var.d(i2, this.f2447b[i2]);
                }
            } else {
                n31Var.w(i2);
            }
        }
    }

    public final void x(int i2) {
        this.f[i2] = 1;
    }
}
