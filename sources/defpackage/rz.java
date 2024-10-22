package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final /* synthetic */ class rz implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4241b;

    public /* synthetic */ rz(Object obj, int i) {
        this.f4240a = i;
        this.f4241b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f4240a;
        Object obj = this.f4241b;
        switch (i) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            default:
                ((l41) obj).invoke(compoundButton, Boolean.valueOf(z));
                return;
        }
    }
}
