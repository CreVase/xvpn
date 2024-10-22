package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.PlaceholderSurface;

/* loaded from: classes.dex */
public final class j52 extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public jp0 f2703a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f2704b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;

    public j52() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final void a(int i) {
        boolean z;
        boolean z2;
        int[] iArr;
        boolean z3;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z4;
        this.f2703a.getClass();
        jp0 jp0Var = this.f2703a;
        jp0Var.getClass();
        boolean z5 = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        bx3.n("eglGetDisplay failed", z);
        int[] iArr3 = new int[2];
        bx3.n("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        jp0Var.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, jp0.g, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bx3.n(wi3.m("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), z2);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = jp0Var.c;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        bx3.n("eglCreateContext failed", z3);
        jp0Var.d = eglCreateContext;
        EGLDisplay eGLDisplay2 = jp0Var.c;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            bx3.n("eglCreatePbufferSurface failed", z4);
        }
        bx3.n("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        jp0Var.e = eglCreatePbufferSurface;
        int[] iArr5 = jp0Var.f2807b;
        GLES20.glGenTextures(1, iArr5, 0);
        StringBuilder sb = new StringBuilder();
        boolean z6 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z6 = true;
        }
        if (!z6) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
            jp0Var.f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(jp0Var);
            SurfaceTexture surfaceTexture2 = this.f2703a.f;
            surfaceTexture2.getClass();
            if (i != 0) {
                z5 = true;
            }
            this.e = new PlaceholderSurface(this, surfaceTexture2, z5);
            return;
        }
        throw new u51(sb.toString());
    }

    public final void b() {
        this.f2703a.getClass();
        jp0 jp0Var = this.f2703a;
        jp0Var.f2806a.removeCallbacks(jp0Var);
        try {
            SurfaceTexture surfaceTexture = jp0Var.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, jp0Var.f2807b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = jp0Var.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = jp0Var.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = jp0Var.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(jp0Var.c, jp0Var.e);
            }
            EGLContext eGLContext = jp0Var.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(jp0Var.c, eGLContext);
            }
            if (wi3.f5017a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = jp0Var.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(jp0Var.c);
            }
            jp0Var.c = null;
            jp0Var.d = null;
            jp0Var.e = null;
            jp0Var.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                sn1.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.c = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                sn1.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.d = e2;
                synchronized (this) {
                    notify();
                }
            } catch (u51 e3) {
                sn1.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.d = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
