package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class jc0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2744a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(kc0 kc0Var) {
        super(new Handler());
        this.f2745b = kc0Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f2744a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        switch (this.f2744a) {
            case 1:
                ((a01) this.f2745b).c();
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.f2744a) {
            case 0:
                kc0 kc0Var = (kc0) this.f2745b;
                if (!kc0Var.f2930b || (cursor = kc0Var.c) == null || cursor.isClosed()) {
                    return;
                }
                kc0Var.f2929a = kc0Var.c.requery();
                return;
            default:
                super.onChange(z);
                return;
        }
    }
}
