package yamljsonconverter.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlJSONhelper {

	    public static String convertYamlToJson(String yaml) {
	        try {
	            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
	            Object obj = yamlReader.readValue(yaml, Object.class);
	            ObjectMapper jsonWriter = new ObjectMapper();
	            return jsonWriter.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
	        } catch (JsonProcessingException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        return null;
	    }
	    
	    public static String convertJsonToYaml(String json) {
	        try {
	            // parse JSON
	            JsonNode jsonNodeTree = new ObjectMapper().readTree(json);
	            // save it as YAML
	            return  new YAMLMapper().writeValueAsString(jsonNodeTree);
	        } catch (JsonProcessingException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        return null;
	    }
    
}
