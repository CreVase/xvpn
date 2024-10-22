package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x7 {
    public final b d;

    /* renamed from: a, reason: collision with root package name */
    public final m62 f5124a = new m62(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5125b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int f = 0;
    public final i32 e = new i32(this, 0);

    public x7(b bVar) {
        this.d = bVar;
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w7 w7Var = (w7) arrayList.get(i2);
            int i3 = w7Var.f4952a;
            if (i3 == 8) {
                if (f(w7Var.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = w7Var.f4953b;
                int i5 = w7Var.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a((w7) arrayList.get(i));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f5125b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w7 w7Var = (w7) arrayList.get(i);
            int i2 = w7Var.f4952a;
            b bVar = this.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            bVar.a(w7Var);
                            bVar.f(w7Var.f4953b, w7Var.d);
                        }
                    } else {
                        bVar.a(w7Var);
                        bVar.d(w7Var.f4953b, w7Var.d, w7Var.c);
                    }
                } else {
                    bVar.a(w7Var);
                    int i3 = w7Var.f4953b;
                    int i4 = w7Var.d;
                    RecyclerView recyclerView = bVar.f273a;
                    recyclerView.R(i3, i4, true);
                    recyclerView.v0 = true;
                    recyclerView.s0.c += i4;
                }
            } else {
                bVar.a(w7Var);
                bVar.e(w7Var.f4953b, w7Var.d);
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(w7 w7Var) {
        int i;
        boolean z;
        int i2 = w7Var.f4952a;
        if (i2 != 1 && i2 != 8) {
            int m = m(w7Var.f4953b, i2);
            int i3 = w7Var.f4953b;
            int i4 = w7Var.f4952a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + w7Var);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < w7Var.d; i6++) {
                int m2 = m((i * i6) + w7Var.f4953b, w7Var.f4952a);
                int i7 = w7Var.f4952a;
                if (i7 == 2 ? m2 == m : !(i7 != 4 || m2 != m + 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i5++;
                } else {
                    w7 h = h(i7, m, i5, w7Var.c);
                    e(h, i3);
                    k(h);
                    if (w7Var.f4952a == 4) {
                        i3 += i5;
                    }
                    m = m2;
                    i5 = 1;
                }
            }
            Object obj = w7Var.c;
            k(w7Var);
            if (i5 > 0) {
                w7 h2 = h(w7Var.f4952a, m, i5, obj);
                e(h2, i3);
                k(h2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(w7 w7Var, int i) {
        b bVar = this.d;
        bVar.a(w7Var);
        int i2 = w7Var.f4952a;
        if (i2 != 2) {
            if (i2 == 4) {
                bVar.d(i, w7Var.d, w7Var.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = w7Var.d;
        RecyclerView recyclerView = bVar.f273a;
        recyclerView.R(i, i3, true);
        recyclerView.v0 = true;
        recyclerView.s0.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            w7 w7Var = (w7) arrayList.get(i2);
            int i3 = w7Var.f4952a;
            if (i3 == 8) {
                int i4 = w7Var.f4953b;
                if (i4 == i) {
                    i = w7Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (w7Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = w7Var.f4953b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = w7Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += w7Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        if (this.f5125b.size() > 0) {
            return true;
        }
        return false;
    }

    public final w7 h(int i, int i2, int i3, Object obj) {
        w7 w7Var = (w7) this.f5124a.a();
        if (w7Var == null) {
            return new w7(i, i2, i3, obj);
        }
        w7Var.f4952a = i;
        w7Var.f4953b = i2;
        w7Var.d = i3;
        w7Var.c = obj;
        return w7Var;
    }

    public final void i(w7 w7Var) {
        this.c.add(w7Var);
        int i = w7Var.f4952a;
        b bVar = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        bVar.f(w7Var.f4953b, w7Var.d);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + w7Var);
                    }
                }
                bVar.d(w7Var.f4953b, w7Var.d, w7Var.c);
                return;
            }
            int i2 = w7Var.f4953b;
            int i3 = w7Var.d;
            RecyclerView recyclerView = bVar.f273a;
            recyclerView.R(i2, i3, false);
            recyclerView.v0 = true;
            return;
        }
        bVar.e(w7Var.f4953b, w7Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7.j():void");
    }

    public final void k(w7 w7Var) {
        w7Var.c = null;
        this.f5124a.b(w7Var);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((w7) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w7 w7Var = (w7) arrayList.get(size);
            int i5 = w7Var.f4952a;
            if (i5 == 8) {
                int i6 = w7Var.f4953b;
                int i7 = w7Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            w7Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            w7Var.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            w7Var.f4953b = i6 + 1;
                        } else if (i2 == 2) {
                            w7Var.f4953b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        w7Var.f4953b = i6 + 1;
                        w7Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        w7Var.f4953b = i6 - 1;
                        w7Var.d = i7 - 1;
                    }
                }
            } else {
                int i8 = w7Var.f4953b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= w7Var.d;
                    } else if (i5 == 2) {
                        i += w7Var.d;
                    }
                } else if (i2 == 1) {
                    w7Var.f4953b = i8 + 1;
                } else if (i2 == 2) {
                    w7Var.f4953b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            w7 w7Var2 = (w7) arrayList.get(size2);
            if (w7Var2.f4952a == 8) {
                int i9 = w7Var2.d;
                if (i9 == w7Var2.f4953b || i9 < 0) {
                    arrayList.remove(size2);
                    k(w7Var2);
                }
            } else if (w7Var2.d <= 0) {
                arrayList.remove(size2);
                k(w7Var2);
            }
        }
        return i;
    }
}
