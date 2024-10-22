package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class g60 extends ji1 implements l41 {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ SwitchCompat g;
    public final /* synthetic */ v31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(RecyclerView recyclerView, SwitchCompat switchCompat, v31 v31Var) {
        super(2);
        this.f = recyclerView;
        this.g = switchCompat;
        this.h = v31Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ic icVar;
        boolean isChecked = ((CompoundButton) obj2).isChecked();
        SwitchCompat switchCompat = this.g;
        if (isChecked) {
            Context context = this.f.getContext();
            if (context instanceof ic) {
                icVar = (ic) context;
            } else {
                icVar = null;
            }
            if (icVar != null) {
                t9.w0(icVar.getSupportFragmentManager(), new q90(8, switchCompat, this.h));
            }
        } else {
            ew3.k0(true);
            switchCompat.setChecked(true);
        }
        return ch3.f636a;
    }
}
