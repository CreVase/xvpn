package defpackage;

import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class nu3 implements hv3 {
    public static final nu3 f = new nu3(new iv3());

    /* renamed from: a, reason: collision with root package name */
    public final v73 f3546a = new v73();

    /* renamed from: b, reason: collision with root package name */
    public Date f3547b;
    public boolean c;
    public final iv3 d;
    public boolean e;

    public nu3(iv3 iv3Var) {
        this.d = iv3Var;
    }

    @Override // defpackage.hv3
    public final void a(boolean z) {
        Date date;
        if (!this.e && z) {
            this.f3546a.getClass();
            Date date2 = new Date();
            Date date3 = this.f3547b;
            if (date3 == null || date2.after(date3)) {
                this.f3547b = date2;
                if (this.c) {
                    Iterator it = dv3.c.a().iterator();
                    while (it.hasNext()) {
                        v7 v7Var = ((mu3) it.next()).d;
                        Date date4 = this.f3547b;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        v7Var.c(date);
                    }
                }
            }
        }
        this.e = z;
    }
}
