package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public final class a5 extends AppCompatImageView implements c5 {
    public final /* synthetic */ b5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(b5 b5Var, Context context) {
        super(context, null, ie2.actionOverflowButtonStyle);
        this.d = b5Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ew3.c1(this, getContentDescription());
        setOnTouchListener(new z4(this, this, b5Var, 0));
    }

    @Override // defpackage.c5
    public final boolean a() {
        return false;
    }

    @Override // defpackage.c5
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            bn0.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
