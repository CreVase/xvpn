package defpackage;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.widget.ConnectView;
import com.vungle.ads.VungleError;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k9 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Looper looper, int i) {
        super(looper);
        this.f2907a = i;
        this.f2908b = obj;
    }

    private void a(Message message) {
        ch chVar = (ch) this.f2908b;
        ArrayDeque arrayDeque = ch.g;
        chVar.getClass();
        int i = message.what;
        bh bhVar = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    AtomicReference atomicReference = chVar.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    chVar.e.h();
                }
            } else {
                bh bhVar2 = (bh) message.obj;
                int i2 = bhVar2.f462a;
                int i3 = bhVar2.f463b;
                MediaCodec.CryptoInfo cryptoInfo = bhVar2.d;
                long j = bhVar2.e;
                int i4 = bhVar2.f;
                try {
                    synchronized (ch.h) {
                        chVar.f630a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e) {
                    AtomicReference atomicReference2 = chVar.d;
                    while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                    }
                }
                bhVar = bhVar2;
            }
        } else {
            bh bhVar3 = (bh) message.obj;
            try {
                chVar.f630a.queueInputBuffer(bhVar3.f462a, bhVar3.f463b, bhVar3.c, bhVar3.e, bhVar3.f);
            } catch (RuntimeException e2) {
                AtomicReference atomicReference3 = chVar.d;
                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                }
            }
            bhVar = bhVar3;
        }
        if (bhVar != null) {
            ch.c(bhVar);
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        boolean z;
        int i = this.f2907a;
        Object obj = this.f2908b;
        switch (i) {
            case 3:
                super.dispatchMessage(message);
                switch (message.what) {
                    case 10002:
                        ((rt3) obj).g(message.arg1);
                        return;
                    case VungleError.CONFIGURATION_ERROR /* 10003 */:
                        ((rt3) obj).f((String) message.obj);
                        return;
                    case 10004:
                        rt3 rt3Var = (rt3) obj;
                        boolean z2 = false;
                        if (message.arg1 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (message.arg2 == 1) {
                            z2 = true;
                        }
                        rt3Var.i(z, z2);
                        return;
                    default:
                        return;
                }
            case 4:
                super.dispatchMessage(message);
                t81 t81Var = (t81) obj;
                WeakReference weakReference = t81Var.f4462a;
                if (weakReference != null && weakReference.get() != null) {
                    t81Var.a((ViewGroup) t81Var.f4462a.get());
                    ew3.i();
                    return;
                }
                return;
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        x50[] x50VarArr;
        switch (this.f2907a) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f2908b).get(), message.what);
                return;
            case 1:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                sm1 sm1Var = (sm1) this.f2908b;
                while (true) {
                    synchronized (sm1Var.f4372b) {
                        try {
                            size = sm1Var.d.size();
                            if (size <= 0) {
                                return;
                            }
                            x50VarArr = new x50[size];
                            sm1Var.d.toArray(x50VarArr);
                            sm1Var.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        x50 x50Var = x50VarArr[i2];
                        int size2 = ((ArrayList) x50Var.f5117b).size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            rm1 rm1Var = (rm1) ((ArrayList) x50Var.f5117b).get(i3);
                            if (!rm1Var.d) {
                                rm1Var.f4180b.onReceive(sm1Var.f4371a, (Intent) x50Var.c);
                            }
                        }
                    }
                }
            case 2:
                a(message);
                return;
            case 3:
            case 4:
            default:
                super.handleMessage(message);
                return;
            case 5:
                ConnectView connectView = (ConnectView) this.f2908b;
                int i4 = ConnectView.N;
                connectView.c();
                int x = hx2.x(connectView.M);
                if (x != 0) {
                    if (x != 1) {
                        if (x != 2) {
                            if (x != 3) {
                                if (x != 4) {
                                    if (x == 5) {
                                        connectView.t = true;
                                        connectView.v.cancel();
                                        connectView.u.cancel();
                                        connectView.x.cancel();
                                        connectView.q.setStrokeWidth((connectView.f1626a * 3) / 4);
                                        connectView.i.setColor(-11084559);
                                        connectView.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                connectView.t = true;
                                connectView.v.cancel();
                                connectView.u.cancel();
                                connectView.w.cancel();
                                connectView.q.setStrokeWidth((connectView.f1626a * 2) / 5);
                                connectView.d();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(connectView.B, 1.0f);
                                connectView.x = ofFloat;
                                ofFloat.setDuration(200L);
                                connectView.x.addListener(connectView.y);
                                connectView.x.addUpdateListener(connectView.z);
                                connectView.x.start();
                                return;
                            }
                            connectView.t = true;
                            connectView.u.cancel();
                            connectView.w.cancel();
                            connectView.x.cancel();
                            connectView.q.setStrokeWidth((connectView.f1626a * 2) / 5);
                            connectView.d();
                            connectView.i.setColor(-2565928);
                            connectView.v.start();
                            return;
                        }
                        connectView.t = true;
                        connectView.v.cancel();
                        connectView.u.cancel();
                        connectView.x.cancel();
                        connectView.q.setStrokeWidth((connectView.f1626a * 3) / 4);
                        connectView.i.setColor(-11084559);
                        connectView.w.start();
                        return;
                    }
                    connectView.t = true;
                    connectView.v.cancel();
                    connectView.w.cancel();
                    connectView.x.cancel();
                    connectView.q.setStrokeWidth((connectView.f1626a * 2) / 5);
                    connectView.d();
                    connectView.i.setColor(-2565928);
                    connectView.u.start();
                    return;
                }
                connectView.v.cancel();
                connectView.u.cancel();
                connectView.x.cancel();
                connectView.t = false;
                connectView.i.setColor(-2565928);
                connectView.invalidate();
                return;
        }
    }

    public k9(DialogInterface dialogInterface) {
        this.f2907a = 0;
        this.f2908b = new WeakReference(dialogInterface);
    }

    public k9(ConnectView connectView) {
        this.f2907a = 5;
        this.f2908b = connectView;
    }
}
