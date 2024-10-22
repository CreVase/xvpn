package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class rm1 {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f4179a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f4180b;
    public boolean c;
    public boolean d;

    public rm1(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f4179a = intentFilter;
        this.f4180b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f4180b);
        sb.append(" filter=");
        sb.append(this.f4179a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
