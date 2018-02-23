package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: ProxyConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 242079

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ProxyConstructor
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@242114
     */
    public native <T> Object revocable(@DoNotAutobox T target, ProxyHandler<T> handler);
}
