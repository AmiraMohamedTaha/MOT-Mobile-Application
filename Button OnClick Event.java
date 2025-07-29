var WebService_1_Result = GetPluginParameterValue('WebService 1', 'Result');
var response = JSON.parse(WebService_1_Result);

SetPluginParameterValue('Grid 1', 'SQL query statement', response);
DrawPlugin('Grid 1');
