package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class mq0 implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f3337a;

    /* renamed from: b, reason: collision with root package name */
    public final s71 f3338b;

    public mq0(KeyListener keyListener) {
        s71 s71Var = new s71(8);
        this.f3337a = keyListener;
        this.f3338b = s71Var;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3337a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3337a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean b2;
        boolean z;
        this.f3338b.getClass();
        Object obj = aq0.j;
        if (i != 67) {
            if (i != 112) {
                b2 = false;
            } else {
                b2 = et2.b(editable, keyEvent, true);
            }
        } else {
            b2 = et2.b(editable, keyEvent, false);
        }
        if (b2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (z || this.f3337a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3337a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3337a.onKeyUp(view, editable, i, keyEvent);
    }
}
