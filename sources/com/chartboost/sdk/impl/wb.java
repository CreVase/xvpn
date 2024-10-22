package com.chartboost.sdk.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class wb {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1282a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f1283b = Pattern.compile("<(head)( [^>]*)?/>", 2);
    public static final Pattern c = Pattern.compile("<(body)( [^>]*?)?>", 2);
    public static final Pattern d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    public static final Pattern e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    public static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    public static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        kc.a(str, "HTML is null or empty");
        int[][] a2 = a(str);
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 16);
        if (!b(str, sb, f1283b, str2, a2) && !a(str, sb, f1282a, str2, a2) && !b(str, sb, d, str2, a2) && !a(str, sb, c, str2, a2) && !b(str, sb, f, str2, a2) && !a(str, sb, e, str2, a2) && !a(str, sb, g, str2, a2)) {
            return str2.concat(str);
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    public static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    public static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    public static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }
}
