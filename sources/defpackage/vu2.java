package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class vu2 implements jt {
    public static final HashSet j = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final File f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final pt f4900b;
    public final jx0 c;
    public final rt d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public ht i;

    public vu2(File file, pt ptVar, he0 he0Var) {
        rt rtVar;
        boolean add;
        jx0 jx0Var = new jx0(he0Var, file);
        if (he0Var != null) {
            rtVar = new rt(he0Var);
        } else {
            rtVar = null;
        }
        synchronized (vu2.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (add) {
            this.f4899a = file;
            this.f4900b = ptVar;
            this.c = jx0Var;
            this.d = rtVar;
            this.e = new HashMap();
            this.f = new Random();
            this.g = ptVar.requiresCacheSpanTouches();
            this.h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new xk0(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    public static void a(vu2 vu2Var) {
        long j2;
        jx0 jx0Var = vu2Var.c;
        File file = vu2Var.f4899a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (ht e) {
                vu2Var.i = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            sn1.c("SimpleCache", str);
            vu2Var.i = new ht(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i < length) {
                File file2 = listFiles[i];
                String name = file2.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        sn1.c("SimpleCache", "Malformed UID file: " + file2);
                        file2.delete();
                    }
                }
                i++;
            } else {
                j2 = -1;
                break;
            }
        }
        vu2Var.h = j2;
        if (j2 == -1) {
            try {
                vu2Var.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                sn1.d("SimpleCache", str2, e2);
                vu2Var.i = new ht(str2, e2);
                return;
            }
        }
        try {
            jx0Var.r(vu2Var.h);
            rt rtVar = vu2Var.d;
            if (rtVar != null) {
                rtVar.b(vu2Var.h);
                HashMap a2 = rtVar.a();
                vu2Var.j(file, true, listFiles, a2);
                rtVar.c(a2.keySet());
            } else {
                vu2Var.j(file, true, listFiles, null);
            }
            kh3 it = ob1.l(((HashMap) jx0Var.f2845a).keySet()).iterator();
            while (it.hasNext()) {
                jx0Var.s((String) it.next());
            }
            try {
                jx0Var.E();
            } catch (IOException e3) {
                sn1.d("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            sn1.d("SimpleCache", str3, e4);
            vu2Var.i = new ht(str3, e4);
        }
    }

    public static void e(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            sn1.c("SimpleCache", str);
            throw new ht(str);
        }
    }

    public static long f(File file) {
        long abs;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            abs = 0;
        } else {
            abs = Math.abs(nextLong);
        }
        File file2 = new File(file, p71.l(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(wu2 wu2Var) {
        jx0 jx0Var = this.c;
        String str = wu2Var.f4569a;
        jx0Var.m(str).c.add(wu2Var);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((pt) arrayList.get(size)).onSpanAdded(this, wu2Var);
                }
            }
        }
        this.f4900b.onSpanAdded(this, wu2Var);
    }

    public final synchronized void c(uy0 uy0Var, String str) {
        d();
        jx0 jx0Var = this.c;
        wt m = jx0Var.m(str);
        m.e = m.e.a(uy0Var);
        if (!r3.equals(r1)) {
            ((zt) jx0Var.e).c(m);
        }
        try {
            this.c.E();
        } catch (IOException e) {
            throw new ht(e);
        }
    }

    public final synchronized void d() {
        ht htVar = this.i;
        if (htVar != null) {
            throw htVar;
        }
    }

    public final synchronized long g(long j2, String str, long j3) {
        long j4;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        wt k = this.c.k(str);
        if (k != null) {
            j4 = k.a(j2, j3);
        } else {
            j4 = -j3;
        }
        return j4;
    }

    public final synchronized TreeSet h(String str) {
        TreeSet treeSet;
        wt k = this.c.k(str);
        if (k != null && !k.c.isEmpty()) {
            treeSet = new TreeSet((Collection) k.c);
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public final synchronized og0 i(String str) {
        og0 og0Var;
        wt k = this.c.k(str);
        if (k != null) {
            og0Var = k.e;
        } else {
            og0Var = og0.c;
        }
        return og0Var;
    }

    public final void j(File file, boolean z, File[] fileArr, HashMap hashMap) {
        qt qtVar;
        long j2;
        long j3;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    j(file2, false, file2.listFiles(), hashMap);
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    if (hashMap != null) {
                        qtVar = (qt) hashMap.remove(name);
                    } else {
                        qtVar = null;
                    }
                    if (qtVar != null) {
                        j3 = qtVar.f4053a;
                        j2 = qtVar.f4054b;
                    } else {
                        j2 = -9223372036854775807L;
                        j3 = -1;
                    }
                    wu2 b2 = wu2.b(file2, j3, j2, this.c);
                    if (b2 != null) {
                        b(b2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return;
        }
        if (!z) {
            file.delete();
        }
    }

    public final synchronized void k(tt ttVar) {
        wt k = this.c.k(ttVar.f4569a);
        k.getClass();
        long j2 = ttVar.f4570b;
        int i = 0;
        while (true) {
            ArrayList arrayList = k.d;
            if (i < arrayList.size()) {
                if (((vt) arrayList.get(i)).f4890a == j2) {
                    arrayList.remove(i);
                    this.c.s(k.f5068b);
                    notifyAll();
                } else {
                    i++;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void l(tt ttVar) {
        boolean z;
        String str = ttVar.f4569a;
        jx0 jx0Var = this.c;
        wt k = jx0Var.k(str);
        if (k != null) {
            boolean remove = k.c.remove(ttVar);
            File file = ttVar.e;
            if (remove) {
                if (file != null) {
                    file.delete();
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                rt rtVar = this.d;
                if (rtVar != null) {
                    String name = file.getName();
                    try {
                        rtVar.f4209b.getClass();
                        try {
                            ((rg0) rtVar.f4208a).b().delete(rtVar.f4209b, "name = ?", new String[]{name});
                        } catch (SQLException e) {
                            throw new ge0(e);
                        }
                    } catch (IOException unused) {
                        sn1.f();
                    }
                }
                jx0Var.s(k.f5068b);
                ArrayList arrayList = (ArrayList) this.e.get(ttVar.f4569a);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            ((pt) arrayList.get(size)).onSpanRemoved(this, ttVar);
                        }
                    }
                }
                this.f4900b.onSpanRemoved(this, ttVar);
            }
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.f2845a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((wt) it.next()).c.iterator();
            while (it2.hasNext()) {
                tt ttVar = (tt) it2.next();
                if (ttVar.e.length() != ttVar.c) {
                    arrayList.add(ttVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            l((tt) arrayList.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x0098, LOOP:0: B:14:0x0053->B:25:0x0085, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0012, B:7:0x003f, B:9:0x0043, B:13:0x0049, B:14:0x0053, B:16:0x005c, B:18:0x006a, B:20:0x0070, B:25:0x0085, B:35:0x007a, B:39:0x0088, B:42:0x0027, B:44:0x002f, B:46:0x003b), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.wu2 n(long r18, java.lang.String r20, long r21) {
        /*
            r17 = this;
            r1 = r17
            r11 = r18
            r0 = r20
            monitor-enter(r17)
            r17.d()     // Catch: java.lang.Throwable -> L98
            jx0 r2 = r1.c     // Catch: java.lang.Throwable -> L98
            wt r2 = r2.k(r0)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L25
            wu2 r13 = new wu2     // Catch: java.lang.Throwable -> L98
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r2 = r13
            r3 = r20
            r4 = r18
            r6 = r21
            r2.<init>(r3, r4, r6, r8, r10)     // Catch: java.lang.Throwable -> L98
            goto L3f
        L25:
            r3 = r21
        L27:
            wu2 r13 = r2.b(r11, r3)     // Catch: java.lang.Throwable -> L98
            boolean r5 = r13.d     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L3f
            java.io.File r5 = r13.e     // Catch: java.lang.Throwable -> L98
            long r5 = r5.length()     // Catch: java.lang.Throwable -> L98
            long r7 = r13.c     // Catch: java.lang.Throwable -> L98
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L3f
            r17.m()     // Catch: java.lang.Throwable -> L98
            goto L27
        L3f:
            boolean r2 = r13.d     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L49
            wu2 r0 = r1.o(r0, r13)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r17)
            return r0
        L49:
            jx0 r2 = r1.c     // Catch: java.lang.Throwable -> L98
            wt r0 = r2.m(r0)     // Catch: java.lang.Throwable -> L98
            long r2 = r13.c     // Catch: java.lang.Throwable -> L98
            r4 = 0
            r5 = 0
        L53:
            java.util.ArrayList r6 = r0.d     // Catch: java.lang.Throwable -> L98
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L98
            r8 = 1
            if (r5 >= r7) goto L88
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L98
            vt r6 = (defpackage.vt) r6     // Catch: java.lang.Throwable -> L98
            long r9 = r6.f4890a     // Catch: java.lang.Throwable -> L98
            r14 = -1
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L76
            long r6 = r6.f4891b     // Catch: java.lang.Throwable -> L98
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 == 0) goto L82
            long r9 = r9 + r6
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L81
            goto L82
        L76:
            int r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r6 == 0) goto L82
            long r6 = r11 + r2
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 <= 0) goto L81
            goto L82
        L81:
            r8 = 0
        L82:
            if (r8 == 0) goto L85
            goto L91
        L85:
            int r5 = r5 + 1
            goto L53
        L88:
            vt r0 = new vt     // Catch: java.lang.Throwable -> L98
            r0.<init>(r11, r2)     // Catch: java.lang.Throwable -> L98
            r6.add(r0)     // Catch: java.lang.Throwable -> L98
            r4 = 1
        L91:
            if (r4 == 0) goto L95
            monitor-exit(r17)
            return r13
        L95:
            monitor-exit(r17)
            r0 = 0
            return r0
        L98:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.n(long, java.lang.String, long):wu2");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wu2 o(java.lang.String r17, defpackage.wu2 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.g
            if (r2 != 0) goto L9
            return r1
        L9:
            java.io.File r2 = r1.e
            r2.getClass()
            java.lang.String r6 = r2.getName()
            long r4 = r1.c
            long r13 = java.lang.System.currentTimeMillis()
            rt r3 = r0.d
            if (r3 == 0) goto L26
            r7 = r13
            r3.d(r4, r6, r7)     // Catch: java.io.IOException -> L21
            goto L24
        L21:
            defpackage.sn1.f()
        L24:
            r3 = 0
            goto L27
        L26:
            r3 = 1
        L27:
            jx0 r4 = r0.c
            r5 = r17
            wt r4 = r4.k(r5)
            java.util.TreeSet r5 = r4.c
            boolean r6 = r5.remove(r1)
            defpackage.cp3.m(r6)
            r2.getClass()
            if (r3 == 0) goto L5e
            java.io.File r7 = r2.getParentFile()
            r7.getClass()
            long r9 = r1.f4570b
            int r8 = r4.f5067a
            r11 = r13
            java.io.File r3 = defpackage.wu2.c(r7, r8, r9, r11)
            boolean r4 = r2.renameTo(r3)
            if (r4 == 0) goto L55
            r15 = r3
            goto L5f
        L55:
            r2.toString()
            r3.toString()
            defpackage.sn1.f()
        L5e:
            r15 = r2
        L5f:
            boolean r2 = r1.d
            defpackage.cp3.m(r2)
            wu2 r2 = new wu2
            java.lang.String r8 = r1.f4569a
            long r9 = r1.f4570b
            long r11 = r1.c
            r7 = r2
            r7.<init>(r8, r9, r11, r13, r15)
            r5.add(r2)
            java.util.HashMap r3 = r0.e
            java.lang.String r4 = r1.f4569a
            java.lang.Object r3 = r3.get(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L91
            int r4 = r3.size()
        L83:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L91
            java.lang.Object r5 = r3.get(r4)
            pt r5 = (defpackage.pt) r5
            r5.onSpanTouched(r0, r1, r2)
            goto L83
        L91:
            pt r3 = r0.f4900b
            r3.onSpanTouched(r0, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu2.o(java.lang.String, wu2):wu2");
    }
}
