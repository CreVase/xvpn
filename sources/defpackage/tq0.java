package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class tq0 extends yp0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4559a;

    public tq0(EditText editText) {
        this.f4559a = new WeakReference(editText);
    }

    @Override // defpackage.yp0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f4559a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        uq0.a((EditText) this.f4559a.get(), 1);
    }
}
