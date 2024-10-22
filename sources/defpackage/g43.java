package defpackage;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g43 {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f2204a;
    public int c;
    public boolean d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2205b = new ArrayList();
    public final f43 e = new f43(this);

    public g43(SwitchCompat switchCompat) {
        this.f2204a = switchCompat;
    }

    public static void a(g43 g43Var, x31 x31Var, l41 l41Var) {
        g43Var.getClass();
        g43Var.f2205b.add(new e43(x31Var, l41Var, null));
    }

    public final void b(boolean z) {
        if (!(!this.f2205b.isEmpty())) {
            this.f2204a.setChecked(z);
            return;
        }
        throw new IllegalArgumentException("init(...) should called before condition(...)");
    }

    public final boolean c(int i) {
        ArrayList arrayList = this.f2205b;
        int size = arrayList.size() - 1;
        CompoundButton compoundButton = this.f2204a;
        if (i > size) {
            if (this.d) {
                compoundButton.toggle();
                this.c = 0;
                this.d = false;
            }
            return true;
        }
        this.c = i;
        e43 e43Var = (e43) arrayList.get(i);
        boolean booleanValue = ((Boolean) e43Var.f1882a.invoke(Boolean.valueOf(compoundButton.isChecked()))).booleanValue();
        f43 f43Var = this.e;
        if (booleanValue) {
            l41 l41Var = e43Var.f1883b;
            if (l41Var != null) {
                l41Var.invoke(f43Var, compoundButton);
            }
        } else {
            l41 l41Var2 = e43Var.c;
            if (l41Var2 != null) {
                l41Var2.invoke(f43Var, compoundButton);
            }
        }
        if (booleanValue) {
            return false;
        }
        return c(i + 1);
    }

    public final void d(l41 l41Var) {
        jo0 jo0Var = new jo0(this, 1);
        CompoundButton compoundButton = this.f2204a;
        compoundButton.setOnTouchListener(jo0Var);
        compoundButton.setOnCheckedChangeListener(new rz(l41Var, 1));
    }
}
