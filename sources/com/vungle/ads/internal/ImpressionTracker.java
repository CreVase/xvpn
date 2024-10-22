package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.kw3;
import defpackage.ng0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ImpressionTracker";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface ImpressionListener {
        void onImpression(View view);
    }

    /* loaded from: classes2.dex */
    public static final class TrackingInfo {
        private ImpressionListener impressionListener;
        private int minViewablePercent;

        public final ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }

        public final void setMinViewablePercent(int i) {
            this.minViewablePercent = i;
        }
    }

    /* loaded from: classes2.dex */
    public final class VisibilityRunnable implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                }
            }
            Iterator<View> it = this.visibleViews.iterator();
            while (it.hasNext()) {
                View next = it.next();
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(next);
                if (trackingInfo != null && (impressionListener = trackingInfo.getImpressionListener()) != null) {
                    impressionListener.onImpression(next);
                }
                ImpressionTracker.this.removeView(next);
            }
            this.visibleViews.clear();
        }
    }

    public ImpressionTracker(Context context, Map<View, TrackingInfo> map, Handler handler) {
        this.trackedViews = map;
        this.visibilityHandler = handler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new kw3(this, 1);
        this.weakViewTreeObserver = new WeakReference<>(null);
        setViewTreeObserver(context, null);
    }

    /* renamed from: _init_$lambda-0 */
    public static final boolean m49_init_$lambda0(ImpressionTracker impressionTracker) {
        impressionTracker.scheduleVisibilityCheck();
        return true;
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    private final View getTopView(Context context, View view) {
        View view2;
        View rootView;
        if (context instanceof Activity) {
            view2 = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        } else {
            view2 = null;
        }
        if (view2 == null && view != null && (rootView = view.getRootView()) != null) {
            return rootView.findViewById(R.id.content);
        }
        return view2;
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    public final boolean isVisible(View view, int i) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long height = this.clipRect.height() * this.clipRect.width();
        long height2 = view.getHeight() * view.getWidth();
        if (height2 <= 0 || 100 * height < i * height2) {
            return false;
        }
        return true;
    }

    private final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final void setViewTreeObserver(Context context, View view) {
        View topView;
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if ((viewTreeObserver != null && viewTreeObserver.isAlive()) || (topView = getTopView(context, view)) == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            return;
        }
        this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
    }

    public final void addView(View view, ImpressionListener impressionListener) {
        setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.setMinViewablePercent(1);
        trackingInfo.setImpressionListener(impressionListener);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        this.weakViewTreeObserver = weakReference;
    }

    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler());
    }
}
