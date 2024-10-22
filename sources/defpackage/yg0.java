package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.b;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yg0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5331a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(b bVar, Looper looper) {
        super(looper);
        this.f5331a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f5331a.l.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.o();
            if (Arrays.equals(aVar.v, bArr)) {
                if (message.what == 2 && aVar.e == 0 && aVar.p == 4) {
                    int i = wi3.f5017a;
                    aVar.h(false);
                    return;
                }
                return;
            }
        }
    }
}
