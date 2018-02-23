package js.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: IterableIterator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 217947

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IterableIterator<T> implements Iterator<T> 
{

    /*
        Methods
    */
    // skipped method ___at_iterator
    public native IteratorResult<T> next();
    /** 
      * inherited from (js.browser.Iterator)
     */
    public native IteratorResult<T> next(Object value /* optional */);
    @JsMethod(name = "return")
    public native IteratorResult<T> return_();
    /** 
      * inherited from (js.browser.Iterator)
     */
    @JsMethod(name = "return")
    public native IteratorResult<T> return_(Object value /* optional */);
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_();
    /** 
      * inherited from (js.browser.Iterator)
     */
    @JsMethod(name = "throw")
    public native IteratorResult<T> throw_(Object e /* optional */);
}
