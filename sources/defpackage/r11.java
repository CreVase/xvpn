package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public abstract class r11 extends p11 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4088b;
    public final Handler c;
    public final a21 d;

    public r11(l lVar) {
        Handler handler = new Handler();
        this.d = new a21();
        this.f4087a = lVar;
        this.f4088b = lVar;
        this.c = handler;
    }
}
