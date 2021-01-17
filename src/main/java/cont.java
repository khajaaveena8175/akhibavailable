
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;

import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import guru.learningjournal.kafka.examples.types.LineItem;

import org.codehaus.jackson.map.JsonMappingException;


public class cont {
    public static void main(String[] args) throws JsonMappingException, com.fasterxml.jackson.databind.JsonMappingException {
        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
        AvroSchemaGenerator gen = new AvroSchemaGenerator();
        mapper.acceptJsonFormatVisitor(LineItem.class, gen);
        AvroSchema schemaWrapper = gen.getGeneratedSchema();
        org.apache.avro.Schema avroSchema = schemaWrapper.getAvroSchema();
        String asJson = avroSchema.toString(true);
        System.out.println(asJson);




    }
}
