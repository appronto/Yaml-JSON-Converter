package yamljsonconverter.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.mendix.core.*;

public class YamlJSONhelper {
		
	public static String convertYamlToJson(String yaml) {
	    try {
	        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
	        Object obj = yamlReader.readValue(yaml, Object.class);
	        ObjectMapper jsonWriter = new ObjectMapper();
	        return jsonWriter.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
	    }
	    catch (JsonProcessingException ex) {
	    	Core.getLogger("yamljsonconverter").error(ex.getMessage());
	    }
	    return null;
	}
	
	public static String convertJsonToYaml(String json) {
	    try {
	        JsonNode jsonNodeTree = new ObjectMapper().readTree(json);
	        return  new YAMLMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonNodeTree);
	    } 
	    catch (JsonProcessingException ex) {
	    	Core.getLogger("yamljsonconverter").error(ex.getMessage());
	    }
	    return null;
	}
    
}
