package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StringConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 17981
  * declared in: tsd/browser/lib.es6.d.ts at pos 214342

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class StringConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public String prototype;

    /*
        Methods
    */
    public native String fromCharCode();
    /** 
      * tsd/browser/lib.es6.d.ts@18107
     */
    public native String fromCharCode(@DoNotAutobox Number...  codes);
    public native String fromCodePoint();
    /** 
      * tsd/browser/lib.es6.d.ts@214546
      * Return the String value whose elements are, in order, the elements in the List elements.
      * If length is 0, the empty string is returned.
     */
    public native String fromCodePoint(@DoNotAutobox Number...  codePoints);
    @JsProperty(name = "prototype")
    public native String getPrototype();
    public native String raw(TemplateStringsArray template);
    /** 
      * tsd/browser/lib.es6.d.ts@215005
      * String.raw is intended for use as a tag function of a Tagged Template String. When called
      * as such the first argument will be a well formed template call site object and the rest
      * parameter will contain the substitution values.
     */
    public native String raw(TemplateStringsArray template, Object...  substitutions);
    @JsProperty(name = "prototype")
    public native void setPrototype(String value);
}
