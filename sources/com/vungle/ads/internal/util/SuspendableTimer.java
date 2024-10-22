package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.ng0;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class SuspendableTimer {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final v31 onFinish;
    private final v31 onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    /* renamed from: com.vungle.ads.internal.util.SuspendableTimer$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ji1 implements v31 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m96invoke() {
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            m96invoke();
            return ch3.f636a;
        }
    }

    public SuspendableTimer(double d, boolean z, v31 v31Var, v31 v31Var2) {
        this.durationSecs = d;
        this.repeats = z;
        this.onTick = v31Var;
        this.onFinish = v31Var2;
        this.nextDurationSecs = d;
    }

    private final CountDownTimer createCountdown(final long j) {
        return new CountDownTimer(j, this) { // from class: com.vungle.ads.internal.util.SuspendableTimer$createCountdown$1
            final /* synthetic */ SuspendableTimer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j, j);
                this.this$0 = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                v31 v31Var;
                boolean z;
                boolean z2;
                double d;
                SuspendableTimer suspendableTimer = this.this$0;
                v31Var = suspendableTimer.onFinish;
                v31Var.invoke();
                z = suspendableTimer.repeats;
                if (z) {
                    z2 = suspendableTimer.isCanceled;
                    if (!z2) {
                        d = suspendableTimer.durationSecs;
                        suspendableTimer.setNextDurationSecs$vungle_ads_release(d);
                        suspendableTimer.start();
                        return;
                    }
                }
                suspendableTimer.cancel();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                v31 v31Var;
                v31Var = this.this$0.onTick;
                v31Var.invoke();
            }
        };
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * 1000);
    }

    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / 1000;
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * 1000);
    }

    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long currentTimeMillis;
        long j;
        if (this.isPaused) {
            currentTimeMillis = getDurationMillis();
            j = getNextDurationMillis();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j = this.startTimeMillis;
        }
        return currentTimeMillis - j;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (!this.isPaused) {
            return;
        }
        this.isPaused = false;
        start();
    }

    public final void setNextDurationSecs$vungle_ads_release(double d) {
        this.nextDurationSecs = d;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j) {
        this.startTimeMillis = j;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer createCountdown = createCountdown(getNextDurationMillis());
        this.timer = createCountdown;
        if (createCountdown != null) {
            createCountdown.start();
        }
    }

    public /* synthetic */ SuspendableTimer(double d, boolean z, v31 v31Var, v31 v31Var2, int i, ng0 ng0Var) {
        this(d, z, (i & 4) != 0 ? AnonymousClass1.INSTANCE : v31Var, v31Var2);
    }
}
