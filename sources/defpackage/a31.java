package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class a31 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Fragment g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a31(Fragment fragment, int i) {
        super(0);
        this.f = i;
        this.g = fragment;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        int i = this.f;
        Fragment fragment = this.g;
        switch (i) {
            case 0:
                return fragment.getDefaultViewModelProviderFactory();
            default:
                return fragment;
        }
    }
}
