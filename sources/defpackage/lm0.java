package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class lm0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3156b;

    public /* synthetic */ lm0(Object obj, int i) {
        this.f3155a = i;
        this.f3156b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z = false;
        int i = this.f3155a;
        Object obj = this.f3156b;
        switch (i) {
            case 0:
                qm0 qm0Var = (qm0) obj;
                qm0Var.getClass();
                int i2 = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = qm0Var.e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            mm0 mm0Var = (mm0) message.obj;
                            qm0Var.m = Collections.unmodifiableList(mm0Var.c);
                            boolean d = qm0Var.d();
                            boolean z2 = mm0Var.f3314b;
                            jm0 jm0Var = mm0Var.f3313a;
                            if (z2) {
                                Iterator it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    ((om0) it.next()).onDownloadRemoved(qm0Var, jm0Var);
                                }
                            } else {
                                Iterator it2 = copyOnWriteArraySet.iterator();
                                while (it2.hasNext()) {
                                    ((om0) it2.next()).onDownloadChanged(qm0Var, jm0Var, mm0Var.d);
                                }
                            }
                            if (d) {
                                qm0Var.a();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        int i5 = qm0Var.f - i3;
                        qm0Var.f = i5;
                        qm0Var.g = i4;
                        if (i4 == 0 && i5 == 0) {
                            z = true;
                        }
                        if (z) {
                            Iterator it3 = copyOnWriteArraySet.iterator();
                            while (it3.hasNext()) {
                                ((om0) it3.next()).onIdle(qm0Var);
                            }
                        }
                    }
                } else {
                    List list = (List) message.obj;
                    qm0Var.h = true;
                    qm0Var.m = Collections.unmodifiableList(list);
                    boolean d2 = qm0Var.d();
                    Iterator it4 = copyOnWriteArraySet.iterator();
                    while (it4.hasNext()) {
                        ((om0) it4.next()).onInitialized(qm0Var);
                    }
                    if (d2) {
                        qm0Var.a();
                    }
                }
                return true;
            default:
                pk0 pk0Var = (pk0) obj;
                Iterator it5 = ((CopyOnWriteArraySet) pk0Var.f).iterator();
                while (it5.hasNext()) {
                    tl1 tl1Var = (tl1) it5.next();
                    sl1 sl1Var = (sl1) pk0Var.e;
                    if (!tl1Var.d && tl1Var.c) {
                        wy0 d3 = tl1Var.f4527b.d();
                        tl1Var.f4527b = new u93(5);
                        tl1Var.c = false;
                        sl1Var.a(tl1Var.f4526a, d3);
                    }
                    if (((z43) ((j71) pk0Var.d)).f5426a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
        }
    }
}
