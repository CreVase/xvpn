package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.tx1;
import defpackage.ux1;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f285a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f286b = new HashMap();
    public final tx1 c = new tx1(this);
    public final ux1 d = new ux1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
