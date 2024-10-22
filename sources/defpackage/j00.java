package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j00 implements mh1, i00 {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2679b;
    public static final LinkedHashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2680a;

    static {
        String substring;
        List b0 = tf3.b0(v31.class, x31.class, l41.class, n41.class, o41.class, p41.class, q41.class, r41.class, s41.class, t41.class, w31.class, y31.class, z31.class, a41.class, b41.class, c41.class, d41.class, e41.class, f41.class, g41.class, i41.class, j41.class, k41.class);
        ArrayList arrayList = new ArrayList(a20.C0(b0, 10));
        int i = 0;
        for (Object obj : b0) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new n42((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                tf3.y0();
                throw null;
            }
        }
        f2679b = jq1.n0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            int c1 = i23.c1(str, '.', 0, 6);
            if (c1 == -1) {
                substring = str;
            } else {
                substring = str.substring(c1 + 1, str.length());
            }
            hashMap3.put(hx2.s(sb, substring, "CompanionObject"), str + ".Companion");
        }
        for (Map.Entry entry : f2679b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(bx3.N(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            int c12 = i23.c1(str2, '.', 0, 6);
            if (c12 != -1) {
                str2 = str2.substring(c12 + 1, str2.length());
            }
            linkedHashMap.put(key, str2);
        }
        c = linkedHashMap;
    }

    public j00(Class cls) {
        this.f2680a = cls;
    }

    @Override // defpackage.i00
    public final Class a() {
        return this.f2680a;
    }

    public final String b() {
        String str;
        Class cls = this.f2680a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return i23.t1(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return i23.t1(simpleName, enclosingConstructor.getName() + '$');
            }
            int Y0 = i23.Y0(simpleName, '$', 0, false, 6);
            if (Y0 != -1) {
                return simpleName.substring(Y0 + 1, simpleName.length());
            }
            return simpleName;
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = c;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j00) && m20.L(fl.E(this), fl.E((mh1) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return fl.E(this).hashCode();
    }

    public final String toString() {
        return this.f2680a.toString() + " (Kotlin reflection is not available)";
    }
}
