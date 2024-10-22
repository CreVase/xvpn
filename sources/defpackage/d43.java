package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d43 extends yp0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1728a;

    public d43(SwitchCompat switchCompat) {
        this.f1728a = new WeakReference(switchCompat);
    }

    @Override // defpackage.yp0
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f1728a.get();
        if (switchCompat != null) {
            switchCompat.d();
        }
    }

    @Override // defpackage.yp0
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f1728a.get();
        if (switchCompat != null) {
            switchCompat.d();
        }
    }
}
