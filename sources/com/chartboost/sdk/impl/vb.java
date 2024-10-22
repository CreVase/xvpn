package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.nb;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class vb implements nb.a {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue<Runnable> f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f1238b;
    public final ArrayDeque<nb> c = new ArrayDeque<>();
    public nb d = null;

    public vb() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f1237a = linkedBlockingQueue;
        this.f1238b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a() {
        nb poll = this.c.poll();
        this.d = poll;
        if (poll != null) {
            poll.a(this.f1238b);
        }
    }

    public void b(nb nbVar) {
        nbVar.a(this);
        this.c.add(nbVar);
        if (this.d == null) {
            a();
        }
    }

    @Override // com.chartboost.sdk.impl.nb.a
    public void a(nb nbVar) {
        this.d = null;
        a();
    }
}
