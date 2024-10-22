package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class yc0 implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, vc0 vc0Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r91 p91Var;
        if (this.mApplicationContext != null) {
            int i = q91.f3971a;
            if (iBinder == null) {
                p91Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof r91)) {
                    p91Var = (r91) queryLocalInterface;
                } else {
                    p91Var = new p91(iBinder);
                }
            }
            onCustomTabsServiceConnected(componentName, new xc0(p91Var, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
