package js.browser;

import fr.lteconsulting.prebuilt.Function2;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: JSON
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 38286
  * declared in: tsd/browser/lib.es6.d.ts at pos 39954
  * declared in: tsd/browser/lib.es6.d.ts at pos 247909

  * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface JSON
{

    /*
        Methods
    */
    // skipped method get___at_toStringTag
    Object parse(String text);
    /** 
      * tsd/browser/lib.es6.d.ts@38670
      * Converts a JavaScript Object Notation (JSON) string into an object.
     */
    Object parse(String text, Function2<Object, Object, Object> reviver /* optional */);
    // skipped method set___at_toStringTag
    String stringify(Object value);
    String stringify(Object value, Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> replacer /* optional */);
    String stringify(Object value, Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> replacer /* optional */, String space /* optional */);
    String stringify(Object value, Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> replacer /* optional */, @DoNotAutobox Number space /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@39699
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * VERSION 1
     */
    String stringify(Object value, Array<PropertyKey_UnionOfFakeEsSymbolAndNumberAndString> replacer /* optional */, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString space /* optional */);
    String stringify(Object value, Function2<String, Object, Object> replacer /* optional */);
    String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, String space /* optional */);
    String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, @DoNotAutobox Number space /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@39126
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     */
    String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, PropertyKey_UnionOfFakeEsSymbolAndNumberAndString space /* optional */);
}
