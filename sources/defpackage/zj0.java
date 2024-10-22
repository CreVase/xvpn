package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class zj0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck0 f5491b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ uo d;

    public /* synthetic */ zj0(ck0 ck0Var, Runnable runnable, uo uoVar, int i) {
        this.f5490a = i;
        this.f5491b = ck0Var;
        this.c = runnable;
        this.d = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5490a;
        final uo uoVar = this.d;
        final Runnable runnable = this.c;
        ck0 ck0Var = this.f5491b;
        switch (i) {
            case 0:
                ck0Var.getClass();
                final int i2 = 0;
                ck0Var.f655a.execute(new Runnable() { // from class: bk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        uo uoVar2 = uoVar;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ek0 ek0Var = (ek0) uoVar2.f4707a;
                                    int i4 = ek0.i;
                                    ek0Var.i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    ek0 ek0Var2 = (ek0) uoVar2.f4707a;
                                    int i5 = ek0.i;
                                    ek0Var2.h(null);
                                    return;
                                } catch (Exception e2) {
                                    ek0 ek0Var3 = (ek0) uoVar2.f4707a;
                                    int i6 = ek0.i;
                                    ek0Var3.i(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ek0 ek0Var4 = (ek0) uoVar2.f4707a;
                                    int i7 = ek0.i;
                                    ek0Var4.i(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ck0Var.getClass();
                final int i3 = 2;
                ck0Var.f655a.execute(new Runnable() { // from class: bk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        uo uoVar2 = uoVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ek0 ek0Var = (ek0) uoVar2.f4707a;
                                    int i4 = ek0.i;
                                    ek0Var.i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    ek0 ek0Var2 = (ek0) uoVar2.f4707a;
                                    int i5 = ek0.i;
                                    ek0Var2.h(null);
                                    return;
                                } catch (Exception e2) {
                                    ek0 ek0Var3 = (ek0) uoVar2.f4707a;
                                    int i6 = ek0.i;
                                    ek0Var3.i(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ek0 ek0Var4 = (ek0) uoVar2.f4707a;
                                    int i7 = ek0.i;
                                    ek0Var4.i(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ck0Var.getClass();
                final int i4 = 1;
                ck0Var.f655a.execute(new Runnable() { // from class: bk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        uo uoVar2 = uoVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ek0 ek0Var = (ek0) uoVar2.f4707a;
                                    int i42 = ek0.i;
                                    ek0Var.i(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    ek0 ek0Var2 = (ek0) uoVar2.f4707a;
                                    int i5 = ek0.i;
                                    ek0Var2.h(null);
                                    return;
                                } catch (Exception e2) {
                                    ek0 ek0Var3 = (ek0) uoVar2.f4707a;
                                    int i6 = ek0.i;
                                    ek0Var3.i(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ek0 ek0Var4 = (ek0) uoVar2.f4707a;
                                    int i7 = ek0.i;
                                    ek0Var4.i(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
