package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mb extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public tj3 f3264a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f3265b;
    public ArrayList c;
    public kg d;

    public mb(dn0 dn0Var) {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
