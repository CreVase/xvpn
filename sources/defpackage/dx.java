package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class dx {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1853a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f1854b;
    public static volatile Charset c;

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}
