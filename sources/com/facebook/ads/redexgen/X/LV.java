package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network.dex */
public final class LV {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;
    public static final ConcurrentHashMap<Integer, Integer> A03;
    public static final AtomicInteger A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        return (int) Math.ceil(ellipsisCount / (textView.getText().length() - ellipsisCount));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Drawable A09(int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4)) : A0A(i, i2, i4);
    }

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{-8, -26, -13, -8, -78, -8, -22, -9, -18, -21, -78, -14, -22, -23, -18, -6, -14};
    }

    static {
        A0E();
        A02 = C00632d.A01(-1, 0);
        A01 = C00632d.A01(-16777216, 115);
        A04 = new AtomicInteger(1);
        A03 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        AtomicInteger atomicInteger;
        int newValue;
        int result;
        do {
            atomicInteger = A04;
            newValue = atomicInteger.get();
            result = newValue + 1;
            if (result > 16777215) {
                result = 1;
            }
        } while (!atomicInteger.compareAndSet(newValue, result));
        return newValue;
    }

    public static int A01(int i) {
        return (int) TypedValue.applyDimension(2, i, C0506Ku.A03);
    }

    public static int A02(int i) {
        if (A0a(i)) {
            return C00632d.A02(i, -1, 0.4f);
        }
        return C00632d.A02(i, -16777216, 0.2f);
    }

    public static int A04(TextView textView, int i) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static Drawable A06(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static StateListDrawable A0A(int i, int i2, int i3) {
        return A0B(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i2, i}, i3);
    }

    public static StateListDrawable A0B(int[][] iArr, int[] iArr2, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr2[i2]);
            gradientDrawable.setCornerRadius(i);
            stateListDrawable.addState(iArr[i2], gradientDrawable);
        }
        return stateListDrawable;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.TextView A0C(android.view.ViewGroup r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L1e
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L12
            android.widget.TextView r1 = (android.widget.TextView) r1
            return r1
        L12:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            A0C(r1)
        L1b:
            int r2 = r2 + 1
            goto L1
        L1e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LV.A0C(android.view.ViewGroup):android.widget.TextView");
    }

    public static void A0F(int i, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C0738Tt(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i, View view) {
        Integer viewId = A03.get(Integer.valueOf(i));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(View view) {
        A0N(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0T((ViewGroup) parent);
        }
    }

    public static void A0J(View view) {
        ViewGroup parent;
        if (view != null && (parent = (ViewGroup) view.getParent()) != null) {
            parent.removeView(view);
        }
    }

    public static void A0K(View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(View view) {
        A0N(view, 0);
    }

    public static void A0M(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    public static void A0N(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0O(View view, int i, int i2) {
        A0S(view, A08(i, A02(i), i2));
    }

    public static void A0P(View view, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A02, A01});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(View view, int i, int i2, int i3) {
        A0S(view, A09(i, A02(i), i2, i3));
    }

    public static void A0R(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A02, A01});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new AutoTransition(), i);
        }
    }

    public static void A0V(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    public static void A0W(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(TextView textView, boolean z, int i) {
        Typeface typeface;
        if (z) {
            typeface = Build.VERSION.SDK_INT >= 21 ? Typeface.create(A0D(0, 17, 46), 0) : Typeface.create(Typeface.SANS_SERIF, 1);
        } else {
            Typeface typeface2 = Typeface.SANS_SERIF;
            typeface = Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        textView.setTextSize(2, i);
    }

    public static void A0Y(Toast toast, String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        TextView A0C = A0C((ViewGroup) toast.getView());
        if (A0C != null) {
            A0C.setText(str);
            A0C.setGravity(17);
        }
    }

    public static void A0Z(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0a(int i) {
        return C00632d.A00(i) < 0.5d;
    }
}
