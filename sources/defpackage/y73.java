package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public abstract class y73 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5287a = {he2.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5288b = {he2.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(bg2.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(he2.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f5288b, "Theme.MaterialComponents");
            }
        }
        c(context, f5287a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            if (r0.getResourceId(defpackage.bg2.ThemeEnforcement_android_textAppearance, -1) != (-1)) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = defpackage.bg2.ThemeEnforcement
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            int r1 = defpackage.bg2.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L13
            r0.recycle()
            return
        L13:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L20
            int r4 = defpackage.bg2.ThemeEnforcement_android_textAppearance
            int r4 = r0.getResourceId(r4, r3)
            if (r4 == r3) goto L3b
            goto L3a
        L20:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L37
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L34
            r4.recycle()
            goto L3b
        L34:
            int r6 = r6 + 1
            goto L26
        L37:
            r4.recycle()
        L3a:
            r2 = 1
        L3b:
            r0.recycle()
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y73.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(hx2.q("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
