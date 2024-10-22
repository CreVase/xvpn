package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.webkit.WebView;
import androidx.recyclerview.widget.h;
import com.google.android.material.datepicker.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o40 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3596a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3597b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public o40(sb2 sb2Var, WebView webView) {
        u7 u7Var = u7.HTML;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.f3596a = sb2Var;
        this.f3597b = webView;
        this.e = null;
        this.h = u7Var;
        this.g = null;
        this.f = null;
    }

    public final void a() {
        int i;
        Iterator it = ((List) this.d).iterator();
        while (true) {
            if (it.hasNext()) {
                cz1 cz1Var = (cz1) it.next();
                int i2 = cz1Var.c.c;
                i = 3;
                if (i2 == 3 || (i2 == 2 && cz1Var.e == 0)) {
                    break;
                }
            } else {
                i = 1;
                break;
            }
        }
        n40 n40Var = (n40) this.f3596a;
        if (i != n40Var.c) {
            n40Var.c = i;
            n40Var.f2091a.f();
        }
    }

    public final int b(cz1 cz1Var) {
        cz1 cz1Var2;
        Iterator it = ((List) this.d).iterator();
        int i = 0;
        while (it.hasNext() && (cz1Var2 = (cz1) it.next()) != cz1Var) {
            i += cz1Var2.e;
        }
        return i;
    }

    public final mp c(int i) {
        mp mpVar = (mp) this.f;
        if (mpVar.f3330b) {
            mpVar = new mp();
        } else {
            mpVar.f3330b = true;
        }
        Iterator it = ((List) this.d).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cz1 cz1Var = (cz1) it.next();
            int i3 = cz1Var.e;
            if (i3 > i2) {
                mpVar.c = cz1Var;
                mpVar.f3329a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((cz1) mpVar.c) != null) {
            return mpVar;
        }
        throw new IllegalArgumentException(hx2.m("Cannot find wrapper for ", i));
    }

    public final cz1 d(h hVar) {
        cz1 cz1Var = (cz1) ((IdentityHashMap) this.e).get(hVar);
        if (cz1Var != null) {
            return cz1Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + hVar + ", seems like it is not bound by this adapter: " + this);
    }

    public o40(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(cp3.L(context, he2.materialCalendarStyle, f.class.getCanonicalName()).data, bg2.MaterialCalendar);
        this.f3596a = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_dayStyle, 0));
        this.g = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_dayInvalidStyle, 0));
        this.f3597b = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_daySelectedStyle, 0));
        this.c = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList j0 = m20.j0(context, obtainStyledAttributes, bg2.MaterialCalendar_rangeFillColor);
        this.d = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_yearStyle, 0));
        this.e = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_yearSelectedStyle, 0));
        this.f = kc.b(context, obtainStyledAttributes.getResourceId(bg2.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(j0.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public o40(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, uy0 uy0Var) {
        this.f3596a = str;
        this.f3597b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = uy0Var;
    }

    public o40(n40 n40Var) {
        this.c = new ArrayList();
        this.e = new IdentityHashMap();
        this.d = new ArrayList();
        this.f = new mp();
        this.f3596a = n40Var;
        this.f3597b = new q9(2);
        this.g = m40.NO_STABLE_IDS;
        this.h = new f03();
    }
}
