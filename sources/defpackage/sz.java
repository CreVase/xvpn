package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class sz extends bx3 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ sz(Object obj, int i) {
        this.l = i;
        this.m = obj;
    }

    @Override // defpackage.bx3
    public final void P(int i) {
        switch (this.l) {
            case 0:
                return;
            default:
                y63 y63Var = (y63) this.m;
                y63Var.d = true;
                x63 x63Var = (x63) y63Var.e.get();
                if (x63Var != null) {
                    wz wzVar = (wz) x63Var;
                    wzVar.u();
                    wzVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.bx3
    public final void Q(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.l;
        Object obj = this.m;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                wz wzVar = chip.e;
                if (wzVar.P0) {
                    text = wzVar.E;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    y63 y63Var = (y63) obj;
                    y63Var.d = true;
                    x63 x63Var = (x63) y63Var.e.get();
                    if (x63Var != null) {
                        wz wzVar2 = (wz) x63Var;
                        wzVar2.u();
                        wzVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
