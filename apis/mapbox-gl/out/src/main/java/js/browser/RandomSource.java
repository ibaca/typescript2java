package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: RandomSource
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 734551
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface RandomSource
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@734582
      * inherited from (js.browser.RandomSource)
     */
    ArrayBufferView getRandomValues(ArrayBufferView array);
}
