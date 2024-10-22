package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p70 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3793a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3794b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(vf2.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(vf2.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(vf2.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(vf2.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(vf2.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(vf2.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(vf2.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(vf2.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(vf2.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(vf2.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(vf2.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(vf2.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(vf2.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(vf2.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(vf2.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(vf2.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(vf2.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(vf2.Constraint_android_orientation, 27);
        sparseIntArray.append(vf2.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(vf2.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(vf2.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(vf2.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(vf2.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(vf2.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(vf2.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(vf2.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(vf2.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(vf2.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(vf2.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(vf2.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(vf2.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(vf2.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(vf2.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(vf2.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(vf2.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(vf2.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(vf2.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(vf2.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(vf2.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(vf2.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(vf2.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(vf2.Constraint_android_layout_width, 23);
        sparseIntArray.append(vf2.Constraint_android_layout_height, 21);
        sparseIntArray.append(vf2.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(vf2.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(vf2.Constraint_android_visibility, 22);
        sparseIntArray.append(vf2.Constraint_android_alpha, 43);
        sparseIntArray.append(vf2.Constraint_android_elevation, 44);
        sparseIntArray.append(vf2.Constraint_android_rotationX, 45);
        sparseIntArray.append(vf2.Constraint_android_rotationY, 46);
        sparseIntArray.append(vf2.Constraint_android_rotation, 60);
        sparseIntArray.append(vf2.Constraint_android_scaleX, 47);
        sparseIntArray.append(vf2.Constraint_android_scaleY, 48);
        sparseIntArray.append(vf2.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(vf2.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(vf2.Constraint_android_translationX, 51);
        sparseIntArray.append(vf2.Constraint_android_translationY, 52);
        sparseIntArray.append(vf2.Constraint_android_translationZ, 53);
        sparseIntArray.append(vf2.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(vf2.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(vf2.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(vf2.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(vf2.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(vf2.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(vf2.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(vf2.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(vf2.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(vf2.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(vf2.Constraint_transitionEasing, 65);
        sparseIntArray.append(vf2.Constraint_drawPath, 66);
        sparseIntArray.append(vf2.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(vf2.Constraint_motionStagger, 79);
        sparseIntArray.append(vf2.Constraint_android_id, 38);
        sparseIntArray.append(vf2.Constraint_motionProgress, 68);
        sparseIntArray.append(vf2.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(vf2.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(vf2.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(vf2.Constraint_chainUseRtl, 71);
        sparseIntArray.append(vf2.Constraint_barrierDirection, 72);
        sparseIntArray.append(vf2.Constraint_barrierMargin, 73);
        sparseIntArray.append(vf2.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(vf2.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(vf2.Constraint_pathMotionArc, 76);
        sparseIntArray.append(vf2.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(vf2.Constraint_visibilityMode, 78);
        sparseIntArray.append(vf2.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(vf2.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(vf2.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(vf2.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(vf2.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(vf2.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(vf2.Constraint_quantizeMotionInterpolator, 86);
        int i = vf2.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray2.append(i, 6);
        sparseIntArray2.append(i, 7);
        sparseIntArray2.append(vf2.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(vf2.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(vf2.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(vf2.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(vf2.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(vf2.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(vf2.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(vf2.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(vf2.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(vf2.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(vf2.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(vf2.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(vf2.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(vf2.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(vf2.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(vf2.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(vf2.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(vf2.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(vf2.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(vf2.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(vf2.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(vf2.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(vf2.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(vf2.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(vf2.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(vf2.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(vf2.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(vf2.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(vf2.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(vf2.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(vf2.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(vf2.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(vf2.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(vf2.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(vf2.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(vf2.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = ze2.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.m) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.m.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:210:0x0587. Please report as an issue. */
    public static k70 d(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        int i;
        int i2;
        k70 k70Var = new k70();
        if (z) {
            iArr = vf2.ConstraintOverride;
        } else {
            iArr = vf2.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        String[] strArr = t9.g;
        int[] iArr2 = d;
        SparseIntArray sparseIntArray = e;
        n70 n70Var = k70Var.f2904b;
        o70 o70Var = k70Var.e;
        m70 m70Var = k70Var.c;
        l70 l70Var = k70Var.d;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            j70 j70Var = new j70();
            m70Var.getClass();
            l70Var.getClass();
            n70Var.getClass();
            o70Var.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        i2 = i3;
                        j70Var.b(2, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        i2 = i3;
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        i2 = i3;
                        j70Var.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        i2 = i3;
                        j70Var.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, l70Var.C));
                        break;
                    case 7:
                        i2 = i3;
                        j70Var.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, l70Var.D));
                        break;
                    case 8:
                        i2 = i3;
                        j70Var.b(8, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.J));
                        break;
                    case 11:
                        i2 = i3;
                        j70Var.b(11, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.P));
                        break;
                    case 12:
                        i2 = i3;
                        j70Var.b(12, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.Q));
                        break;
                    case 13:
                        i2 = i3;
                        j70Var.b(13, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.M));
                        break;
                    case 14:
                        i2 = i3;
                        j70Var.b(14, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.O));
                        break;
                    case 15:
                        i2 = i3;
                        j70Var.b(15, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.R));
                        break;
                    case 16:
                        i2 = i3;
                        j70Var.b(16, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.N));
                        break;
                    case 17:
                        i2 = i3;
                        j70Var.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, l70Var.d));
                        break;
                    case 18:
                        i2 = i3;
                        j70Var.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, l70Var.e));
                        break;
                    case 19:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.f), 19);
                        break;
                    case 20:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.w), 20);
                        break;
                    case 21:
                        i2 = i3;
                        j70Var.b(21, obtainStyledAttributes.getLayoutDimension(index, l70Var.c));
                        break;
                    case 22:
                        i2 = i3;
                        j70Var.b(22, iArr2[obtainStyledAttributes.getInt(index, n70Var.f3406a)]);
                        break;
                    case 23:
                        i2 = i3;
                        j70Var.b(23, obtainStyledAttributes.getLayoutDimension(index, l70Var.f3077b));
                        break;
                    case 24:
                        i2 = i3;
                        j70Var.b(24, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.F));
                        break;
                    case 27:
                        i2 = i3;
                        j70Var.b(27, obtainStyledAttributes.getInt(index, l70Var.E));
                        break;
                    case 28:
                        i2 = i3;
                        j70Var.b(28, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.G));
                        break;
                    case 31:
                        i2 = i3;
                        j70Var.b(31, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.K));
                        break;
                    case 34:
                        i2 = i3;
                        j70Var.b(34, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.H));
                        break;
                    case 37:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.x), 37);
                        break;
                    case 38:
                        i2 = i3;
                        int resourceId = obtainStyledAttributes.getResourceId(index, k70Var.f2903a);
                        k70Var.f2903a = resourceId;
                        j70Var.b(38, resourceId);
                        break;
                    case 39:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.U), 39);
                        break;
                    case 40:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.T), 40);
                        break;
                    case 41:
                        i2 = i3;
                        j70Var.b(41, obtainStyledAttributes.getInt(index, l70Var.V));
                        break;
                    case 42:
                        i2 = i3;
                        j70Var.b(42, obtainStyledAttributes.getInt(index, l70Var.W));
                        break;
                    case 43:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, n70Var.c), 43);
                        break;
                    case 44:
                        i2 = i3;
                        j70Var.d(44, true);
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.m), 44);
                        break;
                    case 45:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, o70Var.f3614b), 45);
                        break;
                    case 46:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, o70Var.c), 46);
                        break;
                    case 47:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, o70Var.d), 47);
                        break;
                    case 48:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, o70Var.e), 48);
                        break;
                    case 49:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.f), 49);
                        break;
                    case 50:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.g), 50);
                        break;
                    case 51:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.i), 51);
                        break;
                    case 52:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.j), 52);
                        break;
                    case 53:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getDimension(index, o70Var.k), 53);
                        break;
                    case 54:
                        i2 = i3;
                        j70Var.b(54, obtainStyledAttributes.getInt(index, l70Var.X));
                        break;
                    case 55:
                        i2 = i3;
                        j70Var.b(55, obtainStyledAttributes.getInt(index, l70Var.Y));
                        break;
                    case 56:
                        i2 = i3;
                        j70Var.b(56, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.Z));
                        break;
                    case 57:
                        i2 = i3;
                        j70Var.b(57, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.a0));
                        break;
                    case 58:
                        i2 = i3;
                        j70Var.b(58, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.b0));
                        break;
                    case 59:
                        i2 = i3;
                        j70Var.b(59, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.c0));
                        break;
                    case 60:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, o70Var.f3613a), 60);
                        break;
                    case 62:
                        i2 = i3;
                        j70Var.b(62, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.A));
                        break;
                    case 63:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, l70Var.B), 63);
                        break;
                    case 64:
                        i2 = i3;
                        j70Var.b(64, f(obtainStyledAttributes, index, m70Var.f3250a));
                        break;
                    case 65:
                        i2 = i3;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            j70Var.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            j70Var.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i2 = i3;
                        j70Var.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, m70Var.e), 67);
                        break;
                    case 68:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, n70Var.d), 68);
                        break;
                    case 69:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        j70Var.b(72, obtainStyledAttributes.getInt(index, l70Var.f0));
                        break;
                    case 73:
                        i2 = i3;
                        j70Var.b(73, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.g0));
                        break;
                    case 74:
                        i2 = i3;
                        j70Var.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        j70Var.d(75, obtainStyledAttributes.getBoolean(index, l70Var.n0));
                        break;
                    case 76:
                        i2 = i3;
                        j70Var.b(76, obtainStyledAttributes.getInt(index, m70Var.c));
                        break;
                    case 77:
                        i2 = i3;
                        j70Var.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        j70Var.b(78, obtainStyledAttributes.getInt(index, n70Var.f3407b));
                        break;
                    case 79:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, m70Var.d), 79);
                        break;
                    case 80:
                        i2 = i3;
                        j70Var.d(80, obtainStyledAttributes.getBoolean(index, l70Var.l0));
                        break;
                    case 81:
                        i2 = i3;
                        j70Var.d(81, obtainStyledAttributes.getBoolean(index, l70Var.m0));
                        break;
                    case 82:
                        i2 = i3;
                        j70Var.b(82, obtainStyledAttributes.getInteger(index, m70Var.f3251b));
                        break;
                    case 83:
                        i2 = i3;
                        j70Var.b(83, f(obtainStyledAttributes, index, o70Var.h));
                        break;
                    case 84:
                        i2 = i3;
                        j70Var.b(84, obtainStyledAttributes.getInteger(index, m70Var.g));
                        break;
                    case 85:
                        i2 = i3;
                        j70Var.a(obtainStyledAttributes.getFloat(index, m70Var.f), 85);
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            m70Var.i = resourceId2;
                            j70Var.b(89, resourceId2);
                            if (m70Var.i != -1) {
                                j70Var.b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            m70Var.h = string;
                            j70Var.c(90, string);
                            if (m70Var.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                m70Var.i = resourceId3;
                                j70Var.b(89, resourceId3);
                                j70Var.b(88, -2);
                                break;
                            } else {
                                j70Var.b(88, -1);
                                break;
                            }
                        } else {
                            j70Var.b(88, obtainStyledAttributes.getInteger(index, m70Var.i));
                            break;
                        }
                    case 87:
                        i2 = i3;
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        i2 = i3;
                        j70Var.b(93, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.L));
                        break;
                    case 94:
                        i2 = i3;
                        j70Var.b(94, obtainStyledAttributes.getDimensionPixelSize(index, l70Var.S));
                        break;
                    case 95:
                        i2 = i3;
                        g(j70Var, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = i3;
                        g(j70Var, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        j70Var.b(97, obtainStyledAttributes.getInt(index, l70Var.o0));
                        break;
                    case 98:
                        int i6 = hx1.q;
                        i2 = i3;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            k70Var.f2903a = obtainStyledAttributes.getResourceId(index, k70Var.f2903a);
                            break;
                        }
                    case 99:
                        j70Var.d(99, obtainStyledAttributes.getBoolean(index, l70Var.g));
                        i2 = i3;
                        break;
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != vf2.Constraint_android_id && vf2.Constraint_android_layout_marginStart != index2 && vf2.Constraint_android_layout_marginEnd != index2) {
                    m70Var.getClass();
                    l70Var.getClass();
                    n70Var.getClass();
                    o70Var.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        l70Var.p = f(obtainStyledAttributes, index2, l70Var.p);
                        break;
                    case 2:
                        i = indexCount2;
                        l70Var.I = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.I);
                        break;
                    case 3:
                        i = indexCount2;
                        l70Var.o = f(obtainStyledAttributes, index2, l70Var.o);
                        break;
                    case 4:
                        i = indexCount2;
                        l70Var.n = f(obtainStyledAttributes, index2, l70Var.n);
                        break;
                    case 5:
                        i = indexCount2;
                        l70Var.y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        i = indexCount2;
                        l70Var.C = obtainStyledAttributes.getDimensionPixelOffset(index2, l70Var.C);
                        break;
                    case 7:
                        i = indexCount2;
                        l70Var.D = obtainStyledAttributes.getDimensionPixelOffset(index2, l70Var.D);
                        break;
                    case 8:
                        i = indexCount2;
                        l70Var.J = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.J);
                        break;
                    case 9:
                        i = indexCount2;
                        l70Var.v = f(obtainStyledAttributes, index2, l70Var.v);
                        break;
                    case 10:
                        i = indexCount2;
                        l70Var.u = f(obtainStyledAttributes, index2, l70Var.u);
                        break;
                    case 11:
                        i = indexCount2;
                        l70Var.P = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.P);
                        break;
                    case 12:
                        i = indexCount2;
                        l70Var.Q = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.Q);
                        break;
                    case 13:
                        i = indexCount2;
                        l70Var.M = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.M);
                        break;
                    case 14:
                        i = indexCount2;
                        l70Var.O = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.O);
                        break;
                    case 15:
                        i = indexCount2;
                        l70Var.R = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.R);
                        break;
                    case 16:
                        i = indexCount2;
                        l70Var.N = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.N);
                        break;
                    case 17:
                        i = indexCount2;
                        l70Var.d = obtainStyledAttributes.getDimensionPixelOffset(index2, l70Var.d);
                        break;
                    case 18:
                        i = indexCount2;
                        l70Var.e = obtainStyledAttributes.getDimensionPixelOffset(index2, l70Var.e);
                        break;
                    case 19:
                        i = indexCount2;
                        l70Var.f = obtainStyledAttributes.getFloat(index2, l70Var.f);
                        break;
                    case 20:
                        i = indexCount2;
                        l70Var.w = obtainStyledAttributes.getFloat(index2, l70Var.w);
                        break;
                    case 21:
                        i = indexCount2;
                        l70Var.c = obtainStyledAttributes.getLayoutDimension(index2, l70Var.c);
                        break;
                    case 22:
                        i = indexCount2;
                        n70Var.f3406a = iArr2[obtainStyledAttributes.getInt(index2, n70Var.f3406a)];
                        break;
                    case 23:
                        i = indexCount2;
                        l70Var.f3077b = obtainStyledAttributes.getLayoutDimension(index2, l70Var.f3077b);
                        break;
                    case 24:
                        i = indexCount2;
                        l70Var.F = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.F);
                        break;
                    case 25:
                        i = indexCount2;
                        l70Var.h = f(obtainStyledAttributes, index2, l70Var.h);
                        break;
                    case 26:
                        i = indexCount2;
                        l70Var.i = f(obtainStyledAttributes, index2, l70Var.i);
                        break;
                    case 27:
                        i = indexCount2;
                        l70Var.E = obtainStyledAttributes.getInt(index2, l70Var.E);
                        break;
                    case 28:
                        i = indexCount2;
                        l70Var.G = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.G);
                        break;
                    case 29:
                        i = indexCount2;
                        l70Var.j = f(obtainStyledAttributes, index2, l70Var.j);
                        break;
                    case 30:
                        i = indexCount2;
                        l70Var.k = f(obtainStyledAttributes, index2, l70Var.k);
                        break;
                    case 31:
                        i = indexCount2;
                        l70Var.K = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.K);
                        break;
                    case 32:
                        i = indexCount2;
                        l70Var.s = f(obtainStyledAttributes, index2, l70Var.s);
                        break;
                    case 33:
                        i = indexCount2;
                        l70Var.t = f(obtainStyledAttributes, index2, l70Var.t);
                        break;
                    case 34:
                        i = indexCount2;
                        l70Var.H = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.H);
                        break;
                    case 35:
                        i = indexCount2;
                        l70Var.m = f(obtainStyledAttributes, index2, l70Var.m);
                        break;
                    case 36:
                        i = indexCount2;
                        l70Var.l = f(obtainStyledAttributes, index2, l70Var.l);
                        break;
                    case 37:
                        i = indexCount2;
                        l70Var.x = obtainStyledAttributes.getFloat(index2, l70Var.x);
                        break;
                    case 38:
                        i = indexCount2;
                        k70Var.f2903a = obtainStyledAttributes.getResourceId(index2, k70Var.f2903a);
                        break;
                    case 39:
                        i = indexCount2;
                        l70Var.U = obtainStyledAttributes.getFloat(index2, l70Var.U);
                        break;
                    case 40:
                        i = indexCount2;
                        l70Var.T = obtainStyledAttributes.getFloat(index2, l70Var.T);
                        break;
                    case 41:
                        i = indexCount2;
                        l70Var.V = obtainStyledAttributes.getInt(index2, l70Var.V);
                        break;
                    case 42:
                        i = indexCount2;
                        l70Var.W = obtainStyledAttributes.getInt(index2, l70Var.W);
                        break;
                    case 43:
                        i = indexCount2;
                        n70Var.c = obtainStyledAttributes.getFloat(index2, n70Var.c);
                        break;
                    case 44:
                        i = indexCount2;
                        o70Var.l = true;
                        o70Var.m = obtainStyledAttributes.getDimension(index2, o70Var.m);
                        break;
                    case 45:
                        i = indexCount2;
                        o70Var.f3614b = obtainStyledAttributes.getFloat(index2, o70Var.f3614b);
                        break;
                    case 46:
                        i = indexCount2;
                        o70Var.c = obtainStyledAttributes.getFloat(index2, o70Var.c);
                        break;
                    case 47:
                        i = indexCount2;
                        o70Var.d = obtainStyledAttributes.getFloat(index2, o70Var.d);
                        break;
                    case 48:
                        i = indexCount2;
                        o70Var.e = obtainStyledAttributes.getFloat(index2, o70Var.e);
                        break;
                    case 49:
                        i = indexCount2;
                        o70Var.f = obtainStyledAttributes.getDimension(index2, o70Var.f);
                        break;
                    case 50:
                        i = indexCount2;
                        o70Var.g = obtainStyledAttributes.getDimension(index2, o70Var.g);
                        break;
                    case 51:
                        i = indexCount2;
                        o70Var.i = obtainStyledAttributes.getDimension(index2, o70Var.i);
                        break;
                    case 52:
                        i = indexCount2;
                        o70Var.j = obtainStyledAttributes.getDimension(index2, o70Var.j);
                        break;
                    case 53:
                        i = indexCount2;
                        o70Var.k = obtainStyledAttributes.getDimension(index2, o70Var.k);
                        break;
                    case 54:
                        i = indexCount2;
                        l70Var.X = obtainStyledAttributes.getInt(index2, l70Var.X);
                        break;
                    case 55:
                        i = indexCount2;
                        l70Var.Y = obtainStyledAttributes.getInt(index2, l70Var.Y);
                        break;
                    case 56:
                        i = indexCount2;
                        l70Var.Z = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.Z);
                        break;
                    case 57:
                        i = indexCount2;
                        l70Var.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.a0);
                        break;
                    case 58:
                        i = indexCount2;
                        l70Var.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.b0);
                        break;
                    case 59:
                        i = indexCount2;
                        l70Var.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.c0);
                        break;
                    case 60:
                        i = indexCount2;
                        o70Var.f3613a = obtainStyledAttributes.getFloat(index2, o70Var.f3613a);
                        break;
                    case 61:
                        i = indexCount2;
                        l70Var.z = f(obtainStyledAttributes, index2, l70Var.z);
                        break;
                    case 62:
                        i = indexCount2;
                        l70Var.A = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.A);
                        break;
                    case 63:
                        i = indexCount2;
                        l70Var.B = obtainStyledAttributes.getFloat(index2, l70Var.B);
                        break;
                    case 64:
                        i = indexCount2;
                        m70Var.f3250a = f(obtainStyledAttributes, index2, m70Var.f3250a);
                        break;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            m70Var.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            m70Var.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        m70Var.getClass();
                        break;
                    case 67:
                        i = indexCount2;
                        m70Var.e = obtainStyledAttributes.getFloat(index2, m70Var.e);
                        break;
                    case 68:
                        i = indexCount2;
                        n70Var.d = obtainStyledAttributes.getFloat(index2, n70Var.d);
                        break;
                    case 69:
                        i = indexCount2;
                        l70Var.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        l70Var.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        l70Var.f0 = obtainStyledAttributes.getInt(index2, l70Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        l70Var.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        l70Var.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        l70Var.n0 = obtainStyledAttributes.getBoolean(index2, l70Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        m70Var.c = obtainStyledAttributes.getInt(index2, m70Var.c);
                        break;
                    case 77:
                        i = indexCount2;
                        l70Var.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        n70Var.f3407b = obtainStyledAttributes.getInt(index2, n70Var.f3407b);
                        break;
                    case 79:
                        i = indexCount2;
                        m70Var.d = obtainStyledAttributes.getFloat(index2, m70Var.d);
                        break;
                    case 80:
                        i = indexCount2;
                        l70Var.l0 = obtainStyledAttributes.getBoolean(index2, l70Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        l70Var.m0 = obtainStyledAttributes.getBoolean(index2, l70Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        m70Var.f3251b = obtainStyledAttributes.getInteger(index2, m70Var.f3251b);
                        break;
                    case 83:
                        i = indexCount2;
                        o70Var.h = f(obtainStyledAttributes, index2, o70Var.h);
                        break;
                    case 84:
                        i = indexCount2;
                        m70Var.g = obtainStyledAttributes.getInteger(index2, m70Var.g);
                        break;
                    case 85:
                        i = indexCount2;
                        m70Var.f = obtainStyledAttributes.getFloat(index2, m70Var.f);
                        break;
                    case 86:
                        int i8 = obtainStyledAttributes.peekValue(index2).type;
                        i = indexCount2;
                        if (i8 == 1) {
                            m70Var.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i8 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            m70Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                m70Var.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, m70Var.i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        i = indexCount2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        i = indexCount2;
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        l70Var.q = f(obtainStyledAttributes, index2, l70Var.q);
                        i = indexCount2;
                        break;
                    case 92:
                        l70Var.r = f(obtainStyledAttributes, index2, l70Var.r);
                        i = indexCount2;
                        break;
                    case 93:
                        l70Var.L = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.L);
                        i = indexCount2;
                        break;
                    case 94:
                        l70Var.S = obtainStyledAttributes.getDimensionPixelSize(index2, l70Var.S);
                        i = indexCount2;
                        break;
                    case 95:
                        g(l70Var, obtainStyledAttributes, index2, 0);
                        i = indexCount2;
                        break;
                    case 96:
                        g(l70Var, obtainStyledAttributes, index2, 1);
                        i = indexCount2;
                        break;
                    case 97:
                        l70Var.o0 = obtainStyledAttributes.getInt(index2, l70Var.o0);
                        i = indexCount2;
                        break;
                }
                i7++;
            }
            if (l70Var.j0 != null) {
                l70Var.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return k70Var;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p70.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(f70 f70Var, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        f70Var.G = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00ea. Please report as an issue. */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        String str;
        int i2;
        p70 p70Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = p70Var.c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (p70Var.f3794b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    k70 k70Var = (k70) hashMap.get(Integer.valueOf(id));
                    if (k70Var != null) {
                        if (childAt instanceof Barrier) {
                            l70 l70Var = k70Var.d;
                            l70Var.h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(l70Var.f0);
                            barrier.setMargin(l70Var.g0);
                            barrier.setAllowsGoneWidget(l70Var.n0);
                            int[] iArr = l70Var.i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = l70Var.j0;
                                if (str2 != null) {
                                    int[] c = c(barrier, str2);
                                    l70Var.i0 = c;
                                    barrier.setReferencedIds(c);
                                }
                            }
                        }
                        f70 f70Var = (f70) childAt.getLayoutParams();
                        f70Var.a();
                        k70Var.a(f70Var);
                        HashMap hashMap2 = k70Var.f;
                        Class<?> cls = childAt.getClass();
                        Iterator it = hashMap2.keySet().iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            a70 a70Var = (a70) hashMap2.get(str3);
                            HashMap hashMap3 = hashMap2;
                            if (!a70Var.f32a) {
                                str = hx2.p("set", str3);
                            } else {
                                str = str3;
                            }
                            Iterator it2 = it;
                            try {
                                switch (hx2.x(a70Var.f33b)) {
                                    case 0:
                                        i2 = childCount;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(a70Var.c));
                                        break;
                                    case 1:
                                        i2 = childCount;
                                        cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(a70Var.d));
                                        break;
                                    case 2:
                                        i2 = childCount;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(a70Var.g));
                                        break;
                                    case 3:
                                        i2 = childCount;
                                        Method method = cls.getMethod(str, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(a70Var.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        i2 = childCount;
                                        cls.getMethod(str, CharSequence.class).invoke(childAt, a70Var.e);
                                        break;
                                    case 5:
                                        i2 = childCount;
                                        cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(a70Var.f));
                                        break;
                                    case 6:
                                        i2 = childCount;
                                        cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(a70Var.d));
                                        break;
                                    case 7:
                                        i2 = childCount;
                                        try {
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(a70Var.c));
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            StringBuilder u = hx2.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u.append(cls.getName());
                                            Log.e("TransitionLayout", u.toString());
                                            e.printStackTrace();
                                            hashMap2 = hashMap3;
                                            it = it2;
                                            childCount = i2;
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                            hashMap2 = hashMap3;
                                            it = it2;
                                            childCount = i2;
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            StringBuilder u2 = hx2.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u2.append(cls.getName());
                                            Log.e("TransitionLayout", u2.toString());
                                            e.printStackTrace();
                                            hashMap2 = hashMap3;
                                            it = it2;
                                            childCount = i2;
                                        }
                                    default:
                                        i2 = childCount;
                                        break;
                                }
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                i2 = childCount;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                i2 = childCount;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                i2 = childCount;
                            }
                            hashMap2 = hashMap3;
                            it = it2;
                            childCount = i2;
                        }
                        i = childCount;
                        childAt.setLayoutParams(f70Var);
                        n70 n70Var = k70Var.f2904b;
                        if (n70Var.f3407b == 0) {
                            childAt.setVisibility(n70Var.f3406a);
                        }
                        childAt.setAlpha(n70Var.c);
                        o70 o70Var = k70Var.e;
                        childAt.setRotation(o70Var.f3613a);
                        childAt.setRotationX(o70Var.f3614b);
                        childAt.setRotationY(o70Var.c);
                        childAt.setScaleX(o70Var.d);
                        childAt.setScaleY(o70Var.e);
                        if (o70Var.h != -1) {
                            if (((View) childAt.getParent()).findViewById(o70Var.h) != null) {
                                float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(o70Var.f)) {
                                childAt.setPivotX(o70Var.f);
                            }
                            if (!Float.isNaN(o70Var.g)) {
                                childAt.setPivotY(o70Var.g);
                            }
                        }
                        childAt.setTranslationX(o70Var.i);
                        childAt.setTranslationY(o70Var.j);
                        childAt.setTranslationZ(o70Var.k);
                        if (o70Var.l) {
                            childAt.setElevation(o70Var.m);
                        }
                        i3++;
                        p70Var = this;
                        childCount = i;
                    }
                }
            }
            i = childCount;
            i3++;
            p70Var = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            k70 k70Var2 = (k70) hashMap.get(num);
            if (k70Var2 != null) {
                l70 l70Var2 = k70Var2.d;
                if (l70Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = l70Var2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str4 = l70Var2.j0;
                        if (str4 != null) {
                            int[] c2 = c(barrier2, str4);
                            l70Var2.i0 = c2;
                            barrier2.setReferencedIds(c2);
                        }
                    }
                    barrier2.setType(l70Var2.f0);
                    barrier2.setMargin(l70Var2.g0);
                    f70 generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    k70Var2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (l70Var2.f3076a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    f70 generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    k70Var2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof d70) {
                ((d70) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        p70 p70Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = p70Var.c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            f70 f70Var = (f70) childAt.getLayoutParams();
            int id = childAt.getId();
            if (p70Var.f3794b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new k70());
            }
            k70 k70Var = (k70) hashMap.get(Integer.valueOf(id));
            if (k70Var == null) {
                i = childCount;
            } else {
                HashMap hashMap2 = p70Var.f3793a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    a70 a70Var = (a70) hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        i2 = childCount;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        i2 = childCount;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        i2 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new a70(a70Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i2 = childCount;
                        try {
                            hashMap3.put(str, new a70(a70Var, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                            childCount = i2;
                        }
                        childCount = i2;
                    }
                }
                i = childCount;
                k70Var.f = hashMap3;
                k70Var.f2903a = id;
                int i4 = f70Var.e;
                l70 l70Var = k70Var.d;
                l70Var.h = i4;
                l70Var.i = f70Var.f;
                l70Var.j = f70Var.g;
                l70Var.k = f70Var.h;
                l70Var.l = f70Var.i;
                l70Var.m = f70Var.j;
                l70Var.n = f70Var.k;
                l70Var.o = f70Var.l;
                l70Var.p = f70Var.m;
                l70Var.q = f70Var.n;
                l70Var.r = f70Var.o;
                l70Var.s = f70Var.s;
                l70Var.t = f70Var.t;
                l70Var.u = f70Var.u;
                l70Var.v = f70Var.v;
                l70Var.w = f70Var.E;
                l70Var.x = f70Var.F;
                l70Var.y = f70Var.G;
                l70Var.z = f70Var.p;
                l70Var.A = f70Var.q;
                l70Var.B = f70Var.r;
                l70Var.C = f70Var.T;
                l70Var.D = f70Var.U;
                l70Var.E = f70Var.V;
                l70Var.f = f70Var.c;
                l70Var.d = f70Var.f2052a;
                l70Var.e = f70Var.f2053b;
                l70Var.f3077b = ((ViewGroup.MarginLayoutParams) f70Var).width;
                l70Var.c = ((ViewGroup.MarginLayoutParams) f70Var).height;
                l70Var.F = ((ViewGroup.MarginLayoutParams) f70Var).leftMargin;
                l70Var.G = ((ViewGroup.MarginLayoutParams) f70Var).rightMargin;
                l70Var.H = ((ViewGroup.MarginLayoutParams) f70Var).topMargin;
                l70Var.I = ((ViewGroup.MarginLayoutParams) f70Var).bottomMargin;
                l70Var.L = f70Var.D;
                l70Var.T = f70Var.I;
                l70Var.U = f70Var.H;
                l70Var.W = f70Var.K;
                l70Var.V = f70Var.J;
                l70Var.l0 = f70Var.W;
                l70Var.m0 = f70Var.X;
                l70Var.X = f70Var.L;
                l70Var.Y = f70Var.M;
                l70Var.Z = f70Var.P;
                l70Var.a0 = f70Var.Q;
                l70Var.b0 = f70Var.N;
                l70Var.c0 = f70Var.O;
                l70Var.d0 = f70Var.R;
                l70Var.e0 = f70Var.S;
                l70Var.k0 = f70Var.Y;
                l70Var.N = f70Var.x;
                l70Var.P = f70Var.z;
                l70Var.M = f70Var.w;
                l70Var.O = f70Var.y;
                l70Var.R = f70Var.A;
                l70Var.Q = f70Var.B;
                l70Var.S = f70Var.C;
                l70Var.o0 = f70Var.Z;
                l70Var.J = f70Var.getMarginEnd();
                l70Var.K = f70Var.getMarginStart();
                int visibility = childAt.getVisibility();
                n70 n70Var = k70Var.f2904b;
                n70Var.f3406a = visibility;
                n70Var.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                o70 o70Var = k70Var.e;
                o70Var.f3613a = rotation;
                o70Var.f3614b = childAt.getRotationX();
                o70Var.c = childAt.getRotationY();
                o70Var.d = childAt.getScaleX();
                o70Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    o70Var.f = pivotX;
                    o70Var.g = pivotY;
                }
                o70Var.i = childAt.getTranslationX();
                o70Var.j = childAt.getTranslationY();
                o70Var.k = childAt.getTranslationZ();
                if (o70Var.l) {
                    o70Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    l70Var.n0 = barrier.getAllowsGoneWidget();
                    l70Var.i0 = barrier.getReferencedIds();
                    l70Var.f0 = barrier.getType();
                    l70Var.g0 = barrier.getMargin();
                }
            }
            i3++;
            p70Var = this;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        k70 d2 = d(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            d2.d.f3076a = true;
                        }
                        this.c.put(Integer.valueOf(d2.f2903a), d2);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
