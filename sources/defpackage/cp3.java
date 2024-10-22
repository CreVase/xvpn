package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract /* synthetic */ class cp3 {
    public static Drawable c;
    public static Drawable d;
    public static Drawable e;
    public static Drawable f;
    public static Drawable g;
    public static Drawable h;
    public static final zr3 l;
    public static final zr3 m;
    public static final zr3 n;
    public static final zr3 o;
    public static final zr3 p;
    public static final zr3 q;
    public static final zr3 r;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1649a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1650b = {"", "A", "B", "C"};
    public static final xz0 i = new xz0(0);
    public static final uh1[] j = new uh1[0];
    public static final s71 k = new s71(19);

    static {
        int i2 = 1;
        int i3 = 2;
        l = new zr3(i2, i3, 0);
        int i4 = 3;
        int i5 = 4;
        m = new zr3(i4, i5, i2);
        int i6 = 5;
        n = new zr3(i5, i6, i3);
        int i7 = 6;
        int i8 = 7;
        o = new zr3(i7, i8, i4);
        int i9 = 8;
        p = new zr3(i8, i9, i5);
        q = new zr3(i9, 9, i6);
        r = new zr3(11, 12, i7);
    }

    public static void A(Context context) {
        if (c != null) {
            return;
        }
        Drawable x = x(context, R.drawable.icon_group_indicator_normal);
        c = x;
        x.setBounds(0, 0, (int) (bx3.z(context) * 10.0f), (int) (bx3.z(context) * 10.0f));
        int z = (int) (bx3.z(context) * 20);
        int z2 = (int) (bx3.z(context) * 14);
        d = x(context, R.drawable.icon_collect_uncheck);
        e = x(context, R.drawable.icon_collect_check);
        f = x(context, R.drawable.icon_server_lock);
        d.setBounds(0, 0, z, z);
        e.setBounds(0, 0, z, z);
        f.setBounds(0, 0, z, z);
        h = x(context, R.drawable.ic_checkbox_checked);
        g = x(context, R.drawable.ic_checkbox_uncheck);
        h.setBounds(0, 0, z2, z2);
        g.setBounds(0, 0, z2, z2);
    }

    public static nr2 B(ob1 ob1Var, ob1 ob1Var2) {
        if (ob1Var != null) {
            if (ob1Var2 != null) {
                return new nr2(ob1Var, ob1Var2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    public static boolean C(XmlPullParser xmlPullParser, String str) {
        boolean z;
        if (xmlPullParser.getEventType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean D(View view) {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        boolean z;
        if (xmlPullParser.getEventType() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static Typeface F(Configuration configuration, Typeface typeface) {
        int weight;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31 && it1.b(configuration) != Integer.MAX_VALUE && it1.b(configuration) != 0 && typeface != null) {
            weight = typeface.getWeight();
            create = Typeface.create(typeface, ew3.E0(it1.b(configuration) + weight, 1, 1000), typeface.isItalic());
            return create;
        }
        return null;
    }

    public static ArrayList G(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static PorterDuff.Mode H(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void I(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static TypedValue J(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean K(Context context, int i2, boolean z) {
        TypedValue J = J(context, i2);
        if (J != null && J.type == 18) {
            if (J.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue L(Context context, int i2, String str) {
        TypedValue J = J(context, i2);
        if (J != null) {
            return J;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static int M(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static void N(List list, t62 t62Var, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (t62Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 >= i2) {
                list.remove(i3);
            } else {
                return;
            }
        }
    }

    public static int O(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int P(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return O(hashCode);
    }

    public static int[] Q(Collection collection) {
        if (collection instanceof ee1) {
            ee1 ee1Var = (ee1) collection;
            return Arrays.copyOfRange(ee1Var.f1923a, ee1Var.f1924b, ee1Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static ArrayList R(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((bs) it.next()).toBundle());
        }
        return arrayList;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static String b(int i2, int i3, String str) {
        if (i2 < 0) {
            return zf3.V("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zf3.V("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String d(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        char c2;
        Object[] objArr = new Object[5];
        objArr[0] = f1650b[i2];
        objArr[1] = Integer.valueOf(i3);
        objArr[2] = Integer.valueOf(i4);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        objArr[3] = Character.valueOf(c2);
        objArr[4] = Integer.valueOf(i5);
        StringBuilder sb = new StringBuilder(wi3.m("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static void e(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(int i2, int i3) {
        String V;
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        if (i2 >= 0) {
            if (i3 >= 0) {
                V = zf3.V("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            V = zf3.V("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(V);
    }

    public static void h(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i3);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void i(int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void k(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
        } else {
            throw new IndexOutOfBoundsException(b(i2, i3, "index"));
        }
    }

    public static void l(int i2, int i3, int i4) {
        String b2;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                b2 = zf3.V("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                b2 = b(i3, i4, "end index");
            }
        } else {
            b2 = b(i2, i4, "start index");
        }
        throw new IndexOutOfBoundsException(b2);
    }

    public static void m(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void n(String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void o(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static int q(long j2) {
        boolean z;
        int i2 = (int) j2;
        if (i2 == j2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i2;
        }
        throw new IllegalArgumentException(zf3.V("Out of range: %s", Long.valueOf(j2)));
    }

    public static int r(int i2, int i3) {
        boolean z;
        if (i3 <= 1073741823) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.min(Math.max(i2, i3), 1073741823);
        }
        throw new IllegalArgumentException(zf3.V("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), 1073741823));
    }

    public static float s(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static boolean t(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static or2 u(Set set, ph0 ph0Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof or2) {
                or2 or2Var = (or2) sortedSet;
                t62 t62Var = or2Var.f3719b;
                t62Var.getClass();
                return new pr2((SortedSet) or2Var.f3718a, new u62(Arrays.asList(t62Var, ph0Var)));
            }
            sortedSet.getClass();
            return new pr2(sortedSet, ph0Var);
        }
        if (set instanceof or2) {
            or2 or2Var2 = (or2) set;
            t62 t62Var2 = or2Var2.f3719b;
            t62Var2.getClass();
            return new or2((Set) or2Var2.f3718a, new u62(Arrays.asList(t62Var2, ph0Var)));
        }
        set.getClass();
        return new or2(set, ph0Var);
    }

    public static ji2 v(as asVar, ArrayList arrayList) {
        db1 db1Var = hb1.f2394b;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            bs d2 = asVar.d(bundle);
            d2.getClass();
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i4));
            }
            objArr[i3] = d2;
            i2++;
            i3 = i4;
        }
        return hb1.j(i3, objArr);
    }

    public static String w(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static Drawable x(Context context, int i2) {
        Resources resources = context.getResources();
        int i3 = context.getResources().getDisplayMetrics().densityDpi;
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = jk2.f2780a;
        return ck2.b(resources, i2, i3, theme);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[LOOP:1: B:13:0x0053->B:27:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[EDGE_INSN: B:28:0x009a->B:29:0x009a BREAK  A[LOOP:1: B:13:0x0053->B:27:0x0096], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.q9 y(android.content.Context r22, defpackage.kc r23) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp3.y(android.content.Context, kc):q9");
    }

    public static int z(Set set) {
        int i2;
        int i3 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 = ~(~(i3 + i2));
        }
        return i3;
    }
}
