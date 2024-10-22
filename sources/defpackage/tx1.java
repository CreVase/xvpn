package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class tx1 extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4590a;

    public tx1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4590a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f4590a.f286b.remove(Integer.valueOf(((Integer) obj).intValue()));
    }
}
