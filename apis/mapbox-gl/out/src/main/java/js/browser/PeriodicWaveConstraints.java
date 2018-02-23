package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PeriodicWaveConstraints
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 272711

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PeriodicWaveConstraints
{

    /*
        Properties
    */

    public Boolean disableNormalization;

    /*
        Methods
    */
    @JsProperty(name = "disableNormalization")
    public native Boolean getDisableNormalization();
    @JsProperty(name = "disableNormalization")
    public native void setDisableNormalization(Boolean value);
}
