package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import js.intl.DateTimeFormatOptions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: Date
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 25093
  * declared in: tsd/browser/lib.es6.d.ts at pos 34580
  * declared in: tsd/browser/lib.es6.d.ts at pos 193247
  * declared in: tsd/browser/lib.es6.d.ts at pos 246831
  * declared in: tsd/browser/lib.es6.d.ts at pos 784435
  * 11 constructors
  * Enables basic storage and retrieval of dates and times. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Date")
public class Date
{

    /*
        Constructors
    */
    public Date () {
    } 
    public Date (@DoNotAutobox Number value) {
    } 
    public Date (String value) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */, @DoNotAutobox Number ms /* optional */) {
    } 
    public Date (Date value) {
    } 
    public Date (VarDate vd) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */) {
    } 
    public Date (@DoNotAutobox Number year, @DoNotAutobox Number month) {
    } 

    /*
        Static methods
    */

    /** 
      * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
      * source : tsd/browser/lib.es6.d.ts:33482
     */
    @JsMethod(namespace="Date", name = "parse")
    public static native Number parse(String s);

    /** 
      * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
      * source : tsd/browser/lib.es6.d.ts:34423
     */
    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */, @DoNotAutobox Number ms /* optional */);

    /** 
      * source : tsd/browser/lib.es6.d.ts:34549
     */
    @JsMethod(namespace="Date", name = "now")
    public static native Number now();

    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */, @DoNotAutobox Number seconds /* optional */);

    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */, @DoNotAutobox Number minutes /* optional */);

    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */, @DoNotAutobox Number hours /* optional */);

    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month, @DoNotAutobox Number date /* optional */);

    @JsMethod(namespace="Date", name = "UTC")
    public static native Number UTC(@DoNotAutobox Number year, @DoNotAutobox Number month);

    /*
        Methods
    */
    // skipped method ___at_toPrimitive
    /** 
      * tsd/browser/lib.es6.d.ts@26433
      * Gets the day-of-the-month, using local time. 
     */
    public native Number getDate();
    /** 
      * tsd/browser/lib.es6.d.ts@26615
      * Gets the day of the week, using local time. 
     */
    public native Number getDay();
    /** 
      * tsd/browser/lib.es6.d.ts@26076
      * Gets the year, using local time. 
     */
    public native Number getFullYear();
    /** 
      * tsd/browser/lib.es6.d.ts@26793
      * Gets the hours in a date, using local time. 
     */
    public native Number getHours();
    /** 
      * tsd/browser/lib.es6.d.ts@27403
      * Gets the milliseconds of a Date, using local time. 
     */
    public native Number getMilliseconds();
    /** 
      * tsd/browser/lib.es6.d.ts@26997
      * Gets the minutes of a Date object, using local time. 
     */
    public native Number getMinutes();
    /** 
      * tsd/browser/lib.es6.d.ts@26243
      * Gets the month, using local time. 
     */
    public native Number getMonth();
    /** 
      * tsd/browser/lib.es6.d.ts@27201
      * Gets the seconds of a Date object, using local time. 
     */
    public native Number getSeconds();
    /** 
      * tsd/browser/lib.es6.d.ts@26009
      * Gets the time value in milliseconds. 
     */
    public native Number getTime();
    /** 
      * tsd/browser/lib.es6.d.ts@27677
      * Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). 
     */
    public native Number getTimezoneOffset();
    /** 
      * tsd/browser/lib.es6.d.ts@26534
      * Gets the day-of-the-month, using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCDate();
    /** 
      * tsd/browser/lib.es6.d.ts@26713
      * Gets the day of the week using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCDay();
    /** 
      * tsd/browser/lib.es6.d.ts@26168
      * Gets the year using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCFullYear();
    /** 
      * tsd/browser/lib.es6.d.ts@26906
      * Gets the hours value in a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCHours();
    /** 
      * tsd/browser/lib.es6.d.ts@27524
      * Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMilliseconds();
    /** 
      * tsd/browser/lib.es6.d.ts@27108
      * Gets the minutes of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMinutes();
    /** 
      * tsd/browser/lib.es6.d.ts@26350
      * Gets the month of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCMonth();
    /** 
      * tsd/browser/lib.es6.d.ts@27312
      * Gets the seconds of a Date object using Universal Coordinated Time (UTC). 
     */
    public native Number getUTCSeconds();
    /** 
      * tsd/browser/lib.es6.d.ts@784470
     */
    public native VarDate getVarDate();
    /** 
      * tsd/browser/lib.es6.d.ts@30651
      * Sets the numeric day-of-the-month value of the Date object using local time.
     */
    public native Number setDate(@DoNotAutobox Number date);
    public native Number setFullYear(@DoNotAutobox Number year);
    public native Number setFullYear(@DoNotAutobox Number year, @DoNotAutobox Number month /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@32102
      * Sets the year of the Date object using local time.
     */
    public native Number setFullYear(@DoNotAutobox Number year, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number date /* optional */);
    public native Number setHours(@DoNotAutobox Number hours);
    public native Number setHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */);
    public native Number setHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */, @DoNotAutobox Number sec /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@29962
      * Sets the hour value in the Date object using local time.
     */
    public native Number setHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */, @DoNotAutobox Number sec /* optional */, @DoNotAutobox Number ms /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@28096
      * Sets the milliseconds value in the Date object using local time.
     */
    public native Number setMilliseconds(@DoNotAutobox Number ms);
    public native Number setMinutes(@DoNotAutobox Number min);
    public native Number setMinutes(@DoNotAutobox Number min, @DoNotAutobox Number sec /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@29193
      * Sets the minutes value in the Date object using local time.
     */
    public native Number setMinutes(@DoNotAutobox Number min, @DoNotAutobox Number sec /* optional */, @DoNotAutobox Number ms /* optional */);
    public native Number setMonth(@DoNotAutobox Number month);
    /** 
      * tsd/browser/lib.es6.d.ts@31277
      * Sets the month value in the Date object using local time.
     */
    public native Number setMonth(@DoNotAutobox Number month, @DoNotAutobox Number date /* optional */);
    public native Number setSeconds(@DoNotAutobox Number sec);
    /** 
      * tsd/browser/lib.es6.d.ts@28575
      * Sets the seconds value in the Date object using local time.
     */
    public native Number setSeconds(@DoNotAutobox Number sec, @DoNotAutobox Number ms /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@27905
      * Sets the date and time value in the Date object.
     */
    public native Number setTime(@DoNotAutobox Number time);
    /** 
      * tsd/browser/lib.es6.d.ts@30871
      * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCDate(@DoNotAutobox Number date);
    public native Number setUTCFullYear(@DoNotAutobox Number year);
    public native Number setUTCFullYear(@DoNotAutobox Number year, @DoNotAutobox Number month /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@32569
      * Sets the year value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCFullYear(@DoNotAutobox Number year, @DoNotAutobox Number month /* optional */, @DoNotAutobox Number date /* optional */);
    public native Number setUTCHours(@DoNotAutobox Number hours);
    public native Number setUTCHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */);
    public native Number setUTCHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */, @DoNotAutobox Number sec /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@30401
      * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCHours(@DoNotAutobox Number hours, @DoNotAutobox Number min /* optional */, @DoNotAutobox Number sec /* optional */, @DoNotAutobox Number ms /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@28315
      * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMilliseconds(@DoNotAutobox Number ms);
    public native Number setUTCMinutes(@DoNotAutobox Number min);
    public native Number setUTCMinutes(@DoNotAutobox Number min, @DoNotAutobox Number sec /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@29557
      * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMinutes(@DoNotAutobox Number min, @DoNotAutobox Number sec /* optional */, @DoNotAutobox Number ms /* optional */);
    public native Number setUTCMonth(@DoNotAutobox Number month);
    /** 
      * tsd/browser/lib.es6.d.ts@31714
      * Sets the month value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCMonth(@DoNotAutobox Number month, @DoNotAutobox Number date /* optional */);
    public native Number setUTCSeconds(@DoNotAutobox Number sec);
    /** 
      * tsd/browser/lib.es6.d.ts@28862
      * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
     */
    public native Number setUTCSeconds(@DoNotAutobox Number sec, @DoNotAutobox Number ms /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@25350
      * Returns a date as a string value. 
     */
    public native String toDateString();
    /** 
      * tsd/browser/lib.es6.d.ts@32816
      * Returns a date as a string value in ISO format. 
     */
    public native String toISOString();
    public native String toJSON();
    /** 
      * tsd/browser/lib.es6.d.ts@32990
      * Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. 
     */
    public native String toJSON(Object key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@25678
      * Returns a date as a string value appropriate to the host environment's current locale. 
      * Converts a date to a string by using the current or specified locale.
     */
    public native String toLocaleDateString();
    public native String toLocaleDateString(String locales /* optional */);
    public native String toLocaleDateString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleDateString(Array<String> locales /* optional */);
    public native String toLocaleDateString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleDateString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@194436
      * Returns a date as a string value appropriate to the host environment's current locale. 
      * Converts a date to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleDateString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@25550
      * Returns a value as a string value appropriate to the host environment's current locale. 
      * Converts a date and time to a string by using the current or specified locale.
     */
    public native String toLocaleString();
    public native String toLocaleString(String locales /* optional */);
    public native String toLocaleString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleString(Array<String> locales /* optional */);
    public native String toLocaleString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@193810
      * Returns a value as a string value appropriate to the host environment's current locale. 
      * Converts a date and time to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@25810
      * Returns a time as a string value appropriate to the host environment's current locale. 
      * Converts a time to a string by using the current or specified locale.
     */
    public native String toLocaleTimeString();
    public native String toLocaleTimeString(String locales /* optional */);
    public native String toLocaleTimeString(String locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleTimeString(Array<String> locales /* optional */);
    public native String toLocaleTimeString(Array<String> locales /* optional */, DateTimeFormatOptions options /* optional */);
    public native String toLocaleTimeString(UnionOfArrayOfStringAndString locales /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@195067
      * Returns a time as a string value appropriate to the host environment's current locale. 
      * Converts a time to a string by using the current or specified locale.
      * VERSION 1
     */
    public native String toLocaleTimeString(UnionOfArrayOfStringAndString locales /* optional */, DateTimeFormatOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@25423
      * Returns a time as a string value. 
     */
    public native String toTimeString();
    /** 
      * tsd/browser/lib.es6.d.ts@32730
      * Returns a date converted to a string using Universal Coordinated Time (UTC). 
     */
    public native String toUTCString();
    /** 
      * tsd/browser/lib.es6.d.ts@25938
      * Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC. 
     */
    public native Number valueOf();
}
