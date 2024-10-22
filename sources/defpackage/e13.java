package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class e13 extends fn0 {
    public d13 n;
    public boolean o;

    @Override // defpackage.fn0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.fn0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            this.n.e();
            this.o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
