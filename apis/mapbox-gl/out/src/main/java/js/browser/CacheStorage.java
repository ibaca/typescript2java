package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: CacheStorage
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 310889
  * declared in: tsd/browser/lib.es6.d.ts at pos 311163
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CacheStorage")
public class CacheStorage
{

    /*
        Constructors
    */
    public CacheStorage () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@310920
     */
    public native Promise<Boolean> delete(String cacheName);
    /** 
      * tsd/browser/lib.es6.d.ts@310969
     */
    public native Promise<Boolean> has(String cacheName);
    /** 
      * tsd/browser/lib.es6.d.ts@311015
     */
    public native Object keys();
    public native Promise<Object> match(String request);
    public native Promise<Object> match(String request, CacheQueryOptions options /* optional */);
    public native Promise<Object> match(Request request);
    public native Promise<Object> match(Request request, CacheQueryOptions options /* optional */);
    public native Promise<Object> match(RequestInfo_UnionOfRequestAndString request);
    /** 
      * tsd/browser/lib.es6.d.ts@311032
     */
    public native Promise<Object> match(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@311108
     */
    public native Promise<Cache> open(String cacheName);
}
