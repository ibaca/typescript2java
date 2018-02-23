package js.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Iterator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 217728
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Iterator<T>
{

    /*
        Methods
    */
    IteratorResult<T> next();
    /** 
      * tsd/browser/lib.es6.d.ts@217758
     */
    IteratorResult<T> next(Object value /* optional */);
    @JsMethod(name = "return")
    IteratorResult<T> return_();
    /** 
      * tsd/browser/lib.es6.d.ts@217800
     */
    @JsMethod(name = "return")
    IteratorResult<T> return_(Object value /* optional */);
    @JsMethod(name = "throw")
    IteratorResult<T> throw_();
    /** 
      * tsd/browser/lib.es6.d.ts@217845
     */
    @JsMethod(name = "throw")
    IteratorResult<T> throw_(Object e /* optional */);
}
