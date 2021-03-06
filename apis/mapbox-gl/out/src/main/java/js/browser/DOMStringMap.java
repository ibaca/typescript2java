package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: DOMStringMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 322766
  * declared in: tsd/browser/lib.es6.d.ts at pos 322847
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMStringMap")
public class DOMStringMap
{

    /*
        Constructors
    */
    public DOMStringMap () {
    } 

    @JsOverlay
    public final void setByIndex(String index, String value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final String getByIndex(String index) {
        return (String) Js.asPropertyMap(this).get(index);
    }
}
