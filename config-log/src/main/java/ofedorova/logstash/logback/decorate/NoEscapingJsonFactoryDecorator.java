package ofedorova.logstash.logback.decorate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import net.logstash.logback.decorate.JsonFactoryDecorator;

public class NoEscapingJsonFactoryDecorator implements JsonFactoryDecorator {

    @Override
    public MappingJsonFactory decorate(MappingJsonFactory factory) {
        return (MappingJsonFactory) factory.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
    }
}
