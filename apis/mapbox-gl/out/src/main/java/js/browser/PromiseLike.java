package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: PromiseLike
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 61563
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface PromiseLike<T>
{

    /*
        Methods
    */
    <TResult> PromiseLike<TResult> then(Function1<T, PromiseLike<TResult>> onfulfilled);
    /** 
      * tsd/browser/lib.es6.d.ts@61930
      * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    <TResult> PromiseLike<TResult> then(Function1<T, PromiseLike<TResult>> onfulfilled, Function1<Object, PromiseLike<TResult>> onrejected /* optional */);
}
