package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0277Az extends Handler {
    public static String[] A01 = {"19chgsqBzMImuF0gwnX2kWBGh", "0va0RllBKLagHwkqX9d70BpModZgILa7", "XpojMROpw9tVkn", "wcizW", "UvDBMI562EynJYmanZ8wO6TzDmvB3zda", "jZLpPncA8U18qC4rrohpR2MIc", "dSPbX", "wnd1v8XwPzGQd7q91R22pRoLt2u"};
    public final /* synthetic */ XB A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A01(Message message) {
        int i;
        if (!(message.arg1 == 1)) {
            return false;
        }
        int i2 = message.arg2 + 1;
        i = this.A00.A0D;
        if (i2 > i) {
            return false;
        }
        Message obtain = Message.obtain(message);
        obtain.arg2 = i2;
        sendMessageDelayed(obtain, A00(i2));
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (K0.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                switch (message.what) {
                    case 0:
                        e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (BQ) obj);
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (BM) pair.first, (String) pair.second);
                        break;
                    default:
                        throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (A01(message)) {
                    return;
                }
                String[] strArr = A01;
                if (strArr[1].charAt(1) != strArr[4].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "iOxYX";
                strArr2[7] = "16FbQS5YLOa2TifOFD04FKBpDBi";
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Az != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0277Az(XB xb, Looper looper) {
        super(looper);
        this.A00 = xb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Az != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Az != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i, Object obj, boolean z) {
        obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
    }
}
