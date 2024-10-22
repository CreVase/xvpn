package defpackage;

import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 l20, still in use, count: 1, list:
  (r0v0 l20) from 0x008c: INVOKE (r2v5 java.util.HashMap), ("x86"), (r0v0 l20) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:141)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class l20 {
    /* JADX INFO: Fake field, exist only in values array */
    X86_32,
    /* JADX INFO: Fake field, exist only in values array */
    X86_64,
    /* JADX INFO: Fake field, exist only in values array */
    ARM_UNKNOWN,
    /* JADX INFO: Fake field, exist only in values array */
    PPC,
    /* JADX INFO: Fake field, exist only in values array */
    PPC64,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV6,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV7,
    UNKNOWN,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV7S,
    /* JADX INFO: Fake field, exist only in values array */
    ARM64;


    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3052b;

    static {
        HashMap hashMap = new HashMap(4);
        f3052b = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r14);
        hashMap.put("x86", r0);
    }

    public l20() {
    }

    public static l20 valueOf(String str) {
        return (l20) Enum.valueOf(l20.class, str);
    }

    public static l20[] values() {
        return (l20[]) c.clone();
    }
}
