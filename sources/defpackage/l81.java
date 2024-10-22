package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes2.dex */
public final class l81 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ComponentActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l81(ComponentActivity componentActivity, int i) {
        super(0);
        this.f = i;
        this.g = componentActivity;
    }

    public final im3 b() {
        int i = this.f;
        ComponentActivity componentActivity = this.g;
        switch (i) {
            case 0:
                return componentActivity.getDefaultViewModelProviderFactory();
            default:
                return componentActivity.getDefaultViewModelProviderFactory();
        }
    }

    public final km3 c() {
        int i = this.f;
        ComponentActivity componentActivity = this.g;
        switch (i) {
            case 1:
                return componentActivity.getViewModelStore();
            case 2:
            default:
                return componentActivity.getViewModelStore();
            case 3:
                return componentActivity.getViewModelStore();
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
            default:
                return c();
            case 3:
                return c();
        }
    }
}
