package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: EXT_texture_filter_anisotropic
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 364990
  * declared in: tsd/browser/lib.es6.d.ts at pos 365151
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EXT_texture_filter_anisotropic")
public class EXT_texture_filter_anisotropic
{

    /*
        Constructors
    */
    public EXT_texture_filter_anisotropic () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="EXT_texture_filter_anisotropic", name="MAX_TEXTURE_MAX_ANISOTROPY_EXT")
    public static Number MAX_TEXTURE_MAX_ANISOTROPY_EXT;

    @JsProperty(namespace="EXT_texture_filter_anisotropic", name="TEXTURE_MAX_ANISOTROPY_EXT")
    public static Number TEXTURE_MAX_ANISOTROPY_EXT;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "MAX_TEXTURE_MAX_ANISOTROPY_EXT")
    public native Number getMAX_TEXTURE_MAX_ANISOTROPY_EXT();
    @JsProperty(name = "TEXTURE_MAX_ANISOTROPY_EXT")
    public native Number getTEXTURE_MAX_ANISOTROPY_EXT();
    @JsProperty(name = "MAX_TEXTURE_MAX_ANISOTROPY_EXT")
    public native void setMAX_TEXTURE_MAX_ANISOTROPY_EXT(@DoNotAutobox Number value);
    @JsProperty(name = "TEXTURE_MAX_ANISOTROPY_EXT")
    public native void setTEXTURE_MAX_ANISOTROPY_EXT(@DoNotAutobox Number value);
}
