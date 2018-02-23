package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.LngLatBoun_89_gLatBounds;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.browser.Array;
import js.browser.Element;
import js.browser.UnionOfElementAndString;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".MapboxOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 6172

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MapboxOptions
{

    /*
        Properties
    */

    /** 
      * If true, an attribution control will be added to the map. 
     */
    public Boolean attributionControl;

    public Number bearing;

    /** 
      * Snap to north threshold in degrees. 
     */
    public Number bearingSnap;

    /** 
      * If true, enable the "box zoom" interaction (see BoxZoomHandler) 
     */
    public Boolean boxZoom;

    /** 
      * initial map center 
     */
    public LngLatLike_UnionOfArrayOfNumberAndLngLat center;

    /** 
      * Style class names with which to initialize the map 
     */
    public Array<String> classes;

    /** 
      * ID of the container element 
     */
    public UnionOfElementAndString container;

    /** 
      * If true, enable the "double click to zoom" interaction (see DoubleClickZoomHandler). 
     */
    public Boolean doubleClickZoom;

    /** 
      * If true, enable the "drag to pan" interaction (see DragPanHandler). 
     */
    public Boolean dragPan;

    /** 
      * If true, enable the "drag to rotate" interaction (see DragRotateHandler). 
     */
    public Boolean dragRotate;

    /** 
      * If true, map creation will fail if the implementation determines that the performance of the created WebGL context would be dramatically lower than expected. 
     */
    public Boolean failIfMayorPerformanceCaveat;

    /** 
      * If true, the map will track and update the page URL according to map position 
     */
    public Boolean hash;

    /** 
      * If false, no mouse, touch, or keyboard listeners are attached to the map, so it will not respond to input 
     */
    public Boolean interactive;

    /** 
      * If true, enable keyboard shortcuts (see KeyboardHandler). 
     */
    public Boolean keyboard;

    public String logoPosition;

    /** 
      * If set, the map is constrained to the given bounds. 
     */
    public LngLatBoun_89_gLatBounds maxBounds;

    /** 
      * Maximum tile cache size for each layer. 
     */
    public Number maxTileCacheSize;

    /** 
      * Maximum zoom of the map 
     */
    public Number maxZoom;

    /** 
      * Minimum zoom of the map 
     */
    public Number minZoom;

    public Number pitch;

    /** 
      * If true, The maps canvas can be exported to a PNG using map.getCanvas().toDataURL();. This is false by default as a performance optimization. 
     */
    public Boolean preserveDrawingBuffer;

    public Boolean refreshExpiredTiles;

    public Boolean renderWorldCopies;

    /** 
      * If true, enable the "scroll to zoom" interaction 
     */
    public Boolean scrollZoom;

    /** 
      * stylesheet location 
     */
    public UnionOfStringAndStyle style;

    /** 
      * If true, enable the "pinch to rotate and zoom" interaction (see TouchZoomRotateHandler). 
     */
    public Boolean touchZoomRotate;

    /** 
      * If  true, the map will automatically resize when the browser window resizes 
     */
    public Boolean trackResize;

    /** 
      * Initial zoom level 
     */
    public Number zoom;

    /*
        Methods
    */
    @JsProperty(name = "attributionControl")
    public native Boolean getAttributionControl();
    @JsProperty(name = "bearing")
    public native Number getBearing();
    @JsProperty(name = "bearingSnap")
    public native Number getBearingSnap();
    @JsProperty(name = "boxZoom")
    public native Boolean getBoxZoom();
    @JsProperty(name = "center")
    public native LngLatLike_UnionOfArrayOfNumberAndLngLat getCenter();
    @JsProperty(name = "classes")
    public native Array<String> getClasses();
    @JsProperty(name = "container")
    public native UnionOfElementAndString getContainer();
    @JsProperty(name = "doubleClickZoom")
    public native Boolean getDoubleClickZoom();
    @JsProperty(name = "dragPan")
    public native Boolean getDragPan();
    @JsProperty(name = "dragRotate")
    public native Boolean getDragRotate();
    @JsProperty(name = "failIfMayorPerformanceCaveat")
    public native Boolean getFailIfMayorPerformanceCaveat();
    @JsProperty(name = "hash")
    public native Boolean getHash();
    @JsProperty(name = "interactive")
    public native Boolean getInteractive();
    @JsProperty(name = "keyboard")
    public native Boolean getKeyboard();
    @JsProperty(name = "logoPosition")
    public native String getLogoPosition();
    @JsProperty(name = "maxBounds")
    public native LngLatBoun_89_gLatBounds getMaxBounds();
    @JsProperty(name = "maxTileCacheSize")
    public native Number getMaxTileCacheSize();
    @JsProperty(name = "maxZoom")
    public native Number getMaxZoom();
    @JsProperty(name = "minZoom")
    public native Number getMinZoom();
    @JsProperty(name = "pitch")
    public native Number getPitch();
    @JsProperty(name = "preserveDrawingBuffer")
    public native Boolean getPreserveDrawingBuffer();
    @JsProperty(name = "refreshExpiredTiles")
    public native Boolean getRefreshExpiredTiles();
    @JsProperty(name = "renderWorldCopies")
    public native Boolean getRenderWorldCopies();
    @JsProperty(name = "scrollZoom")
    public native Boolean getScrollZoom();
    @JsProperty(name = "style")
    public native UnionOfStringAndStyle getStyle();
    @JsProperty(name = "touchZoomRotate")
    public native Boolean getTouchZoomRotate();
    @JsProperty(name = "trackResize")
    public native Boolean getTrackResize();
    @JsProperty(name = "zoom")
    public native Number getZoom();
    @JsProperty(name = "attributionControl")
    public native void setAttributionControl(Boolean value);
    @JsProperty(name = "bearing")
    public native void setBearing(@DoNotAutobox Number value);
    @JsProperty(name = "bearingSnap")
    public native void setBearingSnap(@DoNotAutobox Number value);
    @JsProperty(name = "boxZoom")
    public native void setBoxZoom(Boolean value);
    @JsProperty(name = "center")
    public native void setCenter(LngLat value);
    @JsProperty(name = "center")
    public native void setCenter(Array<Number> value);
    @JsProperty(name = "center")
    public native void setCenter(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    @JsProperty(name = "classes")
    public native void setClasses(Array<String> value);
    @JsProperty(name = "container")
    public native void setContainer(String value);
    @JsProperty(name = "container")
    public native void setContainer(Element value);
    @JsProperty(name = "container")
    public native void setContainer(UnionOfElementAndString value);
    @JsProperty(name = "doubleClickZoom")
    public native void setDoubleClickZoom(Boolean value);
    @JsProperty(name = "dragPan")
    public native void setDragPan(Boolean value);
    @JsProperty(name = "dragRotate")
    public native void setDragRotate(Boolean value);
    @JsProperty(name = "failIfMayorPerformanceCaveat")
    public native void setFailIfMayorPerformanceCaveat(Boolean value);
    @JsProperty(name = "hash")
    public native void setHash(Boolean value);
    @JsProperty(name = "interactive")
    public native void setInteractive(Boolean value);
    @JsProperty(name = "keyboard")
    public native void setKeyboard(Boolean value);
    @JsProperty(name = "logoPosition")
    public native void setLogoPosition(String value);
    @JsProperty(name = "maxBounds")
    public native void setMaxBounds(LngLatBounds value);
    @JsProperty(name = "maxBounds")
    public native void setMaxBounds(Array<Array<Number>> value);
    @JsProperty(name = "maxBounds")
    public native void setMaxBounds(LngLatBoun_89_gLatBounds value);
    @JsProperty(name = "maxTileCacheSize")
    public native void setMaxTileCacheSize(@DoNotAutobox Number value);
    @JsProperty(name = "maxZoom")
    public native void setMaxZoom(@DoNotAutobox Number value);
    @JsProperty(name = "minZoom")
    public native void setMinZoom(@DoNotAutobox Number value);
    @JsProperty(name = "pitch")
    public native void setPitch(@DoNotAutobox Number value);
    @JsProperty(name = "preserveDrawingBuffer")
    public native void setPreserveDrawingBuffer(Boolean value);
    @JsProperty(name = "refreshExpiredTiles")
    public native void setRefreshExpiredTiles(Boolean value);
    @JsProperty(name = "renderWorldCopies")
    public native void setRenderWorldCopies(Boolean value);
    @JsProperty(name = "scrollZoom")
    public native void setScrollZoom(Boolean value);
    @JsProperty(name = "style")
    public native void setStyle(String value);
    @JsProperty(name = "style")
    public native void setStyle(Style value);
    @JsProperty(name = "style")
    public native void setStyle(UnionOfStringAndStyle value);
    @JsProperty(name = "touchZoomRotate")
    public native void setTouchZoomRotate(Boolean value);
    @JsProperty(name = "trackResize")
    public native void setTrackResize(Boolean value);
    @JsProperty(name = "zoom")
    public native void setZoom(@DoNotAutobox Number value);
}
