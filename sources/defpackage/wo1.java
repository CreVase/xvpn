package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;

/* loaded from: classes2.dex */
public final class wo1 extends je0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5048b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wo1(Object obj, int i) {
        this.f5048b = i;
        this.c = obj;
    }

    @Override // defpackage.je0
    public final void a(View view) {
        int i = this.f5048b;
        Object obj = this.c;
        switch (i) {
            case 0:
                bx3.a(((MainActivity) obj).c);
                return;
            case 1:
                ((MainActivity) obj).clickToPremiumPage(view);
                return;
            case 2:
                FullDragDrawerLayout fullDragDrawerLayout = ((MainActivity) obj).k;
                View d = fullDragDrawerLayout.d(3);
                if (d != null) {
                    fullDragDrawerLayout.l(d);
                    return;
                }
                throw new IllegalArgumentException(hx2.p("No drawer view found with gravity ", "LEFT"));
            default:
                ((x31) obj).invoke(view);
                return;
        }
    }
}
