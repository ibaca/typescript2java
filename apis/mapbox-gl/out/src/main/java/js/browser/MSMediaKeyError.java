package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSMediaKeyError
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 510141
  * declared in: tsd/browser/lib.es6.d.ts at pos 510525
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyError")
public class MSMediaKeyError
{

    /*
        Constructors
    */
    public MSMediaKeyError () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_CLIENT")
    public static Number MS_MEDIA_KEYERR_CLIENT;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_DOMAIN")
    public static Number MS_MEDIA_KEYERR_DOMAIN;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_HARDWARECHANGE")
    public static Number MS_MEDIA_KEYERR_HARDWARECHANGE;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_OUTPUT")
    public static Number MS_MEDIA_KEYERR_OUTPUT;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_SERVICE")
    public static Number MS_MEDIA_KEYERR_SERVICE;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_UNKNOWN")
    public static Number MS_MEDIA_KEYERR_UNKNOWN;

    /*
        Properties
    */

    public Number code;

    public Number systemCode;

    /*
        Methods
    */
    @JsProperty(name = "code")
    public native Number getCode();
    @JsProperty(name = "MS_MEDIA_KEYERR_CLIENT")
    public native Number getMS_MEDIA_KEYERR_CLIENT();
    @JsProperty(name = "MS_MEDIA_KEYERR_DOMAIN")
    public native Number getMS_MEDIA_KEYERR_DOMAIN();
    @JsProperty(name = "MS_MEDIA_KEYERR_HARDWARECHANGE")
    public native Number getMS_MEDIA_KEYERR_HARDWARECHANGE();
    @JsProperty(name = "MS_MEDIA_KEYERR_OUTPUT")
    public native Number getMS_MEDIA_KEYERR_OUTPUT();
    @JsProperty(name = "MS_MEDIA_KEYERR_SERVICE")
    public native Number getMS_MEDIA_KEYERR_SERVICE();
    @JsProperty(name = "MS_MEDIA_KEYERR_UNKNOWN")
    public native Number getMS_MEDIA_KEYERR_UNKNOWN();
    @JsProperty(name = "systemCode")
    public native Number getSystemCode();
    @JsProperty(name = "code")
    public native void setCode(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_CLIENT")
    public native void setMS_MEDIA_KEYERR_CLIENT(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_DOMAIN")
    public native void setMS_MEDIA_KEYERR_DOMAIN(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_HARDWARECHANGE")
    public native void setMS_MEDIA_KEYERR_HARDWARECHANGE(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_OUTPUT")
    public native void setMS_MEDIA_KEYERR_OUTPUT(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_SERVICE")
    public native void setMS_MEDIA_KEYERR_SERVICE(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_KEYERR_UNKNOWN")
    public native void setMS_MEDIA_KEYERR_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "systemCode")
    public native void setSystemCode(@DoNotAutobox Number value);
}
