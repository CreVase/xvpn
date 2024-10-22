package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class wc3 {

    /* renamed from: a, reason: collision with root package name */
    public String f4983a;

    /* renamed from: b, reason: collision with root package name */
    public int f4984b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public z63 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(wc3 wc3Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (wc3Var != null) {
            if (!this.c && wc3Var.c) {
                this.f4984b = wc3Var.f4984b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = wc3Var.h;
            }
            if (this.i == -1) {
                this.i = wc3Var.i;
            }
            if (this.f4983a == null && (str = wc3Var.f4983a) != null) {
                this.f4983a = str;
            }
            if (this.f == -1) {
                this.f = wc3Var.f;
            }
            if (this.g == -1) {
                this.g = wc3Var.g;
            }
            if (this.n == -1) {
                this.n = wc3Var.n;
            }
            if (this.o == null && (alignment2 = wc3Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = wc3Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = wc3Var.q;
            }
            if (this.j == -1) {
                this.j = wc3Var.j;
                this.k = wc3Var.k;
            }
            if (this.r == null) {
                this.r = wc3Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = wc3Var.s;
            }
            if (!this.e && wc3Var.e) {
                this.d = wc3Var.d;
                this.e = true;
            }
            if (this.m == -1 && (i = wc3Var.m) != -1) {
                this.m = i;
            }
        }
    }
}
