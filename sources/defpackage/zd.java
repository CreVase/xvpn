package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class zd extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final ae f5465a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zd(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = defpackage.ie2.seekBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.h83.a(r2, r1)
            ae r2 = new ae
            r2.<init>(r1)
            r1.f5465a = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ae aeVar = this.f5465a;
        Drawable drawable = aeVar.e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = aeVar.d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5465a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5465a.d(canvas);
    }
}
