package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class sm3 extends pd0 {
    public final /* synthetic */ int g;
    public boolean h;
    public int i;
    public final /* synthetic */ Object j;

    public sm3(tm3 tm3Var) {
        this.g = 0;
        this.j = tm3Var;
        this.h = false;
        this.i = 0;
    }

    @Override // defpackage.pd0, defpackage.um3
    public final void a(View view) {
        switch (this.g) {
            case 1:
                this.h = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.pd0, defpackage.um3
    public final void b() {
        int i = this.g;
        Object obj = this.j;
        switch (i) {
            case 0:
                if (!this.h) {
                    this.h = true;
                    um3 um3Var = ((tm3) obj).d;
                    if (um3Var != null) {
                        um3Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((w93) obj).f4966a.setVisibility(0);
                return;
        }
    }

    @Override // defpackage.um3
    public final void c() {
        int i = this.g;
        Object obj = this.j;
        switch (i) {
            case 0:
                int i2 = this.i + 1;
                this.i = i2;
                tm3 tm3Var = (tm3) obj;
                if (i2 == tm3Var.f4538a.size()) {
                    um3 um3Var = tm3Var.d;
                    if (um3Var != null) {
                        um3Var.c();
                    }
                    this.i = 0;
                    this.h = false;
                    tm3Var.e = false;
                    return;
                }
                return;
            default:
                if (!this.h) {
                    ((w93) obj).f4966a.setVisibility(this.i);
                    return;
                }
                return;
        }
    }

    public sm3(w93 w93Var, int i) {
        this.g = 1;
        this.j = w93Var;
        this.i = i;
        this.h = false;
    }
}
