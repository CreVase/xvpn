package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class hd extends ContentFrameLayout {
    public final /* synthetic */ jd i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(jd jdVar, b90 b90Var) {
        super(b90Var, null);
        this.i = jdVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.i.C(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                jd jdVar = this.i;
                jdVar.A(jdVar.I(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ew3.P0(getContext(), i));
    }
}
