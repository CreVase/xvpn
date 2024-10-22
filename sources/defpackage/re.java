package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4139a;

    /* renamed from: b, reason: collision with root package name */
    public j93 f4140b;
    public j93 c;
    public j93 d;
    public j93 e;
    public j93 f;
    public j93 g;
    public j93 h;
    public final af i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public re(TextView textView) {
        this.f4139a = textView;
        this.i = new af(textView);
    }

    public static j93 c(Context context, nd ndVar, int i) {
        ColorStateList i2;
        synchronized (ndVar) {
            i2 = ndVar.f3439a.i(context, i);
        }
        if (i2 != null) {
            j93 j93Var = new j93(0);
            j93Var.c = true;
            j93Var.d = i2;
            return j93Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                op0.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                op0.a(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6 + 0;
            } else {
                i = i5 + 0;
            }
            if (i5 > i6) {
                i2 = i5 - 0;
            } else {
                i2 = i6 + 0;
            }
            int length = text.length();
            if (i >= 0 && i2 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (i7 != 129 && i7 != 225 && i7 != 18) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    fl.Y(editorInfo, null, 0, 0);
                    return;
                }
                if (length <= 2048) {
                    fl.Y(editorInfo, text, i, i2);
                    return;
                }
                int i8 = i2 - i;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(text.length() - i2, i9 - Math.min(i, (int) (i9 * 0.8d)));
                int min2 = Math.min(i, i9 - min);
                int i10 = i - min2;
                if (Character.isLowSurrogate(text.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i3 + min;
                if (i3 != i8) {
                    subSequence = TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i2, min + i2));
                } else {
                    subSequence = text.subSequence(i10, i11 + i10);
                }
                int i12 = min2 + 0;
                fl.Y(editorInfo, subSequence, i12, i3 + i12);
                return;
            }
            fl.Y(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, j93 j93Var) {
        if (drawable != null && j93Var != null) {
            nd.e(drawable, j93Var, this.f4139a.getDrawableState());
        }
    }

    public final void b() {
        j93 j93Var = this.f4140b;
        TextView textView = this.f4139a;
        if (j93Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4140b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] a2 = me.a(textView);
            a(a2[0], this.f);
            a(a2[2], this.g);
        }
    }

    public final ColorStateList d() {
        j93 j93Var = this.h;
        if (j93Var != null) {
            return (ColorStateList) j93Var.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        j93 j93Var = this.h;
        if (j93Var != null) {
            return (PorterDuff.Mode) j93Var.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String j;
        ColorStateList b2;
        ColorStateList b3;
        ColorStateList b4;
        go2 go2Var = new go2(context, context.obtainStyledAttributes(i, cg2.TextAppearance));
        int i2 = cg2.TextAppearance_textAllCaps;
        boolean l = go2Var.l(i2);
        TextView textView = this.f4139a;
        if (l) {
            textView.setAllCaps(go2Var.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = cg2.TextAppearance_android_textColor;
            if (go2Var.l(i4) && (b4 = go2Var.b(i4)) != null) {
                textView.setTextColor(b4);
            }
            int i5 = cg2.TextAppearance_android_textColorLink;
            if (go2Var.l(i5) && (b3 = go2Var.b(i5)) != null) {
                textView.setLinkTextColor(b3);
            }
            int i6 = cg2.TextAppearance_android_textColorHint;
            if (go2Var.l(i6) && (b2 = go2Var.b(i6)) != null) {
                textView.setHintTextColor(b2);
            }
        }
        int i7 = cg2.TextAppearance_android_textSize;
        if (go2Var.l(i7) && go2Var.d(i7, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, go2Var);
        if (i3 >= 26) {
            int i8 = cg2.TextAppearance_fontVariationSettings;
            if (go2Var.l(i8) && (j = go2Var.j(i8)) != null) {
                pe.d(textView, j);
            }
        }
        go2Var.o();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        af afVar = this.i;
        if (afVar.h()) {
            DisplayMetrics displayMetrics = afVar.j.getResources().getDisplayMetrics();
            afVar.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (afVar.f()) {
                afVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        af afVar = this.i;
        if (afVar.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = afVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                afVar.f = af.b(iArr2);
                if (!afVar.g()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                afVar.g = false;
            }
            if (afVar.f()) {
                afVar.a();
            }
        }
    }

    public final void k(int i) {
        af afVar = this.i;
        if (afVar.h()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = afVar.j.getResources().getDisplayMetrics();
                    afVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (afVar.f()) {
                        afVar.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(hx2.m("Unknown auto-size text type: ", i));
            }
            afVar.f72a = 0;
            afVar.d = -1.0f;
            afVar.e = -1.0f;
            afVar.c = -1.0f;
            afVar.f = new int[0];
            afVar.f73b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z = false;
        if (this.h == null) {
            this.h = new j93(0);
        }
        j93 j93Var = this.h;
        j93Var.d = colorStateList;
        if (colorStateList != null) {
            z = true;
        }
        j93Var.c = z;
        this.f4140b = j93Var;
        this.c = j93Var;
        this.d = j93Var;
        this.e = j93Var;
        this.f = j93Var;
        this.g = j93Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z = false;
        if (this.h == null) {
            this.h = new j93(0);
        }
        j93 j93Var = this.h;
        j93Var.e = mode;
        if (mode != null) {
            z = true;
        }
        j93Var.f2730b = z;
        this.f4140b = j93Var;
        this.c = j93Var;
        this.d = j93Var;
        this.e = j93Var;
        this.f = j93Var;
        this.g = j93Var;
    }

    public final void n(Context context, go2 go2Var) {
        String j;
        boolean z;
        boolean z2;
        this.j = go2Var.h(cg2.TextAppearance_android_textStyle, this.j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int h = go2Var.h(cg2.TextAppearance_android_textFontWeight, -1);
            this.k = h;
            if (h != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = cg2.TextAppearance_android_fontFamily;
        if (!go2Var.l(i2) && !go2Var.l(cg2.TextAppearance_fontFamily)) {
            int i3 = cg2.TextAppearance_android_typeface;
            if (go2Var.l(i3)) {
                this.m = false;
                int h2 = go2Var.h(i3, 1);
                if (h2 != 1) {
                    if (h2 != 2) {
                        if (h2 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = cg2.TextAppearance_fontFamily;
        if (go2Var.l(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface g = go2Var.g(i2, this.j, new ke(this, i5, i6, new WeakReference(this.f4139a)));
                if (g != null) {
                    if (i >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(g, 0);
                        int i7 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = qe.a(create, i7, z2);
                    } else {
                        this.l = g;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (j = go2Var.j(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(j, 0);
                int i8 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = qe.a(create2, i8, z3);
                return;
            }
            this.l = Typeface.create(j, this.j);
        }
    }
}
