package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: URLSearchParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 737901
  * declared in: tsd/browser/lib.es6.d.ts at pos 738807
  * 4 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URLSearchParams")
public class URLSearchParams
{

    /*
        Constructors
    */
    public URLSearchParams (UnionOfStringAndURLSearchParams init /* optional */) {
    } 
    public URLSearchParams (String init /* optional */) {
    } 
    public URLSearchParams (URLSearchParams init /* optional */) {
    } 
    public URLSearchParams () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@738022
      * Appends a specified key/value pair as a new search parameter.
     */
    public native void append(String name, String value);
    /** 
      * tsd/browser/lib.es6.d.ts@738196
      * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     */
    public native void delete(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@738319
      * Returns the first value associated to the given search parameter.
     */
    public native String get(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@738448
      * Returns all the values association with a given search parameter.
     */
    public native Array<String> getAll(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@738573
      * Returns a Boolean indicating if such a search parameter exists.
     */
    public native Boolean has(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@738753
      * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     */
    public native void set(String name, String value);
}
