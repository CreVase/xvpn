package defpackage;

import android.os.SystemClock;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class je0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f2755a = new WeakHashMap();

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakHashMap weakHashMap = this.f2755a;
        Long l = (Long) weakHashMap.get(view);
        long uptimeMillis = SystemClock.uptimeMillis();
        weakHashMap.put(view, Long.valueOf(uptimeMillis));
        if (l == null || uptimeMillis - l.longValue() > 300) {
            a(view);
        }
    }
}
