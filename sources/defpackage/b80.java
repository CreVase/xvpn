package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class b80 extends nn {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public b80(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i = 2000;
        try {
            Uri uri = ce0Var.f617a;
            this.f = uri;
            r();
            boolean equals = "content".equals(ce0Var.f617a.getScheme());
            ContentResolver contentResolver = this.e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                long j = ce0Var.f;
                if (length != -1 && j > length) {
                    throw new a80(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip == j) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.i = position;
                            if (position < 0) {
                                throw new a80(null, 2008);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.i = j2;
                        if (j2 < 0) {
                            throw new a80(null, 2008);
                        }
                    }
                    long j3 = ce0Var.g;
                    if (j3 != -1) {
                        long j4 = this.i;
                        if (j4 == -1) {
                            min = j3;
                        } else {
                            min = Math.min(j4, j3);
                        }
                        this.i = min;
                    }
                    this.j = true;
                    s(ce0Var);
                    if (j3 == -1) {
                        return this.i;
                    }
                    return j3;
                }
                throw new a80(null, 2008);
            }
            throw new a80(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (a80 e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new a80(e2, i);
        }
    }

    @Override // defpackage.zd0
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a80(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        q();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            q();
                        }
                        throw th;
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            q();
                        }
                    }
                } catch (IOException e2) {
                    throw new a80(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new a80(e3, 2000);
        }
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.f;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a80(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = wi3.f5017a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        p(read);
        return read;
    }
}
