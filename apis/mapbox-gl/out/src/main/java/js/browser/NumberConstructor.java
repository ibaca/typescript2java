package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NumberConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 19744
  * declared in: tsd/browser/lib.es6.d.ts at pos 202087

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class NumberConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    /** 
      * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
      * that is representable as a Number value, which is approximately:
      * 2.2204460492503130808472633361816 x 10‍−‍16.
     */
    public Number EPSILON;

    /** 
      * The value of the largest integer n such that n and n + 1 are both exactly representable as
      * a Number value.
      * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
     */
    public Number MAX_SAFE_INTEGER;

    /** 
      * The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. 
     */
    public Number MAX_VALUE;

    /** 
      * The value of the smallest integer n such that n and n − 1 are both exactly representable as
      * a Number value.
      * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
     */
    public Number MIN_SAFE_INTEGER;

    /** 
      * The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. 
     */
    public Number MIN_VALUE;

    /** 
      * A value that is less than the largest negative number that can be represented in JavaScript.
      * JavaScript displays NEGATIVE_INFINITY values as -infinity.
     */
    public Number NEGATIVE_INFINITY;

    /** 
      * A value that is not a number.
      * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
     */
    public Number NaN;

    /** 
      * A value greater than the largest number that can be represented in JavaScript.
      * JavaScript displays POSITIVE_INFINITY values as infinity.
     */
    public Number POSITIVE_INFINITY;

    public Number prototype;

    /*
        Methods
    */
    @JsProperty(name = "EPSILON")
    public native Number getEPSILON();
    @JsProperty(name = "MAX_SAFE_INTEGER")
    public native Number getMAX_SAFE_INTEGER();
    @JsProperty(name = "MAX_VALUE")
    public native Number getMAX_VALUE();
    @JsProperty(name = "MIN_SAFE_INTEGER")
    public native Number getMIN_SAFE_INTEGER();
    @JsProperty(name = "MIN_VALUE")
    public native Number getMIN_VALUE();
    @JsProperty(name = "NEGATIVE_INFINITY")
    public native Number getNEGATIVE_INFINITY();
    @JsProperty(name = "NaN")
    public native Number getNaN();
    @JsProperty(name = "POSITIVE_INFINITY")
    public native Number getPOSITIVE_INFINITY();
    @JsProperty(name = "prototype")
    public native Number getPrototype();
    /** 
      * tsd/browser/lib.es6.d.ts@202670
      * Returns true if passed value is finite.
      * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
      * number. Only finite values of the type number, result in true.
     */
    public native Boolean isFinite(@DoNotAutobox Number number);
    /** 
      * tsd/browser/lib.es6.d.ts@202839
      * Returns true if the value passed is an integer, false otherwise.
     */
    public native Boolean isInteger(@DoNotAutobox Number number);
    /** 
      * tsd/browser/lib.es6.d.ts@203220
      * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
      * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
      * to a number. Only values of the type number, that are also NaN, result in true.
     */
    public native Boolean isNaN(@DoNotAutobox Number number);
    /** 
      * tsd/browser/lib.es6.d.ts@203373
      * Returns true if the value passed is a safe integer.
     */
    public native Boolean isSafeInteger(@DoNotAutobox Number number);
    /** 
      * tsd/browser/lib.es6.d.ts@204076
      * Converts a string to a floating-point number.
     */
    public native Number parseFloat(String string);
    public native Number parseInt(String string);
    /** 
      * tsd/browser/lib.es6.d.ts@204475
      * Converts A string to an integer.
     */
    public native Number parseInt(String string, @DoNotAutobox Number radix /* optional */);
    @JsProperty(name = "EPSILON")
    public native void setEPSILON(@DoNotAutobox Number value);
    @JsProperty(name = "MAX_SAFE_INTEGER")
    public native void setMAX_SAFE_INTEGER(@DoNotAutobox Number value);
    @JsProperty(name = "MAX_VALUE")
    public native void setMAX_VALUE(@DoNotAutobox Number value);
    @JsProperty(name = "MIN_SAFE_INTEGER")
    public native void setMIN_SAFE_INTEGER(@DoNotAutobox Number value);
    @JsProperty(name = "MIN_VALUE")
    public native void setMIN_VALUE(@DoNotAutobox Number value);
    @JsProperty(name = "NEGATIVE_INFINITY")
    public native void setNEGATIVE_INFINITY(@DoNotAutobox Number value);
    @JsProperty(name = "NaN")
    public native void setNaN(@DoNotAutobox Number value);
    @JsProperty(name = "POSITIVE_INFINITY")
    public native void setPOSITIVE_INFINITY(@DoNotAutobox Number value);
    @JsProperty(name = "prototype")
    public native void setPrototype(@DoNotAutobox Number value);
}
