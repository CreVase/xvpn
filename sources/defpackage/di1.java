package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class di1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1788a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f1789b = 64;
    public final int c;

    public di1(int i) {
        this.c = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f1788a));
    }

    public final synchronized boolean c(String str) {
        boolean equals;
        String b2 = b(this.c, "com.crashlytics.version-control-info");
        if (this.f1788a.size() >= this.f1789b && !this.f1788a.containsKey(b2)) {
            return false;
        }
        String b3 = b(this.c, str);
        String str2 = (String) this.f1788a.get(b2);
        if (str2 == null) {
            if (b3 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str2.equals(b3);
        }
        if (equals) {
            return false;
        }
        this.f1788a.put(b2, b3);
        return true;
    }

    public final synchronized void d(Map map) {
        String b2;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String b3 = b(this.c, str);
                if (this.f1788a.size() < this.f1789b || this.f1788a.containsKey(b3)) {
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f1788a;
                    if (str2 == null) {
                        b2 = "";
                    } else {
                        b2 = b(this.c, str2);
                    }
                    hashMap.put(b3, b2);
                }
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
    }
}
