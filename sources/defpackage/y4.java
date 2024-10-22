package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5264a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5265b;
    public final Object c;

    public /* synthetic */ y4(int i, Object obj, Object obj2) {
        this.f5264a = i;
        this.c = obj;
        this.f5265b = obj2;
    }

    private void a() {
        synchronized (((ConstraintTrackingWorker) this.c).f300b) {
            if (((ConstraintTrackingWorker) this.c).c) {
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.c;
                constraintTrackingWorker.d.h(new ol1());
            } else {
                ((ConstraintTrackingWorker) this.c).d.j((ml1) this.f5265b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x04e0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4.run():void");
    }

    public final String toString() {
        switch (this.f5264a) {
            case 16:
                le1 le1Var = new le1(y4.class.getSimpleName(), 0);
                z41 z41Var = (z41) this.c;
                y33 y33Var = new y33();
                ((y33) le1Var.f).d = y33Var;
                le1Var.f = y33Var;
                y33Var.c = z41Var;
                return le1Var.toString();
            default:
                return super.toString();
        }
    }

    public y4(wu3 wu3Var) {
        this.f5264a = 18;
        this.c = wu3Var;
        this.f5265b = wu3Var.d;
    }

    public /* synthetic */ y4(Object obj, Object obj2, int i) {
        this.f5264a = i;
        this.f5265b = obj;
        this.c = obj2;
    }
}
