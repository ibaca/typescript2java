package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaError
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 517665
  * declared in: tsd/browser/lib.es6.d.ts at pos 517982
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaError")
public class MediaError
{

    /*
        Constructors
    */
    public MediaError () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_ABORTED")
    public static Number MEDIA_ERR_ABORTED;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_DECODE")
    public static Number MEDIA_ERR_DECODE;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_NETWORK")
    public static Number MEDIA_ERR_NETWORK;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_SRC_NOT_SUPPORTED")
    public static Number MEDIA_ERR_SRC_NOT_SUPPORTED;

    @JsProperty(namespace="MediaError", name="MS_MEDIA_ERR_ENCRYPTED")
    public static Number MS_MEDIA_ERR_ENCRYPTED;

    /*
        Properties
    */

    public Number code;

    public Number msExtendedCode;

    /*
        Methods
    */
    @JsProperty(name = "code")
    public native Number getCode();
    @JsProperty(name = "MEDIA_ERR_ABORTED")
    public native Number getMEDIA_ERR_ABORTED();
    @JsProperty(name = "MEDIA_ERR_DECODE")
    public native Number getMEDIA_ERR_DECODE();
    @JsProperty(name = "MEDIA_ERR_NETWORK")
    public native Number getMEDIA_ERR_NETWORK();
    @JsProperty(name = "MEDIA_ERR_SRC_NOT_SUPPORTED")
    public native Number getMEDIA_ERR_SRC_NOT_SUPPORTED();
    @JsProperty(name = "MS_MEDIA_ERR_ENCRYPTED")
    public native Number getMS_MEDIA_ERR_ENCRYPTED();
    @JsProperty(name = "msExtendedCode")
    public native Number getMsExtendedCode();
    @JsProperty(name = "code")
    public native void setCode(@DoNotAutobox Number value);
    @JsProperty(name = "MEDIA_ERR_ABORTED")
    public native void setMEDIA_ERR_ABORTED(@DoNotAutobox Number value);
    @JsProperty(name = "MEDIA_ERR_DECODE")
    public native void setMEDIA_ERR_DECODE(@DoNotAutobox Number value);
    @JsProperty(name = "MEDIA_ERR_NETWORK")
    public native void setMEDIA_ERR_NETWORK(@DoNotAutobox Number value);
    @JsProperty(name = "MEDIA_ERR_SRC_NOT_SUPPORTED")
    public native void setMEDIA_ERR_SRC_NOT_SUPPORTED(@DoNotAutobox Number value);
    @JsProperty(name = "MS_MEDIA_ERR_ENCRYPTED")
    public native void setMS_MEDIA_ERR_ENCRYPTED(@DoNotAutobox Number value);
    @JsProperty(name = "msExtendedCode")
    public native void setMsExtendedCode(@DoNotAutobox Number value);
}
