package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y43 {

    /* renamed from: a, reason: collision with root package name */
    public Message f5269a;

    public final void a() {
        Message message = this.f5269a;
        message.getClass();
        message.sendToTarget();
        this.f5269a = null;
        ArrayList arrayList = z43.f5425b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}
