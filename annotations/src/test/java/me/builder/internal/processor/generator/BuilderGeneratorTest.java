package me.builder.internal.processor.generator;

import me.builder.internal.processor.model.Model;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuilderGeneratorTest {

    @Test
    public void testFluentTemplate() throws IOException {
        Model model = new Model.Builder()
                .withType("my.test", "Circle")
                .addArgument("java.lang", "Integer", "x")
                .addArgument("java.lang", "Integer", "y")
                .addArgument("java.lang", "Boolean", "hidden")
                .addArgument("java.lang", "Integer", "radius").build();

        File tmp = new File("/tmp");
        generate(model, tmp, "CircleFluent.java", GeneratorUtils.DEFAULT_FLUENT_TEMPLATE_LOCATION);
        generate(model, tmp, "CircleBuilder.java", GeneratorUtils.DEFAULT_BUILDER_TEMPLATE_LOCATION);
    }
    
    private static void generate(Model model, File dir, String name, String templateResource) {
        try (FileWriter fluentWriter = new FileWriter(new File(dir, name))) {
            CodeGenerator generator = new CodeGenerator(model, fluentWriter, templateResource);
            generator.generate();    
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}