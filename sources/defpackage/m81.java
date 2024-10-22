package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes2.dex */
public final class m81 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ComponentActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m81(ComponentActivity componentActivity, int i) {
        super(0);
        this.f = i;
        this.g = componentActivity;
    }

    public final bc0 b() {
        int i = this.f;
        ComponentActivity componentActivity = this.g;
        switch (i) {
            case 0:
                return componentActivity.getDefaultViewModelCreationExtras();
            case 1:
                return componentActivity.getDefaultViewModelCreationExtras();
            default:
                return componentActivity.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            case 1:
                return b();
            default:
                return b();
        }
    }
}
