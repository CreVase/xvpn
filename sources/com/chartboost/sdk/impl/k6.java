package com.chartboost.sdk.impl;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.bx3;
import defpackage.ng0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum k6 {
    GET_PARAMETERS("getParameters"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_ORIENTATION_PROPERTIES("getOrientationProperties"),
    CLICK("click"),
    CLOSE(MRAIDPresenter.CLOSE),
    SKIPPED("skipped"),
    VIDEO_COMPLETED("videoCompleted"),
    VIDEO_RESUMED("videoResumed"),
    VIDEO_PAUSED("videoPaused"),
    VIDEO_REPLAY("videoReplay"),
    CURRENT_VIDEO_DURATION("currentVideoDuration"),
    TOTAL_VIDEO_DURATION("totalVideoDuration"),
    SHOW("show"),
    ERROR(MRAIDPresenter.ERROR),
    WARNING("warning"),
    DEBUG("debug"),
    TRACKING("tracking"),
    OPEN_URL("openUrl"),
    SET_ORIENTATION_PROPERTIES(MRAIDPresenter.SET_ORIENTATION_PROPERTIES),
    REWARD("reward"),
    REWARDED_VIDEO_COMPLETED("rewardedVideoCompleted"),
    PLAY_VIDEO("playVideo"),
    PAUSE_VIDEO("pauseVideo"),
    CLOSE_VIDEO("closeVideo"),
    MUTE_VIDEO("mute"),
    UNMUTE_VIDEO("unmute"),
    OM_MEASUREMENT_RESOURCES("OMMeasurementResources"),
    START("start"),
    BUFFER_START("bufferStart"),
    BUFFER_END("bufferEnd"),
    VIDEO_FINISHED("videoFinished"),
    VIDEO_STARTED("videoStarted"),
    VIDEO_ENDED("videoEnded"),
    VIDEO_FAILED("videoFailed"),
    PLAYBACK_TIME("playbackTime"),
    ON_BACKGROUND("onBackground"),
    ON_FOREGROUND("onForeground");


    /* renamed from: b, reason: collision with root package name */
    public static final a f950b = new a(null);
    public static final Map<String, k6> c;

    /* renamed from: a, reason: collision with root package name */
    public final String f951a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public final k6 a(String str) {
            return (k6) k6.c.get(str);
        }

        public a() {
        }
    }

    static {
        k6[] values = values();
        int N = bx3.N(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(N >= 16 ? N : 16);
        for (k6 k6Var : values) {
            linkedHashMap.put(k6Var.f951a, k6Var);
        }
        c = linkedHashMap;
    }

    k6(String str) {
        this.f951a = str;
    }

    public final String c() {
        return this.f951a;
    }
}
