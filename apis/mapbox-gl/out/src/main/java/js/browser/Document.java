package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Document
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 329758
  * declared in: tsd/browser/lib.es6.d.ts at pos 363320
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Document")
public class Document extends Node  implements GlobalEventHandlers, NodeSelector, DocumentEvent, ParentNode, DocumentOrShadowRoot 
{

    /*
        Constructors
    */
    public Document () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or gets the URL for the current document. 
     */
    public String URL;

    /** 
      * Gets the URL for the document, stripped of any character encoding.
     */
    public String URLUnencoded;

    public Element activeElement;

    /** 
      * Sets or gets the color of all active links in the document.
     */
    public String alinkColor;

    /** 
      * Returns a reference to the collection of elements contained by the object.
     */
    public HTMLAllCollection all;

    /** 
      * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
     */
    public HTMLCollectionOf<HTMLAnchorElement> anchors;

    /** 
      * Retrieves a collection of all applet objects in the document.
     */
    public HTMLCollectionOf<HTMLAppletElement> applets;

    /** 
      * Deprecated. Sets or retrieves a value that indicates the background color behind the object. 
     */
    public String bgColor;

    /** 
      * Specifies the beginning and end of the document body.
     */
    public HTMLElement body;

    public String characterSet;

    /** 
      * Gets or sets the character set used to encode the object.
     */
    public String charset;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Gets a value that indicates whether standards-compliant mode is switched on for the object.
     */
    public String compatMode;

    public String cookie;

    public UnionOfHTMLScriptElementAndSVGScriptElement currentScript;

    public Window defaultView;

    /** 
      * Sets or gets a value that indicates whether the document can be edited.
     */
    public String designMode;

    /** 
      * Sets or retrieves a value that indicates the reading order of the object. 
     */
    public String dir;

    /** 
      * Gets an object representing the document type declaration associated with the current document. 
     */
    public DocumentType doctype;

    /** 
      * Gets a reference to the root node of the document. 
     */
    public HTMLElement documentElement;

    /** 
      * Sets or gets the security domain of the document. 
     */
    public String domain;

    /** 
      * Retrieves a collection of all embed objects in the document.
     */
    public HTMLCollectionOf<HTMLEmbedElement> embeds;

    /** 
      * Sets or gets the foreground (text) color of the document.
     */
    public String fgColor;

    public Element firstElementChild;

    /** 
      * Retrieves a collection, in source order, of all form objects in the document.
     */
    public HTMLCollectionOf<HTMLFormElement> forms;

    public Element fullscreenElement;

    public Boolean fullscreenEnabled;

    public HTMLHeadElement head;

    public Boolean hidden;

    /** 
      * Retrieves a collection, in source order, of img objects in the document.
     */
    public HTMLCollectionOf<HTMLImageElement> images;

    /** 
      * Gets the implementation object of the current document. 
     */
    public DOMImplementation implementation;

    /** 
      * Returns the character encoding used to create the webpage that is loaded into the document object.
     */
    public String inputEncoding;

    public Element lastElementChild;

    /** 
      * Gets the date that the page was last modified, if the page supplies one. 
     */
    public String lastModified;

    /** 
      * Sets or gets the color of the document links. 
     */
    public String linkColor;

    /** 
      * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
     */
    public HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> links;

    /** 
      * Contains information about the current URL. 
     */
    public Location location;

    public Boolean msCSSOMElementFloatMetrics;

    public Boolean msCapsLockWarningOff;

    /** 
      * Fires when the user aborts the download.
     */
    public Function1<UIEvent, Object> onabort;

    /** 
      * Fires when the object is set as the active element.
     */
    public Function1<UIEvent, Object> onactivate;

    /** 
      * Fires immediately before the object is set as the active element.
     */
    public Function1<UIEvent, Object> onbeforeactivate;

    /** 
      * Fires immediately before the activeElement is changed from the current object to another object in the parent document.
     */
    public Function1<UIEvent, Object> onbeforedeactivate;

    /** 
      * Fires when the object loses the input focus. 
     */
    public Function1<FocusEvent, Object> onblur;

    /** 
      * Occurs when playback is possible, but would require further buffering. 
     */
    public Function1<Event, Object> oncanplay;

    public Function1<Event, Object> oncanplaythrough;

    /** 
      * Fires when the contents of the object or selection have changed. 
     */
    public Function1<Event, Object> onchange;

    /** 
      * Fires when the user clicks the left mouse button on the object
     */
    public Function1<MouseEvent, Object> onclick;

    /** 
      * Fires when the user clicks the right mouse button in the client area, opening the context menu. 
     */
    public Function1<PointerEvent, Object> oncontextmenu;

    /** 
      * Fires when the user double-clicks the object.
     */
    public Function1<MouseEvent, Object> ondblclick;

    /** 
      * Fires when the activeElement is changed from the current object to another object in the parent document.
     */
    public Function1<UIEvent, Object> ondeactivate;

    /** 
      * Fires on the source object continuously during a drag operation.
     */
    public Function1<DragEvent, Object> ondrag;

    /** 
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
     */
    public Function1<DragEvent, Object> ondragend;

    /** 
      * Fires on the target element when the user drags the object to a valid drop target.
     */
    public Function1<DragEvent, Object> ondragenter;

    /** 
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     */
    public Function1<DragEvent, Object> ondragleave;

    /** 
      * Fires on the target element continuously while the user drags the object over a valid drop target.
     */
    public Function1<DragEvent, Object> ondragover;

    /** 
      * Fires on the source object when the user starts to drag a text selection or selected object. 
     */
    public Function1<DragEvent, Object> ondragstart;

    public Function1<DragEvent, Object> ondrop;

    /** 
      * Occurs when the duration attribute is updated. 
     */
    public Function1<Event, Object> ondurationchange;

    /** 
      * Occurs when the media element is reset to its initial state. 
     */
    public Function1<Event, Object> onemptied;

    /** 
      * Occurs when the end of playback is reached. 
     */
    public Function1<MediaStreamErrorEvent, Object> onended;

    /** 
      * Fires when an error occurs during object loading.
     */
    public Function1<ErrorEvent, Object> onerror;

    /** 
      * Fires when the object receives focus. 
     */
    public Function1<FocusEvent, Object> onfocus;

    public Function1<Event, Object> onfullscreenchange;

    public Function1<Event, Object> onfullscreenerror;

    public Function1<Event, Object> oninput;

    public Function1<Event, Object> oninvalid;

    /** 
      * Fires when the user presses a key.
     */
    public Function1<KeyboardEvent, Object> onkeydown;

    /** 
      * Fires when the user presses an alphanumeric key.
     */
    public Function1<KeyboardEvent, Object> onkeypress;

    /** 
      * Fires when the user releases a key.
     */
    public Function1<KeyboardEvent, Object> onkeyup;

    /** 
      * Fires immediately after the browser loads the object. 
     */
    public Function1<Event, Object> onload;

    /** 
      * Occurs when media data is loaded at the current playback position. 
     */
    public Function1<Event, Object> onloadeddata;

    /** 
      * Occurs when the duration and dimensions of the media have been determined.
     */
    public Function1<Event, Object> onloadedmetadata;

    /** 
      * Occurs when Internet Explorer begins looking for media data. 
     */
    public Function1<Event, Object> onloadstart;

    /** 
      * Fires when the user clicks the object with either mouse button. 
     */
    public Function1<MouseEvent, Object> onmousedown;

    /** 
      * Fires when the user moves the mouse over the object. 
     */
    public Function1<MouseEvent, Object> onmousemove;

    /** 
      * Fires when the user moves the mouse pointer outside the boundaries of the object. 
     */
    public Function1<MouseEvent, Object> onmouseout;

    /** 
      * Fires when the user moves the mouse pointer into the object.
     */
    public Function1<MouseEvent, Object> onmouseover;

    /** 
      * Fires when the user releases a mouse button while the mouse is over the object. 
     */
    public Function1<MouseEvent, Object> onmouseup;

    /** 
      * Fires when the wheel button is rotated. 
     */
    public Function1<WheelEvent, Object> onmousewheel;

    public Function1<UIEvent, Object> onmscontentzoom;

    public Function1<MSGestureEvent, Object> onmsgesturechange;

    public Function1<MSGestureEvent, Object> onmsgesturedoubletap;

    public Function1<MSGestureEvent, Object> onmsgestureend;

    public Function1<MSGestureEvent, Object> onmsgesturehold;

    public Function1<MSGestureEvent, Object> onmsgesturestart;

    public Function1<MSGestureEvent, Object> onmsgesturetap;

    public Function1<MSGestureEvent, Object> onmsinertiastart;

    public Function1<MSManipulationEvent, Object> onmsmanipulationstatechanged;

    public Function1<MSPointerEvent, Object> onmspointercancel;

    public Function1<MSPointerEvent, Object> onmspointerdown;

    public Function1<MSPointerEvent, Object> onmspointerenter;

    public Function1<MSPointerEvent, Object> onmspointerleave;

    public Function1<MSPointerEvent, Object> onmspointermove;

    public Function1<MSPointerEvent, Object> onmspointerout;

    public Function1<MSPointerEvent, Object> onmspointerover;

    public Function1<MSPointerEvent, Object> onmspointerup;

    /** 
      * Occurs when an item is removed from a Jump List of a webpage running in Site Mode. 
     */
    public Function1<MSSiteModeEvent, Object> onmssitemodejumplistitemremoved;

    /** 
      * Occurs when a user clicks a button in a Thumbnail Toolbar of a webpage running in Site Mode.
     */
    public Function1<MSSiteModeEvent, Object> onmsthumbnailclick;

    /** 
      * Occurs when playback is paused.
     */
    public Function1<Event, Object> onpause;

    /** 
      * Occurs when the play method is requested. 
     */
    public Function1<Event, Object> onplay;

    /** 
      * Occurs when the audio or video has started playing. 
     */
    public Function1<Event, Object> onplaying;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<Event, Object> onpointerlockchange;

    public Function1<Event, Object> onpointerlockerror;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    /** 
      * Occurs to indicate progress while downloading media data. 
     */
    public Function1<ProgressEvent, Object> onprogress;

    /** 
      * Occurs when the playback rate is increased or decreased. 
     */
    public Function1<Event, Object> onratechange;

    /** 
      * Fires when the state of the object has changed.
     */
    public Function1<Event, Object> onreadystatechange;

    /** 
      * Fires when the user resets a form. 
     */
    public Function1<Event, Object> onreset;

    /** 
      * Fires when the user repositions the scroll box in the scroll bar on the object. 
     */
    public Function1<UIEvent, Object> onscroll;

    /** 
      * Occurs when the seek operation ends. 
     */
    public Function1<Event, Object> onseeked;

    /** 
      * Occurs when the current playback position is moved. 
     */
    public Function1<Event, Object> onseeking;

    /** 
      * Fires when the current selection changes.
     */
    public Function1<UIEvent, Object> onselect;

    /** 
      * Fires when the selection state of a document changes.
     */
    public Function1<Event, Object> onselectionchange;

    public Function1<Event, Object> onselectstart;

    /** 
      * Occurs when the download has stopped. 
     */
    public Function1<Event, Object> onstalled;

    /** 
      * Fires when the user clicks the Stop button or leaves the Web page.
     */
    public Function1<Event, Object> onstop;

    public Function1<Event, Object> onsubmit;

    /** 
      * Occurs if the load operation has been intentionally halted. 
     */
    public Function1<Event, Object> onsuspend;

    /** 
      * Occurs to indicate the current playback position.
     */
    public Function1<Event, Object> ontimeupdate;

    public Function1<TouchEvent, Object> ontouchcancel;

    public Function1<TouchEvent, Object> ontouchend;

    public Function1<TouchEvent, Object> ontouchmove;

    public Function1<TouchEvent, Object> ontouchstart;

    /** 
      * Occurs when the volume is changed, or playback is muted or unmuted.
     */
    public Function1<Event, Object> onvolumechange;

    /** 
      * Occurs when playback stops because the next frame of a video resource is not available. 
     */
    public Function1<Event, Object> onwaiting;

    public Function1<Event, Object> onwebkitfullscreenchange;

    public Function1<Event, Object> onwebkitfullscreenerror;

    public Function1<WheelEvent, Object> onwheel;

    public HTMLCollectionOf<HTMLEmbedElement> plugins;

    public Element pointerLockElement;

    /** 
      * Retrieves a value that indicates the current state of the object.
     */
    public String readyState;

    /** 
      * Gets the URL of the location that referred the user to the current page.
     */
    public String referrer;

    /** 
      * Gets the root svg element in the document hierarchy.
     */
    public SVGSVGElement rootElement;

    /** 
      * Retrieves a collection of all script objects in the document.
     */
    public HTMLCollectionOf<HTMLScriptElement> scripts;

    public Element scrollingElement;

    /** 
      * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
     */
    public StyleSheetList styleSheets;

    public StyleSheetList stylesheets;

    /** 
      * Contains the title of the document.
     */
    public String title;

    public String visibilityState;

    /** 
      * Sets or gets the color of the links that the user has visited.
     */
    public String vlinkColor;

    public Element webkitCurrentFullScreenElement;

    public Element webkitFullscreenElement;

    public Boolean webkitFullscreenEnabled;

    public Boolean webkitIsFullScreen;

    public String xmlEncoding;

    public Boolean xmlStandalone;

    /** 
      * Gets or sets the version attribute specified in the declaration of an XML document.
     */
    public String xmlVersion;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@346776
     */
    public native Node adoptNode(Node source);
    /** 
      * tsd/browser/lib.es6.d.ts@346811
     */
    public native void captureEvents();
    /** 
      * tsd/browser/lib.es6.d.ts@346838
     */
    public native Range caretRangeFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@346892
     */
    public native void clear();
    /** 
      * tsd/browser/lib.es6.d.ts@346997
      * Closes an output stream and forces the sent data to display.
     */
    public native void close();
    /** 
      * tsd/browser/lib.es6.d.ts@347158
      * Creates an attribute object with a specified name.
     */
    public native Attr createAttribute(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@347199
     */
    public native Attr createAttributeNS(String namespaceURI, String qualifiedName);
    /** 
      * tsd/browser/lib.es6.d.ts@347280
     */
    public native CDATASection createCDATASection(String data);
    /** 
      * tsd/browser/lib.es6.d.ts@347459
      * Creates a comment object with the specified data.
     */
    public native Comment createComment(String data);
    /** 
      * tsd/browser/lib.es6.d.ts@347550
      * Creates a new document.
     */
    public native DocumentFragment createDocumentFragment();
    /** 
      * tsd/browser/lib.es6.d.ts@347824
      * Creates an instance of the element for the specified tag.
     */
    public native HTMLElement createElement(String tagName);
    /** 
      * tsd/browser/lib.es6.d.ts@347873
     */
    public native HTMLElement createElementNS(String namespaceURI, String qualifiedName);
    /** 
      * tsd/browser/lib.es6.d.ts@724123
      * inherited from (js.browser.DocumentEvent)
      * inherited from (js.browser.DocumentEvent)
     */
    public native AnimationEvent createEvent(String eventInterface);
    /** 
      * tsd/browser/lib.es6.d.ts@354991
     */
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    /** 
      * tsd/browser/lib.es6.d.ts@355077
     */
    public native XPathNSResolver createNSResolver(Node nodeResolver);
    public native NodeIterator createNodeIterator(Node root);
    public native NodeIterator createNodeIterator(Node root, @DoNotAutobox Number whatToShow /* optional */);
    public native NodeIterator createNodeIterator(Node root, @DoNotAutobox Number whatToShow /* optional */, NodeFilter filter /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@355648
      * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document. 
     */
    public native NodeIterator createNodeIterator(Node root, @DoNotAutobox Number whatToShow /* optional */, NodeFilter filter /* optional */, Boolean entityReferenceExpansion /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@355776
     */
    public native ProcessingInstruction createProcessingInstruction(String target, String data);
    /** 
      * tsd/browser/lib.es6.d.ts@356001
      * Returns an empty range object that has both of its boundary points positioned at the beginning of the document. 
     */
    public native Range createRange();
    /** 
      * tsd/browser/lib.es6.d.ts@356184
      * Creates a text string from the specified value. 
     */
    public native Text createTextNode(String data);
    /** 
      * tsd/browser/lib.es6.d.ts@356224
     */
    public native Touch createTouch(Window view, EventTarget target, @DoNotAutobox Number identifier, @DoNotAutobox Number pageX, @DoNotAutobox Number pageY, @DoNotAutobox Number screenX, @DoNotAutobox Number screenY);
    public native TouchList createTouchList();
    /** 
      * tsd/browser/lib.es6.d.ts@356367
     */
    public native TouchList createTouchList(Touch...  touches);
    public native TreeWalker createTreeWalker(Node root);
    public native TreeWalker createTreeWalker(Node root, @DoNotAutobox Number whatToShow /* optional */);
    public native TreeWalker createTreeWalker(Node root, @DoNotAutobox Number whatToShow /* optional */, NodeFilter filter /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@356910
      * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
     */
    public native TreeWalker createTreeWalker(Node root, @DoNotAutobox Number whatToShow /* optional */, NodeFilter filter /* optional */, Boolean entityReferenceExpansion /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@743655
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Element elementFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@743715
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Array<Element> elementsFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@357256
     */
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, @DoNotAutobox Number type, XPathResult result);
    public native Boolean execCommand(String commandId);
    public native Boolean execCommand(String commandId, Boolean showUI /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@357767
      * Executes a command on the current document, current selection, or the given range.
     */
    public native Boolean execCommand(String commandId, Boolean showUI /* optional */, Object value /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@358013
      * Displays help information for the given command identifier.
     */
    public native Boolean execCommandShowHelp(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@358066
     */
    public native void exitFullscreen();
    /** 
      * tsd/browser/lib.es6.d.ts@358094
     */
    public native void exitPointerLock();
    /** 
      * tsd/browser/lib.es6.d.ts@358242
      * Causes the element to receive the focus and executes the code specified by the onfocus event.
     */
    public native void focus();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    public native Element getActiveElement();
    @JsProperty(name = "alinkColor")
    public native String getAlinkColor();
    @JsProperty(name = "all")
    public native HTMLAllCollection getAll();
    @JsProperty(name = "anchors")
    public native HTMLCollectionOf<HTMLAnchorElement> getAnchors();
    @JsProperty(name = "applets")
    public native HTMLCollectionOf<HTMLAppletElement> getApplets();
    @JsProperty(name = "bgColor")
    public native String getBgColor();
    @JsProperty(name = "body")
    public native HTMLElement getBody();
    @JsProperty(name = "characterSet")
    public native String getCharacterSet();
    @JsProperty(name = "charset")
    public native String getCharset();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    public native Number getChildElementCount();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native HTMLCollection getChildren();
    @JsProperty(name = "compatMode")
    public native String getCompatMode();
    @JsProperty(name = "cookie")
    public native String getCookie();
    @JsProperty(name = "currentScript")
    public native UnionOfHTMLScriptElementAndSVGScriptElement getCurrentScript();
    @JsProperty(name = "defaultView")
    public native Window getDefaultView();
    @JsProperty(name = "designMode")
    public native String getDesignMode();
    @JsProperty(name = "dir")
    public native String getDir();
    @JsProperty(name = "doctype")
    public native DocumentType getDoctype();
    @JsProperty(name = "documentElement")
    public native HTMLElement getDocumentElement();
    @JsProperty(name = "domain")
    public native String getDomain();
    /** 
      * tsd/browser/lib.es6.d.ts@358459
      * Returns a reference to the first object with the specified value of the ID or NAME attribute.
     */
    public native HTMLElement getElementById(String elementId);
    /** 
      * tsd/browser/lib.es6.d.ts@358518
     */
    public native HTMLCollectionOf<Element> getElementsByClassName(String classNames);
    /** 
      * tsd/browser/lib.es6.d.ts@358799
      * Gets a collection of objects based on the value of the NAME or ID attribute.
     */
    public native NodeListOf<HTMLElement> getElementsByName(String elementName);
    /** 
      * tsd/browser/lib.es6.d.ts@359121
      * Retrieves a collection of objects based on the specified element name.
     */
    public native NodeListOf<Element> getElementsByTagName(String tagname);
    /** 
      * tsd/browser/lib.es6.d.ts@359185
     */
    public native HTMLCollectionOf<HTMLElement> getElementsByTagNameNS(String namespaceURI, String localName);
    @JsProperty(name = "embeds")
    public native HTMLCollectionOf<HTMLEmbedElement> getEmbeds();
    @JsProperty(name = "fgColor")
    public native String getFgColor();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    public native Element getFirstElementChild();
    @JsProperty(name = "forms")
    public native HTMLCollectionOf<HTMLFormElement> getForms();
    @JsProperty(name = "fullscreenElement")
    public native Element getFullscreenElement();
    @JsProperty(name = "fullscreenEnabled")
    public native Boolean getFullscreenEnabled();
    @JsProperty(name = "head")
    public native HTMLHeadElement getHead();
    @JsProperty(name = "hidden")
    public native Boolean getHidden();
    @JsProperty(name = "images")
    public native HTMLCollectionOf<HTMLImageElement> getImages();
    @JsProperty(name = "implementation")
    public native DOMImplementation getImplementation();
    @JsProperty(name = "inputEncoding")
    public native String getInputEncoding();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    public native Element getLastElementChild();
    @JsProperty(name = "lastModified")
    public native String getLastModified();
    @JsProperty(name = "linkColor")
    public native String getLinkColor();
    @JsProperty(name = "links")
    public native HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> getLinks();
    @JsProperty(name = "location")
    public native Location getLocation();
    @JsProperty(name = "msCSSOMElementFloatMetrics")
    public native Boolean getMsCSSOMElementFloatMetrics();
    @JsProperty(name = "msCapsLockWarningOff")
    public native Boolean getMsCapsLockWarningOff();
    @JsProperty(name = "onabort")
    public native Function1<UIEvent, Object> getOnabort();
    @JsProperty(name = "onactivate")
    public native Function1<UIEvent, Object> getOnactivate();
    @JsProperty(name = "onbeforeactivate")
    public native Function1<UIEvent, Object> getOnbeforeactivate();
    @JsProperty(name = "onbeforedeactivate")
    public native Function1<UIEvent, Object> getOnbeforedeactivate();
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
    @JsProperty(name = "onfullscreenchange")
    public native Function1<Event, Object> getOnfullscreenchange();
    @JsProperty(name = "onfullscreenerror")
    public native Function1<Event, Object> getOnfullscreenerror();
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
    @JsProperty(name = "onmsgesturechange")
    public native Function1<MSGestureEvent, Object> getOnmsgesturechange();
    @JsProperty(name = "onmsgesturedoubletap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturedoubletap();
    @JsProperty(name = "onmsgestureend")
    public native Function1<MSGestureEvent, Object> getOnmsgestureend();
    @JsProperty(name = "onmsgesturehold")
    public native Function1<MSGestureEvent, Object> getOnmsgesturehold();
    @JsProperty(name = "onmsgesturestart")
    public native Function1<MSGestureEvent, Object> getOnmsgesturestart();
    @JsProperty(name = "onmsgesturetap")
    public native Function1<MSGestureEvent, Object> getOnmsgesturetap();
    @JsProperty(name = "onmsinertiastart")
    public native Function1<MSGestureEvent, Object> getOnmsinertiastart();
    @JsProperty(name = "onmsmanipulationstatechanged")
    public native Function1<MSManipulationEvent, Object> getOnmsmanipulationstatechanged();
    @JsProperty(name = "onmspointercancel")
    public native Function1<MSPointerEvent, Object> getOnmspointercancel();
    @JsProperty(name = "onmspointerdown")
    public native Function1<MSPointerEvent, Object> getOnmspointerdown();
    @JsProperty(name = "onmspointerenter")
    public native Function1<MSPointerEvent, Object> getOnmspointerenter();
    @JsProperty(name = "onmspointerleave")
    public native Function1<MSPointerEvent, Object> getOnmspointerleave();
    @JsProperty(name = "onmspointermove")
    public native Function1<MSPointerEvent, Object> getOnmspointermove();
    @JsProperty(name = "onmspointerout")
    public native Function1<MSPointerEvent, Object> getOnmspointerout();
    @JsProperty(name = "onmspointerover")
    public native Function1<MSPointerEvent, Object> getOnmspointerover();
    @JsProperty(name = "onmspointerup")
    public native Function1<MSPointerEvent, Object> getOnmspointerup();
    @JsProperty(name = "onmssitemodejumplistitemremoved")
    public native Function1<MSSiteModeEvent, Object> getOnmssitemodejumplistitemremoved();
    @JsProperty(name = "onmsthumbnailclick")
    public native Function1<MSSiteModeEvent, Object> getOnmsthumbnailclick();
    @JsProperty(name = "onpause")
    public native Function1<Event, Object> getOnpause();
    @JsProperty(name = "onplay")
    public native Function1<Event, Object> getOnplay();
    @JsProperty(name = "onplaying")
    public native Function1<Event, Object> getOnplaying();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    public native Function1<PointerEvent, Object> getOnpointercancel();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    public native Function1<PointerEvent, Object> getOnpointerdown();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    public native Function1<PointerEvent, Object> getOnpointerenter();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    public native Function1<PointerEvent, Object> getOnpointerleave();
    @JsProperty(name = "onpointerlockchange")
    public native Function1<Event, Object> getOnpointerlockchange();
    @JsProperty(name = "onpointerlockerror")
    public native Function1<Event, Object> getOnpointerlockerror();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    public native Function1<PointerEvent, Object> getOnpointermove();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    public native Function1<PointerEvent, Object> getOnpointerout();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    public native Function1<PointerEvent, Object> getOnpointerover();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    public native Function1<PointerEvent, Object> getOnpointerup();
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    @JsProperty(name = "onratechange")
    public native Function1<Event, Object> getOnratechange();
    @JsProperty(name = "onreadystatechange")
    public native Function1<Event, Object> getOnreadystatechange();
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
    @JsProperty(name = "onselectionchange")
    public native Function1<Event, Object> getOnselectionchange();
    @JsProperty(name = "onselectstart")
    public native Function1<Event, Object> getOnselectstart();
    @JsProperty(name = "onstalled")
    public native Function1<Event, Object> getOnstalled();
    @JsProperty(name = "onstop")
    public native Function1<Event, Object> getOnstop();
    @JsProperty(name = "onsubmit")
    public native Function1<Event, Object> getOnsubmit();
    @JsProperty(name = "onsuspend")
    public native Function1<Event, Object> getOnsuspend();
    @JsProperty(name = "ontimeupdate")
    public native Function1<Event, Object> getOntimeupdate();
    @JsProperty(name = "ontouchcancel")
    public native Function1<TouchEvent, Object> getOntouchcancel();
    @JsProperty(name = "ontouchend")
    public native Function1<TouchEvent, Object> getOntouchend();
    @JsProperty(name = "ontouchmove")
    public native Function1<TouchEvent, Object> getOntouchmove();
    @JsProperty(name = "ontouchstart")
    public native Function1<TouchEvent, Object> getOntouchstart();
    @JsProperty(name = "onvolumechange")
    public native Function1<Event, Object> getOnvolumechange();
    @JsProperty(name = "onwaiting")
    public native Function1<Event, Object> getOnwaiting();
    @JsProperty(name = "onwebkitfullscreenchange")
    public native Function1<Event, Object> getOnwebkitfullscreenchange();
    @JsProperty(name = "onwebkitfullscreenerror")
    public native Function1<Event, Object> getOnwebkitfullscreenerror();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native Function1<WheelEvent, Object> getOnwheel();
    @JsProperty(name = "plugins")
    public native HTMLCollectionOf<HTMLEmbedElement> getPlugins();
    @JsProperty(name = "pointerLockElement")
    public native Element getPointerLockElement();
    @JsProperty(name = "readyState")
    public native String getReadyState();
    @JsProperty(name = "referrer")
    public native String getReferrer();
    @JsProperty(name = "rootElement")
    public native SVGSVGElement getRootElement();
    @JsProperty(name = "scripts")
    public native HTMLCollectionOf<HTMLScriptElement> getScripts();
    @JsProperty(name = "scrollingElement")
    public native Element getScrollingElement();
    /** 
      * tsd/browser/lib.es6.d.ts@743617
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Selection getSelection();
    @JsProperty(name = "styleSheets")
    public native StyleSheetList getStyleSheets();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    public native StyleSheetList getStylesheets();
    @JsProperty(name = "title")
    public native String getTitle();
    @JsProperty(name = "URL")
    public native String getURL();
    @JsProperty(name = "URLUnencoded")
    public native String getURLUnencoded();
    @JsProperty(name = "visibilityState")
    public native String getVisibilityState();
    @JsProperty(name = "vlinkColor")
    public native String getVlinkColor();
    @JsProperty(name = "webkitCurrentFullScreenElement")
    public native Element getWebkitCurrentFullScreenElement();
    @JsProperty(name = "webkitFullscreenElement")
    public native Element getWebkitFullscreenElement();
    @JsProperty(name = "webkitFullscreenEnabled")
    public native Boolean getWebkitFullscreenEnabled();
    @JsProperty(name = "webkitIsFullScreen")
    public native Boolean getWebkitIsFullScreen();
    @JsProperty(name = "xmlEncoding")
    public native String getXmlEncoding();
    @JsProperty(name = "xmlStandalone")
    public native Boolean getXmlStandalone();
    @JsProperty(name = "xmlVersion")
    public native String getXmlVersion();
    /** 
      * tsd/browser/lib.es6.d.ts@359793
      * Gets a value indicating whether the object currently has focus.
     */
    public native Boolean hasFocus();
    /** 
      * tsd/browser/lib.es6.d.ts@359818
     */
    public native Node importNode(Node importedNode, Boolean deep);
    /** 
      * tsd/browser/lib.es6.d.ts@359875
     */
    public native NodeListOf<Element> msElementsFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@359943
     */
    public native NodeListOf<Element> msElementsFromRect(@DoNotAutobox Number left, @DoNotAutobox Number top, @DoNotAutobox Number width, @DoNotAutobox Number height);
    public native Document open();
    public native Document open(String url /* optional */);
    public native Document open(String url /* optional */, String name /* optional */);
    public native Document open(String url /* optional */, String name /* optional */, String features /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@360815
      * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
     */
    public native Document open(String url /* optional */, String name /* optional */, String features /* optional */, Boolean replace /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@361141
      * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
     */
    public native Boolean queryCommandEnabled(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@361388
      * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
     */
    public native Boolean queryCommandIndeterm(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@361609
      * Returns a Boolean value that indicates the current state of the command.
     */
    public native Boolean queryCommandState(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@361844
      * Returns a Boolean value that indicates whether the current command is supported on the current range.
     */
    public native Boolean queryCommandSupported(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@362125
      * Retrieves the string associated with a command.
     */
    public native String queryCommandText(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@362362
      * Returns the current value of the document, range, or current selection for the given command.
     */
    public native String queryCommandValue(String commandId);
    /** 
      * tsd/browser/lib.es6.d.ts@734337
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native Element querySelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@734492
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native NodeListOf<Element> querySelectorAll(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@362412
     */
    public native void releaseEvents();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    public native void setActiveElement(Element value);
    @JsProperty(name = "alinkColor")
    public native void setAlinkColor(String value);
    @JsProperty(name = "all")
    public native void setAll(HTMLAllCollection value);
    @JsProperty(name = "anchors")
    public native void setAnchors(HTMLCollectionOf<HTMLAnchorElement> value);
    @JsProperty(name = "applets")
    public native void setApplets(HTMLCollectionOf<HTMLAppletElement> value);
    @JsProperty(name = "bgColor")
    public native void setBgColor(String value);
    @JsProperty(name = "body")
    public native void setBody(HTMLElement value);
    @JsProperty(name = "characterSet")
    public native void setCharacterSet(String value);
    @JsProperty(name = "charset")
    public native void setCharset(String value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    public native void setChildElementCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native void setChildren(HTMLCollection value);
    @JsProperty(name = "compatMode")
    public native void setCompatMode(String value);
    @JsProperty(name = "cookie")
    public native void setCookie(String value);
    @JsProperty(name = "currentScript")
    public native void setCurrentScript(HTMLScriptElement value);
    @JsProperty(name = "currentScript")
    public native void setCurrentScript(SVGScriptElement value);
    @JsProperty(name = "currentScript")
    public native void setCurrentScript(UnionOfHTMLScriptElementAndSVGScriptElement value);
    @JsProperty(name = "defaultView")
    public native void setDefaultView(Window value);
    @JsProperty(name = "designMode")
    public native void setDesignMode(String value);
    @JsProperty(name = "dir")
    public native void setDir(String value);
    @JsProperty(name = "doctype")
    public native void setDoctype(DocumentType value);
    @JsProperty(name = "documentElement")
    public native void setDocumentElement(HTMLElement value);
    @JsProperty(name = "domain")
    public native void setDomain(String value);
    @JsProperty(name = "embeds")
    public native void setEmbeds(HTMLCollectionOf<HTMLEmbedElement> value);
    @JsProperty(name = "fgColor")
    public native void setFgColor(String value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    public native void setFirstElementChild(Element value);
    @JsProperty(name = "forms")
    public native void setForms(HTMLCollectionOf<HTMLFormElement> value);
    @JsProperty(name = "fullscreenElement")
    public native void setFullscreenElement(Element value);
    @JsProperty(name = "fullscreenEnabled")
    public native void setFullscreenEnabled(Boolean value);
    @JsProperty(name = "head")
    public native void setHead(HTMLHeadElement value);
    @JsProperty(name = "hidden")
    public native void setHidden(Boolean value);
    @JsProperty(name = "images")
    public native void setImages(HTMLCollectionOf<HTMLImageElement> value);
    @JsProperty(name = "implementation")
    public native void setImplementation(DOMImplementation value);
    @JsProperty(name = "inputEncoding")
    public native void setInputEncoding(String value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    public native void setLastElementChild(Element value);
    @JsProperty(name = "lastModified")
    public native void setLastModified(String value);
    @JsProperty(name = "linkColor")
    public native void setLinkColor(String value);
    @JsProperty(name = "links")
    public native void setLinks(HTMLCollectionOf<UnionOfHTMLAnchorElementAndHTMLAreaElement> value);
    @JsProperty(name = "location")
    public native void setLocation(Location value);
    @JsProperty(name = "msCSSOMElementFloatMetrics")
    public native void setMsCSSOMElementFloatMetrics(Boolean value);
    @JsProperty(name = "msCapsLockWarningOff")
    public native void setMsCapsLockWarningOff(Boolean value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<UIEvent, Object> value);
    @JsProperty(name = "onactivate")
    public native void setOnactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "onbeforeactivate")
    public native void setOnbeforeactivate(Function1<UIEvent, Object> value);
    @JsProperty(name = "onbeforedeactivate")
    public native void setOnbeforedeactivate(Function1<UIEvent, Object> value);
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
    @JsProperty(name = "onfullscreenchange")
    public native void setOnfullscreenchange(Function1<Event, Object> value);
    @JsProperty(name = "onfullscreenerror")
    public native void setOnfullscreenerror(Function1<Event, Object> value);
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
    @JsProperty(name = "onmsgesturechange")
    public native void setOnmsgesturechange(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturedoubletap")
    public native void setOnmsgesturedoubletap(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgestureend")
    public native void setOnmsgestureend(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturehold")
    public native void setOnmsgesturehold(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturestart")
    public native void setOnmsgesturestart(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsgesturetap")
    public native void setOnmsgesturetap(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsinertiastart")
    public native void setOnmsinertiastart(Function1<MSGestureEvent, Object> value);
    @JsProperty(name = "onmsmanipulationstatechanged")
    public native void setOnmsmanipulationstatechanged(Function1<MSManipulationEvent, Object> value);
    @JsProperty(name = "onmspointercancel")
    public native void setOnmspointercancel(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerdown")
    public native void setOnmspointerdown(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerenter")
    public native void setOnmspointerenter(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerleave")
    public native void setOnmspointerleave(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointermove")
    public native void setOnmspointermove(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerout")
    public native void setOnmspointerout(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerover")
    public native void setOnmspointerover(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmspointerup")
    public native void setOnmspointerup(Function1<MSPointerEvent, Object> value);
    @JsProperty(name = "onmssitemodejumplistitemremoved")
    public native void setOnmssitemodejumplistitemremoved(Function1<MSSiteModeEvent, Object> value);
    @JsProperty(name = "onmsthumbnailclick")
    public native void setOnmsthumbnailclick(Function1<MSSiteModeEvent, Object> value);
    @JsProperty(name = "onpause")
    public native void setOnpause(Function1<Event, Object> value);
    @JsProperty(name = "onplay")
    public native void setOnplay(Function1<Event, Object> value);
    @JsProperty(name = "onplaying")
    public native void setOnplaying(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    public native void setOnpointercancel(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    public native void setOnpointerdown(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    public native void setOnpointerenter(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    public native void setOnpointerleave(Function1<PointerEvent, Object> value);
    @JsProperty(name = "onpointerlockchange")
    public native void setOnpointerlockchange(Function1<Event, Object> value);
    @JsProperty(name = "onpointerlockerror")
    public native void setOnpointerlockerror(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    public native void setOnpointermove(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    public native void setOnpointerout(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    public native void setOnpointerover(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    public native void setOnpointerup(Function1<PointerEvent, Object> value);
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "onratechange")
    public native void setOnratechange(Function1<Event, Object> value);
    @JsProperty(name = "onreadystatechange")
    public native void setOnreadystatechange(Function1<Event, Object> value);
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
    @JsProperty(name = "onselectionchange")
    public native void setOnselectionchange(Function1<Event, Object> value);
    @JsProperty(name = "onselectstart")
    public native void setOnselectstart(Function1<Event, Object> value);
    @JsProperty(name = "onstalled")
    public native void setOnstalled(Function1<Event, Object> value);
    @JsProperty(name = "onstop")
    public native void setOnstop(Function1<Event, Object> value);
    @JsProperty(name = "onsubmit")
    public native void setOnsubmit(Function1<Event, Object> value);
    @JsProperty(name = "onsuspend")
    public native void setOnsuspend(Function1<Event, Object> value);
    @JsProperty(name = "ontimeupdate")
    public native void setOntimeupdate(Function1<Event, Object> value);
    @JsProperty(name = "ontouchcancel")
    public native void setOntouchcancel(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchend")
    public native void setOntouchend(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchmove")
    public native void setOntouchmove(Function1<TouchEvent, Object> value);
    @JsProperty(name = "ontouchstart")
    public native void setOntouchstart(Function1<TouchEvent, Object> value);
    @JsProperty(name = "onvolumechange")
    public native void setOnvolumechange(Function1<Event, Object> value);
    @JsProperty(name = "onwaiting")
    public native void setOnwaiting(Function1<Event, Object> value);
    @JsProperty(name = "onwebkitfullscreenchange")
    public native void setOnwebkitfullscreenchange(Function1<Event, Object> value);
    @JsProperty(name = "onwebkitfullscreenerror")
    public native void setOnwebkitfullscreenerror(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    public native void setOnwheel(Function1<WheelEvent, Object> value);
    @JsProperty(name = "plugins")
    public native void setPlugins(HTMLCollectionOf<HTMLEmbedElement> value);
    @JsProperty(name = "pointerLockElement")
    public native void setPointerLockElement(Element value);
    @JsProperty(name = "readyState")
    public native void setReadyState(String value);
    @JsProperty(name = "referrer")
    public native void setReferrer(String value);
    @JsProperty(name = "rootElement")
    public native void setRootElement(SVGSVGElement value);
    @JsProperty(name = "scripts")
    public native void setScripts(HTMLCollectionOf<HTMLScriptElement> value);
    @JsProperty(name = "scrollingElement")
    public native void setScrollingElement(Element value);
    @JsProperty(name = "styleSheets")
    public native void setStyleSheets(StyleSheetList value);
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    public native void setStylesheets(StyleSheetList value);
    @JsProperty(name = "title")
    public native void setTitle(String value);
    @JsProperty(name = "URL")
    public native void setURL(String value);
    @JsProperty(name = "URLUnencoded")
    public native void setURLUnencoded(String value);
    @JsProperty(name = "visibilityState")
    public native void setVisibilityState(String value);
    @JsProperty(name = "vlinkColor")
    public native void setVlinkColor(String value);
    @JsProperty(name = "webkitCurrentFullScreenElement")
    public native void setWebkitCurrentFullScreenElement(Element value);
    @JsProperty(name = "webkitFullscreenElement")
    public native void setWebkitFullscreenElement(Element value);
    @JsProperty(name = "webkitFullscreenEnabled")
    public native void setWebkitFullscreenEnabled(Boolean value);
    @JsProperty(name = "webkitIsFullScreen")
    public native void setWebkitIsFullScreen(Boolean value);
    @JsProperty(name = "xmlEncoding")
    public native void setXmlEncoding(String value);
    @JsProperty(name = "xmlStandalone")
    public native void setXmlStandalone(Boolean value);
    @JsProperty(name = "xmlVersion")
    public native void setXmlVersion(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@362513
      * Allows updating the print settings for the page.
     */
    public native void updateSettings();
    /** 
      * tsd/browser/lib.es6.d.ts@362541
     */
    public native void webkitCancelFullScreen();
    /** 
      * tsd/browser/lib.es6.d.ts@362577
     */
    public native void webkitExitFullscreen();
    public native void write();
    /** 
      * tsd/browser/lib.es6.d.ts@362778
      * Writes one or more HTML expressions to a document in the specified window. 
     */
    public native void write(String...  content);
    public native void writeln();
    /** 
      * tsd/browser/lib.es6.d.ts@363006
      * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window. 
     */
    public native void writeln(String...  content);
}
