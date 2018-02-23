package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RegExp
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 34788
  * declared in: tsd/browser/lib.es6.d.ts at pos 36569
  * declared in: tsd/browser/lib.es6.d.ts at pos 209564
  * declared in: tsd/browser/lib.es6.d.ts at pos 248650
  * source type: RegExp
  * flags: TypeParameter (16384)
  * declared in: tsd/browser/lib.es6.d.ts at pos 34788
  * declared in: tsd/browser/lib.es6.d.ts at pos 36569
  * declared in: tsd/browser/lib.es6.d.ts at pos 209564
  * declared in: tsd/browser/lib.es6.d.ts at pos 248650
  * 4 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RegExp")
public class RegExp
{

    /*
        Constructors
    */
    public RegExp (RegExp pattern) {
    } 
    public RegExp (String pattern, String flags /* optional */) {
    } 
    public RegExp (RegExp pattern, String flags /* optional */) {
    } 
    public RegExp (String pattern) {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="RegExp", name="$1")
    public static String $1;

    @JsProperty(namespace="RegExp", name="$2")
    public static String $2;

    @JsProperty(namespace="RegExp", name="$3")
    public static String $3;

    @JsProperty(namespace="RegExp", name="$4")
    public static String $4;

    @JsProperty(namespace="RegExp", name="$5")
    public static String $5;

    @JsProperty(namespace="RegExp", name="$6")
    public static String $6;

    @JsProperty(namespace="RegExp", name="$7")
    public static String $7;

    @JsProperty(namespace="RegExp", name="$8")
    public static String $8;

    @JsProperty(namespace="RegExp", name="$9")
    public static String $9;

    @JsProperty(namespace="RegExp", name="lastMatch")
    public static String lastMatch;

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:250731
     */
    @JsMethod(namespace="RegExp", name = "___at_species")
    public static native RegExpConstructor ___at_species();

    /*
        Properties
    */

    /** 
      * Returns a string indicating the flags of the regular expression in question. This field is read-only.
      * The characters in this string are sequenced and concatenated in the following order:
      * 
      *     - "g" for global
      *     - "i" for ignoreCase
      *     - "m" for multiline
      *     - "u" for unicode
      *     - "y" for sticky
      * 
      * If no flags are set, the value is the empty string.
     */
    public String flags;

    /** 
      * Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean global;

    /** 
      * Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean ignoreCase;

    public Number lastIndex;

    /** 
      * Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean multiline;

    /** 
      * Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. 
     */
    public String source;

    /** 
      * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
      * expression. Default is false. Read-only.
     */
    public Boolean sticky;

    /** 
      * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
      * expression. Default is false. Read-only.
     */
    public Boolean unicode;

    /*
        Methods
    */
    // skipped method ___at_match
    // skipped method ___at_replace
    // skipped method ___at_replace
    // skipped method ___at_search
    // skipped method ___at_split
    // skipped method ___at_split
    /** 
      * tsd/browser/lib.es6.d.ts@36108
     */
    public native RegExp compile();
    /** 
      * tsd/browser/lib.es6.d.ts@35054
      * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
     */
    public native RegExpExecArray exec(String string);
    @JsProperty(name = "flags")
    public native String getFlags();
    @JsProperty(name = "global")
    public native Boolean getGlobal();
    @JsProperty(name = "ignoreCase")
    public native Boolean getIgnoreCase();
    @JsProperty(name = "lastIndex")
    public native Number getLastIndex();
    @JsProperty(name = "multiline")
    public native Boolean getMultiline();
    @JsProperty(name = "source")
    public native String getSource();
    @JsProperty(name = "sticky")
    public native Boolean getSticky();
    @JsProperty(name = "unicode")
    public native Boolean getUnicode();
    @JsProperty(name = "flags")
    public native void setFlags(String value);
    @JsProperty(name = "global")
    public native void setGlobal(Boolean value);
    @JsProperty(name = "ignoreCase")
    public native void setIgnoreCase(Boolean value);
    @JsProperty(name = "lastIndex")
    public native void setLastIndex(@DoNotAutobox Number value);
    @JsProperty(name = "multiline")
    public native void setMultiline(Boolean value);
    @JsProperty(name = "source")
    public native void setSource(String value);
    @JsProperty(name = "sticky")
    public native void setSticky(Boolean value);
    @JsProperty(name = "unicode")
    public native void setUnicode(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@35284
      * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
     */
    public native Boolean test(String string);
}
