package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.ViewUtility;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.ui1;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ClickCoordinateTracker {
    private static final String TAG = "ClickCoordinateTracker";
    private final AdPayload advertisement;
    private final Context context;
    private final ClickCoordinate currentClick;
    private final Executor executor;
    private final ui1 vungleApiClient$delegate;
    public static final Companion Companion = new Companion(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* loaded from: classes2.dex */
    public static final class ClickCoordinate {
        private Coordinate downCoordinate;
        private Coordinate upCoordinate;

        public ClickCoordinate(Coordinate coordinate, Coordinate coordinate2) {
            this.downCoordinate = coordinate;
            this.upCoordinate = coordinate2;
        }

        public static /* synthetic */ ClickCoordinate copy$default(ClickCoordinate clickCoordinate, Coordinate coordinate, Coordinate coordinate2, int i, Object obj) {
            if ((i & 1) != 0) {
                coordinate = clickCoordinate.downCoordinate;
            }
            if ((i & 2) != 0) {
                coordinate2 = clickCoordinate.upCoordinate;
            }
            return clickCoordinate.copy(coordinate, coordinate2);
        }

        public final Coordinate component1() {
            return this.downCoordinate;
        }

        public final Coordinate component2() {
            return this.upCoordinate;
        }

        public final ClickCoordinate copy(Coordinate coordinate, Coordinate coordinate2) {
            return new ClickCoordinate(coordinate, coordinate2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickCoordinate)) {
                return false;
            }
            ClickCoordinate clickCoordinate = (ClickCoordinate) obj;
            return m20.L(this.downCoordinate, clickCoordinate.downCoordinate) && m20.L(this.upCoordinate, clickCoordinate.upCoordinate);
        }

        public final Coordinate getDownCoordinate() {
            return this.downCoordinate;
        }

        public final Coordinate getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
        }

        public final boolean ready() {
            if (this.downCoordinate.getX() != Integer.MIN_VALUE && this.downCoordinate.getY() != Integer.MIN_VALUE && this.upCoordinate.getX() != Integer.MIN_VALUE && this.upCoordinate.getY() != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public final void setDownCoordinate(Coordinate coordinate) {
            this.downCoordinate = coordinate;
        }

        public final void setUpCoordinate(Coordinate coordinate) {
            this.upCoordinate = coordinate;
        }

        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Coordinate {
        private final int x;
        private final int y;

        public Coordinate(int i, int i2) {
            this.x = i;
            this.y = i2;
        }

        public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = coordinate.x;
            }
            if ((i3 & 2) != 0) {
                i2 = coordinate.y;
            }
            return coordinate.copy(i, i2);
        }

        public final int component1() {
            return this.x;
        }

        public final int component2() {
            return this.y;
        }

        public final Coordinate copy(int i, int i2) {
            return new Coordinate(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) obj;
            return this.x == coordinate.x && this.y == coordinate.y;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return (this.x * 31) + this.y;
        }

        public String toString() {
            return "Coordinate(x=" + this.x + ", y=" + this.y + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class DeviceScreenInfo {
        private final Context context;
        private final DisplayMetrics dm;

        public DeviceScreenInfo(Context context) {
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.dm = displayMetrics;
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ DeviceScreenInfo copy$default(DeviceScreenInfo deviceScreenInfo, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = deviceScreenInfo.context;
            }
            return deviceScreenInfo.copy(context);
        }

        public final Context component1() {
            return this.context;
        }

        public final DeviceScreenInfo copy(Context context) {
            return new DeviceScreenInfo(context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceScreenInfo) && m20.L(this.context, ((DeviceScreenInfo) obj).context);
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.dm.widthPixels;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ")";
        }
    }

    public ClickCoordinateTracker(Context context, AdPayload adPayload, Executor executor) {
        this.context = context;
        this.advertisement = adPayload;
        this.executor = executor;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = m20.D0(kj1.f2953a, new ClickCoordinateTracker$special$$inlined$inject$1(context));
        this.currentClick = new ClickCoordinate(new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE), new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }

    private final int getDeviceHeight() {
        return new DeviceScreenInfo(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new DeviceScreenInfo(this.context).getDeviceWidth();
    }

    private final int getRequestedHeight() {
        BannerAdSize adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceHeight();
        }
        return ViewUtility.INSTANCE.dpToPixels(this.context, adSize.getHeight());
    }

    private final int getRequestedWidth() {
        BannerAdSize adSize = this.advertisement.getAdSize();
        if (adSize == null) {
            return getDeviceWidth();
        }
        return ViewUtility.INSTANCE.dpToPixels(this.context, adSize.getWidth());
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    private final void sendClickCoordinates() {
        boolean z;
        List<String> tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, AdPayload.TPAT_CLICK_COORDINATES_URLS, null, 2, null);
        List list = tpatUrls$default;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: click_coordinate", this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        TpatSender tpatSender = new TpatSender(getVungleApiClient(), this.advertisement.placementId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
        for (String str : tpatUrls$default) {
            Pattern compile = Pattern.compile(MACRO_REQ_WIDTH);
            String replaceAll = compile.matcher(str).replaceAll(String.valueOf(requestedWidth));
            Pattern compile2 = Pattern.compile(MACRO_REQ_HEIGHT);
            String replaceAll2 = compile2.matcher(replaceAll).replaceAll(String.valueOf(requestedHeight));
            Pattern compile3 = Pattern.compile(MACRO_WIDTH);
            String replaceAll3 = compile3.matcher(replaceAll2).replaceAll(String.valueOf(requestedWidth2));
            Pattern compile4 = Pattern.compile(MACRO_HEIGHT);
            String replaceAll4 = compile4.matcher(replaceAll3).replaceAll(String.valueOf(requestedHeight2));
            Pattern compile5 = Pattern.compile(MACRO_DOWN_X);
            String replaceAll5 = compile5.matcher(replaceAll4).replaceAll(String.valueOf(this.currentClick.getDownCoordinate().getX()));
            Pattern compile6 = Pattern.compile(MACRO_DOWN_Y);
            String replaceAll6 = compile6.matcher(replaceAll5).replaceAll(String.valueOf(this.currentClick.getDownCoordinate().getY()));
            Pattern compile7 = Pattern.compile(MACRO_UP_X);
            String replaceAll7 = compile7.matcher(replaceAll6).replaceAll(String.valueOf(this.currentClick.getUpCoordinate().getX()));
            Pattern compile8 = Pattern.compile(MACRO_UP_Y);
            tpatSender.sendTpat(compile8.matcher(replaceAll7).replaceAll(String.valueOf(this.currentClick.getUpCoordinate().getY())), this.executor);
        }
    }

    public final ClickCoordinate getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent motionEvent) {
        if (!this.advertisement.isClickCoordinatesTrackingEnabled()) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.currentClick.setUpCoordinate(new Coordinate((int) motionEvent.getX(), (int) motionEvent.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                    return;
                }
                return;
            }
            return;
        }
        this.currentClick.setDownCoordinate(new Coordinate((int) motionEvent.getX(), (int) motionEvent.getY()));
    }
}
