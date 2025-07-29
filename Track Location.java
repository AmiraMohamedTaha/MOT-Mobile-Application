var Gps_1_Latitude = GetPluginParameterValue('Gps 1', 'Latitude');
var Gps_1_Longitude = GetPluginParameterValue('Gps 1', 'Longitude');

AlertMessage(`Lat ${Gps_1_Latitude} - Lng ${Gps_1_Longitude}`, '', '');

DrawMarker('Map 1', 'marker1', Gps_1_Latitude, Gps_1_Longitude, '#ff0000', 100, `Lat ${Gps_1_Latitude} - Lng ${Gps_1_Longitude}`, '', '');

var userName = getLoggedInUser().username;
var MQTT_1_Plugin_Object = GetPluginParameterValue('MQTT 1', 'Plugin Object');
MQTT_1_Plugin_Object.Publish('Phone/Location', `Location of ${userName} is: Lat ${Gps_1_Latitude} - Lng ${Gps_1_Longitude}`);
