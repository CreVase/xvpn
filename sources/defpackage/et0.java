package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class et0 {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final bt0 G;
    public static final bt0[][] H;
    public static final bt0[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public String f1990a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f1991b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);
    public static final List n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};
    public static final byte[] t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};
    public static final byte[] v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] x = {101, 88, 73, 102};
    public static final byte[] y = {73, 72, 68, 82};
    public static final byte[] z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        bt0[] bt0VarArr = {new bt0("NewSubfileType", 254, 4), new bt0("SubfileType", 255, 4), new bt0("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new bt0("ImageLength", 257, 3, 4), new bt0("BitsPerSample", 258, 3), new bt0("Compression", 259, 3), new bt0("PhotometricInterpretation", 262, 3), new bt0("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new bt0("Make", 271, 2), new bt0("Model", 272, 2), new bt0("StripOffsets", 273, 3, 4), new bt0("Orientation", 274, 3), new bt0("SamplesPerPixel", 277, 3), new bt0("RowsPerStrip", 278, 3, 4), new bt0("StripByteCounts", 279, 3, 4), new bt0("XResolution", 282, 5), new bt0("YResolution", 283, 5), new bt0("PlanarConfiguration", 284, 3), new bt0("ResolutionUnit", 296, 3), new bt0("TransferFunction", 301, 3), new bt0("Software", 305, 2), new bt0("DateTime", 306, 2), new bt0("Artist", 315, 2), new bt0("WhitePoint", 318, 5), new bt0("PrimaryChromaticities", 319, 5), new bt0("SubIFDPointer", 330, 4), new bt0("JPEGInterchangeFormat", 513, 4), new bt0("JPEGInterchangeFormatLength", 514, 4), new bt0("YCbCrCoefficients", 529, 5), new bt0("YCbCrSubSampling", 530, 3), new bt0("YCbCrPositioning", 531, 3), new bt0("ReferenceBlackWhite", 532, 5), new bt0("Copyright", 33432, 2), new bt0("ExifIFDPointer", 34665, 4), new bt0("GPSInfoIFDPointer", 34853, 4), new bt0("SensorTopBorder", 4, 4), new bt0("SensorLeftBorder", 5, 4), new bt0("SensorBottomBorder", 6, 4), new bt0("SensorRightBorder", 7, 4), new bt0("ISO", 23, 3), new bt0("JpgFromRaw", 46, 7), new bt0("Xmp", 700, 1)};
        bt0[] bt0VarArr2 = {new bt0("ExposureTime", 33434, 5), new bt0("FNumber", 33437, 5), new bt0("ExposureProgram", 34850, 3), new bt0("SpectralSensitivity", 34852, 2), new bt0("PhotographicSensitivity", 34855, 3), new bt0("OECF", 34856, 7), new bt0("SensitivityType", 34864, 3), new bt0("StandardOutputSensitivity", 34865, 4), new bt0("RecommendedExposureIndex", 34866, 4), new bt0("ISOSpeed", 34867, 4), new bt0("ISOSpeedLatitudeyyy", 34868, 4), new bt0("ISOSpeedLatitudezzz", 34869, 4), new bt0("ExifVersion", 36864, 2), new bt0("DateTimeOriginal", 36867, 2), new bt0("DateTimeDigitized", 36868, 2), new bt0("OffsetTime", 36880, 2), new bt0("OffsetTimeOriginal", 36881, 2), new bt0("OffsetTimeDigitized", 36882, 2), new bt0("ComponentsConfiguration", 37121, 7), new bt0("CompressedBitsPerPixel", 37122, 5), new bt0("ShutterSpeedValue", 37377, 10), new bt0("ApertureValue", 37378, 5), new bt0("BrightnessValue", 37379, 10), new bt0("ExposureBiasValue", 37380, 10), new bt0("MaxApertureValue", 37381, 5), new bt0("SubjectDistance", 37382, 5), new bt0("MeteringMode", 37383, 3), new bt0("LightSource", 37384, 3), new bt0("Flash", 37385, 3), new bt0("FocalLength", 37386, 5), new bt0("SubjectArea", 37396, 3), new bt0("MakerNote", 37500, 7), new bt0("UserComment", 37510, 7), new bt0("SubSecTime", 37520, 2), new bt0("SubSecTimeOriginal", 37521, 2), new bt0("SubSecTimeDigitized", 37522, 2), new bt0("FlashpixVersion", 40960, 7), new bt0("ColorSpace", 40961, 3), new bt0("PixelXDimension", 40962, 3, 4), new bt0("PixelYDimension", 40963, 3, 4), new bt0("RelatedSoundFile", 40964, 2), new bt0("InteroperabilityIFDPointer", 40965, 4), new bt0("FlashEnergy", 41483, 5), new bt0("SpatialFrequencyResponse", 41484, 7), new bt0("FocalPlaneXResolution", 41486, 5), new bt0("FocalPlaneYResolution", 41487, 5), new bt0("FocalPlaneResolutionUnit", 41488, 3), new bt0("SubjectLocation", 41492, 3), new bt0("ExposureIndex", 41493, 5), new bt0("SensingMethod", 41495, 3), new bt0("FileSource", 41728, 7), new bt0("SceneType", 41729, 7), new bt0("CFAPattern", 41730, 7), new bt0("CustomRendered", 41985, 3), new bt0("ExposureMode", 41986, 3), new bt0("WhiteBalance", 41987, 3), new bt0("DigitalZoomRatio", 41988, 5), new bt0("FocalLengthIn35mmFilm", 41989, 3), new bt0("SceneCaptureType", 41990, 3), new bt0("GainControl", 41991, 3), new bt0("Contrast", 41992, 3), new bt0("Saturation", 41993, 3), new bt0("Sharpness", 41994, 3), new bt0("DeviceSettingDescription", 41995, 7), new bt0("SubjectDistanceRange", 41996, 3), new bt0("ImageUniqueID", 42016, 2), new bt0("CameraOwnerName", 42032, 2), new bt0("BodySerialNumber", 42033, 2), new bt0("LensSpecification", 42034, 5), new bt0("LensMake", 42035, 2), new bt0("LensModel", 42036, 2), new bt0("Gamma", 42240, 5), new bt0("DNGVersion", 50706, 1), new bt0("DefaultCropSize", 50720, 3, 4)};
        bt0[] bt0VarArr3 = {new bt0("GPSVersionID", 0, 1), new bt0("GPSLatitudeRef", 1, 2), new bt0("GPSLatitude", 2, 5, 10), new bt0("GPSLongitudeRef", 3, 2), new bt0("GPSLongitude", 4, 5, 10), new bt0("GPSAltitudeRef", 5, 1), new bt0("GPSAltitude", 6, 5), new bt0("GPSTimeStamp", 7, 5), new bt0("GPSSatellites", 8, 2), new bt0("GPSStatus", 9, 2), new bt0("GPSMeasureMode", 10, 2), new bt0("GPSDOP", 11, 5), new bt0("GPSSpeedRef", 12, 2), new bt0("GPSSpeed", 13, 5), new bt0("GPSTrackRef", 14, 2), new bt0("GPSTrack", 15, 5), new bt0("GPSImgDirectionRef", 16, 2), new bt0("GPSImgDirection", 17, 5), new bt0("GPSMapDatum", 18, 2), new bt0("GPSDestLatitudeRef", 19, 2), new bt0("GPSDestLatitude", 20, 5), new bt0("GPSDestLongitudeRef", 21, 2), new bt0("GPSDestLongitude", 22, 5), new bt0("GPSDestBearingRef", 23, 2), new bt0("GPSDestBearing", 24, 5), new bt0("GPSDestDistanceRef", 25, 2), new bt0("GPSDestDistance", 26, 5), new bt0("GPSProcessingMethod", 27, 7), new bt0("GPSAreaInformation", 28, 7), new bt0("GPSDateStamp", 29, 2), new bt0("GPSDifferential", 30, 3), new bt0("GPSHPositioningError", 31, 5)};
        bt0[] bt0VarArr4 = {new bt0("InteroperabilityIndex", 1, 2)};
        bt0[] bt0VarArr5 = {new bt0("NewSubfileType", 254, 4), new bt0("SubfileType", 255, 4), new bt0("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new bt0("ThumbnailImageLength", 257, 3, 4), new bt0("BitsPerSample", 258, 3), new bt0("Compression", 259, 3), new bt0("PhotometricInterpretation", 262, 3), new bt0("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new bt0("Make", 271, 2), new bt0("Model", 272, 2), new bt0("StripOffsets", 273, 3, 4), new bt0("ThumbnailOrientation", 274, 3), new bt0("SamplesPerPixel", 277, 3), new bt0("RowsPerStrip", 278, 3, 4), new bt0("StripByteCounts", 279, 3, 4), new bt0("XResolution", 282, 5), new bt0("YResolution", 283, 5), new bt0("PlanarConfiguration", 284, 3), new bt0("ResolutionUnit", 296, 3), new bt0("TransferFunction", 301, 3), new bt0("Software", 305, 2), new bt0("DateTime", 306, 2), new bt0("Artist", 315, 2), new bt0("WhitePoint", 318, 5), new bt0("PrimaryChromaticities", 319, 5), new bt0("SubIFDPointer", 330, 4), new bt0("JPEGInterchangeFormat", 513, 4), new bt0("JPEGInterchangeFormatLength", 514, 4), new bt0("YCbCrCoefficients", 529, 5), new bt0("YCbCrSubSampling", 530, 3), new bt0("YCbCrPositioning", 531, 3), new bt0("ReferenceBlackWhite", 532, 5), new bt0("Xmp", 700, 1), new bt0("Copyright", 33432, 2), new bt0("ExifIFDPointer", 34665, 4), new bt0("GPSInfoIFDPointer", 34853, 4), new bt0("DNGVersion", 50706, 1), new bt0("DefaultCropSize", 50720, 3, 4)};
        G = new bt0("StripOffsets", 273, 3);
        H = new bt0[][]{bt0VarArr, bt0VarArr2, bt0VarArr3, bt0VarArr4, bt0VarArr5, bt0VarArr, new bt0[]{new bt0("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new bt0("CameraSettingsIFDPointer", 8224, 4), new bt0("ImageProcessingIFDPointer", 8256, 4)}, new bt0[]{new bt0("PreviewImageStart", 257, 4), new bt0("PreviewImageLength", 258, 4)}, new bt0[]{new bt0("AspectFrame", 4371, 3)}, new bt0[]{new bt0("ColorSpace", 55, 3)}};
        I = new bt0[]{new bt0("SubIFDPointer", 330, 4), new bt0("ExifIFDPointer", 34665, 4), new bt0("GPSInfoIFDPointer", 34853, 4), new bt0("InteroperabilityIFDPointer", 40965, 4), new bt0("CameraSettingsIFDPointer", 8224, 1), new bt0("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            bt0[][] bt0VarArr6 = H;
            if (i < bt0VarArr6.length) {
                J[i] = new HashMap();
                K[i] = new HashMap();
                for (bt0 bt0Var : bt0VarArr6[i]) {
                    J[i].put(Integer.valueOf(bt0Var.f522a), bt0Var);
                    K[i].put(bt0Var.f523b, bt0Var);
                }
                i++;
            } else {
                HashMap hashMap = M;
                bt0[] bt0VarArr7 = I;
                hashMap.put(Integer.valueOf(bt0VarArr7[0].f522a), 5);
                hashMap.put(Integer.valueOf(bt0VarArr7[1].f522a), 1);
                hashMap.put(Integer.valueOf(bt0VarArr7[2].f522a), 2);
                hashMap.put(Integer.valueOf(bt0VarArr7[3].f522a), 3);
                hashMap.put(Integer.valueOf(bt0VarArr7[4].f522a), 7);
                hashMap.put(Integer.valueOf(bt0VarArr7[5].f522a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public et0(String str) {
        FileInputStream fileInputStream;
        boolean z2;
        bt0[][] bt0VarArr = H;
        this.d = new HashMap[bt0VarArr.length];
        this.e = new HashSet(bt0VarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            this.f1990a = str;
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    ft0.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    this.f1991b = fileInputStream.getFD();
                } else {
                    this.f1991b = null;
                }
                o(fileInputStream);
                try {
                    fileInputStream.close();
                    return;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused2) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public static ByteOrder r(zs0 zs0Var) {
        short readShort = zs0Var.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b2 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", at0.a(b2));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", at0.b(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", at0.b(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", at0.b(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", at0.b(0L, this.f));
        }
    }

    public final String b(String str) {
        at0 c = c(str);
        if (c != null) {
            if (!L.contains(str)) {
                return c.g(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c.f331a;
                if (i != 5 && i != 10) {
                    return null;
                }
                ct0[] ct0VarArr = (ct0[]) c.h(this.f);
                if (ct0VarArr != null && ct0VarArr.length == 3) {
                    ct0 ct0Var = ct0VarArr[0];
                    ct0 ct0Var2 = ct0VarArr[1];
                    ct0 ct0Var3 = ct0VarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) ct0Var.f1669a) / ((float) ct0Var.f1670b))), Integer.valueOf((int) (((float) ct0Var2.f1669a) / ((float) ct0Var2.f1670b))), Integer.valueOf((int) (((float) ct0Var3.f1669a) / ((float) ct0Var3.f1670b))));
                }
                Arrays.toString(ct0VarArr);
                return null;
            }
            try {
                return Double.toString(c.e(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final at0 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < H.length; i++) {
            at0 at0Var = (at0) this.d[i].get(str);
            if (at0Var != null) {
                return at0Var;
            }
        }
        return null;
    }

    public final void d(dt0 dt0Var) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    gt0.a(mediaMetadataRetriever, new ys0(dt0Var));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", at0.d(Integer.parseInt(str), this.f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", at0.d(Integer.parseInt(str2), this.f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        hashMapArr[0].put("Orientation", at0.d(i, this.f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            dt0Var.c(parseInt2);
                            byte[] bArr = new byte[6];
                            if (dt0Var.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, O)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (dt0Var.read(bArr2) == i3) {
                                        this.h = i2;
                                        s(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x015c, code lost:            r23.f5540b = r22.f;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0160, code lost:            return;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0066. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[LOOP:0: B:9:0x0024->B:32:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.zs0 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et0.e(zs0, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x00c7, code lost:            if (r6 == null) goto L70;     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et0.f(java.io.BufferedInputStream):int");
    }

    public final void g(dt0 dt0Var) {
        int i;
        int i2;
        j(dt0Var);
        HashMap[] hashMapArr = this.d;
        at0 at0Var = (at0) hashMapArr[1].get("MakerNote");
        if (at0Var != null) {
            dt0 dt0Var2 = new dt0(at0Var.d);
            dt0Var2.f5540b = this.f;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            dt0Var2.readFully(bArr2);
            dt0Var2.c(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            dt0Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                dt0Var2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                dt0Var2.c(12L);
            }
            t(dt0Var2, 6);
            at0 at0Var2 = (at0) hashMapArr[7].get("PreviewImageStart");
            at0 at0Var3 = (at0) hashMapArr[7].get("PreviewImageLength");
            if (at0Var2 != null && at0Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", at0Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", at0Var3);
            }
            at0 at0Var4 = (at0) hashMapArr[8].get("AspectFrame");
            if (at0Var4 != null) {
                int[] iArr = (int[]) at0Var4.h(this.f);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        at0 d = at0.d(i5, this.f);
                        at0 d2 = at0.d(i6, this.f);
                        hashMapArr[0].put("ImageWidth", d);
                        hashMapArr[0].put("ImageLength", d2);
                        return;
                    }
                    return;
                }
                Arrays.toString(iArr);
            }
        }
    }

    public final void h(zs0 zs0Var) {
        if (l) {
            Objects.toString(zs0Var);
        }
        zs0Var.f5540b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        zs0Var.a(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = zs0Var.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (zs0Var.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, z)) {
                        if (Arrays.equals(bArr2, x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (zs0Var.read(bArr3) == readInt) {
                                int readInt2 = zs0Var.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.h = i2;
                                    s(0, bArr3);
                                    y();
                                    v(new zs0(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + t9.r(bArr2));
                        }
                        int i3 = readInt + 4;
                        zs0Var.a(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(zs0 zs0Var) {
        if (l) {
            Objects.toString(zs0Var);
        }
        zs0Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        zs0Var.read(bArr);
        zs0Var.read(bArr2);
        zs0Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        zs0Var.a(i - zs0Var.c);
        zs0Var.read(bArr4);
        e(new zs0(bArr4), i, 5);
        zs0Var.a(i3 - zs0Var.c);
        zs0Var.f5540b = ByteOrder.BIG_ENDIAN;
        int readInt = zs0Var.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = zs0Var.readUnsignedShort();
            int readUnsignedShort2 = zs0Var.readUnsignedShort();
            if (readUnsignedShort == G.f522a) {
                short readShort = zs0Var.readShort();
                short readShort2 = zs0Var.readShort();
                at0 d = at0.d(readShort, this.f);
                at0 d2 = at0.d(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", d);
                hashMapArr[0].put("ImageWidth", d2);
                return;
            }
            zs0Var.a(readUnsignedShort2);
        }
    }

    public final void j(dt0 dt0Var) {
        p(dt0Var);
        t(dt0Var, 0);
        x(dt0Var, 0);
        x(dt0Var, 5);
        x(dt0Var, 4);
        y();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            at0 at0Var = (at0) hashMapArr[1].get("MakerNote");
            if (at0Var != null) {
                dt0 dt0Var2 = new dt0(at0Var.d);
                dt0Var2.f5540b = this.f;
                dt0Var2.a(6);
                t(dt0Var2, 9);
                at0 at0Var2 = (at0) hashMapArr[9].get("ColorSpace");
                if (at0Var2 != null) {
                    hashMapArr[1].put("ColorSpace", at0Var2);
                }
            }
        }
    }

    public final void k(dt0 dt0Var) {
        if (l) {
            Objects.toString(dt0Var);
        }
        j(dt0Var);
        HashMap[] hashMapArr = this.d;
        at0 at0Var = (at0) hashMapArr[0].get("JpgFromRaw");
        if (at0Var != null) {
            e(new zs0(at0Var.d), (int) at0Var.c, 5);
        }
        at0 at0Var2 = (at0) hashMapArr[0].get("ISO");
        at0 at0Var3 = (at0) hashMapArr[1].get("PhotographicSensitivity");
        if (at0Var2 != null && at0Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", at0Var2);
        }
    }

    public final void l(zs0 zs0Var) {
        if (l) {
            Objects.toString(zs0Var);
        }
        zs0Var.f5540b = ByteOrder.LITTLE_ENDIAN;
        zs0Var.a(A.length);
        int readInt = zs0Var.readInt() + 8;
        byte[] bArr = B;
        zs0Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (zs0Var.read(bArr2) == 4) {
                    int readInt2 = zs0Var.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (zs0Var.read(bArr3) == readInt2) {
                            this.h = i;
                            s(0, bArr3);
                            v(new zs0(bArr3));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + t9.r(bArr2));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        zs0Var.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(zs0 zs0Var, HashMap hashMap) {
        at0 at0Var = (at0) hashMap.get("JPEGInterchangeFormat");
        at0 at0Var2 = (at0) hashMap.get("JPEGInterchangeFormatLength");
        if (at0Var != null && at0Var2 != null) {
            int f = at0Var.f(this.f);
            int f2 = at0Var2.f(this.f);
            if (this.c == 7) {
                f += this.i;
            }
            if (f > 0 && f2 > 0 && this.f1990a == null && this.f1991b == null) {
                zs0Var.skip(f);
                zs0Var.read(new byte[f2]);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        at0 at0Var = (at0) hashMap.get("ImageLength");
        at0 at0Var2 = (at0) hashMap.get("ImageWidth");
        if (at0Var != null && at0Var2 != null) {
            int f = at0Var.f(this.f);
            int f2 = at0Var2.f(this.f);
            if (f <= 512 && f2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: all -> 0x0086, IOException | UnsupportedOperationException -> 0x0090, TryCatch #2 {IOException | UnsupportedOperationException -> 0x0090, all -> 0x0086, blocks: (B:3:0x0004, B:5:0x0009, B:7:0x0015, B:15:0x0037, B:17:0x0042, B:18:0x0058, B:27:0x0049, B:30:0x0051, B:31:0x0055, B:32:0x0062, B:34:0x006b, B:36:0x0071, B:38:0x0077, B:40:0x007d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x0086, IOException | UnsupportedOperationException -> 0x0090, TryCatch #2 {IOException | UnsupportedOperationException -> 0x0090, all -> 0x0086, blocks: (B:3:0x0004, B:5:0x0009, B:7:0x0015, B:15:0x0037, B:17:0x0042, B:18:0x0058, B:27:0x0049, B:30:0x0051, B:31:0x0055, B:32:0x0062, B:34:0x006b, B:36:0x0071, B:38:0x0077, B:40:0x007d), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.io.FileInputStream r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.et0.l
            r1 = 0
            r2 = 0
        L4:
            bt0[][] r3 = defpackage.et0.H     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            int r3 = r3.length     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            if (r2 >= r3) goto L15
            java.util.HashMap[] r3 = r7.d     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r4.<init>()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r3[r2] = r4     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            int r2 = r2 + 1
            goto L4
        L15:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            int r8 = r7.f(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r7.c = r8     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L34
            if (r8 == r5) goto L34
            if (r8 == r4) goto L34
            if (r8 != r3) goto L32
            goto L34
        L32:
            r8 = 1
            goto L35
        L34:
            r8 = 0
        L35:
            if (r8 == 0) goto L62
            dt0 r8 = new dt0     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            int r1 = r7.c     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r2 = 12
            if (r1 != r2) goto L46
            r7.d(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L58
        L46:
            r2 = 7
            if (r1 != r2) goto L4d
            r7.g(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L58
        L4d:
            r2 = 10
            if (r1 != r2) goto L55
            r7.k(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L58
        L55:
            r7.j(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
        L58:
            int r1 = r7.h     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r8.c(r1)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r7.v(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L80
        L62:
            zs0 r8 = new zs0     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            int r2 = r7.c     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            if (r2 != r6) goto L6f
            r7.e(r8, r1, r1)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L80
        L6f:
            if (r2 != r4) goto L75
            r7.h(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L80
        L75:
            if (r2 != r5) goto L7b
            r7.i(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
            goto L80
        L7b:
            if (r2 != r3) goto L80
            r7.l(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L90
        L80:
            r7.a()
            if (r0 == 0) goto L99
            goto L96
        L86:
            r8 = move-exception
            r7.a()
            if (r0 == 0) goto L8f
            r7.q()
        L8f:
            throw r8
        L90:
            r7.a()
            if (r0 == 0) goto L99
        L96:
            r7.q()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et0.o(java.io.FileInputStream):void");
    }

    public final void p(zs0 zs0Var) {
        ByteOrder r2 = r(zs0Var);
        this.f = r2;
        zs0Var.f5540b = r2;
        int readUnsignedShort = zs0Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = zs0Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                zs0Var.a(i2);
                return;
            }
            return;
        }
        throw new IOException(hx2.m("Invalid first Ifd offset: ", readInt));
    }

    public final void q() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i < hashMapArr.length) {
                hashMapArr[i].size();
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    at0 at0Var = (at0) entry.getValue();
                    at0Var.toString();
                    at0Var.g(this.f);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void s(int i, byte[] bArr) {
        dt0 dt0Var = new dt0(bArr);
        p(dt0Var);
        t(dt0Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.dt0 r31, int r32) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et0.t(dt0, int):void");
    }

    public final void u(int i, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.zs0 r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et0.v(zs0):void");
    }

    public final void w(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i].isEmpty() && !hashMapArr[i2].isEmpty()) {
            at0 at0Var = (at0) hashMapArr[i].get("ImageLength");
            at0 at0Var2 = (at0) hashMapArr[i].get("ImageWidth");
            at0 at0Var3 = (at0) hashMapArr[i2].get("ImageLength");
            at0 at0Var4 = (at0) hashMapArr[i2].get("ImageWidth");
            if (at0Var != null && at0Var2 != null && at0Var3 != null && at0Var4 != null) {
                int f = at0Var.f(this.f);
                int f2 = at0Var2.f(this.f);
                int f3 = at0Var3.f(this.f);
                int f4 = at0Var4.f(this.f);
                if (f < f3 && f2 < f4) {
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public final void x(dt0 dt0Var, int i) {
        at0 d;
        at0 d2;
        HashMap[] hashMapArr = this.d;
        at0 at0Var = (at0) hashMapArr[i].get("DefaultCropSize");
        at0 at0Var2 = (at0) hashMapArr[i].get("SensorTopBorder");
        at0 at0Var3 = (at0) hashMapArr[i].get("SensorLeftBorder");
        at0 at0Var4 = (at0) hashMapArr[i].get("SensorBottomBorder");
        at0 at0Var5 = (at0) hashMapArr[i].get("SensorRightBorder");
        if (at0Var != null) {
            if (at0Var.f331a == 5) {
                ct0[] ct0VarArr = (ct0[]) at0Var.h(this.f);
                if (ct0VarArr != null && ct0VarArr.length == 2) {
                    d = at0.c(ct0VarArr[0], this.f);
                    d2 = at0.c(ct0VarArr[1], this.f);
                } else {
                    Arrays.toString(ct0VarArr);
                    return;
                }
            } else {
                int[] iArr = (int[]) at0Var.h(this.f);
                if (iArr != null && iArr.length == 2) {
                    d = at0.d(iArr[0], this.f);
                    d2 = at0.d(iArr[1], this.f);
                } else {
                    Arrays.toString(iArr);
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", d);
            hashMapArr[i].put("ImageLength", d2);
            return;
        }
        if (at0Var2 != null && at0Var3 != null && at0Var4 != null && at0Var5 != null) {
            int f = at0Var2.f(this.f);
            int f2 = at0Var4.f(this.f);
            int f3 = at0Var5.f(this.f);
            int f4 = at0Var3.f(this.f);
            if (f2 > f && f3 > f4) {
                at0 d3 = at0.d(f2 - f, this.f);
                at0 d4 = at0.d(f3 - f4, this.f);
                hashMapArr[i].put("ImageLength", d3);
                hashMapArr[i].put("ImageWidth", d4);
                return;
            }
            return;
        }
        at0 at0Var6 = (at0) hashMapArr[i].get("ImageLength");
        at0 at0Var7 = (at0) hashMapArr[i].get("ImageWidth");
        if (at0Var6 == null || at0Var7 == null) {
            at0 at0Var8 = (at0) hashMapArr[i].get("JPEGInterchangeFormat");
            at0 at0Var9 = (at0) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (at0Var8 != null && at0Var9 != null) {
                int f5 = at0Var8.f(this.f);
                int f6 = at0Var8.f(this.f);
                dt0Var.c(f5);
                byte[] bArr = new byte[f6];
                dt0Var.read(bArr);
                e(new zs0(bArr), f5, i);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.d;
        at0 at0Var = (at0) hashMapArr[1].get("PixelXDimension");
        at0 at0Var2 = (at0) hashMapArr[1].get("PixelYDimension");
        if (at0Var != null && at0Var2 != null) {
            hashMapArr[0].put("ImageWidth", at0Var);
            hashMapArr[0].put("ImageLength", at0Var2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        n(hashMapArr[4]);
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
