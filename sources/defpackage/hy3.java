package defpackage;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class hy3 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2502a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f2502a = new HashMap();
        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (hy3.class) {
            hashMap = f2502a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
        }
        return bundle;
    }
}
