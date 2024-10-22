package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.q;
import defpackage.cq0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class y3 {
    public static final HashMap<String, LinkedList<o9>> h = new HashMap<>();
    public static final HashMap<String, LinkedList<o9>> i = new HashMap<>();
    public static final HashMap<String, LinkedList<o9>> j = new HashMap<>();
    public static final HashMap<String, LinkedList<o9>> k = new HashMap<>();
    public static n9 l;
    public static y3 m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1306a;

    /* renamed from: b, reason: collision with root package name */
    public final x3 f1307b;
    public final z1 c;
    public final h8 d;
    public final ScheduledExecutorService e;
    public final p7 f;
    public final HashMap<String, j9> g = new HashMap<>();

    public y3(Context context, x3 x3Var, z1 z1Var, h8 h8Var, ScheduledExecutorService scheduledExecutorService, n9 n9Var, p7 p7Var) {
        this.f1306a = context;
        this.f1307b = x3Var;
        this.c = z1Var;
        this.d = h8Var;
        this.e = scheduledExecutorService;
        l = n9Var;
        this.f = p7Var;
        m = this;
    }

    public static void d(o9 o9Var) {
        y3 b2 = b();
        if (b2 != null) {
            b2.e(o9Var);
            return;
        }
        f6.c("EventTracker", "EventTracker was not initialised when trying to track. Event: " + o9Var.g());
    }

    public void b(String str, String str2) {
        a(str).remove(str2);
    }

    public final boolean c(o9 o9Var) {
        if (b(o9Var.g())) {
            String a2 = o9Var.a();
            String d = o9Var.d();
            LinkedList<o9> linkedList = a(a2).get(d);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            linkedList.add(o9Var);
            a(a2).put(d, linkedList);
            return true;
        }
        return false;
    }

    public o9 e(o9 o9Var) {
        if (o9Var == null) {
            return null;
        }
        if (!l.d()) {
            return o9Var;
        }
        o9 b2 = this.f1307b.b(o9Var);
        if (this.f1306a != null && b2 != null) {
            b(b2);
        }
        return b2;
    }

    public static void a(n9 n9Var) {
        l = n9Var;
    }

    public final void b(o9 o9Var) {
        if (c(o9Var)) {
            return;
        }
        j9 j9Var = this.g.get(o9Var.d() + o9Var.a());
        if (j9Var != null) {
            o9Var.a(j9Var);
        }
        o9Var.a(a(o9Var));
        a(l, o9Var);
        f6.a("EventTracker", "Event: " + o9Var);
    }

    public void a(j9 j9Var) {
        this.g.put(j9Var.d() + j9Var.c(), j9Var);
    }

    public final Map<String, LinkedList<o9>> a(String str) {
        if (q.b.g.b().equals(str)) {
            return h;
        }
        if (q.c.g.b().equals(str)) {
            return i;
        }
        if (q.a.g.b().equals(str)) {
            return j;
        }
        return k;
    }

    public final boolean b(String str) {
        return "cache_start".equals(str) || "show_start".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(n9 n9Var, o9 o9Var) {
        String a2 = n9Var != null ? n9Var.a() : "";
        if (this.c == null || a2.length() <= 0) {
            return;
        }
        this.c.a(new p9(a2, o9Var, a()));
    }

    public final float a(o9 o9Var) {
        if (!o9Var.b()) {
            return 0.0f;
        }
        try {
            LinkedList<o9> linkedList = a(o9Var.a()).get(o9Var.d());
            o9 remove = linkedList != null ? linkedList.remove() : null;
            if (remove != null) {
                return ((float) (o9Var.h() - remove.h())) / 1000.0f;
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static void b(j9 j9Var) {
        y3 b2 = b();
        if (b2 != null) {
            b2.a(j9Var);
        } else {
            f6.c("EventTracker", "EventTracker was not initialised when trying to trackAd.");
        }
    }

    public static y3 b() {
        try {
            return m;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(n9 n9Var, o9 o9Var) {
        ScheduledExecutorService scheduledExecutorService;
        if (this.d == null || this.f1306a == null || o9Var == null || (scheduledExecutorService = this.e) == null) {
            return;
        }
        scheduledExecutorService.execute(new cq0(5, this, n9Var, o9Var));
    }

    public final v3 a() {
        j8 build = this.d.build();
        return v3.a(this.f1306a, build.c(), this.d.build().h(), build.g().c(), this.f, build.h);
    }

    public static void a(String str, String str2) {
        y3 b2 = b();
        if (b2 != null) {
            b2.b(str, str2);
        } else {
            f6.c("EventTracker", "EventTracker was not initialised when trying to clear.");
        }
    }
}
