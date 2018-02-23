package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Cache
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 310340
  * declared in: tsd/browser/lib.es6.d.ts at pos 310838
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Cache")
public class Cache
{

    /*
        Constructors
    */
    public Cache () {
    } 

    /*
        Methods
    */
    public native Promise<Void> add(String request);
    public native Promise<Void> add(Request request);
    /** 
      * tsd/browser/lib.es6.d.ts@310364
     */
    public native Promise<Void> add(RequestInfo_UnionOfRequestAndString request);
    /** 
      * tsd/browser/lib.es6.d.ts@310410
     */
    public native Promise<Void> addAll(Array<RequestInfo_UnionOfRequestAndString> requests);
    public native Promise<Boolean> delete(String request);
    public native Promise<Boolean> delete(String request, CacheQueryOptions options /* optional */);
    public native Promise<Boolean> delete(Request request);
    public native Promise<Boolean> delete(Request request, CacheQueryOptions options /* optional */);
    public native Promise<Boolean> delete(RequestInfo_UnionOfRequestAndString request);
    /** 
      * tsd/browser/lib.es6.d.ts@310462
     */
    public native Promise<Boolean> delete(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    public native Object keys();
    public native Object keys(String request /* optional */);
    public native Object keys(String request /* optional */, CacheQueryOptions options /* optional */);
    public native Object keys(Request request /* optional */);
    public native Object keys(Request request /* optional */, CacheQueryOptions options /* optional */);
    public native Object keys(RequestInfo_UnionOfRequestAndString request /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@310543
     */
    public native Object keys(RequestInfo_UnionOfRequestAndString request /* optional */, CacheQueryOptions options /* optional */);
    public native Promise<Response> match(String request);
    public native Promise<Response> match(String request, CacheQueryOptions options /* optional */);
    public native Promise<Response> match(Request request);
    public native Promise<Response> match(Request request, CacheQueryOptions options /* optional */);
    public native Promise<Response> match(RequestInfo_UnionOfRequestAndString request);
    /** 
      * tsd/browser/lib.es6.d.ts@310610
     */
    public native Promise<Response> match(RequestInfo_UnionOfRequestAndString request, CacheQueryOptions options /* optional */);
    public native Object matchAll();
    public native Object matchAll(String request /* optional */);
    public native Object matchAll(String request /* optional */, CacheQueryOptions options /* optional */);
    public native Object matchAll(Request request /* optional */);
    public native Object matchAll(Request request /* optional */, CacheQueryOptions options /* optional */);
    public native Object matchAll(RequestInfo_UnionOfRequestAndString request /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@310691
     */
    public native Object matchAll(RequestInfo_UnionOfRequestAndString request /* optional */, CacheQueryOptions options /* optional */);
    public native Promise<Void> put(String request, Response response);
    public native Promise<Void> put(Request request, Response response);
    /** 
      * tsd/browser/lib.es6.d.ts@310762
     */
    public native Promise<Void> put(RequestInfo_UnionOfRequestAndString request, Response response);
}
