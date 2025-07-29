var ComboBox_1_Selected_item = GetPluginParameterValue('ComboBox 1', 'Selected item');

SetPluginParameterValue('WebService 1', 'Parameters', 'city=' + ComboBox_1_Selected_item + '&DriverManagerId=1_Shebeen&DriverManagerPassword=123');
SetPluginParameterValue('WebService 1', 'Run', 1);
DrawPlugin('WebService 1');
