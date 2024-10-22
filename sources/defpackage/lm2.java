package defpackage;

import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class lm2 implements h03 {

    /* renamed from: a, reason: collision with root package name */
    public long f3157a;

    public /* synthetic */ lm2(int i) {
    }

    @Override // defpackage.h03
    public g03 a() {
        return new j(this);
    }

    public void b(String str) {
        boolean z;
        if (str.hashCode() == 0 && this.f3157a + 2000 >= System.currentTimeMillis()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f3157a = System.currentTimeMillis();
            ew3.L0("dgazvg55m9", str);
        }
    }
}
