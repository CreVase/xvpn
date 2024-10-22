package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wk0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5027a;

    /* renamed from: b, reason: collision with root package name */
    public final d92 f5028b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public yk0[] g;
    public byte[] h;

    public wk0(AssetManager assetManager, zf zfVar, d92 d92Var, String str, File file) {
        byte[] bArr;
        this.f5027a = zfVar;
        this.f5028b = d92Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = t9.s;
                    break;
                case 26:
                    bArr = t9.r;
                    break;
                case 27:
                    bArr = t9.q;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = t9.p;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = t9.o;
                    break;
            }
            this.c = bArr;
        }
        bArr = null;
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5028b.e();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f5027a.execute(new vk0(this, i, serializable, 0));
    }
}
