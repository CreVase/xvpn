package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rp {
    public Object c;
    public final Object e;
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public String f4195a = "topic_operation_queue";

    /* renamed from: b, reason: collision with root package name */
    public String f4196b = ",";

    public rp(SharedPreferences sharedPreferences, Executor executor) {
        this.c = sharedPreferences;
        this.e = executor;
    }

    public static rp a(SharedPreferences sharedPreferences, Executor executor) {
        rp rpVar = new rp(sharedPreferences, executor);
        synchronized (rpVar.d) {
            rpVar.d.clear();
            String string = ((SharedPreferences) rpVar.c).getString(rpVar.f4195a, "");
            if (!TextUtils.isEmpty(string) && string.contains(rpVar.f4196b)) {
                String[] split = string.split(rpVar.f4196b, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        rpVar.d.add(str);
                    }
                }
            }
        }
        return rpVar;
    }

    public final String b() {
        String str;
        synchronized (this.d) {
            str = (String) this.d.peek();
        }
        return str;
    }

    public final boolean c(String str) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(str);
            if (remove) {
                ((Executor) this.e).execute(new nw3(this, 25));
            }
        }
        return remove;
    }
}
