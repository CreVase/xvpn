package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class b90 extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a, reason: collision with root package name */
    public int f426a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f427b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public b90(Context context, int i) {
        super(context);
        this.f426a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d == null) {
                this.d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z;
        if (this.f427b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f427b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f427b.setTo(theme);
            }
        }
        this.f427b.applyStyle(this.f426a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:            if (r0.equals(defpackage.b90.f) != false) goto L15;     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = defpackage.b90.f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.b90.f = r1
        L1c:
            android.content.res.Configuration r1 = defpackage.b90.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.d
            android.content.Context r0 = defpackage.a90.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.e = r0
        L38:
            android.content.res.Resources r0 = r3.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b90.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f427b;
        if (theme != null) {
            return theme;
        }
        if (this.f426a == 0) {
            this.f426a = rf2.Theme_AppCompat_Light;
        }
        b();
        return this.f427b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f426a != i) {
            this.f426a = i;
            b();
        }
    }
}
