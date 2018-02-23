package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAssertion
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 502610
  * declared in: tsd/browser/lib.es6.d.ts at pos 502702
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAssertion")
public class MSAssertion
{

    /*
        Constructors
    */
    public MSAssertion () {
    } 

    /*
        Properties
    */

    public String id;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
