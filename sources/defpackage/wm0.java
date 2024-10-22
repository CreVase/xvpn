package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wm0 extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends wm0>, um0> downloadManagerHelpers = new HashMap<>();
    private um0 downloadManagerHelper;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;
    private final vm0 foregroundNotificationUpdater = null;
    private final String channelId = null;
    private final int channelNameResourceId = 0;
    private final int channelDescriptionResourceId = 0;

    public static Intent a(Context context, Class cls, String str, boolean z) {
        return new Intent(context, (Class<?>) cls).setAction(str).putExtra(KEY_FOREGROUND, z);
    }

    public static void access$300(wm0 wm0Var, List list) {
        boolean z;
        if (wm0Var.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = ((jm0) list.get(i)).f2791b;
                if (i2 != 2 && i2 != 5 && i2 != 7) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    vm0 vm0Var = wm0Var.foregroundNotificationUpdater;
                    vm0Var.getClass();
                    vm0Var.a();
                    return;
                }
            }
        }
    }

    public static void access$400(wm0 wm0Var, jm0 jm0Var) {
        boolean z;
        vm0 vm0Var = wm0Var.foregroundNotificationUpdater;
        if (vm0Var != null) {
            int i = jm0Var.f2791b;
            if (i != 2 && i != 5 && i != 7) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                vm0Var.getClass();
                vm0Var.a();
            } else {
                vm0Var.getClass();
            }
        }
    }

    public static boolean access$500(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    public static void access$600(wm0 wm0Var) {
        vm0 vm0Var = wm0Var.foregroundNotificationUpdater;
        if (vm0Var != null) {
            vm0Var.getClass();
        }
    }

    public static /* synthetic */ void access$700(wm0 wm0Var) {
        wm0Var.b();
    }

    public static boolean access$800(wm0 wm0Var) {
        return wm0Var.isStopped;
    }

    public static Intent access$900(Context context, Class cls, String str) {
        return new Intent(context, (Class<?>) cls).setAction(str);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends wm0> cls, DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends wm0> cls, boolean z) {
        return a(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends wm0> cls, boolean z) {
        return a(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends wm0> cls, String str, boolean z) {
        return a(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends wm0> cls, boolean z) {
        return a(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends wm0> cls, Requirements requirements, boolean z) {
        return a(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends wm0> cls, String str, int i, boolean z) {
        return a(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
    }

    public static void c(Context context, Intent intent, boolean z) {
        if (z) {
            if (wi3.f5017a >= 26) {
                context.startForegroundService(intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        context.startService(intent);
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    public static void sendAddDownload(Context context, Class<? extends wm0> cls, DownloadRequest downloadRequest, boolean z) {
        c(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendPauseDownloads(Context context, Class<? extends wm0> cls, boolean z) {
        c(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends wm0> cls, boolean z) {
        c(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveDownload(Context context, Class<? extends wm0> cls, String str, boolean z) {
        c(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendResumeDownloads(Context context, Class<? extends wm0> cls, boolean z) {
        c(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetRequirements(Context context, Class<? extends wm0> cls, Requirements requirements, boolean z) {
        c(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void sendSetStopReason(Context context, Class<? extends wm0> cls, String str, int i, boolean z) {
        c(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void start(Context context, Class<? extends wm0> cls) {
        context.startService(new Intent(context, cls).setAction(ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends wm0> cls) {
        Intent a2 = a(context, cls, ACTION_INIT, true);
        if (wi3.f5017a >= 26) {
            context.startForegroundService(a2);
        } else {
            context.startService(a2);
        }
    }

    public final void b() {
        vm0 vm0Var = this.foregroundNotificationUpdater;
        if (vm0Var == null) {
            um0 um0Var = this.downloadManagerHelper;
            um0Var.getClass();
            if (!um0Var.c()) {
                return;
            }
            if (wi3.f5017a < 28 && this.taskRemoved) {
                stopSelf();
                this.isStopped = true;
                return;
            } else {
                this.isStopped |= stopSelfResult(this.lastStartId);
                return;
            }
        }
        vm0Var.getClass();
        vm0Var.getClass();
        throw null;
    }

    public abstract qm0 getDownloadManager();

    public abstract gn2 getScheduler();

    public final void invalidateForegroundNotification() {
        vm0 vm0Var = this.foregroundNotificationUpdater;
        if (vm0Var != null && !this.isDestroyed) {
            vm0Var.getClass();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        boolean z;
        boolean z2;
        gn2 gn2Var;
        String str = this.channelId;
        if (str != null) {
            int i = this.channelNameResourceId;
            int i2 = this.channelDescriptionResourceId;
            if (wi3.f5017a >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                notificationManager.getClass();
                z51.r();
                NotificationChannel f = z51.f(str, getString(i));
                if (i2 != 0) {
                    f.setDescription(getString(i2));
                }
                notificationManager.createNotificationChannel(f);
            }
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends wm0>, um0> hashMap = downloadManagerHelpers;
        um0 um0Var = (um0) hashMap.get(cls);
        boolean z3 = true;
        if (um0Var == null) {
            if (this.foregroundNotificationUpdater != null) {
                z = true;
            } else {
                z = false;
            }
            if (wi3.f5017a < 31) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                gn2Var = getScheduler();
            } else {
                gn2Var = null;
            }
            qm0 downloadManager = getDownloadManager();
            downloadManager.c(false);
            um0Var = new um0(getApplicationContext(), downloadManager, z, gn2Var, cls);
            hashMap.put(cls, um0Var);
        }
        this.downloadManagerHelper = um0Var;
        if (um0Var.f != null) {
            z3 = false;
        }
        cp3.m(z3);
        um0Var.f = this;
        if (um0Var.f4696b.h) {
            wi3.l(null).postAtFrontOfQueue(new lf(14, um0Var, this));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        boolean z = true;
        this.isDestroyed = true;
        um0 um0Var = this.downloadManagerHelper;
        um0Var.getClass();
        if (um0Var.f != this) {
            z = false;
        }
        cp3.m(z);
        um0Var.f = null;
        vm0 vm0Var = this.foregroundNotificationUpdater;
        if (vm0Var == null) {
            return;
        }
        vm0Var.getClass();
        vm0Var.getClass();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        char c;
        vm0 vm0Var;
        boolean z;
        this.lastStartId = i2;
        boolean z2 = false;
        this.taskRemoved = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra(KEY_CONTENT_ID);
            boolean z3 = this.startedInForeground;
            if (!intent.getBooleanExtra(KEY_FOREGROUND, false) && !ACTION_RESTART.equals(str)) {
                z = false;
            } else {
                z = true;
            }
            this.startedInForeground = z3 | z;
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = ACTION_INIT;
        }
        um0 um0Var = this.downloadManagerHelper;
        um0Var.getClass();
        switch (str.hashCode()) {
            case -1931239035:
                if (str.equals(ACTION_ADD_DOWNLOAD)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -932047176:
                if (str.equals(ACTION_RESUME_DOWNLOADS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -871181424:
                if (str.equals(ACTION_RESTART)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -650547439:
                if (str.equals(ACTION_REMOVE_ALL_DOWNLOADS)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -119057172:
                if (str.equals(ACTION_SET_REQUIREMENTS)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 191112771:
                if (str.equals(ACTION_PAUSE_DOWNLOADS)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 671523141:
                if (str.equals(ACTION_SET_STOP_REASON)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1015676687:
                if (str.equals(ACTION_INIT)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1547520644:
                if (str.equals(ACTION_REMOVE_DOWNLOAD)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        qm0 qm0Var = um0Var.f4696b;
        switch (c) {
            case 0:
                intent.getClass();
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest == null) {
                    sn1.c(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra(KEY_STOP_REASON, 0);
                    qm0Var.f++;
                    qm0Var.c.obtainMessage(6, intExtra, 0, downloadRequest).sendToTarget();
                    break;
                }
            case 1:
                qm0Var.c(false);
                break;
            case 2:
            case 7:
                break;
            case 3:
                qm0Var.f++;
                qm0Var.c.obtainMessage(8).sendToTarget();
                break;
            case 4:
                intent.getClass();
                Requirements requirements = (Requirements) intent.getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements == null) {
                    sn1.c(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else if (!requirements.equals(qm0Var.n.c)) {
                    rj2 rj2Var = qm0Var.n;
                    fd fdVar = rj2Var.e;
                    fdVar.getClass();
                    Context context = rj2Var.f4162a;
                    context.unregisterReceiver(fdVar);
                    rj2Var.e = null;
                    if (wi3.f5017a >= 24 && rj2Var.g != null) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        connectivityManager.getClass();
                        qj2 qj2Var = rj2Var.g;
                        qj2Var.getClass();
                        connectivityManager.unregisterNetworkCallback(qj2Var);
                        rj2Var.g = null;
                    }
                    rj2 rj2Var2 = new rj2(qm0Var.f4020a, qm0Var.d, requirements);
                    qm0Var.n = rj2Var2;
                    qm0Var.b(qm0Var.n, rj2Var2.b());
                    break;
                }
                break;
            case 5:
                qm0Var.c(true);
                break;
            case 6:
                intent.getClass();
                if (!intent.hasExtra(KEY_STOP_REASON)) {
                    sn1.c(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra2 = intent.getIntExtra(KEY_STOP_REASON, 0);
                    qm0Var.f++;
                    qm0Var.c.obtainMessage(3, intExtra2, 0, str2).sendToTarget();
                    break;
                }
            case '\b':
                if (str2 == null) {
                    sn1.c(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    qm0Var.f++;
                    qm0Var.c.obtainMessage(7, str2).sendToTarget();
                    break;
                }
            default:
                sn1.c(TAG, "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (wi3.f5017a >= 26 && this.startedInForeground && (vm0Var = this.foregroundNotificationUpdater) != null) {
            vm0Var.getClass();
            vm0Var.a();
        }
        this.isStopped = false;
        if (qm0Var.g == 0 && qm0Var.f == 0) {
            z2 = true;
        }
        if (z2) {
            b();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends wm0> cls, DownloadRequest downloadRequest, int i, boolean z) {
        return a(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
    }

    public static void sendAddDownload(Context context, Class<? extends wm0> cls, DownloadRequest downloadRequest, int i, boolean z) {
        c(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }
}
