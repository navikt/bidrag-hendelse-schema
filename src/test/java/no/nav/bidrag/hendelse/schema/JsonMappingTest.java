package no.nav.bidrag.hendelse.schema;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JsonMappingTest {

  @Autowired
  private ObjectMapper objectMapper;

  @Test
  @DisplayName("skal mappe til RegistrerJournalpostDto")
  void skalMappeTilRegistrerJournalpostDto() throws IOException {
    var registrertJpJson = String.join(
        "\n",
        "{",
        "  \"namespace\" : \"namespace\",",
        "  \"type\" : \"record\",",
        "  \"name\" : \"dto\",",
        "  \"fields\" : [",
        "    {\"name\": \"journalpostid\", \"type\": \"long\"},",
        "    {\"name\": \"saksnummer\", \"type\": \"long\"}",
        "  ]",
        "}");

    var registrertJp = objectMapper.readValue(registrertJpJson, RegistrerJournalpostDto.class);

    assertThat(registrertJp).as("registrertJp").isNotNull();
    assertThat(registrertJp.getFields()).as("registrertJp.fields").isEqualTo(List.of(
        new Field("journalpostid", "long"),
        new Field("saksnummer", "long")
    ));
  }
}

