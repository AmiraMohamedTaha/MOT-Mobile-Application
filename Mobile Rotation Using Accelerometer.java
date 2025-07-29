//Fires when any change happens in readings

var Accelerometer_1_XY_Angle = GetPluginParameterValue('Accelerometer 1', 'XY Angle');

SetPluginParameterValue('Image 1', 'Rotate image', Accelerometer_1_XY_Angle);
DrawPlugin('Image 1');
