package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wb3 {

    /* renamed from: b, reason: collision with root package name */
    public final View f4979b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4978a = new HashMap();
    public final ArrayList c = new ArrayList();

    public wb3(View view) {
        this.f4979b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb3) {
            wb3 wb3Var = (wb3) obj;
            if (this.f4979b == wb3Var.f4979b && this.f4978a.equals(wb3Var.f4978a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4978a.hashCode() + (this.f4979b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder p = p71.p("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        p.append(this.f4979b);
        p.append("\n");
        String l = p71.l(p.toString(), "    values:");
        HashMap hashMap = this.f4978a;
        for (String str : hashMap.keySet()) {
            l = l + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return l;
    }
}
