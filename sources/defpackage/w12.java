package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class w12 {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }
}
