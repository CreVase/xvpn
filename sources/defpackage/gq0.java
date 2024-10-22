package defpackage;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class gq0 implements jh {

    /* renamed from: a, reason: collision with root package name */
    public final int f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2303b;
    public final Object c;

    public gq0(EditText editText) {
        this.f2302a = Integer.MAX_VALUE;
        this.f2303b = 0;
        if (editText != null) {
            this.c = new fq0(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    @Override // defpackage.jh
    public final int a() {
        return this.f2302a;
    }

    @Override // defpackage.jh
    public final int b() {
        return this.f2303b;
    }

    @Override // defpackage.jh
    public final int c() {
        int i = this.f2302a;
        if (i == -1) {
            return ((r42) this.c).y();
        }
        return i;
    }

    public gq0(gh ghVar, y01 y01Var) {
        r42 r42Var = ghVar.c;
        this.c = r42Var;
        r42Var.G(12);
        int y = r42Var.y();
        if ("audio/raw".equals(y01Var.l)) {
            int s = wi3.s(y01Var.A, y01Var.y);
            if (y == 0 || y % s != 0) {
                sn1.f();
                y = s;
            }
        }
        this.f2302a = y == 0 ? -1 : y;
        this.f2303b = r42Var.y();
    }
}
