package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ wh1[] f5009a;

    static {
        wh1[] wh1VarArr = {new wh1("PUBLIC", 0), new wh1("PROTECTED", 1), new wh1("INTERNAL", 2), new wh1("PRIVATE", 3)};
        f5009a = wh1VarArr;
        new yr0(wh1VarArr);
    }

    public wh1(String str, int i) {
    }

    public static wh1 valueOf(String str) {
        return (wh1) Enum.valueOf(wh1.class, str);
    }

    public static wh1[] values() {
        return (wh1[]) f5009a.clone();
    }
}
