package defpackage;

import a.bx;
import a.du;
import android.app.PendingIntent;
import android.app.StatusBarManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.graphics.drawable.IconCompat;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity;
import com.security.xvpn.z35kb.quickconn.QuickConnTileService;
import com.security.xvpn.z35kb.quickconn.QuickConnWidgetAddedReceiver;
import com.security.xvpn.z35kb.quickconn.QuickToggleShortcut;
import com.security.xvpn.z35kb.quickconn.WidgetProvider;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class yf extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ApplyQuickConnActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf(ApplyQuickConnActivity applyQuickConnActivity, int i) {
        super(1);
        this.f = i;
        this.g = applyQuickConnActivity;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [wf] */
    public final void a(View view) {
        Icon createWithResource;
        Executor mainExecutor;
        boolean isRequestPinAppWidgetSupported;
        Object systemService;
        Object systemService2;
        int i = 2;
        int i2 = this.f;
        boolean z = false;
        String str = "Android 8.0+";
        final ApplyQuickConnActivity applyQuickConnActivity = this.g;
        switch (i2) {
            case 1:
                applyQuickConnActivity.getClass();
                bx bxVar = new bx();
                bxVar.z("true");
                du.d(606, bxVar);
                bxVar.h();
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applyQuickConnActivity.c);
                    ComponentName componentName = new ComponentName(applyQuickConnActivity.c, (Class<?>) WidgetProvider.class);
                    isRequestPinAppWidgetSupported = appWidgetManager.isRequestPinAppWidgetSupported();
                    if (isRequestPinAppWidgetSupported) {
                        Intent intent = new Intent(applyQuickConnActivity.c, (Class<?>) QuickConnWidgetAddedReceiver.class);
                        int i3 = QuickConnWidgetAddedReceiver.f1612a;
                        intent.setAction("ACTION_WIDGET_ADDED");
                        appWidgetManager.requestPinAppWidget(componentName, null, PendingIntent.getBroadcast(applyQuickConnActivity.c, 0, intent, 201326592));
                        return;
                    }
                    return;
                }
                t9.u0(applyQuickConnActivity, new yy(str, i));
                return;
            case 2:
                applyQuickConnActivity.getClass();
                bx bxVar2 = new bx();
                bxVar2.z("true");
                du.d(607, bxVar2);
                bxVar2.h();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 26) {
                    et2 et2Var = new et2(applyQuickConnActivity);
                    int i5 = 1;
                    Intent[] intentArr = {new Intent(applyQuickConnActivity, (Class<?>) QuickToggleShortcut.class).setAction("android.intent.action.MAIN")};
                    Object obj = et2Var.f1995b;
                    ((ft2) obj).c = intentArr;
                    PorterDuff.Mode mode = IconCompat.k;
                    ((ft2) obj).e = IconCompat.b(applyQuickConnActivity.getResources(), applyQuickConnActivity.getPackageName(), R.mipmap.ic_launcher_toggle);
                    ((ft2) obj).d = applyQuickConnActivity.getString(R.string.shortcut_short_lable);
                    ft2 a2 = et2Var.a();
                    Intent intent2 = new Intent(applyQuickConnActivity.c, (Class<?>) QuickConnWidgetAddedReceiver.class);
                    int i6 = QuickConnWidgetAddedReceiver.f1612a;
                    intent2.setAction("ACTION_SHORTCUTS_ADDED");
                    PendingIntent broadcast = PendingIntent.getBroadcast(applyQuickConnActivity.c, 0, intent2, 201326592);
                    lt3 lt3Var = applyQuickConnActivity.c;
                    IntentSender intentSender = broadcast.getIntentSender();
                    if (i4 <= 32) {
                        a2.getClass();
                    }
                    if (i4 >= 26) {
                        systemService2 = lt3Var.getSystemService((Class<Object>) np0.f());
                        np0.e(systemService2).requestPinShortcut(a2.b(), intentSender);
                        return;
                    }
                    if (i4 >= 26) {
                        systemService = lt3Var.getSystemService((Class<Object>) np0.f());
                        z = np0.e(systemService).isRequestPinShortcutSupported();
                    } else if (x80.checkSelfPermission(lt3Var, "com.android.launcher.permission.INSTALL_SHORTCUT") == 0) {
                        Iterator<ResolveInfo> it = lt3Var.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
                        while (it.hasNext()) {
                            String str2 = it.next().activityInfo.permission;
                            if (TextUtils.isEmpty(str2) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str2)) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Intent intent3 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                        a2.a(intent3);
                        if (intentSender == null) {
                            lt3Var.sendBroadcast(intent3);
                            return;
                        } else {
                            lt3Var.sendOrderedBroadcast(intent3, null, new fd(intentSender, i5), null, -1, null, null);
                            return;
                        }
                    }
                    return;
                }
                t9.u0(applyQuickConnActivity, new yy(str, i));
                return;
            default:
                applyQuickConnActivity.getClass();
                bx bxVar3 = new bx();
                bxVar3.z("true");
                du.d(608, bxVar3);
                bxVar3.h();
                if (Build.VERSION.SDK_INT >= 33) {
                    StatusBarManager b2 = y2.b(applyQuickConnActivity.getSystemService("statusbar"));
                    ComponentName componentName2 = new ComponentName(applyQuickConnActivity.c, (Class<?>) QuickConnTileService.class);
                    String y = pd0.y(R.string.quick_toggle);
                    createWithResource = Icon.createWithResource(applyQuickConnActivity.c, R.drawable.ic_quick_setting_tile_connected);
                    mainExecutor = applyQuickConnActivity.getMainExecutor();
                    b2.requestAddTileService(componentName2, y, createWithResource, mainExecutor, new Consumer() { // from class: wf
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj2) {
                            ApplyQuickConnActivity applyQuickConnActivity2 = ApplyQuickConnActivity.this;
                            Integer num = (Integer) obj2;
                            int i7 = ApplyQuickConnActivity.m;
                            if (num != null && num.intValue() == 2) {
                                Toast.makeText(applyQuickConnActivity2.c, pd0.y(R.string.TileAdded), 0).show();
                            } else if (num != null && num.intValue() == 1) {
                                Toast.makeText(applyQuickConnActivity2.c, pd0.y(R.string.TileAlreadyAdded), 0).show();
                            }
                        }
                    });
                    return;
                }
                t9.u0(applyQuickConnActivity, new yy("Android 13.0+", i));
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        boolean z = false;
        ApplyQuickConnActivity applyQuickConnActivity = this.g;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                applyQuickConnActivity.Z().f3063a.setPadding(0, 0, 0, rect.bottom);
                applyQuickConnActivity.Z().j.setPadding(0, rect.top, 0, 0);
                return ch3Var;
            case 1:
                a((View) obj);
                return ch3Var;
            case 2:
                a((View) obj);
                return ch3Var;
            case 3:
                a((View) obj);
                return ch3Var;
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    int i2 = ApplyQuickConnActivity.m;
                    if (!new l12(applyQuickConnActivity.c).a()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                p9 p9Var = (p9) obj;
                p9Var.f3799b = pd0.y(R.string.FeatureNeedNotificationOn);
                p9.b(p9Var, pd0.y(R.string.GoToSettings), new yy2(applyQuickConnActivity, 15), 2);
                p9.a(p9Var, pd0.y(R.string.Cancel), null, 6);
                return ch3Var;
        }
    }
}
