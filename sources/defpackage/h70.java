package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h70 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2375a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f2376b = new SparseArray();

    public h70(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            nd1 nd1Var = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            c = 65535;
                            if (c != 2) {
                                if (c != 3) {
                                    if (c == 4) {
                                        a(context, xml);
                                    }
                                } else {
                                    g70 g70Var = new g70(context, xml);
                                    if (nd1Var != null) {
                                        ((ArrayList) nd1Var.c).add(g70Var);
                                    }
                                }
                            } else {
                                nd1 nd1Var2 = new nd1(context, xml);
                                this.f2375a.put(nd1Var2.f3442a, nd1Var2);
                                nd1Var = nd1Var2;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0225, code lost:            continue;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0138. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h70.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
