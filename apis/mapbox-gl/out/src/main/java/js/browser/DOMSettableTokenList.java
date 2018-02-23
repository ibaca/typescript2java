package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMSettableTokenList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 322330
  * declared in: tsd/browser/lib.es6.d.ts at pos 322419
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMSettableTokenList")
public class DOMSettableTokenList extends DOMTokenList 
{

    /*
        Constructors
    */
    public DOMSettableTokenList () {
    } 

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    public String value;

    /*
        Methods
    */
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "value")
    public native void setValue(String value);
}
