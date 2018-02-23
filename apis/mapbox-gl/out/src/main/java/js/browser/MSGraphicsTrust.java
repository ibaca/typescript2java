package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSGraphicsTrust
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 505896
  * declared in: tsd/browser/lib.es6.d.ts at pos 506011
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGraphicsTrust")
public class MSGraphicsTrust
{

    /*
        Constructors
    */
    public MSGraphicsTrust () {
    } 

    /*
        Properties
    */

    public Boolean constrictionActive;

    public String status;

    /*
        Methods
    */
    @JsProperty(name = "constrictionActive")
    public native Boolean getConstrictionActive();
    @JsProperty(name = "status")
    public native String getStatus();
    @JsProperty(name = "constrictionActive")
    public native void setConstrictionActive(Boolean value);
    @JsProperty(name = "status")
    public native void setStatus(String value);
}
