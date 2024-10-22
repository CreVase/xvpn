package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class sm1 {
    public static final Object f = new Object();
    public static sm1 g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4371a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4372b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final k9 e;

    public sm1(Context context) {
        this.f4371a = context;
        this.e = new k9(this, context.getMainLooper(), 1);
    }

    public static sm1 a(Context context) {
        sm1 sm1Var;
        synchronized (f) {
            if (g == null) {
                g = new sm1(context.getApplicationContext());
            }
            sm1Var = g;
        }
        return sm1Var;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f4372b) {
            rm1 rm1Var = new rm1(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) this.f4372b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f4372b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(rm1Var);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(rm1Var);
            }
        }
    }

    public final void c(Intent intent) {
        boolean z;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f4372b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4371a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                intent.toString();
            }
            ArrayList arrayList3 = (ArrayList) this.c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    rm1 rm1Var = (rm1) arrayList3.get(i2);
                    if (z) {
                        Objects.toString(rm1Var.f4179a);
                    }
                    if (rm1Var.c) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = rm1Var.f4179a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Integer.toHexString(match);
                            }
                            if (arrayList == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList;
                            }
                            arrayList4.add(rm1Var);
                            rm1Var.c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((rm1) arrayList5.get(i3)).c = false;
                    }
                    this.d.add(new x50(intent, arrayList5, 10));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f4372b) {
            ArrayList arrayList = (ArrayList) this.f4372b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                rm1 rm1Var = (rm1) arrayList.get(size);
                rm1Var.d = true;
                for (int i = 0; i < rm1Var.f4179a.countActions(); i++) {
                    String action = rm1Var.f4179a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            rm1 rm1Var2 = (rm1) arrayList2.get(size2);
                            if (rm1Var2.f4180b == broadcastReceiver) {
                                rm1Var2.d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
