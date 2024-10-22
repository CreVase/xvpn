package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class l70 {
    public static final SparseIntArray p0;

    /* renamed from: b, reason: collision with root package name */
    public int f3077b;
    public int c;
    public int[] i0;
    public String j0;
    public String k0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3076a = false;
    public int d = -1;
    public int e = -1;
    public float f = -1.0f;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public float w = 0.5f;
    public float x = 0.5f;
    public String y = null;
    public int z = -1;
    public int A = 0;
    public float B = 0.0f;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = Integer.MIN_VALUE;
    public int N = Integer.MIN_VALUE;
    public int O = Integer.MIN_VALUE;
    public int P = Integer.MIN_VALUE;
    public int Q = Integer.MIN_VALUE;
    public int R = Integer.MIN_VALUE;
    public int S = Integer.MIN_VALUE;
    public float T = -1.0f;
    public float U = -1.0f;
    public int V = 0;
    public int W = 0;
    public int X = 0;
    public int Y = 0;
    public int Z = 0;
    public int a0 = 0;
    public int b0 = 0;
    public int c0 = 0;
    public float d0 = 1.0f;
    public float e0 = 1.0f;
    public int f0 = -1;
    public int g0 = 0;
    public int h0 = -1;
    public boolean l0 = false;
    public boolean m0 = false;
    public boolean n0 = true;
    public int o0 = 0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.append(vf2.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(vf2.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(vf2.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(vf2.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(vf2.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(vf2.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(vf2.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(vf2.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(vf2.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(vf2.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(vf2.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(vf2.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(vf2.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(vf2.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(vf2.Layout_guidelineUseRtl, 90);
        sparseIntArray.append(vf2.Layout_android_orientation, 26);
        sparseIntArray.append(vf2.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(vf2.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(vf2.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(vf2.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(vf2.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(vf2.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(vf2.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(vf2.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(vf2.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(vf2.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(vf2.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(vf2.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(vf2.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(vf2.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(vf2.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(vf2.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(vf2.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(vf2.Layout_layout_constraintLeft_creator, 91);
        sparseIntArray.append(vf2.Layout_layout_constraintTop_creator, 91);
        sparseIntArray.append(vf2.Layout_layout_constraintRight_creator, 91);
        sparseIntArray.append(vf2.Layout_layout_constraintBottom_creator, 91);
        sparseIntArray.append(vf2.Layout_layout_constraintBaseline_creator, 91);
        sparseIntArray.append(vf2.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(vf2.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(vf2.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(vf2.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(vf2.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(vf2.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(vf2.Layout_android_layout_width, 22);
        sparseIntArray.append(vf2.Layout_android_layout_height, 21);
        sparseIntArray.append(vf2.Layout_layout_constraintWidth, 41);
        sparseIntArray.append(vf2.Layout_layout_constraintHeight, 42);
        sparseIntArray.append(vf2.Layout_layout_constrainedWidth, 41);
        sparseIntArray.append(vf2.Layout_layout_constrainedHeight, 42);
        sparseIntArray.append(vf2.Layout_layout_wrapBehaviorInParent, 76);
        sparseIntArray.append(vf2.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(vf2.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(vf2.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(vf2.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(vf2.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(vf2.Layout_chainUseRtl, 71);
        sparseIntArray.append(vf2.Layout_barrierDirection, 72);
        sparseIntArray.append(vf2.Layout_barrierMargin, 73);
        sparseIntArray.append(vf2.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(vf2.Layout_barrierAllowsGoneWidgets, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vf2.Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = p0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.p = p70.f(obtainStyledAttributes, index, this.p);
                    break;
                case 2:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.o = p70.f(obtainStyledAttributes, index, this.o);
                    break;
                case 4:
                    this.n = p70.f(obtainStyledAttributes, index, this.n);
                    break;
                case 5:
                    this.y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case 7:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 8:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.v = p70.f(obtainStyledAttributes, index, this.v);
                    break;
                case 10:
                    this.u = p70.f(obtainStyledAttributes, index, this.u);
                    break;
                case 11:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 12:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case 14:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 15:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 17:
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                    break;
                case 18:
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 19:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 20:
                    this.w = obtainStyledAttributes.getFloat(index, this.w);
                    break;
                case 21:
                    this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 22:
                    this.f3077b = obtainStyledAttributes.getLayoutDimension(index, this.f3077b);
                    break;
                case 23:
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case 24:
                    this.h = p70.f(obtainStyledAttributes, index, this.h);
                    break;
                case 25:
                    this.i = p70.f(obtainStyledAttributes, index, this.i);
                    break;
                case 26:
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.j = p70.f(obtainStyledAttributes, index, this.j);
                    break;
                case 29:
                    this.k = p70.f(obtainStyledAttributes, index, this.k);
                    break;
                case 30:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 31:
                    this.s = p70.f(obtainStyledAttributes, index, this.s);
                    break;
                case 32:
                    this.t = p70.f(obtainStyledAttributes, index, this.t);
                    break;
                case 33:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 34:
                    this.m = p70.f(obtainStyledAttributes, index, this.m);
                    break;
                case 35:
                    this.l = p70.f(obtainStyledAttributes, index, this.l);
                    break;
                case 36:
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                    break;
                case 37:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 38:
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                    break;
                case 39:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case 40:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case 41:
                    p70.g(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    p70.g(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.z = p70.f(obtainStyledAttributes, index, this.z);
                            break;
                        case 62:
                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f0 = obtainStyledAttributes.getInt(index, this.f0);
                                    break;
                                case 73:
                                    this.g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                    break;
                                case 74:
                                    this.j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 76:
                                    this.o0 = obtainStyledAttributes.getInt(index, this.o0);
                                    break;
                                case 77:
                                    this.q = p70.f(obtainStyledAttributes, index, this.q);
                                    break;
                                case 78:
                                    this.r = p70.f(obtainStyledAttributes, index, this.r);
                                    break;
                                case 79:
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 84:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 86:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 87:
                                    this.l0 = obtainStyledAttributes.getBoolean(index, this.l0);
                                    break;
                                case 88:
                                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 89:
                                    this.k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.g = obtainStyledAttributes.getBoolean(index, this.g);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
