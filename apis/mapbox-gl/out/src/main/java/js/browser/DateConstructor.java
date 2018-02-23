package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DateConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 33018
  * declared in: tsd/browser/lib.es6.d.ts at pos 198454
  * declared in: tsd/browser/lib.es6.d.ts at pos 784375

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class DateConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Date prototype;

    /*
        Methods
    */
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month);
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */);
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */);
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */);
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@34423
      * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
     */
    public native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */, @DoNotAutobox Number ms /* optional */);
    @JsProperty(name = "prototype")
    public native Date getPrototype();
    /** 
      * tsd/browser/lib.es6.d.ts@34549
     */
    public native Number now();
    /** 
      * tsd/browser/lib.es6.d.ts@33482
      * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
     */
    public native Number parse(String s);
    @JsProperty(name = "prototype")
    public native void setPrototype(Date value);
}
