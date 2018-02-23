package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextStreamReader
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 777514

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextStreamReader implements TextStreamBase 
{

    /*
        Properties
    */

    /** 
      * Indicates whether the stream pointer position is at the end of a line.
     */
    public Boolean AtEndOfLine;

    /** 
      * Indicates whether the stream pointer position is at the end of a stream.
     */
    public Boolean AtEndOfStream;

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
      * tsd/browser/lib.es6.d.ts@777854
      * Returns a specified number of characters from an input stream, starting at the current pointer position.
      * Does not return until the ENTER key is pressed.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String Read(@DoNotAutobox Number characters);
    /** 
      * tsd/browser/lib.es6.d.ts@778060
      * Returns all characters from an input stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String ReadAll();
    /** 
      * tsd/browser/lib.es6.d.ts@778354
      * Returns an entire line from an input stream.
      * Although this method extracts the newline character, it does not add it to the returned string.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String ReadLine();
    /** 
      * tsd/browser/lib.es6.d.ts@778690
      * Skips a specified number of characters when reading from an input text stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native void Skip(@DoNotAutobox Number characters);
    /** 
      * tsd/browser/lib.es6.d.ts@778894
      * Skips the next line when reading from an input text stream.
      * Can only be used on a stream in reading mode, not writing or appending mode.
     */
    public native void SkipLine();
    @JsProperty(name = "AtEndOfLine")
    public native Boolean getAtEndOfLine();
    @JsProperty(name = "AtEndOfStream")
    public native Boolean getAtEndOfStream();
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
    @JsProperty(name = "AtEndOfLine")
    public native void setAtEndOfLine(Boolean value);
    @JsProperty(name = "AtEndOfStream")
    public native void setAtEndOfStream(Boolean value);
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
