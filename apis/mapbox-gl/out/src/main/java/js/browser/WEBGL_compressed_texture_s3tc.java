package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WEBGL_compressed_texture_s3tc
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 663237
  * declared in: tsd/browser/lib.es6.d.ts at pos 663502
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WEBGL_compressed_texture_s3tc")
public class WEBGL_compressed_texture_s3tc
{

    /*
        Constructors
    */
    public WEBGL_compressed_texture_s3tc () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="WEBGL_compressed_texture_s3tc", name="COMPRESSED_RGBA_S3TC_DXT1_EXT")
    public static Number COMPRESSED_RGBA_S3TC_DXT1_EXT;

    @JsProperty(namespace="WEBGL_compressed_texture_s3tc", name="COMPRESSED_RGBA_S3TC_DXT3_EXT")
    public static Number COMPRESSED_RGBA_S3TC_DXT3_EXT;

    @JsProperty(namespace="WEBGL_compressed_texture_s3tc", name="COMPRESSED_RGBA_S3TC_DXT5_EXT")
    public static Number COMPRESSED_RGBA_S3TC_DXT5_EXT;

    @JsProperty(namespace="WEBGL_compressed_texture_s3tc", name="COMPRESSED_RGB_S3TC_DXT1_EXT")
    public static Number COMPRESSED_RGB_S3TC_DXT1_EXT;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT1_EXT")
    public native Number getCOMPRESSED_RGBA_S3TC_DXT1_EXT();
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT3_EXT")
    public native Number getCOMPRESSED_RGBA_S3TC_DXT3_EXT();
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT5_EXT")
    public native Number getCOMPRESSED_RGBA_S3TC_DXT5_EXT();
    @JsProperty(name = "COMPRESSED_RGB_S3TC_DXT1_EXT")
    public native Number getCOMPRESSED_RGB_S3TC_DXT1_EXT();
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT1_EXT")
    public native void setCOMPRESSED_RGBA_S3TC_DXT1_EXT(@DoNotAutobox Number value);
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT3_EXT")
    public native void setCOMPRESSED_RGBA_S3TC_DXT3_EXT(@DoNotAutobox Number value);
    @JsProperty(name = "COMPRESSED_RGBA_S3TC_DXT5_EXT")
    public native void setCOMPRESSED_RGBA_S3TC_DXT5_EXT(@DoNotAutobox Number value);
    @JsProperty(name = "COMPRESSED_RGB_S3TC_DXT1_EXT")
    public native void setCOMPRESSED_RGB_S3TC_DXT1_EXT(@DoNotAutobox Number value);
}
