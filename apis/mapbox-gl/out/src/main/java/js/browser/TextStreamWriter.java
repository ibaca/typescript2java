package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextStreamWriter
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 777097

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextStreamWriter implements TextStreamBase 
{

    /*
        Properties
    */

    /** 
      * The column number of the current character position in an input stream.
     */
    public Number Column;

    /** 
      * The current line number in an input stream.
     */
    public Number Line;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@777081
      * Closes a text stream.
      * It is not necessary to close standard streams; they close automatically when the process ends. If 
      * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    public native void Close();
    /** 
      * tsd/browser/lib.es6.d.ts@777214
      * Sends a string to an output stream.
     */
    public native void Write(String s);
    /** 
      * tsd/browser/lib.es6.d.ts@777348
      * Sends a specified number of blank lines (newline characters) to an output stream.
     */
    public native void WriteBlankLines(@DoNotAutobox Number intLines);
    /** 
      * tsd/browser/lib.es6.d.ts@777485
      * Sends a string followed by a newline character to an output stream.
     */
    public native void WriteLine(String s);
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Column")
    public native Number getColumn();
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Line")
    public native Number getLine();
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Column")
    public native void setColumn(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.TextStreamBase)
      * inherited from (js.browser.TextStreamBase)
     */
    @JsProperty(name = "Line")
    public native void setLine(@DoNotAutobox Number value);
}
