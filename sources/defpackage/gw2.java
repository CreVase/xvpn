package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class gw2 {
    public static final xz0 h = new xz0(20);
    public static final xz0 i = new xz0(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f2334a;
    public int e;
    public int f;
    public int g;
    public final fw2[] c = new fw2[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2335b = new ArrayList();
    public int d = -1;

    public gw2(int i2) {
        this.f2334a = i2;
    }

    public final void a(float f, int i2) {
        fw2 fw2Var;
        int i3 = this.d;
        ArrayList arrayList = this.f2335b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        fw2[] fw2VarArr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            fw2Var = fw2VarArr[i5];
        } else {
            fw2Var = new fw2();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        fw2Var.f2166a = i6;
        fw2Var.f2167b = i2;
        fw2Var.c = f;
        arrayList.add(fw2Var);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.f2334a;
            if (i7 > i8) {
                int i9 = i7 - i8;
                fw2 fw2Var2 = (fw2) arrayList.get(0);
                int i10 = fw2Var2.f2167b;
                if (i10 <= i9) {
                    this.f -= i10;
                    arrayList.remove(0);
                    int i11 = this.g;
                    if (i11 < 5) {
                        this.g = i11 + 1;
                        fw2VarArr[i11] = fw2Var2;
                    }
                } else {
                    fw2Var2.f2167b = i10 - i9;
                    this.f -= i9;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.f2335b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            fw2 fw2Var = (fw2) arrayList.get(i4);
            i3 += fw2Var.f2167b;
            if (i3 >= f) {
                return fw2Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((fw2) arrayList.get(arrayList.size() - 1)).c;
    }
}
