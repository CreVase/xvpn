package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class nx0 implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3556a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (px0.k) {
            Iterator it = new ArrayList(px0.l.values()).iterator();
            while (it.hasNext()) {
                px0 px0Var = (px0) it.next();
                if (px0Var.e.get()) {
                    Iterator it2 = px0Var.i.iterator();
                    while (it2.hasNext()) {
                        px0 px0Var2 = ((mx0) it2.next()).f3368a;
                        if (!z) {
                            ((nh0) px0Var2.h.get()).c();
                        } else {
                            px0Var2.getClass();
                        }
                    }
                }
            }
        }
    }
}
