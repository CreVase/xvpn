package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class hb extends bx3 {
    public final /* synthetic */ int l;
    public final Animatable m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb(Animatable animatable, int i) {
        super(0);
        this.l = i;
        this.m = animatable;
    }

    @Override // defpackage.bx3
    public final void a0() {
        int i = this.l;
        Animatable animatable = this.m;
        switch (i) {
            case 0:
                animatable.start();
                return;
            default:
                ((ob) animatable).start();
                return;
        }
    }

    @Override // defpackage.bx3
    public final void b0() {
        int i = this.l;
        Animatable animatable = this.m;
        switch (i) {
            case 0:
                animatable.stop();
                return;
            default:
                ((ob) animatable).stop();
                return;
        }
    }
}
