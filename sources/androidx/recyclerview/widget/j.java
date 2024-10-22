package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.cm3;
import defpackage.cz1;
import defpackage.g03;
import defpackage.i32;
import defpackage.kh2;
import defpackage.ko1;
import defpackage.lm2;
import defpackage.nh2;
import defpackage.ok3;
import defpackage.uu2;
import defpackage.ym3;
import defpackage.yz2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements g03, ym3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283a;

    /* renamed from: b, reason: collision with root package name */
    public Object f284b;
    public Object c;

    public j(int i) {
        this.f283a = i;
        if (i != 1) {
            return;
        }
        this.f284b = new uu2();
        this.c = new ko1();
    }

    public final void a(h hVar) {
        cm3 cm3Var = (cm3) ((uu2) this.f284b).getOrDefault(hVar, null);
        if (cm3Var == null) {
            cm3Var = cm3.a();
            ((uu2) this.f284b).put(hVar, cm3Var);
        }
        cm3Var.f668a |= 1;
    }

    @Override // defpackage.g03
    public final long b(long j) {
        Long l = (Long) ((ko1) this.f284b).e(j, null);
        if (l == null) {
            lm2 lm2Var = (lm2) this.c;
            long j2 = lm2Var.f3157a;
            lm2Var.f3157a = 1 + j2;
            l = Long.valueOf(j2);
            ((ko1) this.f284b).f(j, l);
        }
        return l.longValue();
    }

    public final void c(h hVar, kh2 kh2Var) {
        cm3 cm3Var = (cm3) ((uu2) this.f284b).getOrDefault(hVar, null);
        if (cm3Var == null) {
            cm3Var = cm3.a();
            ((uu2) this.f284b).put(hVar, cm3Var);
        }
        cm3Var.c = kh2Var;
        cm3Var.f668a |= 8;
    }

    public final void d(h hVar, kh2 kh2Var) {
        cm3 cm3Var = (cm3) ((uu2) this.f284b).getOrDefault(hVar, null);
        if (cm3Var == null) {
            cm3Var = cm3.a();
            ((uu2) this.f284b).put(hVar, cm3Var);
        }
        cm3Var.f669b = kh2Var;
        cm3Var.f668a |= 4;
    }

    public final void e() {
        switch (this.f283a) {
            case 0:
                int[] iArr = (int[]) this.f284b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.c = null;
                return;
            default:
                ((uu2) this.f284b).clear();
                ((ko1) this.c).b();
                return;
        }
    }

    public final void f(int i) {
        Object obj = this.f284b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.f284b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f284b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f284b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View g(int i, int i2, int i3, int i4) {
        int E;
        int i5;
        View u;
        nh2 nh2Var = (nh2) ((ok3) this.f284b);
        int i6 = nh2Var.f3460a;
        c cVar = nh2Var.f3461b;
        switch (i6) {
            case 0:
                E = cVar.C();
                break;
            default:
                E = cVar.E();
                break;
        }
        int c = ((nh2) ((ok3) this.f284b)).c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            nh2 nh2Var2 = (nh2) ((ok3) this.f284b);
            int i7 = nh2Var2.f3460a;
            c cVar2 = nh2Var2.f3461b;
            switch (i7) {
                case 0:
                    u = cVar2.u(i);
                    break;
                default:
                    u = cVar2.u(i);
                    break;
            }
            int b2 = ((nh2) ((ok3) this.f284b)).b(u);
            int a2 = ((nh2) ((ok3) this.f284b)).a(u);
            Object obj = this.c;
            yz2 yz2Var = (yz2) obj;
            yz2Var.f5405b = E;
            yz2Var.c = c;
            yz2Var.d = b2;
            yz2Var.e = a2;
            if (i3 != 0) {
                ((yz2) obj).f5404a = i3 | 0;
                if (((yz2) obj).a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                Object obj2 = this.c;
                ((yz2) obj2).f5404a = i4 | 0;
                if (((yz2) obj2).a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f284b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L14
            goto L71
        L14:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1a
            goto L34
        L1a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L1f:
            if (r0 < 0) goto L34
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r4 = r3.f269a
            if (r4 != r6) goto L31
            r2 = r3
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L1f
        L34:
            if (r2 == 0) goto L3d
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3d:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L46:
            if (r2 >= r0) goto L5a
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f269a
            if (r3 < r6) goto L57
            goto L5b
        L57:
            int r2 = r2 + 1
            goto L46
        L5a:
            r2 = -1
        L5b:
            if (r2 == r1) goto L71
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f269a
            goto L72
        L71:
            r0 = -1
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f284b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f284b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f284b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f284b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.j.h(int):int");
    }

    public final boolean i(View view) {
        int E;
        yz2 yz2Var = (yz2) this.c;
        nh2 nh2Var = (nh2) ((ok3) this.f284b);
        int i = nh2Var.f3460a;
        c cVar = nh2Var.f3461b;
        switch (i) {
            case 0:
                E = cVar.C();
                break;
            default:
                E = cVar.E();
                break;
        }
        int c = ((nh2) ((ok3) this.f284b)).c();
        int b2 = ((nh2) ((ok3) this.f284b)).b(view);
        int a2 = ((nh2) ((ok3) this.f284b)).a(view);
        yz2Var.f5405b = E;
        yz2Var.c = c;
        yz2Var.d = b2;
        yz2Var.e = a2;
        Object obj = this.c;
        ((yz2) obj).f5404a = 24579 | 0;
        return ((yz2) obj).a();
    }

    public final void j(int i, int i2) {
        int[] iArr = (int[]) this.f284b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            f(i3);
            int[] iArr2 = (int[]) this.f284b;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.f284b, i, i3, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((List) this.c).get(size);
                    int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f269a;
                    if (i4 >= i) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f269a = i4 + i2;
                    }
                }
            }
        }
    }

    public final void k(int i, int i2) {
        int[] iArr = (int[]) this.f284b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            f(i3);
            int[] iArr2 = (int[]) this.f284b;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.f284b;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((List) this.c).get(size);
                    int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f269a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.c).remove(size);
                        } else {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f269a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public final kh2 l(h hVar, int i) {
        cm3 cm3Var;
        kh2 kh2Var;
        int f = ((uu2) this.f284b).f(hVar);
        if (f >= 0 && (cm3Var = (cm3) ((uu2) this.f284b).k(f)) != null) {
            int i2 = cm3Var.f668a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                cm3Var.f668a = i3;
                if (i == 4) {
                    kh2Var = cm3Var.f669b;
                } else if (i == 8) {
                    kh2Var = cm3Var.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((uu2) this.f284b).j(f);
                    cm3Var.f668a = 0;
                    cm3Var.f669b = null;
                    cm3Var.c = null;
                    cm3.d.b(cm3Var);
                }
                return kh2Var;
            }
        }
        return null;
    }

    public final void m(h hVar) {
        cm3 cm3Var = (cm3) ((uu2) this.f284b).getOrDefault(hVar, null);
        if (cm3Var == null) {
            return;
        }
        cm3Var.f668a &= -2;
    }

    @Override // defpackage.ym3
    public final int n(int i) {
        return i;
    }

    @Override // defpackage.ym3
    public final int o(int i) {
        List list = (List) ((SparseArray) ((i32) this.c).f2531b).get(i);
        if (list == null) {
            list = new ArrayList();
            ((SparseArray) ((i32) this.c).f2531b).put(i, list);
        }
        if (!list.contains((cz1) this.f284b)) {
            list.add((cz1) this.f284b);
        }
        return i;
    }

    public final void p(h hVar) {
        ko1 ko1Var = (ko1) this.c;
        if (ko1Var.f2986a) {
            ko1Var.d();
        }
        int i = ko1Var.d - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (hVar == ((ko1) this.c).g(i)) {
                ko1 ko1Var2 = (ko1) this.c;
                Object[] objArr = ko1Var2.c;
                Object obj = objArr[i];
                Object obj2 = ko1.e;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    ko1Var2.f2986a = true;
                }
            } else {
                i--;
            }
        }
        cm3 cm3Var = (cm3) ((uu2) this.f284b).remove(hVar);
        if (cm3Var != null) {
            cm3Var.f668a = 0;
            cm3Var.f669b = null;
            cm3Var.c = null;
            cm3.d.b(cm3Var);
        }
    }

    public j(i32 i32Var, cz1 cz1Var) {
        this.f283a = 4;
        this.c = i32Var;
        this.f284b = cz1Var;
    }

    public j(lm2 lm2Var) {
        this.f283a = 2;
        this.c = lm2Var;
        this.f284b = new ko1();
    }

    public j(nh2 nh2Var) {
        this.f283a = 3;
        this.f284b = nh2Var;
        this.c = new yz2();
    }
}
