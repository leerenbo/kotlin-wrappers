// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface SessionEvent {
    sealed interface EXTENSION_LOADED : node.events.LegacyEventType
    sealed interface EXTENSION_READY : node.events.LegacyEventType
    sealed interface EXTENSION_UNLOADED : node.events.LegacyEventType
    sealed interface HID_DEVICE_ADDED : node.events.LegacyEventType
    sealed interface HID_DEVICE_REMOVED : node.events.LegacyEventType
    sealed interface HID_DEVICE_REVOKED : node.events.LegacyEventType
    sealed interface PRECONNECT : node.events.LegacyEventType
    sealed interface SELECT_HID_DEVICE : node.events.LegacyEventType
    sealed interface SELECT_SERIAL_PORT : node.events.LegacyEventType
    sealed interface SELECT_USB_DEVICE : node.events.LegacyEventType
    sealed interface SERIAL_PORT_ADDED : node.events.LegacyEventType
    sealed interface SERIAL_PORT_REMOVED : node.events.LegacyEventType
    sealed interface SERIAL_PORT_REVOKED : node.events.LegacyEventType
    sealed interface SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN : node.events.LegacyEventType
    sealed interface SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE : node.events.LegacyEventType
    sealed interface SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS : node.events.LegacyEventType
    sealed interface SPELLCHECK_DICTIONARY_INITIALIZED : node.events.LegacyEventType
    sealed interface USB_DEVICE_ADDED : node.events.LegacyEventType
    sealed interface USB_DEVICE_REMOVED : node.events.LegacyEventType
    sealed interface USB_DEVICE_REVOKED : node.events.LegacyEventType
    sealed interface WILL_DOWNLOAD : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("extension-loaded")
        val EXTENSION_LOADED: EXTENSION_LOADED

        @seskar.js.JsValue("extension-ready")
        val EXTENSION_READY: EXTENSION_READY

        @seskar.js.JsValue("extension-unloaded")
        val EXTENSION_UNLOADED: EXTENSION_UNLOADED

        @seskar.js.JsValue("hid-device-added")
        val HID_DEVICE_ADDED: HID_DEVICE_ADDED

        @seskar.js.JsValue("hid-device-removed")
        val HID_DEVICE_REMOVED: HID_DEVICE_REMOVED

        @seskar.js.JsValue("hid-device-revoked")
        val HID_DEVICE_REVOKED: HID_DEVICE_REVOKED

        @seskar.js.JsValue("preconnect")
        val PRECONNECT: PRECONNECT

        @seskar.js.JsValue("select-hid-device")
        val SELECT_HID_DEVICE: SELECT_HID_DEVICE

        @seskar.js.JsValue("select-serial-port")
        val SELECT_SERIAL_PORT: SELECT_SERIAL_PORT

        @seskar.js.JsValue("select-usb-device")
        val SELECT_USB_DEVICE: SELECT_USB_DEVICE

        @seskar.js.JsValue("serial-port-added")
        val SERIAL_PORT_ADDED: SERIAL_PORT_ADDED

        @seskar.js.JsValue("serial-port-removed")
        val SERIAL_PORT_REMOVED: SERIAL_PORT_REMOVED

        @seskar.js.JsValue("serial-port-revoked")
        val SERIAL_PORT_REVOKED: SERIAL_PORT_REVOKED

        @seskar.js.JsValue("spellcheck-dictionary-download-begin")
        val SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN: SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN

        @seskar.js.JsValue("spellcheck-dictionary-download-failure")
        val SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE: SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE

        @seskar.js.JsValue("spellcheck-dictionary-download-success")
        val SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS: SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS

        @seskar.js.JsValue("spellcheck-dictionary-initialized")
        val SPELLCHECK_DICTIONARY_INITIALIZED: SPELLCHECK_DICTIONARY_INITIALIZED

        @seskar.js.JsValue("usb-device-added")
        val USB_DEVICE_ADDED: USB_DEVICE_ADDED

        @seskar.js.JsValue("usb-device-removed")
        val USB_DEVICE_REMOVED: USB_DEVICE_REMOVED

        @seskar.js.JsValue("usb-device-revoked")
        val USB_DEVICE_REVOKED: USB_DEVICE_REVOKED

        @seskar.js.JsValue("will-download")
        val WILL_DOWNLOAD: WILL_DOWNLOAD

        @seskar.js.JsValue("extension-loaded")
        fun extensionLoaded(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, Extension>>

        @seskar.js.JsValue("extension-ready")
        fun extensionReady(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, Extension>>

        @seskar.js.JsValue("extension-unloaded")
        fun extensionUnloaded(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, Extension>>

        @seskar.js.JsValue("hid-device-added")
        fun hidDeviceAdded(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, HidDeviceAddedDetails>>

        @seskar.js.JsValue("hid-device-removed")
        fun hidDeviceRemoved(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, HidDeviceRemovedDetails>>

        @seskar.js.JsValue("hid-device-revoked")
        fun hidDeviceRevoked(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, HidDeviceRevokedDetails>>

        @seskar.js.JsValue("preconnect")
        fun preconnect(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, String, Boolean>>

        @seskar.js.JsValue("select-hid-device")
        fun selectHidDevice(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, SelectHidDeviceDetails, (deviceId: String? /* use undefined for default */) -> Unit>>

        @seskar.js.JsValue("select-serial-port")
        fun selectSerialPort(): node.events.EventType<Session, js.array.JsTuple4<Event<*>, js.array.ReadonlyArray<SerialPort>, WebContents, (portId: String) -> Unit>>

        @seskar.js.JsValue("select-usb-device")
        fun selectUsbDevice(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, SelectUsbDeviceDetails, (deviceId: String? /* use undefined for default */) -> Unit>>

        @seskar.js.JsValue("serial-port-added")
        fun serialPortAdded(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, SerialPort, WebContents>>

        @seskar.js.JsValue("serial-port-removed")
        fun serialPortRemoved(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, SerialPort, WebContents>>

        @seskar.js.JsValue("serial-port-revoked")
        fun serialPortRevoked(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, SerialPortRevokedDetails>>

        @seskar.js.JsValue("spellcheck-dictionary-download-begin")
        fun spellcheckDictionaryDownloadBegin(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("spellcheck-dictionary-download-failure")
        fun spellcheckDictionaryDownloadFailure(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("spellcheck-dictionary-download-success")
        fun spellcheckDictionaryDownloadSuccess(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("spellcheck-dictionary-initialized")
        fun spellcheckDictionaryInitialized(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, String>>

        @seskar.js.JsValue("usb-device-added")
        fun usbDeviceAdded(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, USBDevice, WebContents>>

        @seskar.js.JsValue("usb-device-removed")
        fun usbDeviceRemoved(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, USBDevice, WebContents>>

        @seskar.js.JsValue("usb-device-revoked")
        fun usbDeviceRevoked(): node.events.EventType<Session, js.array.JsTuple2<Event<*>, UsbDeviceRevokedDetails>>

        @seskar.js.JsValue("will-download")
        fun willDownload(): node.events.EventType<Session, js.array.JsTuple3<Event<*>, DownloadItem, WebContents>>
    }
}
