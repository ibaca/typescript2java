package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 400086
  * declared in: tsd/browser/lib.es6.d.ts at pos 405067
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLElement")
public class HTMLElement extends Element 
{

    /*
        Constructors
    */
    public HTMLElement () {
    } 

    /*
        Properties
    */

    public String accessKey;

    public Number childElementCount;

    public HTMLCollection children;

    public String contentEditable;

    public DOMStringMap dataset;

    public String dir;

    public Boolean draggable;

    public Element firstElementChild;

    public Boolean hidden;

    public Boolean hideFocus;

    public String innerText;

    public Boolean isContentEditable;

    public String lang;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Number offsetHeight;

    public Number offsetLeft;

    public Element offsetParent;

    public Number offsetTop;

    public Number offsetWidth;

    public Function1<UIEvent, Object> onabort;

    public Function1<UIEvent, Object> onactivate;

    public Function1<UIEvent, Object> onbeforeactivate;

    public Function1<ClipboardEvent, Object> onbeforecopy;

    public Function1<ClipboardEvent, Object> onbeforecut;

    public Function1<UIEvent, Object> onbeforedeactivate;

    public Function1<ClipboardEvent, Object> onbeforepaste;

    public Function1<FocusEvent, Object> onblur;

    public Function1<Event, Object> oncanplay;

    public Function1<Event, Object> oncanplaythrough;

    public Function1<Event, Object> onchange;

    public Function1<MouseEvent, Object> onclick;

    public Function1<PointerEvent, Object> oncontextmenu;

    public Function1<ClipboardEvent, Object> oncopy;

    public Function1<Event, Object> oncuechange;

    public Function1<ClipboardEvent, Object> oncut;

    public Function1<MouseEvent, Object> ondblclick;

    public Function1<UIEvent, Object> ondeactivate;

    public Function1<DragEvent, Object> ondrag;

    public Function1<DragEvent, Object> ondragend;

    public Function1<DragEvent, Object> ondragenter;

    public Function1<DragEvent, Object> ondragleave;

    public Function1<DragEvent, Object> ondragover;

    public Function1<DragEvent, Object> ondragstart;

    public Function1<DragEvent, Object> ondrop;

    public Function1<Event, Object> ondurationchange;

    public Function1<Event, Object> onemptied;

    public Function1<MediaStreamErrorEvent, Object> onended;

    public Function1<ErrorEvent, Object> onerror;

    public Function1<FocusEvent, Object> onfocus;

    public Function1<Event, Object> oninput;

    public Function1<Event, Object> oninvalid;

    public Function1<KeyboardEvent, Object> onkeydown;

    public Function1<KeyboardEvent, Object> onkeypress;

    public Function1<KeyboardEvent, Object> onkeyup;

    public Function1<Event, Object> onload;

    public Function1<Event, Object> onloadeddata;

    public Function1<Event, Object> onloadedmetadata;

    public Function1<Event, Object> onloadstart;

    public Function1<MouseEvent, Object> onmousedown;

    public Function1<MouseEvent, Object> onmouseenter;

    public Function1<MouseEvent, Object> onmouseleave;

    public Function1<MouseEvent, Object> onmousemove;

    public Function1<MouseEvent, Object> onmouseout;

    public Function1<MouseEvent, Object> onmouseover;

    public Function1<MouseEvent, Object> onmouseup;

    public Function1<WheelEvent, Object> onmousewheel;

    public Function1<UIEvent, Object> onmscontentzoom;

    public Function1<MSManipulationEvent, Object> onmsmanipulationstatechanged;

    public Function1<ClipboardEvent, Object> onpaste;

    public Function1<Event, Object> onpause;

    public Function1<Event, Object> onplay;

    public Function1<Event, Object> onplaying;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<ProgressEvent, Object> onprogress;

    public Function1<Event, Object> onratechange;

    public Function1<Event, Object> onreset;

    public Function1<UIEvent, Object> onscroll;

    public Function1<Event, Object> onseeked;

    public Function1<Event, Object> onseeking;

    public Function1<UIEvent, Object> onselect;

    public Function1<Event, Object> onselectstart;

    public Function1<Event, Object> onstalled;

    public Function1<Event, Object> onsubmit;

    public Function1<Event, Object> onsuspend;

    public Function1<Event, Object> ontimeupdate;

    public Function1<Event, Object> onvolumechange;

    public Function1<Event, Object> onwaiting;

    public Function1<WheelEvent, Object> onwheel;

    public String outerText;

    public Element previousElementSibling;

    public Boolean spellcheck;

    public CSSStyleDeclaration style;

    public Number tabIndex;

    public String title;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@404657
     */
    public native void blur();
    /** 
      * tsd/browser/lib.es6.d.ts@404675
     */
    public native void click();
    /** 
      * tsd/browser/lib.es6.d.ts@404694
     */
    public native Boolean dragDrop();
    /** 
      * tsd/browser/lib.es6.d.ts@404719
     */
    public native void focus();
    @JsProperty(name = "accessKey")
    public native String getAccessKey();
    @JsProperty(name = "contentEditable")
    public native String getContentEditable();
    @JsProperty(name = "dataset")
    public native DOMStringMap getDataset();
    @JsProperty(name = "dir")
    public native String getDir();
    @JsProperty(name = "draggable")
    public native Boolean getDraggable();
    @JsProperty(name = "hidden")
    public native Boolean getHidden();
    @JsProperty(name = "hideFocus")
    public native Boolean getHideFocus();
    @JsProperty(name = "innerText")
    public native String getInnerText();
    @JsProperty(name = "isContentEditable")
    public native Boolean getIsContentEditable();
    @JsProperty(name = "lang")
    public native String getLang();
    @JsProperty(name = "offsetHeight")
    public native Number getOffsetHeight();
    @JsProperty(name = "offsetLeft")
    public native Number getOffsetLeft();
    @JsProperty(name = "offsetParent")
    public native Element getOffsetParent();
    @JsProperty(name = "offsetTop")
    public native Number getOffsetTop();
    @JsProperty(name = "offsetWidth")
    public native Number getOffsetWidth();
    @JsProperty(name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();
    @JsProperty(name = "onactivate")
    public native Function1<UIEvent, Object> getOnactivate();
    @JsProperty(name = "onbeforeactivate")
    public native Function1<UIEvent, Object> getOnbeforeactivate();
    @JsProperty(name = "onbeforecopy")
    public native Function1<ClipboardEvent, Object> getOnbeforecopy();
    @JsProperty(name = "onbeforecut")
    public native Function1<ClipboardEvent, Object> getOnbeforecut();
    @JsProperty(name = "onbeforedeactivate")
    public native Function1<UIEvent, Object> getOnbeforedeactivate();
    @JsProperty(name = "onbeforepaste")
    public native Function1<ClipboardEvent, Object> getOnbeforepaste();
    @JsProperty(name = "onblur")
    public native Function1<FocusEvent, Object> getOnblur();
    @JsProperty(name = "oncanplay")
    public native Function1<Event, Object> getOncanplay();
    @JsProperty(name = "oncanplaythrough")
    public native Function1<Event, Object> getOncanplaythrough();
    @JsProperty(name = "onchange")
    public native Function1<Event, Object> getOnchange();
    @JsProperty(name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();
    @JsProperty(name = "oncontextmenu")
    public native Function1<PointerEvent, Object> getOncontextmenu();
    @JsProperty(name = "oncopy")
    public native Function1<ClipboardEvent, Object> getOncopy();
    @JsProperty(name = "oncuechange")
    public native Function1<Event, Object> getOncuechange();
    @JsProperty(name = "oncut")
    public native Function1<ClipboardEvent, Object> getOncut();
    @JsProperty(name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();
    @JsProperty(name = "ondeactivate")
    public native Function1<UIEvent, Object> getOndeactivate();
    @JsProperty(name = "ondrag")
    public native Function1<DragEvent, Object> getOndrag();
    @JsProperty(name = "ondragend")
    public native Function1<DragEvent, Object> getOndragend();
    @JsProperty(name = "ondragenter")
    public native Function1<DragEvent, Object> getOndragenter();
    @JsProperty(name = "ondragleave")
    public native Function1<DragEvent, Object> getOndragleave();
    @JsProperty(name = "ondragover")
    public native Function1<DragEvent, Object> getOndragover();
    @JsProperty(name = "ondragstart")
    public native Function1<DragEvent, Object> getOndragstart();
    @JsProperty(name = "ondrop")
    public native Function1<DragEvent, Object> getOndrop();
    @JsProperty(name = "ondurationchange")
    public native Function1<Event, Object> getOndurationchange();
    @JsProperty(name = "onemptied")
    public native Function1<Event, Object> getOnemptied();
    @JsProperty(name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();
    @JsProperty(name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();
    @JsProperty(name = "onfocus")
    public native Function1<FocusEvent, Object> getOnfocus();
    @JsProperty(name = "oninput")
    public native Function1<Event, Object> getOninput();
    @JsProperty(name = "oninvalid")
    public native Function1<Event, Object> getOninvalid();
    @JsProperty(name = "onkeydown")
    public native Function1<KeyboardEvent, Object> getOnkeydown();
    @JsProperty(name = "onkeypress")
    public native Function1<KeyboardEvent, Object> getOnkeypress();
    @JsProperty(name = "onkeyup")
    public native Function1<KeyboardEvent, Object> getOnkeyup();
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    @JsProperty(name = "onloadeddata")
    public native Function1<Event, Object> getOnloadeddata();
    @JsProperty(name = "onloadedmetadata")
    public native Function1<Event, Object> getOnloadedmetadata();
    @JsProperty(name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();
    @JsProperty(name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();
    @JsProperty(name = "onmouseenter")
    public native Function1<MouseEvent, Object> getOnmouseenter();
    @JsProperty(name = "onmouseleave")
    public native Function1<MouseEvent, Object> getOnmouseleave();
    @JsProperty(name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();
    @JsProperty(name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();
    @JsProperty(name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();
    @JsProperty(name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();
    @JsProperty(name = "onmousewheel")
    public native Function1<WheelEvent, Object> getOnmousewheel();
    @JsProperty(name = "onmscontentzoom")
    public native Function1<UIEvent, Object> getOnmscontentzoom();
    @JsProperty(name = "onmsmanipulationstatechanged")
    public native Function1<MSManipulationEvent, Object> getOnmsmanipulationstatechanged();
    @JsProperty(name = "onpaste")
    public native Function1<ClipboardEvent, Object> getOnpaste();
    @JsProperty(name = "onpause")
    public native Function1<Event, Object> getOnpause();
    @JsProperty(name = "onplay")
    public native Function1<Event, Object> getOnplay();
    @JsProperty(name = "onplaying")
    public native Function1<Event, Object> getOnplaying();
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    @JsProperty(name = "onratechange")
    public native Function1<Event, Object> getOnratechange();
    @JsProperty(name = "onreset")
    public native Function1<Event, Object> getOnreset();
    @JsProperty(name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();
    @JsProperty(name = "onseeked")
    public native Function1<Event, Object> getOnseeked();
    @JsProperty(name = "onseeking")
    public native Function1<Event, Object> getOnseeking();
    @JsProperty(name = "onselect")
    public native Function1<UIEvent, Object> getOnselect();
    @JsProperty(name = "onselectstart")
    public native Function1<Event, Object> getOnselectstart();
    @JsProperty(name = "onstalled")
    public native Function1<Event, Object> getOnstalled();
    @JsProperty(name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();
    @JsProperty(name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();
    @JsProperty(name = "ontimeupdate")
    public native Function1<Event, Object> getOntimeupdate();
    @JsProperty(name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();
    @JsProperty(name = "onwaiting")
    public native Function1<Event, Object> getOnwaiting();
    @JsProperty(name = "outerText")
    public native String getOuterText();
    @JsProperty(name = "spellcheck")
    public native Boolean getSpellcheck();
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "tabIndex")
    public native Number getTabIndex();
    @JsProperty(name = "title")
    public native String getTitle();
    /** 
      * tsd/browser/lib.es6.d.ts@404738
     */
    public native MSInputMethodContext msGetInputContext();
    @JsProperty(name = "accessKey")
    public native void setAccessKey(String value);
    @JsProperty(name = "contentEditable")
    public native void setContentEditable(String value);
    @JsProperty(name = "dataset")
    public native void setDataset(DOMStringMap value);
    @JsProperty(name = "dir")
    public native void setDir(String value);
    @JsProperty(name = "draggable")
    public native void setDraggable(Boolean value);
    @JsProperty(name = "hidden")
    public native void setHidden(Boolean value);
    @JsProperty(name = "hideFocus")
    public native void setHideFocus(Boolean value);
    @JsProperty(name = "innerText")
    public native void setInnerText(String value);
    @JsProperty(name = "isContentEditable")
    public native void setIsContentEditable(Boolean value);
    @JsProperty(name = "lang")
    public native void setLang(String value);
    @JsProperty(name = "offsetHeight")
    public native void setOffsetHeight(@DoNotAutobox Number value);
    @JsProperty(name = "offsetLeft")
    public native void setOffsetLeft(@DoNotAutobox Number value);
    @JsProperty(name = "offsetParent")
    public native void setOffsetParent(Element value);
    @JsProperty(name = "offsetTop")
    public native void setOffsetTop(@DoNotAutobox Number value);
    @JsProperty(name = "offsetWidth")
    public native void setOffsetWidth(@DoNotAutobox Number value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<UIEvent, Object> value);
    @JsProperty(name = "onactivate")
    public native void setOnactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "onbeforeactivate")
    public native void setOnbeforeactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "onbeforecopy")
    public native void setOnbeforecopy(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "onbeforecut")
    public native void setOnbeforecut(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "onbeforedeactivate")
    public native void setOnbeforedeactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "onbeforepaste")
    public native void setOnbeforepaste(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "onblur")
    public native void setOnblur(Function1<FocusEvent, Object> value);
    @JsProperty(name = "oncanplay")
    public native void setOncanplay(Function1<Event, Object> value);
    @JsProperty(name = "oncanplaythrough")
    public native void setOncanplaythrough(Function1<Event, Object> value);
    @JsProperty(name = "onchange")
    public native void setOnchange(Function1<Event, Object> value);
    @JsProperty(name = "onclick")
    public native void setOnclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "oncontextmenu")
    public native void setOncontextmenu(Function1<PointerEvent, Object> value);
    @JsProperty(name = "oncopy")
    public native void setOncopy(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "oncuechange")
    public native void setOncuechange(Function1<Event, Object> value);
    @JsProperty(name = "oncut")
    public native void setOncut(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "ondblclick")
    public native void setOndblclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "ondeactivate")
    public native void setOndeactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "ondrag")
    public native void setOndrag(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragend")
    public native void setOndragend(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragenter")
    public native void setOndragenter(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragleave")
    public native void setOndragleave(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragover")
    public native void setOndragover(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondragstart")
    public native void setOndragstart(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondrop")
    public native void setOndrop(Function1<DragEvent, Object> value);
    @JsProperty(name = "ondurationchange")
    public native void setOndurationchange(Function1<Event, Object> value);
    @JsProperty(name = "onemptied")
    public native void setOnemptied(Function1<Event, Object> value);
    @JsProperty(name = "onended")
    public native void setOnended(Function1<MediaStreamErrorEvent, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<ErrorEvent, Object> value);
    @JsProperty(name = "onfocus")
    public native void setOnfocus(Function1<FocusEvent, Object> value);
    @JsProperty(name = "oninput")
    public native void setOninput(Function1<Event, Object> value);
    @JsProperty(name = "oninvalid")
    public native void setOninvalid(Function1<Event, Object> value);
    @JsProperty(name = "onkeydown")
    public native void setOnkeydown(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onkeypress")
    public native void setOnkeypress(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onkeyup")
    public native void setOnkeyup(Function1<KeyboardEvent, Object> value);
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    @JsProperty(name = "onloadeddata")
    public native void setOnloadeddata(Function1<Event, Object> value);
    @JsProperty(name = "onloadedmetadata")
    public native void setOnloadedmetadata(Function1<Event, Object> value);
    @JsProperty(name = "onloadstart")
    public native void setOnloadstart(Function1<Event, Object> value);
    @JsProperty(name = "onmousedown")
    public native void setOnmousedown(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseenter")
    public native void setOnmouseenter(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseleave")
    public native void setOnmouseleave(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmousemove")
    public native void setOnmousemove(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseout")
    public native void setOnmouseout(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseover")
    public native void setOnmouseover(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseup")
    public native void setOnmouseup(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmousewheel")
    public native void setOnmousewheel(Function1<WheelEvent, Object> value);
    @JsProperty(name = "onmscontentzoom")
    public native void setOnmscontentzoom(Function1<UIEvent, Object> value);
    @JsProperty(name = "onmsmanipulationstatechanged")
    public native void setOnmsmanipulationstatechanged(Function1<MSManipulationEvent, Object> value);
    @JsProperty(name = "onpaste")
    public native void setOnpaste(Function1<ClipboardEvent, Object> value);
    @JsProperty(name = "onpause")
    public native void setOnpause(Function1<Event, Object> value);
    @JsProperty(name = "onplay")
    public native void setOnplay(Function1<Event, Object> value);
    @JsProperty(name = "onplaying")
    public native void setOnplaying(Function1<Event, Object> value);
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "onratechange")
    public native void setOnratechange(Function1<Event, Object> value);
    @JsProperty(name = "onreset")
    public native void setOnreset(Function1<Event, Object> value);
    @JsProperty(name = "onscroll")
    public native void setOnscroll(Function1<UIEvent, Object> value);
    @JsProperty(name = "onseeked")
    public native void setOnseeked(Function1<Event, Object> value);
    @JsProperty(name = "onseeking")
    public native void setOnseeking(Function1<Event, Object> value);
    @JsProperty(name = "onselect")
    public native void setOnselect(Function1<UIEvent, Object> value);
    @JsProperty(name = "onselectstart")
    public native void setOnselectstart(Function1<Event, Object> value);
    @JsProperty(name = "onstalled")
    public native void setOnstalled(Function1<Event, Object> value);
    @JsProperty(name = "onsubmit")
    public native void setOnsubmit(Function1<Event, Object> value);
    @JsProperty(name = "onsuspend")
    public native void setOnsuspend(Function1<Event, Object> value);
    @JsProperty(name = "ontimeupdate")
    public native void setOntimeupdate(Function1<Event, Object> value);
    @JsProperty(name = "onvolumechange")
    public native void setOnvolumechange(Function1<Event, Object> value);
    @JsProperty(name = "onwaiting")
    public native void setOnwaiting(Function1<Event, Object> value);
    @JsProperty(name = "outerText")
    public native void setOuterText(String value);
    @JsProperty(name = "spellcheck")
    public native void setSpellcheck(Boolean value);
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
    @JsProperty(name = "tabIndex")
    public native void setTabIndex(@DoNotAutobox Number value);
    @JsProperty(name = "title")
    public native void setTitle(String value);
}
