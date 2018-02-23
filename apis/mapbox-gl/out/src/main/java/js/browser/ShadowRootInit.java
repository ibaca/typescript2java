package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ShadowRootInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 743892

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ShadowRootInit
{

    /*
        Properties
    */

    public Boolean delegatesFocus;

    public String mode;

    /*
        Methods
    */
    @JsProperty(name = "delegatesFocus")
    public native Boolean getDelegatesFocus();
    @JsProperty(name = "mode")
    public native String getMode();
    @JsProperty(name = "delegatesFocus")
    public native void setDelegatesFocus(Boolean value);
    @JsProperty(name = "mode")
    public native void setMode(String value);
}
