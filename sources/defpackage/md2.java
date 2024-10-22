package defpackage;

import android.app.Application;
import androidx.databinding.ObservableInt;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class md2 extends bp implements w73 {
    public final ObservableInt e;
    public List f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public md2(Application application) {
        super(application);
        this.e = new ObservableInt(0);
        this.g = false;
        new HashMap();
        this.h = v73.j(1000042);
        this.i = v73.j(1000043);
        this.j = v73.j(1000044);
        this.k = v73.j(1000045);
        this.l = v73.j(1000122);
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        this.h = v73.j(1000042);
        this.i = v73.j(1000043);
        this.j = v73.j(1000044);
        this.k = v73.j(1000045);
        this.l = v73.j(1000046);
        synchronized (this) {
            z92 z92Var = this.d;
            if (z92Var != null) {
                z92Var.c(0, this);
            }
        }
    }
}
