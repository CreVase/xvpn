package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class s71 implements mv0, is1, gx0, bs2 {

    /* renamed from: b, reason: collision with root package name */
    public static s71 f4284b;
    public static Method c;
    public static boolean d;
    public static Field e;
    public static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4285a;

    public s71() {
        this.f4285a = 7;
    }

    public static tm2 k(Bundle bundle, Bundle bundle2) {
        boolean z;
        if (bundle == null) {
            if (bundle2 == null) {
                return new tm2();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
            return new tm2(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new tm2(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    @Override // defpackage.gx0
    public final void a() {
    }

    @Override // defpackage.gx0
    public final String b() {
        return null;
    }

    @Override // defpackage.is1
    public final MediaCodecInfo c(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.gx0
    public final void d(String str, long j) {
    }

    @Override // defpackage.is1
    public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.is1
    public final boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.bs2
    public final vr2 g(mp0 mp0Var, JSONObject jSONObject) {
        kz1 kz1Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            kz1Var = new kz1(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4);
        } else {
            kz1Var = new kz1(new JSONObject().optInt("max_custom_exception_events", 8), 4);
        }
        kz1 kz1Var2 = kz1Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ur2 ur2Var = new ur2(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            mp0Var.getClass();
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new vr2(currentTimeMillis, kz1Var2, ur2Var, optDouble, optDouble2, optInt2);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f4285a) {
            case 18:
                return "com.google.android.datatransport.events";
            default:
                return new gi3(1);
        }
    }

    @Override // defpackage.is1
    public final int h() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.is1
    public final boolean i() {
        return false;
    }

    public final ro3 j(tl3 tl3Var, int i, ReferenceQueue referenceQueue) {
        switch (this.f4285a) {
            case 4:
                return (ro3) new sl3(tl3Var, i, referenceQueue).f4367b;
            default:
                return new rl3(tl3Var, i, referenceQueue).f4175a;
        }
    }

    public void l() {
    }

    public void m(boolean z) {
    }

    public void n(boolean z) {
    }

    public void o(View view, int i, int i2, int i3, int i4) {
        if (!d) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void p() {
    }

    public void q(View view, int i) {
        if (!f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                e.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void r(int i) {
    }

    public /* synthetic */ s71(int i) {
        this.f4285a = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(q71 q71Var) {
        this(23);
        this.f4285a = 23;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(r71 r71Var) {
        this(24);
        this.f4285a = 24;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(p71 p71Var) {
        this(20);
        this.f4285a = 20;
    }
}
