package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.e;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class xg0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f5153a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(a aVar, Looper looper) {
        super(looper);
        this.f5153a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                a aVar = this.f5153a;
                if (obj == aVar.x && aVar.i()) {
                    aVar.x = null;
                    if (obj2 instanceof Exception) {
                        aVar.k((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (aVar.e == 3) {
                            e eVar = aVar.f1462b;
                            byte[] bArr2 = aVar.w;
                            int i2 = wi3.f5017a;
                            eVar.g(bArr2, bArr);
                            o90 o90Var = aVar.i;
                            synchronized (o90Var.f3621a) {
                                set2 = o90Var.c;
                            }
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                ((un0) it.next()).b();
                            }
                            return;
                        }
                        byte[] g = aVar.f1462b.g(aVar.v, bArr);
                        int i3 = aVar.e;
                        if ((i3 == 2 || (i3 == 0 && aVar.w != null)) && g != null && g.length != 0) {
                            aVar.w = g;
                        }
                        aVar.p = 4;
                        o90 o90Var2 = aVar.i;
                        synchronized (o90Var2.f3621a) {
                            set = o90Var2.c;
                        }
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            ((un0) it2.next()).a();
                        }
                        return;
                    } catch (Exception e) {
                        aVar.k(e, true);
                        return;
                    }
                    aVar.k(e, true);
                    return;
                }
                return;
            }
            return;
        }
        a aVar2 = this.f5153a;
        if (obj == aVar2.y) {
            if (aVar2.p == 2 || aVar2.i()) {
                aVar2.y = null;
                boolean z = obj2 instanceof Exception;
                x50 x50Var = aVar2.c;
                if (z) {
                    x50Var.x((Exception) obj2, false);
                    return;
                }
                try {
                    aVar2.f1462b.i((byte[]) obj2);
                    x50Var.c = null;
                    hb1 l = hb1.l((Set) x50Var.f5117b);
                    ((Set) x50Var.f5117b).clear();
                    db1 listIterator = l.listIterator(0);
                    while (listIterator.hasNext()) {
                        a aVar3 = (a) listIterator.next();
                        if (aVar3.l()) {
                            aVar3.h(true);
                        }
                    }
                } catch (Exception e2) {
                    x50Var.x(e2, true);
                }
            }
        }
    }
}
