package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class t81 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f4462a = null;

    /* renamed from: b, reason: collision with root package name */
    public final k9 f4463b = new k9(this, Looper.getMainLooper(), 4);

    public void a(ViewGroup viewGroup) {
    }

    public abstract void b(ViewGroup viewGroup);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
