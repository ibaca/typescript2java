package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: BarProp
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 292311
  * declared in: tsd/browser/lib.es6.d.ts at pos 292378
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BarProp")
public class BarProp
{

    /*
        Constructors
    */
    public BarProp () {
    } 

    /*
        Properties
    */

    public Boolean visible;

    /*
        Methods
    */
    @JsProperty(name = "visible")
    public native Boolean getVisible();
    @JsProperty(name = "visible")
    public native void setVisible(Boolean value);
}
