package defpackage;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class fq0 extends c02 {
    public final EditText d;
    public final uq0 e;

    public fq0(EditText editText) {
        super(7);
        this.d = editText;
        uq0 uq0Var = new uq0(editText);
        this.e = uq0Var;
        editText.addTextChangedListener(uq0Var);
        if (hq0.f2466b == null) {
            synchronized (hq0.f2465a) {
                if (hq0.f2466b == null) {
                    hq0.f2466b = new hq0();
                }
            }
        }
        editText.setEditableFactory(hq0.f2466b);
    }

    @Override // defpackage.c02
    public final KeyListener i(KeyListener keyListener) {
        if (keyListener instanceof mq0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new mq0(keyListener);
    }

    @Override // defpackage.c02
    public final InputConnection k(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection instanceof jq0) {
            return inputConnection;
        }
        return new jq0(this.d, inputConnection, editorInfo);
    }

    @Override // defpackage.c02
    public final void n(boolean z) {
        uq0 uq0Var = this.e;
        if (uq0Var.d != z) {
            if (uq0Var.c != null) {
                aq0 a2 = aq0.a();
                tq0 tq0Var = uq0Var.c;
                a2.getClass();
                tf3.w(tq0Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f316a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f317b.remove(tq0Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            uq0Var.d = z;
            if (z) {
                uq0.a(uq0Var.f4714a, aq0.a().b());
            }
        }
    }
}
