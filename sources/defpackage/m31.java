package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* loaded from: classes.dex */
public final class m31 implements u33 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3227b;
    public final rd c;
    public final boolean d;
    public final Object e = new Object();
    public l31 f;
    public boolean g;

    public m31(Context context, String str, rd rdVar, boolean z) {
        this.f3226a = context;
        this.f3227b = str;
        this.c = rdVar;
        this.d = z;
    }

    public final l31 a() {
        l31 l31Var;
        synchronized (this.e) {
            if (this.f == null) {
                j31[] j31VarArr = new j31[1];
                if (Build.VERSION.SDK_INT >= 23 && this.f3227b != null && this.d) {
                    this.f = new l31(this.f3226a, new File(this.f3226a.getNoBackupFilesDir(), this.f3227b).getAbsolutePath(), j31VarArr, this.c);
                } else {
                    this.f = new l31(this.f3226a, this.f3227b, j31VarArr, this.c);
                }
                this.f.setWriteAheadLoggingEnabled(this.g);
            }
            l31Var = this.f;
        }
        return l31Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // defpackage.u33
    public final String getDatabaseName() {
        return this.f3227b;
    }

    @Override // defpackage.u33
    public final r33 q() {
        return a().c();
    }

    @Override // defpackage.u33
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.e) {
            l31 l31Var = this.f;
            if (l31Var != null) {
                l31Var.setWriteAheadLoggingEnabled(z);
            }
            this.g = z;
        }
    }
}
