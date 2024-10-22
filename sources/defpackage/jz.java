package defpackage;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class jz extends FrameLayout {
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f2860a;

    /* renamed from: b, reason: collision with root package name */
    public RatingBar f2861b;
    public EditText c;
    public TextView d;
    public TextView e;
    public Button f;
    public TextView g;
    public vt3 h;
    public eu3 i;
    public String j;
    public final xn2 k;

    public jz(Context context) {
        super(context, null, 0);
        this.j = "";
        this.k = new xn2(this, 4);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        eu3 eu3Var = new eu3(getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        if (eu3Var.getLayoutParams() == null) {
            eu3Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams = eu3Var.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        layoutParams2 = layoutParams2 == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams2;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        layoutParams2.gravity = 17;
        eu3Var.setLayoutParams(layoutParams2);
        eu3Var.setClipToPadding(false);
        eu3Var.setPadding(tf3.K(20), tf3.K(17), tf3.K(20), tf3.K(20));
        if (eu3Var.getAttachToParent()) {
            addView(eu3Var);
        }
        this.i = eu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:            if (r6 == true) goto L41;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setAlreadyRate(boolean r6) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.setAlreadyRate(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.a():void");
    }

    public final Drawable b(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = b(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) ((BitmapDrawable) drawable).getConstantState().newDrawable(getResources());
            bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
            if (this.f2860a <= 0) {
                this.f2860a = bitmapDrawable.getIntrinsicWidth();
            }
            if (z) {
                return new ClipDrawable(bitmapDrawable, 3, 1);
            }
            return bitmapDrawable;
        }
        return drawable;
    }

    public final void c() {
        int i;
        String str;
        Editable text;
        HashMap hashMap = (HashMap) wx2.f5084b.getValue();
        String str2 = this.j;
        vt3 vt3Var = new vt3();
        RatingBar ratingBar = this.f2861b;
        if (ratingBar != null) {
            i = ratingBar.getProgress();
        } else {
            i = 0;
        }
        vt3Var.f4897b = i;
        EditText editText = this.c;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        vt3Var.c = str;
        hashMap.put(str2, vt3Var);
    }

    public final Button getBtnSubmit() {
        return this.f;
    }

    public final eu3 getContainer() {
        return this.i;
    }

    public final EditText getEtReviewContent() {
        return this.c;
    }

    public final int getMSampleWidth() {
        return this.f2860a;
    }

    public final String getMsgId() {
        return this.j;
    }

    public final vt3 getRateInfo() {
        return this.h;
    }

    public final RatingBar getRatingBar() {
        return this.f2861b;
    }

    public final TextWatcher getTextWatcher() {
        return this.k;
    }

    public final TextView getTvCollapseText() {
        return this.g;
    }

    public final TextView getTvRateTitle() {
        return this.e;
    }

    public final TextView getTvRatingState() {
        return this.d;
    }

    public final void setBtnSubmit(Button button) {
        this.f = button;
    }

    public final void setContainer(eu3 eu3Var) {
        this.i = eu3Var;
    }

    public final void setEtReviewContent(EditText editText) {
        this.c = editText;
    }

    public final void setMSampleWidth(int i) {
        this.f2860a = i;
    }

    public final void setMsgId(String str) {
        this.j = str;
    }

    public final void setRateInfo(vt3 vt3Var) {
        this.h = vt3Var;
    }

    public final void setRatingBar(RatingBar ratingBar) {
        this.f2861b = ratingBar;
    }

    public final void setTvCollapseText(TextView textView) {
        this.g = textView;
    }

    public final void setTvRateTitle(TextView textView) {
        this.e = textView;
    }

    public final void setTvRatingState(TextView textView) {
        this.d = textView;
    }
}
