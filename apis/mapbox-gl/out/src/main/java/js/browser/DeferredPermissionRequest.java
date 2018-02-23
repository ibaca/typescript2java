package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeferredPermissionRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 324775
  * declared in: tsd/browser/lib.es6.d.ts at pos 324944
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeferredPermissionRequest")
public class DeferredPermissionRequest
{

    /*
        Constructors
    */
    public DeferredPermissionRequest () {
    } 

    /*
        Properties
    */

    public Number id;

    public String type;

    public String uri;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@324897
     */
    public native void allow();
    /** 
      * tsd/browser/lib.es6.d.ts@324916
     */
    public native void deny();
    @JsProperty(name = "id")
    public native Number getId();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "uri")
    public native String getUri();
    @JsProperty(name = "id")
    public native void setId(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "uri")
    public native void setUri(String value);
}
