// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCPeerConnectionIceEventTypes :
    RTCPeerConnectionIceEventTypes_deprecated {

    @JsValue("icecandidate")
    val ICE_CANDIDATE: EventType<RTCPeerConnectionIceEvent>
}
