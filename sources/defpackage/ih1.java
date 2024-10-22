package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class ih1 {

    /* renamed from: a, reason: collision with root package name */
    public final z13 f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2597b;
    public int c;

    public ih1(wf1 wf1Var, z13 z13Var) {
        this.f2596a = z13Var;
        this.f2597b = wf1Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ih1 r13, defpackage.bf0 r14, defpackage.c90 r15) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih1.a(ih1, bf0, c90):java.lang.Object");
    }

    public final eg1 b() {
        eg1 tg1Var;
        String j;
        Object obj;
        Object invoke;
        Object de1Var;
        z13 z13Var = this.f2596a;
        byte q = z13Var.q();
        if (q == 1) {
            return d(true);
        }
        if (q == 0) {
            return d(false);
        }
        if (q == 6) {
            int i = this.c + 1;
            this.c = i;
            if (i == 200) {
                gh1 gh1Var = new gh1(this, null);
                ba0 ba0Var = af0.f74a;
                bf0 bf0Var = new bf0(gh1Var);
                while (true) {
                    obj = bf0Var.d;
                    c90 c90Var = bf0Var.c;
                    if (c90Var == null) {
                        break;
                    }
                    ba0 ba0Var2 = af0.f74a;
                    if (m20.L(ba0Var2, obj)) {
                        try {
                            n41 n41Var = bf0Var.f457a;
                            Object obj2 = bf0Var.f458b;
                            if (!(n41Var instanceof mn)) {
                                t90 context = c90Var.getContext();
                                if (context == zq0.f5530a) {
                                    de1Var = new ce1(c90Var);
                                } else {
                                    de1Var = new de1(c90Var, context);
                                }
                                fl.d(3, n41Var);
                                invoke = n41Var.invoke(bf0Var, obj2, de1Var);
                            } else {
                                fl.d(3, n41Var);
                                invoke = n41Var.invoke(bf0Var, obj2, c90Var);
                            }
                            if (invoke != ba0.f430a) {
                                c90Var.resumeWith(invoke);
                            }
                        } catch (Throwable th) {
                            c90Var.resumeWith(new pk2(th));
                        }
                    } else {
                        bf0Var.d = ba0Var2;
                        c90Var.resumeWith(obj);
                    }
                }
                fl.a0(obj);
                tg1Var = (eg1) obj;
            } else {
                byte g = z13Var.g((byte) 6);
                if (z13Var.q() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!z13Var.b()) {
                            break;
                        }
                        if (this.f2597b) {
                            j = z13Var.k();
                        } else {
                            j = z13Var.j();
                        }
                        z13Var.g((byte) 5);
                        linkedHashMap.put(j, b());
                        g = z13Var.f();
                        if (g != 4) {
                            if (g != 7) {
                                z13.n(z13Var, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (g == 6) {
                        z13Var.g((byte) 7);
                    } else if (g == 4) {
                        z13.n(z13Var, "Unexpected trailing comma", 0, null, 6);
                        throw null;
                    }
                    tg1Var = new tg1(linkedHashMap);
                } else {
                    z13.n(z13Var, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.c--;
            return tg1Var;
        }
        if (q == 8) {
            return c();
        }
        z13.n(z13Var, hx2.m("Cannot begin reading element, unexpected token: ", q), 0, null, 6);
        throw null;
    }

    public final rf1 c() {
        boolean z;
        z13 z13Var = this.f2596a;
        byte f = z13Var.f();
        if (z13Var.q() != 4) {
            ArrayList arrayList = new ArrayList();
            while (z13Var.b()) {
                arrayList.add(b());
                f = z13Var.f();
                if (f != 4) {
                    if (f == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = z13Var.f5416a;
                    if (!z) {
                        z13.n(z13Var, "Expected end of the array or comma", i, null, 4);
                        throw null;
                    }
                }
            }
            if (f == 8) {
                z13Var.g((byte) 9);
            } else if (f == 4) {
                z13.n(z13Var, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            return new rf1(arrayList);
        }
        z13.n(z13Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final wg1 d(boolean z) {
        String k;
        boolean z2 = this.f2597b;
        z13 z13Var = this.f2596a;
        if (!z2 && z) {
            k = z13Var.j();
        } else {
            k = z13Var.k();
        }
        if (!z && m20.L(k, "null")) {
            return rg1.f4151a;
        }
        return new lg1(k, z);
    }
}
