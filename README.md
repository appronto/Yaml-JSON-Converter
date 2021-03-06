# Yaml-JSON-Converter
Convert Yaml to JSON and vice versa

## Dependencies

 - jackson-databind-2.12.2.jar 
 - jackson-core-2.12.2.jar
 - jackson-annotations-2.12.2.jar 
 - jackson-dataformat-yaml-2.12.2.jar
 - snakeyaml-1.28.jar
 
## Examples

Yaml file like this:

    ---
    customFields:
    - id: "_1_id"
      name: "_1_name"
      description: "1 description"
      type: "SINGLEmalt"
    - id: "_2_id"
      name: "_2_name"
      description: "set 2 description"
      type: "BLENDED"

will be converted to a JSON like this:

    {
       "customFields": [
          {
             "id": "_1_id",
             "name": "_1_name",
             "description": "1 description",
             "type": "SINGLEmalt"
          },
          {
             "id": "__1_id",
             "name": "_1_name",
             "description": "1 description",
             "type": "BLENDED"
          }
       ]
    }
