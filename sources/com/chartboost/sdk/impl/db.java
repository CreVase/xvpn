package com.chartboost.sdk.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class db {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<View, String> f773a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<View, a> f774b = new HashMap<>();
    public final HashMap<String, View> c = new HashMap<>();
    public final HashSet<View> d = new HashSet<>();
    public final HashSet<String> e = new HashSet<>();
    public final HashSet<String> f = new HashSet<>();
    public final HashMap<String, String> g = new HashMap<>();
    public final Map<View, Boolean> h = new WeakHashMap();
    public boolean i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final dc f775a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<String> f776b = new ArrayList<>();

        public a(dc dcVar, String str) {
            this.f775a = dcVar;
            a(str);
        }

        public dc a() {
            return this.f775a;
        }

        public ArrayList<String> b() {
            return this.f776b;
        }

        public void a(String str) {
            this.f776b.add(str);
        }
    }

    public View a(String str) {
        return this.c.get(str);
    }

    public final Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.h.remove(view);
            return Boolean.FALSE;
        }
        if (this.h.containsKey(view)) {
            return this.h.get(view);
        }
        Map<View, Boolean> map = this.h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public a c(View view) {
        a aVar = this.f774b.get(view);
        if (aVar != null) {
            this.f774b.remove(view);
        }
        return aVar;
    }

    public String d(View view) {
        if (this.f773a.size() == 0) {
            return null;
        }
        String str = this.f773a.get(view);
        if (str != null) {
            this.f773a.remove(view);
        }
        return str;
    }

    public ub e(View view) {
        return this.d.contains(view) ? ub.PARENT_VIEW : this.i ? ub.OBSTRUCTION_VIEW : ub.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, Boolean.TRUE);
        return false;
    }

    public final String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a2 = lc.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.e;
    }

    public void d() {
        this.i = true;
    }

    public void e() {
        rb c = rb.c();
        if (c != null) {
            for (xa xaVar : c.a()) {
                View e = xaVar.e();
                if (xaVar.h()) {
                    String j = xaVar.j();
                    if (e != null) {
                        String a2 = a(e);
                        if (a2 == null) {
                            this.e.add(j);
                            this.f773a.put(e, j);
                            a(xaVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f.add(j);
                            this.c.put(j, e);
                            this.g.put(j, a2);
                        }
                    } else {
                        this.f.add(j);
                        this.g.put(j, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f773a.clear();
        this.f774b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public final void a(dc dcVar, xa xaVar) {
        View view = dcVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f774b.get(view);
        if (aVar != null) {
            aVar.a(xaVar.j());
        } else {
            this.f774b.put(view, new a(dcVar, xaVar.j()));
        }
    }

    public final void a(xa xaVar) {
        Iterator<dc> it = xaVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), xaVar);
        }
    }
}
