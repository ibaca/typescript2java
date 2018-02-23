package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScopedCredential
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 637797
  * declared in: tsd/browser/lib.es6.d.ts at pos 637899
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredential")
public class ScopedCredential
{

    /*
        Constructors
    */
    public ScopedCredential () {
    } 

    /*
        Properties
    */

    public ArrayBuffer id;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "id")
    public native ArrayBuffer getId();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "id")
    public native void setId(ArrayBuffer value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
