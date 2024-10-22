package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.protobuf.v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p33 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3774a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3775b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public p33(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f3774a = objArr;
        this.f3775b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        char charAt;
        char charAt2;
        boolean z;
        Object obj;
        o33 o33Var = new o33(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            if (eventType != 1) {
                Menu menu2 = o33Var.f3592a;
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            str = null;
                            z3 = false;
                        } else if (name2.equals("group")) {
                            o33Var.f3593b = 0;
                            o33Var.c = 0;
                            o33Var.d = 0;
                            o33Var.e = 0;
                            o33Var.f = true;
                            o33Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!o33Var.h) {
                                tu1 tu1Var = o33Var.z;
                                if (tu1Var != null && tu1Var.f4579a.hasSubMenu()) {
                                    o33Var.h = true;
                                    o33Var.a(menu2.addSubMenu(o33Var.f3593b, o33Var.i, o33Var.j, o33Var.k).getItem());
                                } else {
                                    o33Var.h = true;
                                    o33Var.a(menu2.add(o33Var.f3593b, o33Var.i, o33Var.j, o33Var.k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    p33 p33Var = o33Var.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = p33Var.c.obtainStyledAttributes(attributeSet, cg2.MenuGroup);
                        o33Var.f3593b = obtainStyledAttributes.getResourceId(cg2.MenuGroup_android_id, 0);
                        o33Var.c = obtainStyledAttributes.getInt(cg2.MenuGroup_android_menuCategory, 0);
                        o33Var.d = obtainStyledAttributes.getInt(cg2.MenuGroup_android_orderInCategory, 0);
                        o33Var.e = obtainStyledAttributes.getInt(cg2.MenuGroup_android_checkableBehavior, 0);
                        o33Var.f = obtainStyledAttributes.getBoolean(cg2.MenuGroup_android_visible, true);
                        o33Var.g = obtainStyledAttributes.getBoolean(cg2.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = p33Var.c;
                        go2 go2Var = new go2(context, context.obtainStyledAttributes(attributeSet, cg2.MenuItem));
                        o33Var.i = go2Var.i(cg2.MenuItem_android_id, 0);
                        o33Var.j = (go2Var.h(cg2.MenuItem_android_menuCategory, o33Var.c) & (-65536)) | (go2Var.h(cg2.MenuItem_android_orderInCategory, o33Var.d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        o33Var.k = go2Var.k(cg2.MenuItem_android_title);
                        o33Var.l = go2Var.k(cg2.MenuItem_android_titleCondensed);
                        o33Var.m = go2Var.i(cg2.MenuItem_android_icon, 0);
                        String j = go2Var.j(cg2.MenuItem_android_alphabeticShortcut);
                        if (j == null) {
                            charAt = 0;
                        } else {
                            charAt = j.charAt(0);
                        }
                        o33Var.n = charAt;
                        o33Var.o = go2Var.h(cg2.MenuItem_alphabeticModifiers, v.DEFAULT_BUFFER_SIZE);
                        String j2 = go2Var.j(cg2.MenuItem_android_numericShortcut);
                        if (j2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j2.charAt(0);
                        }
                        o33Var.p = charAt2;
                        o33Var.q = go2Var.h(cg2.MenuItem_numericModifiers, v.DEFAULT_BUFFER_SIZE);
                        int i2 = cg2.MenuItem_android_checkable;
                        if (go2Var.l(i2)) {
                            o33Var.r = go2Var.a(i2, false) ? 1 : 0;
                        } else {
                            o33Var.r = o33Var.e;
                        }
                        o33Var.s = go2Var.a(cg2.MenuItem_android_checked, false);
                        o33Var.t = go2Var.a(cg2.MenuItem_android_visible, o33Var.f);
                        o33Var.u = go2Var.a(cg2.MenuItem_android_enabled, o33Var.g);
                        o33Var.v = go2Var.h(cg2.MenuItem_showAsAction, -1);
                        o33Var.y = go2Var.j(cg2.MenuItem_android_onClick);
                        o33Var.w = go2Var.i(cg2.MenuItem_actionLayout, 0);
                        o33Var.x = go2Var.j(cg2.MenuItem_actionViewClass);
                        String j3 = go2Var.j(cg2.MenuItem_actionProviderClass);
                        if (j3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && o33Var.w == 0 && o33Var.x == null) {
                            Class<?>[] clsArr = f;
                            Object[] objArr = p33Var.f3775b;
                            try {
                                Constructor<?> constructor = Class.forName(j3, false, p33Var.c.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            o33Var.z = (tu1) obj;
                        } else {
                            o33Var.z = null;
                        }
                        o33Var.A = go2Var.k(cg2.MenuItem_contentDescription);
                        o33Var.B = go2Var.k(cg2.MenuItem_tooltipText);
                        int i3 = cg2.MenuItem_iconTintMode;
                        if (go2Var.l(i3)) {
                            o33Var.D = in0.c(go2Var.h(i3, -1), o33Var.D);
                        } else {
                            o33Var.D = null;
                        }
                        int i4 = cg2.MenuItem_iconTint;
                        if (go2Var.l(i4)) {
                            o33Var.C = go2Var.b(i4);
                        } else {
                            o33Var.C = null;
                        }
                        go2Var.o();
                        o33Var.h = false;
                    } else if (name3.equals("menu")) {
                        o33Var.h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(o33Var.f3593b, o33Var.i, o33Var.j, o33Var.k);
                        o33Var.a(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof m33)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
