package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.d73;
import defpackage.gh3;
import defpackage.p71;
import defpackage.vw0;
import defpackage.yv1;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class t0 {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private t0() {
    }

    private static void indent(int i, StringBuilder sb) {
        int i2;
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            if (i > cArr.length) {
                i2 = cArr.length;
            } else {
                i2 = i;
            }
            sb.append(cArr, 0, i2);
            i -= i2;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof g) {
            return obj.equals(g.EMPTY);
        }
        if (obj instanceof yv1) {
            if (obj == ((yv1) obj).getDefaultInstanceForType()) {
                return true;
            }
            return false;
        }
        if ((obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0) {
            return true;
        }
        return false;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void printField(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(d73.escapeText((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof g) {
            sb.append(": \"");
            sb.append(d73.escapeBytes((g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof o0) {
            sb.append(" {");
            reflectivePrintWithIndent((o0) obj, sb, i + 2);
            sb.append("\n");
            indent(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i2 = i + 2;
            printField(sb, i2, "key", entry.getKey());
            printField(sb, i2, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            indent(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void reflectivePrintWithIndent(yv1 yv1Var, StringBuilder sb, int i) {
        int i2;
        boolean booleanValue;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = yv1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith(LIST_SUFFIX) && !substring.endsWith(BUILDER_LIST_SUFFIX) && !substring.equals(LIST_SUFFIX) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                printField(sb, i, substring.substring(0, substring.length() - 4), o0.invokeOrDie(method2, yv1Var, new Object[0]));
            } else if (substring.endsWith(MAP_SUFFIX) && !substring.equals(MAP_SUFFIX) && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                printField(sb, i, substring.substring(0, substring.length() - 3), o0.invokeOrDie(method, yv1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith(BYTES_SUFFIX)) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object invokeOrDie = o0.invokeOrDie(method4, yv1Var, new Object[0]);
                    if (method5 == null) {
                        if (!isDefaultValue(invokeOrDie)) {
                            booleanValue = true;
                        } else {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) o0.invokeOrDie(method5, yv1Var, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        printField(sb, i, substring, invokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        if (yv1Var instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator<Map.Entry<vw0, Object>> it = ((GeneratedMessageLite$ExtendableMessage) yv1Var).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry<vw0, Object> next = it.next();
                printField(sb, i, "[" + ((m0) next.getKey()).getNumber() + "]", next.getValue());
            }
        }
        gh3 gh3Var = ((o0) yv1Var).unknownFields;
        if (gh3Var != null) {
            gh3Var.printWithIndent(sb, i);
        }
    }

    public static String toString(yv1 yv1Var, String str) {
        StringBuilder p = p71.p("# ", str);
        reflectivePrintWithIndent(yv1Var, p, 0);
        return p.toString();
    }
}
