package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ap3 {
    public int f;
    public int h;
    public float o;

    /* renamed from: a, reason: collision with root package name */
    public String f314a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f315b = "";
    public Set c = Collections.emptySet();
    public String d = "";
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public final int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int a(int i, int i2, String str, String str2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }
}
