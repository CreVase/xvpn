package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ia0 implements Continuation, SuccessContinuation, ou3, fw3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2559a;

    public /* synthetic */ ia0(Object obj) {
        this.f2559a = obj;
    }

    public static boolean i(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static void k(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    @Override // defpackage.ou3
    public final JSONObject a(View view) {
        if (view == null) {
            return ev3.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen((int[]) this.f2559a);
        int[] iArr = (int[]) this.f2559a;
        return ev3.a(iArr[0], iArr[1], width, height);
    }

    public final void b(Object obj, Writer writer) {
        ag1 ag1Var = (ag1) this.f2559a;
        jh1 jh1Var = new jh1(writer, ag1Var.f80a, ag1Var.f81b, ag1Var.c, ag1Var.d);
        jh1Var.h(obj);
        jh1Var.j();
        jh1Var.f2765b.flush();
    }

    public final boolean c(String str) {
        String h = h(str);
        if (!"1".equals(h) && !Boolean.parseBoolean(h)) {
            return false;
        }
        return true;
    }

    public final Integer d(String str) {
        String h = h(str);
        if (!TextUtils.isEmpty(h)) {
            try {
                return Integer.valueOf(Integer.parseInt(h));
            } catch (NumberFormatException unused) {
                k(str);
                return null;
            }
        }
        return null;
    }

    public final JSONArray e(String str) {
        String h = h(str);
        if (!TextUtils.isEmpty(h)) {
            try {
                return new JSONArray(h);
            } catch (JSONException unused) {
                k(str);
                return null;
            }
        }
        return null;
    }

    public final Object f(mp2 mp2Var, og1 og1Var) {
        Object obj;
        d5 d5Var = pg1.f3838a;
        Map map = (Map) ((Map) this.f2559a).get(mp2Var);
        Object obj2 = null;
        if (map != null) {
            obj = map.get(d5Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        Object invoke = og1Var.invoke();
        Map map2 = (Map) this.f2559a;
        Object obj3 = map2.get(mp2Var);
        if (obj3 == null) {
            obj3 = new ConcurrentHashMap(1);
            map2.put(mp2Var, obj3);
        }
        ((Map) obj3).put(d5Var, invoke);
        return invoke;
    }

    public final String g(Resources resources, String str, String str2) {
        String[] strArr;
        String h = h(str2);
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        String h2 = h(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(h2)) {
            return null;
        }
        int identifier = resources.getIdentifier(h2, "string", str);
        if (identifier == 0) {
            k(str2.concat("_loc_key"));
            return null;
        }
        JSONArray e = e(str2.concat("_loc_args"));
        if (e == null) {
            strArr = null;
        } else {
            int length = e.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = e.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            k(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public final String h(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f2559a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (((Bundle) this.f2559a).containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle j() {
        boolean z;
        Bundle bundle = new Bundle((Bundle) this.f2559a);
        for (String str : ((Bundle) this.f2559a).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    public ia0(int i) {
        if (i == 5) {
            this.f2559a = new int[2];
        } else if (i != 11) {
            this.f2559a = null;
        } else {
            this.f2559a = new ConcurrentHashMap(1);
        }
    }

    @Override // defpackage.ou3
    public final void a(View view, JSONObject jSONObject, iu3 iu3Var, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (z) {
                HashMap hashMap = new HashMap();
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((hc3) iu3Var).a((View) it2.next(), this, jSONObject, z2);
                    }
                }
                return;
            }
            while (i < viewGroup.getChildCount()) {
                ((hc3) iu3Var).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                i++;
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public ia0(Bundle bundle) {
        this.f2559a = new Bundle(bundle);
    }
}
