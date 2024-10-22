package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class xm3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorStateList f5183a;

    /* renamed from: b, reason: collision with root package name */
    public static final wm3 f5184b;

    static {
        new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[]{R.attr.state_selected}, StateSet.WILD_CARD}, new int[]{-1, -1, -10066330});
        f5183a = new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[]{R.attr.state_selected}, StateSet.WILD_CARD}, new int[]{-1, -1, -6710887});
        f5184b = new wm3();
    }

    public static final ColorStateList a(String str) {
        int i;
        boolean z = false;
        int[][] iArr = {new int[]{R.attr.state_selected}, StateSet.WILD_CARD};
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        if (str.length() > 0) {
            z = true;
        }
        if (z) {
            Context z2 = zf3.z();
            i = -16777216;
            if (z2 != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Resources resources = z2.getResources();
                    if (resources != null) {
                        i = resources.getColor(com.security.xvpn.z35kb.R.color.tvErrorColor, z2.getTheme());
                    }
                } else {
                    Resources resources2 = z2.getResources();
                    if (resources2 != null) {
                        i = resources2.getColor(com.security.xvpn.z35kb.R.color.tvErrorColor);
                    }
                }
            }
        } else {
            i = -10066330;
        }
        iArr2[1] = i;
        return new ColorStateList(iArr, iArr2);
    }

    public static final StateListDrawable b(String str) {
        int i;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = ew3.q;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = 7;
        gradientDrawable.setCornerRadius(tf3.F * f);
        boolean z = true;
        gradientDrawable.setStroke(tf3.K(1), zf3.v(com.security.xvpn.z35kb.R.color.tvBlue));
        stateListDrawable.addState(iArr, gradientDrawable);
        int[] iArr2 = ew3.p;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(tf3.F * f);
        gradientDrawable2.setStroke(tf3.K(1), zf3.v(com.security.xvpn.z35kb.R.color.tvBlue));
        stateListDrawable.addState(iArr2, gradientDrawable2);
        int[] iArr3 = StateSet.WILD_CARD;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(f * tf3.F);
        int K = tf3.K(1);
        if (str.length() <= 0) {
            z = false;
        }
        if (z) {
            i = zf3.v(com.security.xvpn.z35kb.R.color.tvErrorColor);
        } else {
            i = -10066330;
        }
        gradientDrawable3.setStroke(K, i);
        stateListDrawable.addState(iArr3, gradientDrawable3);
        return stateListDrawable;
    }

    public static final void c(AppCompatTextView appCompatTextView) {
        appCompatTextView.setFocusable(true);
        appCompatTextView.setOnKeyListener(f5184b);
        appCompatTextView.setTextColor(new ColorStateList(new int[][]{ew3.q, StateSet.WILD_CARD}, new int[]{-1, -6710887}));
        appCompatTextView.setBackgroundResource(com.security.xvpn.z35kb.R.drawable.tv_common_item_background);
        appCompatTextView.setPadding(tf3.K(40), 0, tf3.K(40), 0);
        appCompatTextView.setGravity(19);
        appCompatTextView.setStateListAnimator(tf3.z0());
    }

    public static final void d(AppCompatButton appCompatButton) {
        appCompatButton.setAllCaps(false);
        appCompatButton.setTextSize(15.0f);
        appCompatButton.setTextColor(-1);
        appCompatButton.setPadding(tf3.K(20), 0, tf3.K(20), 0);
        appCompatButton.setBackgroundResource(com.security.xvpn.z35kb.R.drawable.tv_common_button);
        appCompatButton.setStateListAnimator(tf3.z0());
    }

    public static final void e(AppCompatTextView appCompatTextView) {
        c(appCompatTextView);
        Drawable P0 = ew3.P0(appCompatTextView.getContext(), com.security.xvpn.z35kb.R.drawable.tv_ic_checked);
        P0.setBounds(0, 0, P0.getIntrinsicWidth(), P0.getIntrinsicHeight());
        P0.setTintList(new ColorStateList(new int[][]{new int[]{-16842913}, new int[]{R.attr.state_focused}, StateSet.WILD_CARD}, new int[]{0, -1, -6710887}));
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, P0, (Drawable) null);
    }

    public static final void f(AppCompatTextView appCompatTextView) {
        appCompatTextView.setFocusable(true);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setStateListAnimator(tf3.z0());
        appCompatTextView.setTextColor(new ColorStateList(new int[][]{ew3.q, StateSet.WILD_CARD}, new int[]{-1, -10066330}));
        appCompatTextView.setCompoundDrawablePadding(tf3.K(8));
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, com.security.xvpn.z35kb.R.drawable.tv_text_focus_indicator);
    }

    public static final void g(AppCompatEditText appCompatEditText) {
        appCompatEditText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) appCompatEditText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(appCompatEditText, 1);
        }
    }

    public static final void h(AppCompatEditText appCompatEditText) {
        if (Build.VERSION.SDK_INT >= 29) {
            appCompatEditText.setTextCursorDrawable(com.security.xvpn.z35kb.R.drawable.color_cursor_white);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(appCompatEditText, Integer.valueOf(com.security.xvpn.z35kb.R.drawable.color_cursor_white));
        } catch (Exception e) {
            Log.e("TAG", "whiteCursor: ", e);
        }
    }
}
