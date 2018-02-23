package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StyleMedia
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 648913
  * declared in: tsd/browser/lib.es6.d.ts at pos 649025
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleMedia")
public class StyleMedia
{

    /*
        Constructors
    */
    public StyleMedia () {
    } 

    /*
        Properties
    */

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * tsd/browser/lib.es6.d.ts@648969
     */
    public native Boolean matchMedium(String mediaquery);
    @JsProperty(name = "type")
    public native void setType(String value);
}
