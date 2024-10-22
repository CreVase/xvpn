package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class yt0 implements kk3, h73, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, vh, s13 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bu0 f5387a;

    public yt0(bu0 bu0Var) {
        this.f5387a = bu0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        bu0 bu0Var = this.f5387a;
        bu0Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        bu0Var.w(surface);
        bu0Var.N = surface;
        bu0Var.t(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bu0 bu0Var = this.f5387a;
        bu0Var.w(null);
        bu0Var.t(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5387a.t(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f5387a.t(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bu0 bu0Var = this.f5387a;
        if (bu0Var.P) {
            bu0Var.w(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bu0 bu0Var = this.f5387a;
        if (bu0Var.P) {
            bu0Var.w(null);
        }
        bu0Var.t(0, 0);
    }
}
