package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: ProxyHandler
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 241249

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ProxyHandler<T>
{

    /*
        Methods
    */
    public native Object apply(@DoNotAutobox T target);
    /** 
      * thisArg is java.lang.Object
      * tsd/browser/lib.es6.d.ts@241956
     */
    public native Object apply(@DoNotAutobox T target, Object argArray /* optional */);
    public native Object construct(@DoNotAutobox T target, Object argArray);
    /** 
      * tsd/browser/lib.es6.d.ts@242015
     */
    public native Object construct(@DoNotAutobox T target, Object argArray, Object newTarget /* optional */);
    public native Boolean defineProperty(@DoNotAutobox T target, String p, PropertyDescriptor attributes);
    public native Boolean defineProperty(@DoNotAutobox T target, @DoNotAutobox Number p, PropertyDescriptor attributes);
    /** 
      * tsd/browser/lib.es6.d.ts@241782
     */
    public native Boolean defineProperty(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p, PropertyDescriptor attributes);
    public native Boolean deleteProperty(@DoNotAutobox T target, String p);
    public native Boolean deleteProperty(@DoNotAutobox T target, @DoNotAutobox Number p);
    /** 
      * tsd/browser/lib.es6.d.ts@241724
     */
    public native Boolean deleteProperty(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p);
    /** 
      * tsd/browser/lib.es6.d.ts@241872
     */
    public native Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> enumerate(@DoNotAutobox T target);
    public native Object get(@DoNotAutobox T target, String p, Object receiver);
    public native Object get(@DoNotAutobox T target, @DoNotAutobox Number p, Object receiver);
    /** 
      * tsd/browser/lib.es6.d.ts@241592
     */
    public native Object get(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p, Object receiver);
    public native PropertyDescriptor getOwnPropertyDescriptor(@DoNotAutobox T target, String p);
    public native PropertyDescriptor getOwnPropertyDescriptor(@DoNotAutobox T target, @DoNotAutobox Number p);
    /** 
      * tsd/browser/lib.es6.d.ts@241466
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p);
    /** 
      * tsd/browser/lib.es6.d.ts@241283
     */
    public native Object getPrototypeOf(@DoNotAutobox T target);
    public native Boolean has(@DoNotAutobox T target, String p);
    public native Boolean has(@DoNotAutobox T target, @DoNotAutobox Number p);
    /** 
      * tsd/browser/lib.es6.d.ts@241545
     */
    public native Boolean has(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p);
    /** 
      * tsd/browser/lib.es6.d.ts@241381
     */
    public native Boolean isExtensible(@DoNotAutobox T target);
    /** 
      * tsd/browser/lib.es6.d.ts@241915
     */
    public native Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> ownKeys(@DoNotAutobox T target);
    /** 
      * tsd/browser/lib.es6.d.ts@241421
     */
    public native Boolean preventExtensions(@DoNotAutobox T target);
    public native Boolean set(@DoNotAutobox T target, String p, Object value, Object receiver);
    public native Boolean set(@DoNotAutobox T target, @DoNotAutobox Number p, Object value, Object receiver);
    /** 
      * tsd/browser/lib.es6.d.ts@241650
     */
    public native Boolean set(@DoNotAutobox T target, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString p, Object value, Object receiver);
    /** 
      * tsd/browser/lib.es6.d.ts@241331
     */
    public native Boolean setPrototypeOf(@DoNotAutobox T target, Object v);
}
