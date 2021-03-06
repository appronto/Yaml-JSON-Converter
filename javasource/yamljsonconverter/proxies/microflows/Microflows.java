// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package yamljsonconverter.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the YamlJSONConverter module
	public static boolean test_JSONYaml_Petstore(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("YamlJSONConverter.Test_JSONYaml_Petstore").withParams(params).execute(context);
	}
	public static boolean test_YamlJSON_Petstore(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("YamlJSONConverter.Test_YamlJSON_Petstore").withParams(params).execute(context);
	}
}