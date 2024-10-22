package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class av extends mr {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(int i, CarouselLayoutManager carouselLayoutManager, int i2) {
        super(i);
        this.c = i2;
        this.d = carouselLayoutManager;
    }

    public final int i() {
        int i = this.c;
        CarouselLayoutManager carouselLayoutManager = this.d;
        switch (i) {
            case 0:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.B();
        }
    }

    public final int j() {
        switch (this.c) {
            case 0:
                return this.d.C();
            default:
                return 0;
        }
    }

    public final int k() {
        int i = this.c;
        CarouselLayoutManager carouselLayoutManager = this.d;
        switch (i) {
            case 0:
                return carouselLayoutManager.n - carouselLayoutManager.D();
            default:
                return carouselLayoutManager.n;
        }
    }

    public final int l() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.d.E();
        }
    }
}
