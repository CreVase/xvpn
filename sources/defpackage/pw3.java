package defpackage;

import a.wcyybbcujkCs;
import a.wcyybbcujkPra;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pw3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3928a;

    public /* synthetic */ pw3(int i) {
        this.f3928a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Boolean bool;
        String str;
        boolean z2 = true;
        switch (this.f3928a) {
            case 0:
                wcyybbcujkCs.d = false;
                wcyybbcujkCs.f = false;
                Context d = tf3.d();
                try {
                    if (VpnService.prepare(d) == null) {
                        wcyybbcujkCs.c(d);
                        return;
                    }
                    Intent intent = new Intent(d, (Class<?>) wcyybbcujkPra.class);
                    intent.putExtra("psk", "z93emquwpbdk9qvqfkfc8z552vaf52szsvzbmvd6qjdynmxm7yh6nq23c9yw4drs");
                    intent.setFlags(268435456);
                    d.startActivity(intent);
                    return;
                } catch (NullPointerException e) {
                    e.printStackTrace();
                    wcyybbcujkCs.d = true;
                    ew3.b0(new ow3(0));
                    return;
                } catch (Exception unused) {
                    wcyybbcujkCs.f = true;
                    ew3.b0(new ow3(1));
                    return;
                }
            case 1:
                wcyybbcujkCs.f5b.h();
                return;
            case 2:
                try {
                    int i = qa3.f3976a;
                    pa3.a("EmojiCompat.EmojiCompatInitializer.run");
                    if (aq0.k == null) {
                        z2 = false;
                    }
                    if (z2) {
                        aq0.a().c();
                    }
                    pa3.b();
                    return;
                } catch (Throwable th) {
                    int i2 = qa3.f3976a;
                    pa3.b();
                    throw th;
                }
            case 3:
                hc3 hc3Var = hc3.g;
                hc3Var.getClass();
                hc3Var.f2402b.clear();
                Iterator it = dv3.c.a().iterator();
                while (it.hasNext()) {
                    ((mu3) it.next()).getClass();
                }
                hc3Var.f = System.nanoTime();
                dc2 dc2Var = hc3Var.d;
                dc2Var.getClass();
                dv3 dv3Var = dv3.c;
                if (dv3Var != null) {
                    for (mu3 mu3Var : dv3Var.a()) {
                        View view = (View) mu3Var.c.get();
                        if (mu3Var.e && !mu3Var.f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            String str2 = mu3Var.g;
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    str = "notAttached";
                                } else {
                                    if (view.hasWindowFocus()) {
                                        ((Map) dc2Var.i).remove(view);
                                        bool = Boolean.FALSE;
                                    } else if (((Map) dc2Var.i).containsKey(view)) {
                                        bool = (Boolean) ((Map) dc2Var.i).get(view);
                                    } else {
                                        Map map = (Map) dc2Var.i;
                                        Boolean bool2 = Boolean.FALSE;
                                        map.put(view, bool2);
                                        bool = bool2;
                                    }
                                    if (bool.booleanValue()) {
                                        str = "noWindowFocus";
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        View view2 = view;
                                        while (true) {
                                            if (view2 != null) {
                                                String a2 = fl.a(view2);
                                                if (a2 != null) {
                                                    str = a2;
                                                } else {
                                                    hashSet.add(view2);
                                                    Object parent = view2.getParent();
                                                    if (parent instanceof View) {
                                                        view2 = (View) parent;
                                                    } else {
                                                        view2 = null;
                                                    }
                                                }
                                            } else {
                                                ((HashSet) dc2Var.e).addAll(hashSet);
                                                str = null;
                                            }
                                        }
                                    }
                                }
                                if (str == null) {
                                    ((HashSet) dc2Var.f).add(str2);
                                    ((HashMap) dc2Var.f1757b).put(view, str2);
                                    Iterator it2 = mu3Var.f3357b.iterator();
                                    if (it2.hasNext()) {
                                        p71.C(it2.next());
                                        throw null;
                                    }
                                } else if (str != "noWindowFocus") {
                                    ((HashSet) dc2Var.g).add(str2);
                                    ((HashMap) dc2Var.d).put(str2, view);
                                    ((HashMap) dc2Var.h).put(str2, str);
                                }
                            } else {
                                ((HashSet) dc2Var.g).add(str2);
                                ((HashMap) dc2Var.h).put(str2, "noAdView");
                            }
                        }
                    }
                }
                long nanoTime = System.nanoTime();
                uy0 uy0Var = hc3Var.c;
                uo uoVar = (uo) uy0Var.c;
                int size = ((HashSet) dc2Var.g).size();
                uy0 uy0Var2 = hc3Var.e;
                if (size > 0) {
                    Iterator it3 = ((HashSet) dc2Var.g).iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        JSONObject a3 = uoVar.a(null);
                        View view3 = (View) ((HashMap) dc2Var.d).get(str3);
                        ia0 ia0Var = (ia0) uy0Var.f4757b;
                        String str4 = (String) ((HashMap) dc2Var.h).get(str3);
                        if (str4 != null) {
                            JSONObject a4 = ia0Var.a(view3);
                            try {
                                a4.put("adSessionId", str3);
                            } catch (JSONException e2) {
                                bx3.c("Error with setting ad session id", e2);
                            }
                            try {
                                a4.put("notVisibleReason", str4);
                            } catch (JSONException e3) {
                                bx3.c("Error with setting not visible reason", e3);
                            }
                            try {
                                JSONArray optJSONArray = a3.optJSONArray("childViews");
                                if (optJSONArray == null) {
                                    optJSONArray = new JSONArray();
                                    a3.put("childViews", optJSONArray);
                                }
                                optJSONArray.put(a4);
                            } catch (JSONException e4) {
                                e4.printStackTrace();
                            }
                        }
                        ev3.c(a3);
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(str3);
                        ((eb3) uy0Var2.c).s(new nv3(uy0Var2, hashSet2, a3, nanoTime, 0));
                    }
                }
                if (((HashSet) dc2Var.f).size() > 0) {
                    JSONObject a5 = uoVar.a(null);
                    hc3Var.b(null, uoVar, a5, 1, false);
                    ev3.c(a5);
                    ((eb3) uy0Var2.c).s(new nv3(uy0Var2, (HashSet) dc2Var.f, a5, nanoTime, 1));
                } else {
                    uy0Var2.f();
                }
                ((HashMap) dc2Var.f1757b).clear();
                ((HashMap) dc2Var.c).clear();
                ((HashMap) dc2Var.d).clear();
                ((HashSet) dc2Var.e).clear();
                ((HashSet) dc2Var.f).clear();
                ((HashSet) dc2Var.g).clear();
                ((HashMap) dc2Var.h).clear();
                dc2Var.f1756a = false;
                long nanoTime2 = System.nanoTime() - hc3Var.f;
                ArrayList arrayList = hc3Var.f2401a;
                if (arrayList.size() > 0) {
                    Iterator it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                        p71.C(it4.next());
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw null;
                    }
                    return;
                }
                return;
            case 4:
                Handler handler = hc3.i;
                if (handler != null) {
                    handler.post(hc3.j);
                    hc3.i.postDelayed(hc3.k, 200L);
                    return;
                }
                return;
            default:
                tf3.t.getWindow().addFlags(128);
                return;
        }
    }
}
