package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class gl1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl1 f2274a;

    public gl1(hl1 hl1Var) {
        this.f2274a = hl1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        td tdVar;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        hl1 hl1Var = this.f2274a;
        if (action == 0 && (tdVar = hl1Var.z) != null && tdVar.isShowing() && x >= 0) {
            td tdVar2 = hl1Var.z;
            if (x < tdVar2.getWidth() && y >= 0 && y < tdVar2.getHeight()) {
                hl1Var.v.postDelayed(hl1Var.r, 250L);
                return false;
            }
        }
        if (action == 1) {
            hl1Var.v.removeCallbacks(hl1Var.r);
            return false;
        }
        return false;
    }
}
