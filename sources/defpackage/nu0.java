package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class nu0 extends b33 {
    public final /* synthetic */ int f;
    public final /* synthetic */ w23 g;

    public /* synthetic */ nu0(w23 w23Var, int i) {
        this.f = i;
        this.g = w23Var;
    }

    @Override // defpackage.we0
    public final void i() {
        boolean z;
        boolean z2 = false;
        switch (this.f) {
            case 0:
                ArrayDeque arrayDeque = ((pu0) this.g).c;
                if (arrayDeque.size() < 2) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.m(z);
                cp3.e(true ^ arrayDeque.contains(this));
                this.f3342b = 0;
                this.d = null;
                arrayDeque.addFirst(this);
                return;
            default:
                zu2 zu2Var = (zu2) this.g;
                synchronized (zu2Var.f5551b) {
                    this.f3342b = 0;
                    this.d = null;
                    int i = zu2Var.h;
                    zu2Var.h = i + 1;
                    zu2Var.f[i] = this;
                    if (!zu2Var.c.isEmpty() && zu2Var.h > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        zu2Var.f5551b.notify();
                    }
                }
                return;
        }
    }
}
