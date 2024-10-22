package defpackage;

import android.content.Context;
import androidx.fragment.app.l;
import com.google.android.play.core.review.b;

/* loaded from: classes2.dex */
public final class yk2 implements xk2 {

    /* renamed from: a, reason: collision with root package name */
    public l f5354a;

    @Override // defpackage.xk2
    public final void a(l lVar) {
        this.f5354a = lVar;
    }

    @Override // defpackage.xk2
    public final xk2 b(String str) {
        return this;
    }

    @Override // defpackage.xk2
    public final void c() {
    }

    @Override // defpackage.xk2
    public final void show() {
        int i = 1;
        try {
            pe0.a("wvuuc254m8", "Try to showing Google Play review dialog");
            Context context = this.f5354a;
            if (context == null) {
                context = null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            b bVar = new b(new dy3(context));
            bVar.b().addOnCompleteListener(new ti0(i, bVar, this));
        } catch (Exception e) {
            pe0.a("wvuuc254m8", hx2.p("Error0:", e.getMessage()));
        }
    }
}
